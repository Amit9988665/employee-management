package com.in2it.service;

import java.util.List;

import com.in2it.dto.PersonDTO;
import com.in2it.exception.UserNotFoundException;
import com.in2it.model.Persons;

public interface PersonServiceImpl {

	public Persons savePerson(PersonDTO personDTO);

	public List<Persons> getAllPersons();

	public Persons getPersonById(int id) throws UserNotFoundException;
}
