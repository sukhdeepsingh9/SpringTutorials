package com.tbs.springtutorial.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingSpringApplication {

	public static void main(String[] args) {
		
			try(var context=new AnnotationConfigApplicationContext(GamingSpringApplication.class)){
				
				GameRunner runner=context.getBean(GameRunner.class);		
				runner.run();
				
				
			}
		}
}
