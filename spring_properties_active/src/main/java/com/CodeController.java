package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/controller")
@RestController
public class CodeController {
	
	@Value("${msg}")
	String message;
	
	@GetMapping("/env")
	public String getEnv() {
		return message;
	}

}
