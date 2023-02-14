package com.tbs.springboot.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbs.springboot.Person;

public interface SpringDataJpaRepository extends JpaRepository<Person,Integer>{

	public List<Person> findByAge(int age);
	
	
}
