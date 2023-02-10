

package com.tbs.springtutorial.examples.a3;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class DependencyInjectionExample {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(DependencyInjectionExample.class)){
			
			
			System.out.println(context.getBean(BusinessClass.class));
			
		}
		

	}

}

@Component
class BusinessClass{
	
	private Dependency1 dep1;
	@Autowired
	private Dependency2 dep2;
	private Dependency3 dep3;
	
	public BusinessClass(Dependency1 dep1){
		this.dep1=dep1;
	}

	public Dependency2 getDep2() {
		return dep2;
	}

	public void setDep2(Dependency2 dep2) {
		this.dep2 = dep2;
	}

	public Dependency3 getDep3() {
		return dep3;
	}
	@Autowired
	public void setDep3(Dependency3 dep3) {
		this.dep3 = dep3;
	}

	@Override
	public String toString() {
		return "BusinessClass [dep1=" + dep1 + ", dep2=" + dep2 + ", dep3=" + dep3 + "]";
	}
	
	
}

@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}
@Component
class Dependency3{
	
}