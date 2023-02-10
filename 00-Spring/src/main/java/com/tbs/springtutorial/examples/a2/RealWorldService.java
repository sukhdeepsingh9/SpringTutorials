

package com.tbs.springtutorial.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class RealWorldService {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(RealWorldService.class)){
			
			
			System.out.println(context.getBean(BusinessService.class).findMax());
			
		}
		

	}

}


interface DataService{
	int[] getData();
}
@Component
@Primary
class MongoDBService implements DataService
{

	@Override
	public int[] getData() {
		return new int[] {11,22,33,44,55};
	}
	
}
@Component
class MySQLService implements DataService
{

	@Override
	public int[] getData() {
		
		return new int[] {1,2,3,4,5};
	}
	
}
@Component
class BusinessService{
	
	private DataService dataService;
	public BusinessService(DataService dataService) {
		this.dataService=dataService;
	}
	public int findMax() {
		return Arrays.stream(dataService.getData()).max().orElse(0);
	}
	
}
