package com.testing.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.testing.entites.Person;
import com.testing.personrepo.Personrepo;

@SpringBootTest
public class PersonRepoTest {
	
	@Autowired
	private Personrepo personrepo;

	@Test
	void isPersonExitsById() {
		
		Person person =new Person(123,"Ayush","Orai");
		personrepo.save(person);
		
//	     Boolean actualResult = personrepo.isPersonExitsById(123);
//	     
//	     assertThat(actualResult).isTrue();
	}
	
	@AfterEach
	void tearDown() {
		
		System.out.println("tearing down");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("setting up");
	}
}
