package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Computer;
import dmacc.controller.BeanConfig;
import dmacc.repository.ComputerRepo;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}
	@Autowired
	ComputerRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
			Computer c = appContext.getBean("computer", Computer.class);
			repo.save(c);
			
			List<Computer> allComputers = repo.findAll();
			for(Computer com: allComputers)
			{
				System.out.println(com.toString());
			}
			((AbstractApplicationContext) appContext).close();	
	}

}
