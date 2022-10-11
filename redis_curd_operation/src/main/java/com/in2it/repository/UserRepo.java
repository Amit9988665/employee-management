package com.in2it.repository;

import java.util.List;

import com.in2it.model.UserTest;

public interface UserRepo {

	boolean saveUser(UserTest user);

	List<UserTest> fetchAllUser();

	UserTest fetchById(Integer id);

}
