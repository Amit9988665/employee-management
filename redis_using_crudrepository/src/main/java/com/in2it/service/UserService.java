package com.in2it.service;

import java.util.List;
import java.util.Optional;

import com.in2it.model.UserTest;

public interface UserService {
	
	public String saveUser(UserTest userTest);
	
	public List<UserTest> getAllUser();
	
	public Optional<UserTest> getById(int id);
	
	public String deleteById(int id);
	
	public String updateById(UserTest userTest);

}
