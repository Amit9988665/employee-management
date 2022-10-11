package com.in2it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.model.Department;
import com.in2it.service.DepartmentServiceImpl;
import com.in2it.wrapperobject.DepartmentDTO;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl departmentServiceImpl;
	

	@PostMapping("/savedep")
	public String saveDep(@RequestBody DepartmentDTO departmentDTO)
	{
		departmentServiceImpl.saveDep(departmentDTO);
		return "Save department successfully";
	}
	
	@GetMapping("/getalldep")
	public List<Department> getAllDep()
	{
		return departmentServiceImpl.getAllDep();
	}
}
