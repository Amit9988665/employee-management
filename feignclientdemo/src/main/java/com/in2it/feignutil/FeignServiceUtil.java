package com.in2it.feignutil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.in2it.model.Employee;

@FeignClient(value = "feignDemo", url = "http://10.0.1.35:5600/api/cancel_lead_reason")
public interface FeignServiceUtil {
 
	@GetMapping("/getemp")
	List<Employee> getEmployeeList();
	
	@PostMapping("/save")
	String savEmployee(Employee employee);
	
	@GetMapping("/getbyid/{eid}")
	Optional<Employee> getEmployeeById(@PathVariable("eid") int eid);
	
	@GetMapping("/dropdown")
	public ArrayList<ArrayList<Object>> getDropdown();

}
