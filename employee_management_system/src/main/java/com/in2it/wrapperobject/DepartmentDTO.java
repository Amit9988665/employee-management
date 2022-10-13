package com.in2it.wrapperobject;

import java.util.List;

public class DepartmentDTO {

	int did;

	String depName;

	String depAddress;

	String depEmailId;

	String depPhoneNo;

	List<EmployeeDTO> empDTO;

	public DepartmentDTO() {
	}

	public DepartmentDTO(int did, String depName, String depAddress, String depEmailId, String depPhoneNo,
			List<EmployeeDTO> empDTO) {
		super();
		this.did = did;
		this.depName = depName;
		this.depAddress = depAddress;
		this.depEmailId = depEmailId;
		this.depPhoneNo = depPhoneNo;
		this.empDTO = empDTO;
	}

	public List<EmployeeDTO> getEmpDTO() {
		return empDTO;
	}

	public void setEmpDTO(List<EmployeeDTO> empDTO) {
		this.empDTO = empDTO;
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
