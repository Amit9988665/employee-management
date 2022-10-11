package com.in2it.model;

public class LeadConfirmed {

	public int id;
	public String value;
	public LeadConfirmed() {
		super();
	}
	public LeadConfirmed(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
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
	
}
