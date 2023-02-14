package com.tbs.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping("/persons")
	
	public List<Person> list(){
		
		
		return Arrays.asList(new Person("Tom",15),new Person("Jerry",20));
		
	}
	

}
