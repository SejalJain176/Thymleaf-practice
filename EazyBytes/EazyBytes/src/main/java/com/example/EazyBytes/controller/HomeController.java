package com.example.EazyBytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String display() {
		
//		model.addAttribute("username","Sejal");
		return "home.html";
	}
}
