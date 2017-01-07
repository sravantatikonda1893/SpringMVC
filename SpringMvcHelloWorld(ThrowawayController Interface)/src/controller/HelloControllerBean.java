package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
//Command and Bean same as a ActionSupport child classes in struts2
public class HelloControllerBean implements ThrowawayController {
	
private String name, email, address;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
//Dispatcher servlet will read the form and will store into this bean using its setter methods which are same as the form fields
//then it will execute() method without giving req and res
public ModelAndView execute()
	{
//Some By using the populated(getters) data perform some operations here and mav object
	
	ModelAndView mav=new ModelAndView(getViewName(),m);
		return mav;
	}
	

}


