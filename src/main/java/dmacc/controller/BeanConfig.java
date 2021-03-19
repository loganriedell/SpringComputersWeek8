package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

@Configuration
public class BeanConfig {
	@Bean
	public Computer computer()
	{
		Computer bean = new Computer("HP", "Windows");
		return bean;
	}
	

}
