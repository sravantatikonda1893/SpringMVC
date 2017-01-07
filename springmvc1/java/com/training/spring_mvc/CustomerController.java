package com.training.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CustomerController {
@RequestMapping("/customer/add")
//When there is a method with return type as object, DispatcherServlet will think as it got both ViewName and the model Attribute
	public ModelAndView signupForm()
{
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("AddCustomer");
//	Customer c=new Customer(); we can prepopulate if we want to
//	c.setFirstname("please enter first name");
//	c.setLastname("please enter last name");
//	The below line will set the bean in the request scope using request.setAttribut() method internally to be set by AddCustomer.jsp
	modelAndView.addObject("customer",new Customer());
	return modelAndView;	
}
@RequestMapping(value="/customer/add", method=RequestMethod.POST)
public String saveCustomer(Customer customer)
{
// We just need to create a Customer bean, Spring will provide us the fully populated bean with the values taken from the user
//using the form. It also performs a validations for us on all the form fields.
	System.out.println("First Name is:"+customer.getFirstname());
	System.out.println("First Name is:"+customer.getLastname());
	System.out.println("First Name is:"+customer.getCity());
	System.out.println("First Name is:"+customer.getState());
	System.out.println("First Name is:"+customer.getZipcode());
	return "success";
}
}
