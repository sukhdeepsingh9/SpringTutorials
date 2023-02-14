package com.tbs.springboot.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tbs.springboot.Person;

@Repository
public class PersonJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(Person person) {
		jdbcTemplate.update("insert into person values(?,?,?)", person.getId(),person.getName(),person.getAge());	
	}
	
	public void deleteById(int id) {
		jdbcTemplate.update("delete from person where id=?", id);	
	}
	public Person findById(int id) {
		
		return jdbcTemplate.queryForObject("select * from person where id =?", new BeanPropertyRowMapper<>(Person.class),id);
		
	}
}
