package com.codingtips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {
	
	
	public static void main(String[] args) {
		
        //shortcut for storing  run method return type is ctrl + 1 ;		
		
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
	   
		
		
		
	}

}
