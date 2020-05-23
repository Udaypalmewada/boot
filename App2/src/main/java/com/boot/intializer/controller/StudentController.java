package com.boot.intializer.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.boot.intializer.model.Student;
import com.boot.intializer.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	IStudentService studentService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@Valid Student student, BindingResult result, ModelMap model,
			RedirectAttributes redirectAttributes) {
		if(result.hasErrors()){
			return "add";
		}
		return "redirect:/viewstudent1";
	}
}
