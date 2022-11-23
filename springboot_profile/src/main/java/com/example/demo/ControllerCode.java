package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCode {

	@Value("${message}")
	String message;

	@GetMapping("/msg")
	public String getMessage() {

		System.out.println(message);
		return message;
	}

}
