package com.in2it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in2it.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}
