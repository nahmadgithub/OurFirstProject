package com.responder.controllers;

import com.responder.models.Responder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceProviderController {

	@GetMapping("/get-responders")
	public List<Responder> getRespondersInYourArea() {
		Responder responder1= Responder.builder()
				.ID("1")
				.Name("Nasir")
				.Description("A very helpful responder")
				.isSecurityCleared(true)
				.build();
		Responder responder2= Responder.builder()
				.ID("2")
				.Name("Kashan")
				.Description("A passionate volunteer")
				.isSecurityCleared(true)
				.build();
		Responder responder3= Responder.builder()
				.ID("3")
				.Name("Ijaz")
				.Description("Temporarily disabled")
				.isSecurityCleared(false)
				.build();
		List<Responder> responderList = new ArrayList<>();
		responderList.add(responder1);
		responderList.add(responder2);
		responderList.add(responder3);

		return responderList;
	}

}
