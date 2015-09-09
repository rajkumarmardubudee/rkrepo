package com.lav.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lav.sprinmvc.dto.StudentDTO;

@Controller
public class RegistrantController {
	
	@RequestMapping(value = "/register", method= RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody String createRegistrant(@RequestBody StudentDTO studentDTO) {
		System.out.println(studentDTO.toString());
		return "Success";
	}
}
