package org.hcl.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping
	public String showform() {
		System.out.println("page loaded");
		return "welcome spring boot page !";
	}
	
	@GetMapping("/hello")
	public String helloprint() {
		return "hello build1";
	}
	@GetMapping("/jenkins")
	public String hellojenkins() {
		return "hello jenkins";
	}
	

}
