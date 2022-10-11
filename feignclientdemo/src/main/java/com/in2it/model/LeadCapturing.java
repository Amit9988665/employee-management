package com.in2it.model;

public class LeadCapturing {
	public int id;
	public String value;

	public LeadCapturing() {
		super();
	}

	public LeadCapturing(int id, String value) {
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
