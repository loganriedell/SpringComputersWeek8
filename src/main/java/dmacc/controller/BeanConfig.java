package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.CentralProcessor;
import dmacc.beans.Computer;
import dmacc.beans.GraphicsProcessor;

@Configuration
public class BeanConfig {
	@Bean
	public Computer computer()
	{
		Computer bean = new Computer("HP", "Windows");
		return bean;
	}
	@Bean 
	public CentralProcessor cpu()
	{
		CentralProcessor bean = new CentralProcessor("Intel", 8);
		return bean;
	}
	@Bean
	public GraphicsProcessor gpu()
	{
		GraphicsProcessor bean = new GraphicsProcessor("AMD", "Ryzen");
		return bean;
	}
}
