package com.in2it.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in2it.model.Employee;
import com.in2it.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;

	@Mock
	EmployeeService employeeService;

	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void mockTestByList() {
		List<Employee> list = new ArrayList<>();

		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEmpName("Amit Kumar");
		employee.setEmpAddress("Grater Noida");
		employee.setEmpSalary("1000");
		employee.setEmpPassword("admin");
		employee.setEmpUserName("amit");

		Employee employee2 = new Employee();
		employee2.setEid(2);
		employee2.setEmpName("Amit Kumar");
		employee2.setEmpAddress("Grater Noida");
		employee2.setEmpSalary("1000");
		employee2.setEmpPassword("admin");
		employee2.setEmpUserName("amit");
		list.add(employee2);
		list.add(employee2);

		when(employeeService.getAllEmp()).thenReturn(list);

		List<Employee> list2 = employeeController.getAllEmployee();
		assertEquals(2, list2.size());
		verify(employeeService, times(1)).getAllEmp();
	}

}
