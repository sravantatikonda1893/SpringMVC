package com.training.spring_mvc;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class SignUpController {

	//	@AutoWired
	//	CustomerService service;
	@RequestMapping("/signup")
	public ModelAndView emptyForm(){

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("SignUp");
		modelAndView.addObject("customer",new Customer());
		return modelAndView;	

	}
	//	If there are any errors evaluated by Hibernate Validator, 
//	DS will put them in binding result. DS will do it only if we  specify explicitly to validate the 
//	customer bean by using "Valid" annotation
	@RequestMapping(value="/signup", method=RequestMethod.POST)
//	If we want to use any objects we need to pass them as arguments to the method we want use in.
	public String signup(@Valid Customer customer, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
			return "SignUp";
		else{
			//		service.add(customer);
			return "Login";
		}
	}




}
