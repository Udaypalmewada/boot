package com.boot.intializer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class App1Test {
	@RequestMapping("/welcome.html")
public ModelAndView welcome() {
	return new ModelAndView("welcome");
}
}
