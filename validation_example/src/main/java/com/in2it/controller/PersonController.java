package com.in2it.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.dto.PersonDTO;
import com.in2it.exception.UserNotFoundException;
import com.in2it.model.Persons;
import com.in2it.service.PersonServiceImpl;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonServiceImpl personServiceImpl;

	@PostMapping("/save")
	public ResponseEntity<Persons> savePerson(@Valid @RequestBody PersonDTO personDTO) {
		return new ResponseEntity<>(personServiceImpl.savePerson(personDTO), HttpStatus.CREATED);
	}

	@GetMapping("/getallperson")
	public ResponseEntity<List<Persons>> getAllPerson() {
		return ResponseEntity.ok(personServiceImpl.getAllPersons());
	}

	@GetMapping("/getbyid/{pid}")
	public ResponseEntity<Persons> getById(@PathVariable int pid) throws UserNotFoundException {
		return ResponseEntity.ok(personServiceImpl.getPersonById(pid));
	}
}
