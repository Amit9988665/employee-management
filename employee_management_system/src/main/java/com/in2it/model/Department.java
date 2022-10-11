package com.in2it.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int did;
	
	String depName;
	
	String depAddress;
	
	String depEmailId;
	
	String depPhoneNo;

	public Department() {
		 
	}

	public Department(int did, String depName, String depAddress, String depEmailId, String depPhoneNo) {
	 
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
