package com.login.rest.webservices.restfullwebservices.userlogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.login.rest.webservices.restfullwebservices.userlogin.bean.LoginBean;

@RestController
public class Login {
	
	@GetMapping(path="/login")
	public String login() {
		return "login page";
		
	}
	
	@GetMapping(path="/loginBean")
	public LoginBean loginBean() {
		return new LoginBean("Login-message");
		
	}

}
