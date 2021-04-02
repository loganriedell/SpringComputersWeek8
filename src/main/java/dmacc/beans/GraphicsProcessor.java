package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.NoArgsConstructor;

@Embeddable
public class GraphicsProcessor {
	
	private String gpu_Brand;
	private String gpu_Series;
	
	public GraphicsProcessor() {
		super();
	}
	
	public GraphicsProcessor(String gpu_Brand, String gpu_Series)
	{
		this.gpu_Brand = gpu_Brand;
		this.gpu_Series = gpu_Series;
	}

	public String getGpu_Brand() {
		return gpu_Brand;
	}

	public void setGpu_Brand(String gpu_Brand) {
		this.gpu_Brand = gpu_Brand;
	}

	public String getGpu_Series() {
		return gpu_Series;
	}

	public void setGpu_Series(String gpu_Series) {
		this.gpu_Series = gpu_Series;
	}

	@Override
	public String toString() {
		return "GraphicsProcessor [gpu_Brand=" + gpu_Brand + ", gpu_Series=" + gpu_Series + "]";
	}
	
	
}
