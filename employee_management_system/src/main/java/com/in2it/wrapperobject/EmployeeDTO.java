package com.in2it.wrapperobject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmployeeDTO {

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

	public EmployeeDTO(int eid, String empName, String empUserName, String empPassword, String empAddress,
			String empSalary) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empUserName = empUserName;
		this.empPassword = empPassword;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	public EmployeeDTO() {
		super();
	}

}
