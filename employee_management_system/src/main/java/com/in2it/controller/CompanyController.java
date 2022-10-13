package com.in2it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.model.Company;
import com.in2it.service.CompanyServiceI;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyServiceI companyServiceI;

	@PostMapping("save")
	public ResponseEntity<String> saveCompany(@RequestBody Company company) {
		companyServiceI.saveCompany(company);
		return ResponseEntity.ok("Save Successfully");
	}
	@GetMapping("/getcompanybyid/{cid}")
	public ResponseEntity<Company> getCompanyById(@PathVariable int cid)
	{
	return	ResponseEntity.ok(companyServiceI.getCompanyById(cid));
	}

}
