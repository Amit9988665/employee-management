package com.in2it.service;

import java.util.List;

import com.in2it.model.Department;
import com.in2it.wrapperobject.DepartmentDTO;

 
public interface DepartmentServiceImpl {
	
	public void saveDep(DepartmentDTO departmentDTO);
	
	public List<Department> getAllDep();

	void saveDepAndEmp(DepartmentDTO departmentDTO);

	public Department getEmpByDepId(int did);

 

}
