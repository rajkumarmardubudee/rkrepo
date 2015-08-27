package com.lav.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements IUserService{
	
	String userName;

	@Override
	public void setUserName(String name) {
		userName = name;		
	}

	@Override
	public String displayUserName() {		
		return userName;
	}

}
