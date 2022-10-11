package com.in2it.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.model.UserTest;
import com.in2it.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody UserTest userTest) {
		return ResponseEntity.ok(userService.saveUser(userTest));
	}
	 
	@GetMapping("/getalluser")
	public ResponseEntity<List<UserTest>> getAllUser() {
		return ResponseEntity.ok(userService.getAllUser());
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Optional<UserTest>> getById(@PathVariable int id) {
		return ResponseEntity.ok(userService.getById(id));
	}

	@GetMapping("/deletebyid/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		return ResponseEntity.ok(userService.deleteById(id));
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateById(@RequestBody UserTest userTest) {
		return ResponseEntity.ok(userService.updateById(userTest));
	}

}
