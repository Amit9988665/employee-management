package com.in2it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.in2it.model.Employee;

@Service
public class RestService {

	private final RestTemplate restTemplate;

	@Autowired
	public RestService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Employee[] getAllEmp() {
		return restTemplate.getForObject("http://localhost:8080/getemp", Employee[].class);
	}

	public ResponseEntity<String> saveEmployee(Employee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Employee> httpEntity = new HttpEntity<Employee>(employee, headers);
		return restTemplate.exchange("http://localhost:8080/save", HttpMethod.POST, httpEntity, String.class);
	}

	public ResponseEntity<String> updateEmpById(Employee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Employee> httpEntity = new HttpEntity<Employee>(employee, headers);
		return restTemplate.exchange("http://localhost:8080/update", HttpMethod.PUT, httpEntity, String.class);
	}

	public ResponseEntity<Employee> getEmpById(int Id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> httpEntity = new HttpEntity<String>(headers);
		return restTemplate.exchange("http://localhost:8080/getbyid/{id}", HttpMethod.GET, httpEntity, Employee.class,
				Id);
	}

	public ResponseEntity<String> deleteEmpById(int Id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> httpEntity = new HttpEntity<>(headers);
		return restTemplate.exchange("http://localhost:8080/{id}", HttpMethod.DELETE, httpEntity, String.class, Id);
	}

}
