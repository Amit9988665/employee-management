package com.in2it.service;

import com.in2it.model.Company;

public interface CompanyServiceI {

	void saveCompany(Company company);

	Company getCompanyById(int cid);

}
