package com.in2it.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in2it.model.UserTest;
import com.in2it.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public String saveUser(UserTest userTest) {
		userRepo.save(userTest);
		return "Save sucessesfully";
	}

	@Override
	public List<UserTest> getAllUser() {
		return (List<UserTest>) userRepo.findAll();
	}

	@Override
	public Optional<UserTest> getById(int id) {

		return userRepo.findById(id);
	}

	@Override
	public String deleteById(int id) {
		userRepo.deleteById(id);
		return "Delete successfully";
	}

	@Override
	public String updateById(UserTest userTest) {
		userRepo.save(userTest);
		return "update sucessfully";
	}

}
