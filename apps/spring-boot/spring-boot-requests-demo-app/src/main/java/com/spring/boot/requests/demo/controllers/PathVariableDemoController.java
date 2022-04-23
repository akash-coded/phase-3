package com.spring.boot.requests.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathVariableDemo")
public class PathVariableDemoController {
	
	@GetMapping("/showId/{id}")
	public String showId(@PathVariable Integer id) {
		return "ID: " + id;
	}
	
}
