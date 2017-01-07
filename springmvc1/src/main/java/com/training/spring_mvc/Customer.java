package com.training.spring_mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
// Java bean validation is an API which we need to implement its just a standard
// Hibernate validation is the implementation java bean API
import org.hibernate.validator.constraints.NotEmpty;

public class Customer {
	
@NotEmpty(message="First Name cannot be empty")
@Size(min=3, max=15, message="First Name should be atleast 3 characters")
@Pattern(regexp = "[a-z-A-Z]", message="First Name should be only characters")
private String firstname;

@NotBlank(message="Last Name cannot be empty")
private String lastname;

private String city;

@Max(2)
private String state;

@NotEmpty(message="Zip code cannot be blank")
@Pattern(regexp = "[0-9]* ", message="Zip can take only numbers")
@Max(5)
private String zipcode;
//We used to do the validation messages in properties.messages file in struts 1.x and 2.x

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}


}
