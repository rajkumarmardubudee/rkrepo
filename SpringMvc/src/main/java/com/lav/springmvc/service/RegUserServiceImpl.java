package com.lav.springmvc.service;

import org.springframework.stereotype.Service;

@Service("regUserServiceImpl")
public class RegUserServiceImpl implements IUserService{

	String userName;
	String password;

	public boolean proccess(String uName, String password) {
		if ((uName.isEmpty() || uName.equals("null")) && (password.isEmpty() || password.equals("null"))){
			userName = uName;
			this.password = password;
			System.out.println("UserName:"+uName+"\n Password : "+password);
			return true;
		}
		return false;
	}
}
