package com.in2it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("welcome to the contact page");
		return "contact";
	}
}
