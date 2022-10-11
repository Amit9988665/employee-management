package com.in2it.model;
 



 
public class Employee {
	
	 
	int eid;
	
	String empName;
	
	
	String empUserName;
	
	String empPassword;
	
	String empAddress;
	
	String empSalary;

	public Employee(int eid, String empName, String empAddress, String empSalary) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	
	public Employee(int eid, String empName, String empUserName, String empPassword, String empAddress,
			String empSalary) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empUserName = empUserName;
		this.empPassword = empPassword;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

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
	
	

}
