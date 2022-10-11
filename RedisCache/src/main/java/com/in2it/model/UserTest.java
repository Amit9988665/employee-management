package com.in2it.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash(value="amit")
public class UserTest implements Serializable{

	 
	private static final long serialVersionUID = 1L;
	@Id
	Integer id;
	String userLastName;
	String userFirstName;
	String userEmail;
	String userAge;
	
	public UserTest(Integer id, String userLastName, String userFirstName, String userEmail, String userAge) {
		super();
		this.id = id;
		this.userLastName = userLastName;
		this.userFirstName = userFirstName;
		this.userEmail = userEmail;
		this.userAge = userAge;
	}
	
	public UserTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", userLastName=" + userLastName + ", userFirstName=" + userFirstName
				+ ", userEmail=" + userEmail + ", userAge=" + userAge + "]";
	}
	
	 
}
