package com.in2it.entity;

public class Employee {
	int eid;
	String employeeName;
	String address;
	float salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int eid, String employeeName, String address, float salary) {
		super();
		this.eid = eid;
		this.employeeName = employeeName;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", employeeName=" + employeeName + ", address=" + address + ", salary=" + salary
				+ "]";
	}
	
}
