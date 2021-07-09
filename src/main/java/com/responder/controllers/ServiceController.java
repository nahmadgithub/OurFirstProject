package com.responder.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@GetMapping("/get-service")
	public String getRespondersInYourArea() {
		return "/get-service call!";
	}

}
