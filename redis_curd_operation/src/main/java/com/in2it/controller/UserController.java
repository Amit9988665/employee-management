package com.in2it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.model.UserTest;
import com.in2it.service.UserService;

@RestController
public class UserController {

	@Autowired
	 UserService userService;

	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody UserTest user) {
		boolean result=userService.saveUser(user);
		if (result) {
			return ResponseEntity.ok("user created sucessgully");
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@GetMapping("/getalluser")
	public ResponseEntity<List<UserTest>> getUsers(){
		List<UserTest> userList=userService.fetchAllUsers();
		return ResponseEntity.ok(userList);
	}
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<UserTest> fetchById(@PathVariable Integer id)
	{
		UserTest users=userService.fetchById(id);
		return ResponseEntity.ok(users);
	}
}
