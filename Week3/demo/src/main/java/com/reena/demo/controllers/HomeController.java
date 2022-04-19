package com.reena.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/student")
	public String students(Model studentModel ) {
		String student="Brody";
		String city="Chicago";
		studentModel.addAttribute("studentName",student);
		studentModel.addAttribute("city",city);
		
		return "student.jsp";
	}
	
	@RequestMapping("/stacks")
	public String stacks(Model model) {
		ArrayList<String> stacks=new ArrayList<>();
		stacks.add("Java");
		stacks.add("Python");
		stacks.add("MERN");		
		model.addAttribute("myStacks",stacks);
		return "stacks.jsp";
	}
	

}
