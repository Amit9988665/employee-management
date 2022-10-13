package com.in2it.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Builder;
import lombok.Data;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eid;

	@NotBlank(message = "Employee name is blank")
	@NotNull(message = "Employee name is null")
	String empName;

	@NotBlank(message = "Employee user name is blank")
	@NotNull(message = "Employee user name is null")
	String empUserName;

	@NotBlank(message = "Employee password is blank")
	@NotNull(message = "Employee passwor is null")
	String empPassword;

	@NotBlank(message = "Employee Address is blank")
	@NotNull(message = "Employee address is null")
	String empAddress;

	String empSalary;

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(joinColumns = { @JoinColumn(name = "empolyees_eid") }, inverseJoinColumns = {
			@JoinColumn(name = "departments_did") })
	List<Department> departments;

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpUserName() {
		return empUserName;
	}

	public void setEmpUserName(String empUserName) {
		this.empUserName = empUserName;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", empUserName=" + empUserName + ", empPassword="
				+ empPassword + ", empAddress=" + empAddress + ", empSalary=" + empSalary + "]";
	}

	public Employee(int eid, String empName, String empUserName, String empPassword, String empAddress,
			String empSalary, List<Department> departments) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empUserName = empUserName;
		this.empPassword = empPassword;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.departments = departments;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

}
