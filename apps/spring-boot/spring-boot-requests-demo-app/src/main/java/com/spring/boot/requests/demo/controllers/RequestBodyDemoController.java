package com.spring.boot.requests.demo.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestBodyDemo")
public class RequestBodyDemoController {

	@PostMapping("/showRequestBody")
	public Map<String, String> showRequestBody(@RequestBody Map<String, String> requestBody) { // Deserializing the RequestBody to a Map
		requestBody.put("message", "Showing the request payload");
		return requestBody;
	}
	
}
