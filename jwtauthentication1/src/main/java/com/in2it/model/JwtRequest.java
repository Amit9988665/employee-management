package com.in2it.model;

import java.io.Serializable;

public class JwtRequest implements Serializable{
	
	
	private static final long serialVersionUID = 5926468583005150707L;
	
	String userName;
	String password;
	public JwtRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public JwtRequest() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JwtRequest [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
