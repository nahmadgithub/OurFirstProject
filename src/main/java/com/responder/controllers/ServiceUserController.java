package com.responder.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceUserController {

	@GetMapping("/get-service-users")
	public String getRespondersInYourArea() {
		return "/get-service-users call!";
	}

}
