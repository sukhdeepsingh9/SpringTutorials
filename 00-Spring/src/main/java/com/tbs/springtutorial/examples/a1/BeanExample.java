package com.tbs.springtutorial.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanExample {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(BeanExample.class)){
			
			
			System.out.println(context.getBean("person1",Person.class));
			System.out.println(context.getBean("person2",Person.class));
		}
		

	}
	
	record Person (String name,String lastName, int age) {};
	
	@Bean
	public String name() {
		return "Ravi";
	}
	
	@Bean 
	public int age() {
		return 15;
	}
	@Bean(name="lastName1")
	public String lastName1() {
		return "Last1";
	}
	@Bean(name="lastName2")
	public String lastName2() {
		return "Last2";
	}
	@Bean 
	public Person person1()
	{
		return new Person(name(),lastName1(),16);
	}
	
	@Bean
	public Person person2(String name, int age,String lastName2) {
		return new Person (name, lastName2,age);
	}
	
	
}

