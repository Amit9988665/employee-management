package com.in2it.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.custumexception.UserCustumException;
import com.in2it.model.Department;
import com.in2it.model.Employee;
import com.in2it.service.EmployeeServiceI;
import com.in2it.wrapperobject.EmployeeAndDepartmentData;
import com.in2it.wrapperobject.EmployeeAndDepartmentImpl;
import com.in2it.wrapperobject.EmployeeDTO;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	org.slf4j.Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeServiceI employeeService;

	@GetMapping("/log")
	public String logString() {
		logger.trace("Log Level : trace");

		logger.info("Log level: INFO");
		logger.debug("Log level: DEBUG");
		logger.error("Log level: ERROR");
		logger.warn("Log level: WARN");
		return "Hey! You can check the output in the logs";
	}

	@PostMapping("/save")
	public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeDTO employee) {

		employeeService.saveEmp(employee);

		return new ResponseEntity<>("save succussesfully", HttpStatus.CREATED);

	}

	@GetMapping("/getemp")
	public List<Employee> getAllEmployee() {
		System.out.println("hello Controller");

		return employeeService.getAllEmp();

	}

	@GetMapping("/getbyid/{eid}")
	public Employee getEmployeeById(@PathVariable int eid) throws UserCustumException {

		return employeeService.getByEmpId(eid);

	}

	@DeleteMapping("{eid}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable int eid) throws UserCustumException {

		employeeService.delete(eid);
		return new ResponseEntity<>("Employee deos not eist", HttpStatus.OK);
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody EmployeeDTO employee) {

		employeeService.updateOrSave(employee);
		return "Update sucussefully";
	}

	@GetMapping("/employee/{pageNo}/{pageSize}")
	public List<Employee> getPaginatedCountries(@PathVariable int pageNo, @PathVariable int pageSize) {

		return employeeService.findPaginated(pageNo, pageSize);
	}

	@GetMapping("/getempanddep")
	public EmployeeAndDepartmentData getEmpAndDep() {
		return employeeService.findEmployeesAndDep();
	}

	@GetMapping("/getempanddep1")
	public EmployeeAndDepartmentImpl getEmpAndDep1() {
		return employeeService.getAndDepartmentData();
	}

	@GetMapping("/getempanddep2")
	public Optional<EmployeeAndDepartmentData> getEmpAndDep2() {
		return employeeService.getAndDepartmentData1();
	}

	@GetMapping("/getempbysal")
	public List<Employee> getBySalary() {
		return employeeService.getBySalaryGreaterThen();
	}

	@GetMapping("/getempanddep3")
	public EmployeeAndDepartmentData getEmpAndDep3() {
		return employeeService.getEmployeeAndDepData();
	}

	@PostMapping("/saveempanddep")
	public ResponseEntity<String> saveEmpAndDep(@RequestBody EmployeeDTO dto) {
		employeeService.saveEmpAndDep(dto);
		return ResponseEntity.ok("Successfully save");

	}
	
	@GetMapping("/getdepbyempid/{eid}")
	public ResponseEntity<List<Department>> getDepByEmpId(@PathVariable int eid)
	{
		Employee employee=employeeService.getDepByEmpId(eid); 
		System.out.println(employee.getDepartments());
		
		List<Department> departments=employee.getDepartments();
		
		return ResponseEntity.ok(departments);
		
		
	}
	
}
