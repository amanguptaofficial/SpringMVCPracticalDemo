package com.spr.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {

	@RequestMapping("helloform")
	public String showForm() {
		return "index";
	}

	@RequestMapping(path="/showresult", method=RequestMethod.POST)
	public String handleData(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String pass, Model model) {

		System.out.println("Name is: " + name);
		System.out.println("Email is: " + email);
		System.out.println("Password is: " + pass);

		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);

		return "result";
	}
}
