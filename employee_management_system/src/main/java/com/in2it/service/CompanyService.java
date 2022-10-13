package com.in2it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in2it.model.Company;
import com.in2it.repository.CompanyRepo;

@Service
public class CompanyService implements CompanyServiceI{
	
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public void saveCompany(Company company) {
		 
		companyRepo.save(company);
	}

	@Override
	public Company getCompanyById(int cid) {
		  
		return companyRepo.findById(cid).get();
	}

}
