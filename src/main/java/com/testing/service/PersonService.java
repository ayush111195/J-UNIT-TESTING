package com.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.entites.Person;
import com.testing.personrepo.Personrepo;

@Service
public class PersonService {

	@Autowired
	private Personrepo repo;
	
	public List<Person> getAllPerson(){
		return this.repo.findAll();
		
		
	}

	public PersonService(Personrepo repo) {
		super();
		this.repo = repo;
	}
	
}
