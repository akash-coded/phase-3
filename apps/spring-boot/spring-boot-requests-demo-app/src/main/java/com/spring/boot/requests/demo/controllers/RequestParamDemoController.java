package com.spring.boot.requests.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestParamDemo")
public class RequestParamDemoController {
	
	@GetMapping("/showFullName")
	public String showFullName(@RequestParam String firstName,@RequestParam String lastName) {
		return "Full Name: " + firstName + " " + lastName;
	}
	
}
