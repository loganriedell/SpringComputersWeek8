package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Computer;

import dmacc.repository.ComputerRepo;

@Controller
public class WebController {
	
	@Autowired
	ComputerRepo repo;
	
	@PostMapping("/update/{id}")
	public String reviseComputer(Computer com, Model model) {
		repo.save(com);
		return viewAllComputers(model);
	}
	
	@GetMapping({"/", "viewAll"})
	public String viewAllComputers(Model model) {
		if(repo.findAll().isEmpty())
		{
			return addNewComputer(model);
		}
		model.addAttribute("computers", repo.findAll());
		return "results";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Computer com = repo.findById(id).orElse(null);
		model.addAttribute("newComputer", com);
		return "input";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		 Computer com = repo.findById(id).orElse(null);
		 repo.delete(com);
		 return viewAllComputers(model);
	}
	
	@GetMapping("/inputComputer")
	public String addNewComputer(Model model) {
	 Computer com = new Computer();
	 model.addAttribute("newComputer", com);
	 return "input";
	}
	
	@PostMapping("/inputComputer")
	public String addNewComputer(@ModelAttribute Computer c, Model model) {
		repo.save(c);
		return viewAllComputers(model);
	}
}
