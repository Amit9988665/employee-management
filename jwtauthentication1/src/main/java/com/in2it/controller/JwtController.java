package com.in2it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in2it.config.JwtTokenUtil;
import com.in2it.model.JwtRequest;
import com.in2it.model.JwtResponse;
import com.in2it.service.CustomUserDetailsService;

@RestController
public class JwtController {
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	AuthenticationManager authenticationManager;

	@RequestMapping(value="/token", method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception
	{
		System.out.println(jwtRequest);
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(), jwtRequest.getPassword()));
		}catch (UsernameNotFoundException e) {
			 e.printStackTrace();
			 throw new Exception("Bad Credentials");
		}
	
		UserDetails userDetails=this.customUserDetailsService.loadUserByUsername(jwtRequest.getUserName());
		String token=this.jwtTokenUtil.generateToken(userDetails);
		System.out.println(token);
		
		return ResponseEntity.ok(new JwtResponse(token));
	}
}
