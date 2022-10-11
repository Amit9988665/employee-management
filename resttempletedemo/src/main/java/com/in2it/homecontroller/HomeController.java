package com.in2it.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.model.Employee;
import com.in2it.service.RestService;

@RestController
public class HomeController {

	private final RestService restService;

	@Autowired
	public HomeController(RestService restService) {
		super();
		this.restService = restService;
	}

	@GetMapping("/getdata")
	public Employee[] getData() {
		return restService.getAllEmp();
	}

	@PostMapping("/saveemp")
	public String saveEmp(@RequestBody Employee employee) {
		restService.saveEmployee(employee);
		return "save successfully";
	}

	@PutMapping("/updateemp")
	public String updateEmp(@RequestBody Employee employee) {
		restService.updateEmpById(employee);
		return "Update successfully";
	}

	@GetMapping("{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable int eid) {
		return restService.getEmpById(eid);
	}

	@DeleteMapping("{eid}")
	public String deleteById(@PathVariable int eid) {
		restService.deleteEmpById(eid);
		return "delete sucessfully";
	}

}
