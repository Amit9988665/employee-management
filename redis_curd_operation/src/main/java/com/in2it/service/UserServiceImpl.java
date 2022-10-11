package com.in2it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in2it.model.UserTest;
import com.in2it.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = true)
	private UserRepo userRepo;

	@Override
	public boolean saveUser(UserTest user) {
		return userRepo.saveUser(user);
	}

	@Override
	public List<UserTest> fetchAllUsers() {
		return userRepo.fetchAllUser();
	}

	@Override
	public UserTest fetchById(Integer id) {
		return userRepo.fetchById(id);
	}
}
