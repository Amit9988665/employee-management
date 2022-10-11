package com.in2it.service;

import java.util.List;

import com.in2it.model.UserTest;

public interface UserService {

	boolean saveUser(UserTest user);

	List<UserTest> fetchAllUsers();

	UserTest fetchById(Integer id);

	 

}
