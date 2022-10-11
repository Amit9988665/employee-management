package com.in2it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in2it.model.Persons;

public interface PersonRepository extends JpaRepository<Persons, Integer>{

}
