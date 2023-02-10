

package com.tbs.springtutorial.examples.a4;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class LazyInitExample {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(LazyInitExample.class)){
			
			
			System.out.println("Context Loaded!");
			context.getBean(Dependency1.class);
			
		}
	}
}



@Component
@Lazy
class Dependency1{
	
	public Dependency1() {
		
		System.out.println("Dependency1 Initialized");
		
	}
	
}
@Component
class Dependency2{
	
public Dependency2() {
		
		System.out.println("Dependency2 Initialized");
		
	}
	
}
