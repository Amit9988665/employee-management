package com.in2it.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int did;

	String depName;

	String depAddress;

	String depEmailId;

	String depPhoneNo;

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="departments")
	List<Employee> employees;

	public Department() {

	}

	public Department(int did, String depName, String depAddress, String depEmailId, String depPhoneNo,
			List<Employee> employees) {
		super();
		this.did = did;
		this.depName = depName;
		this.depAddress = depAddress;
		this.depEmailId = depEmailId;
		this.depPhoneNo = depPhoneNo;
		this.employees = employees;
	}


	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepAddress() {
		return depAddress;
	}

	public void setDepAddress(String depAddress) {
		this.depAddress = depAddress;
	}

	public String getDepEmailId() {
		return depEmailId;
	}

	public void setDepEmailId(String depEmailId) {
		this.depEmailId = depEmailId;
	}

	public String getDepPhoneNo() {
		return depPhoneNo;
	}

	public void setDepPhoneNo(String depPhoneNo) {
		this.depPhoneNo = depPhoneNo;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", depName=" + depName + ", depAddress=" + depAddress + ", depEmailId="
				+ depEmailId + ", depPhoneNo=" + depPhoneNo + ", employees=" + employees + "]";
	}
	

}
