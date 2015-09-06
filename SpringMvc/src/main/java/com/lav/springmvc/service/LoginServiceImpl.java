package com.lav.springmvc.service;

import org.springframework.stereotype.Service;

@Service("loginServiceImpl")
public class LoginServiceImpl implements IUserService{
	
	public boolean proccess(String uName, String password) {
		if ((uName.isEmpty() || uName.equals("null")) && (password.isEmpty() || password.equals("null"))){
			return true;
		}
		return false;
	}
}
