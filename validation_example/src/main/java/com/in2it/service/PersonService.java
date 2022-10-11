package com.in2it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in2it.dto.PersonDTO;
import com.in2it.exception.UserNotFoundException;
import com.in2it.model.Persons;
import com.in2it.repo.PersonRepository;

@Service
public class PersonService implements PersonServiceImpl {

	@Autowired
	private PersonRepository personRepository;

	public Persons savePerson(PersonDTO personDTO) {
		Persons persons = new Persons();
		/**
		 *** Persons persons=Persons.build(0, personDTO.getPersonName(),
		 * personDTO.getPersonAddress(),personDTO.getPersonEmail(),
		 * personDTO.getPersonPhoneNo());
		 */
		persons.setPersonName(personDTO.getPersonName());
		persons.setPersonAddress(personDTO.getPersonAddress());
		persons.setPersonEmail(personDTO.getPersonEmail());
		persons.setPersonPhoneNo(personDTO.getPersonPhoneNo());

		return personRepository.save(persons);
	}

	public List<Persons> getAllPersons() {
		return personRepository.findAll();
	}

	public Persons getPersonById(int id) throws UserNotFoundException {

		return personRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found exception"));
	}

}
