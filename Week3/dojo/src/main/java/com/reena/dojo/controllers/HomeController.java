package com.reena.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
	@GetMapping("/")
	private String index() {
		return "index.jsp"; 		
	}
	
//	@RequestMapping("/results")
//	@RequestMapping(value="/results", method=RequestMethod.POST)
	@PostMapping("/results")
	private String results(
			@RequestParam String firstName, 
			@RequestParam String email,
			@RequestParam String program,
			Model dojoModel) {
		
		dojoModel.addAttribute("firstName",firstName);
		dojoModel.addAttribute("email",email);
		dojoModel.addAttribute("program",program);
		return "result.jsp";
	}

}
