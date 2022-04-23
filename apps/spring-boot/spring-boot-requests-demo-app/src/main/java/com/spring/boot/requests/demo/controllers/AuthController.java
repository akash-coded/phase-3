package com.spring.boot.requests.demo.controllers;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Map<String, String> register(@RequestParam MultiValueMap<String, String> userInfo) {
		Map<String, String> registeredUserDetails = userInfo.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get(0)));

		registeredUserDetails.put("message", "User registration successful!");

		return registeredUserDetails;
	}

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Boolean login(@RequestParam MultiValueMap<String, String> userCredentials) {
		String acceptedUsername = "akdas";
		String acceptedPassword = "qwerty@123";

		return userCredentials.get("username").get(0).equals(acceptedUsername)
				&& userCredentials.get("password").get(0).equals(acceptedPassword);
	}

}
