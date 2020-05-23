package com.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.web.entity.RegistrationEntity;
import com.boot.web.service.RegistraionService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistraionService registraionService;

	//@RequestMapping("/registration")
	@GetMapping("/home")
	public String home() {
		return "input";
	}

	@RequestMapping(value = "/input", method = {RequestMethod.GET, RequestMethod.POST})
	public String showWelcomePage( @RequestParam String name, @RequestParam String lastname,
			@RequestParam int age, @RequestParam String qualification, @RequestParam String mo_no,
			@RequestParam String email) {

RegistrationEntity model=new RegistrationEntity(name, lastname, age, qualification, mo_no, email);
		registraionService.saveUser(model);
		System.out.println("registration sucess full");
		return "welcome";
	}

}
