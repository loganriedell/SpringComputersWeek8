package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.NoArgsConstructor;

@Embeddable
public class CentralProcessor {
	
	private String cpu_Brand;
	private int cpu_Cores;
	
	public CentralProcessor() {
		super();
	}
	
	public CentralProcessor(String cpu_Brand, int cpu_Cores){
		this.cpu_Brand = cpu_Brand;
		this.cpu_Cores = cpu_Cores;
	}

	public String getCpu_Brand() {
		return cpu_Brand;
	}

	public void setCpu_Brand(String cpu_Brand) {
		this.cpu_Brand = cpu_Brand;
	}

	public int getCpu_Cores() {
		return cpu_Cores;
	}

	public void setCpu_Cores(int cpu_Cores) {
		this.cpu_Cores = cpu_Cores;
	}

	@Override
	public String toString() {
		return "CentralProcessor [cpu_Brand=" + cpu_Brand + ", cpu_Cores=" + cpu_Cores + "]";
	}
	
}
