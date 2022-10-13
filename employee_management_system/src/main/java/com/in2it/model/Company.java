package com.in2it.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
	String cName;
	String cAddress;
	String cEmail;
	String cMobileNo;

	 
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	List<Employee> employees=new ArrayList<>();

 
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	List<Department> departments=new ArrayList<>();

	public Company() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcMobileNo() {
		return cMobileNo;
	}

	public void setcMobileNo(String cMobileNo) {
		this.cMobileNo = cMobileNo;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Company(int cid, String cName, String cAddress, String cEmail, String cMobileNo, List<Employee> employees,
			List<Department> departments) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.cAddress = cAddress;
		this.cEmail = cEmail;
		this.cMobileNo = cMobileNo;
		this.employees = employees;
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cName=" + cName + ", cAddress=" + cAddress + ", cEmail=" + cEmail
				+ ", cMobileNo=" + cMobileNo + ", employees=" + employees + ", departments=" + departments + "]";
	}

}
