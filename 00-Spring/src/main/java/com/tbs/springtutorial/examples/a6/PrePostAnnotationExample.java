

package com.tbs.springtutorial.examples.a6;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
@ComponentScan
public class PrePostAnnotationExample {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(PrePostAnnotationExample.class)){
			
			
			System.out.println("Context Loaded!");
			
		}
	}
}



@Component
class Dependency1{
	
	public Dependency1() {
		
		System.out.println("Dependency1 Initialized");
		
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("After init!");
	}
	@PreDestroy
	public void close() {
		System.out.println("Before Destruction!");
	}
}

