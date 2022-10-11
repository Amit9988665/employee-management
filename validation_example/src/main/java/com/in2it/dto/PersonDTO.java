package com.in2it.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class PersonDTO {
	int id;
	@NotNull(message = "invalid name")
	@NotBlank(message = "invalid blank name")
	String personName;
	@NotBlank(message = "Invalid address")
	String personAddress;
	@Email(message = "invalid1 Email")
	String personEmail;
	@Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile number")
	String personPhoneNo;
}
