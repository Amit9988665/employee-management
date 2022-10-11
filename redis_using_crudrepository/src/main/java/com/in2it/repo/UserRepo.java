package com.in2it.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.in2it.model.UserTest;

@Repository
public interface UserRepo extends CrudRepository<UserTest, Integer>{

}
