package com.in2it.wrapperobject;

public class DepartmentDTO {
	
	int did;
	
	String depName;
	
	String depAddress;
	
	String depEmailId;
	
	String depPhoneNo;

	public DepartmentDTO() {
		 
	}

	public DepartmentDTO(int did, String depName, String depAddress, String depEmailId, String depPhoneNo) {
	 
		this.did = did;
		this.depName = depName;
		this.depAddress = depAddress;
		this.depEmailId = depEmailId;
		this.depPhoneNo = depPhoneNo;
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
	
	
}
