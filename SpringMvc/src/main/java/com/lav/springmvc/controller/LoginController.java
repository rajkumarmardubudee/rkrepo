package com.lav.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lav.springmvc.service.IUserService;

@Controller
public class LoginController {
	@Autowired
	@Qualifier("loginServiceImpl")
	IUserService login;
	
	@RequestMapping(value="/login" ,method = RequestMethod.GET)
	public String login() {
		login.setUserName("Raj");
		System.out.println("User Name:"+login.displayUserName());		
		return "Success";
	}
}
