package com.login.rest.webservices.restfullwebservices.userlogin.bean;

import org.omg.CORBA.PRIVATE_MEMBER;

public class LoginBean {
	private String message;

	public LoginBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginBean [message=" + message + "]";
	}

	
}
