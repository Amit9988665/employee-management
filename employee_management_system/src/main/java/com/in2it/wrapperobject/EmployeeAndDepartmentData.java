package com.in2it.wrapperobject;

public class EmployeeAndDepartmentData {
	
	 
	String empName;

	 
	String empAddress;

	 
	String depName;

	 
	String depAddress;

	public EmployeeAndDepartmentData() {
		 
	}

	public EmployeeAndDepartmentData(String empName, String empAddress, String depName, String depAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.depName = depName;
		this.depAddress = depAddress;
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

	@Override
	public String toString() {
		return "EmployeeAndDepartmentData [empName=" + empName + ", empAddress=" + empAddress + ", depName=" + depName
				+ ", depAddress=" + depAddress + "]";
	}
	

}
