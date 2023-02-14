package com.tbs.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonDetailController {

		@Autowired
		PersonDetailsConfiguration personDetailsConfiguration;
		@RequestMapping("/person-details")
		public PersonDetailsConfiguration personDetails(){
			
			return personDetailsConfiguration;
			
		}
	
}

