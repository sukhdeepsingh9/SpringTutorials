

package com.tbs.springtutorial.examples.a5;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class ScopeExample {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(ScopeExample.class)){
			
			
			System.out.println("Context Loaded!");
			context.getBean(Dependency1.class);
			context.getBean(Dependency1.class);
			context.getBean(Dependency1.class);
			
			context.getBean(Dependency2.class);
			context.getBean(Dependency2.class);
			context.getBean(Dependency2.class);
			
		}
	}
}



@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
