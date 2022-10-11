package com.in2it.model;

public class LeadProgressed {

	public int id;
	public String value;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public LeadProgressed(int id, String value) {
		this.id = id;
		this.value = value;
	}
	public LeadProgressed() {
		 
	}
	
}
