package com.in2it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in2it.model.Department;
import com.in2it.repository.DepartmentRepo;
import com.in2it.wrapperobject.DepartmentDTO;

@Service
public class DepartmentService implements DepartmentServiceImpl{
	
	@Autowired
	DepartmentRepo departmentRepo;

	@Override
	public void saveDep(DepartmentDTO departmentDTO) {
		 
		Department department=new Department();
		department.setDepName(departmentDTO.getDepName());
		department.setDepAddress(departmentDTO.getDepAddress());
		department.setDepEmailId(departmentDTO.getDepEmailId());
		department.setDepPhoneNo(departmentDTO.getDepPhoneNo());
		departmentRepo.save(department);
	}

	@Override
	public List<Department> getAllDep() {
		 
		return departmentRepo.findAll();
	}

}
