package com.in2it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.model.Users;
import com.in2it.repository.UserRepo;

@RestController
@RequestMapping("/home")
public class HomeController {
	
 
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		String text="this is private page";
		return text;
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Users users)
	{
		Users user1=new Users();
		user1.setUserName(user1.getUserName());
		user1.setEmailId(users.getEmailId());
		String encodedpass=bCryptPasswordEncoder.encode(users.getPassword());
		user1.setPassword(encodedpass);
		userRepo.save(users);
		return "save Sucessfully";
	}

}
