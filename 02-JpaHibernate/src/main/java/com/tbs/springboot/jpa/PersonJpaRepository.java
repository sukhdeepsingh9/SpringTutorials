package com.tbs.springboot.jpa;

import org.springframework.stereotype.Repository;

import com.tbs.springboot.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void save(Person person) {
		entityManager.merge(person);
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	public void deleteById(int id) {
		entityManager.remove(findById(id));
	}
}
