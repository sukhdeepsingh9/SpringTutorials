package com.tbs.springboot.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tbs.springboot.Person;

@Component
public class PersonSpringDataJpaCommandLineRunner implements CommandLineRunner{

	
	@Autowired
	private SpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Person(1,"Tom DataJPA",20));
		repository.save(new Person(2,"Jerry DataJPA",13));
		repository.save(new Person(3,"Scooby",20));
		repository.deleteById(2);
		System.out.println(repository.findByAge(20));
		
	}

	
}
