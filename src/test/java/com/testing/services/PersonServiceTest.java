package com.testing.services;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.testing.personrepo.Personrepo;
import com.testing.service.PersonService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

	@Mock
	private Personrepo personrepo;
	
	
	private PersonService personService;
	
	@BeforeEach
	
	void setUp() {
		this.personService=new PersonService(this.personrepo);
	}
	
	@Test
	void getAllPerson() {
		
		personService.getAllPerson();
		
		verify(personrepo).findAll();
		
	}
}
