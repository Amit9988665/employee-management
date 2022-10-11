package com.in2it.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.entity.Employee;

@RestController
public class EmployeeController {
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		System.out.println(emp.getEid()+" "+emp.getEmployeeName()+" "+emp.getAddress()+" "+emp.getSalary());
				Employee empolyee1=new Employee(emp.getEid(),emp.getEmployeeName(),emp.getAddress(),emp.getSalary());
			
		
		return empolyee1;
		
	}

}
