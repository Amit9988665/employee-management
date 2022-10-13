package com.in2it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in2it.model.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
