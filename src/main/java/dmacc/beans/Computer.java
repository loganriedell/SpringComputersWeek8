package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.NoArgsConstructor;

@Entity
public class Computer {
	//Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	private String brand;
	private String os;
	private boolean hasDedicatedGraphics;
	private int watts;
	
	@Autowired
	private CentralProcessor cpu;
	@Autowired
	private GraphicsProcessor gpu;
	
	//Constructors
	public Computer()
	{
		super();
	}
	
	public Computer(String brand, String os)
	{
		super();
		this.brand = brand;
		this.os = os;
	}
	
	public Computer(String brand, String os, boolean hasDedicatedGraphics, int watts)
	{
		super();
		this.brand = brand;
		this.os = os;
		this.hasDedicatedGraphics = hasDedicatedGraphics;
		this.watts = watts;
	}
	
	public Computer(long id, String brand, String os, boolean hasDedicatedGraphics, int watts)
	{
		super();
		this.id = id;
		this.brand = brand;
		this.os = os;
		this.hasDedicatedGraphics = hasDedicatedGraphics;
		this.watts = watts;
	}
	
	//Methods
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean isHasDedicatedGraphics() {
		return hasDedicatedGraphics;
	}
	public void setHasDedicatedGraphics(boolean hasDedicatedGraphics) {
		this.hasDedicatedGraphics = hasDedicatedGraphics;
	}
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	
	public CentralProcessor getCpu() {
		return cpu;
	}

	public void setCpu(CentralProcessor cpu) {
		this.cpu = cpu;
	}

	public GraphicsProcessor getGpu() {
		return gpu;
	}

	public void setGpu(GraphicsProcessor gpu) {
		this.gpu = gpu;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", brand=" + brand + ", os=" + os + ", hasDedicatedGPU=" + hasDedicatedGraphics
				+ ", watts=" + watts + "]";
	} 
}
