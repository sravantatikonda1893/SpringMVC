package com.training.spring_mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {
//	We dont need to mention RequestMethod=GET, As it is by default it takes the request as a get
	@RequestMapping("/login")
	public String emptyForm(){
		return "login";
	}
	
//If the RequestMethod is POST, we need to do it explicitly by specifying
//	If the url is specified by /login with post,the following method is called
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validate(@RequestParam("username") String uname, @RequestParam String pwd)
	{
		System.out.println("uname is:"+uname+"password is "+pwd);
		return "success";
		
	}

}
