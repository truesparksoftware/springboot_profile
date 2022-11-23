package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	
	@Value("${message}")
	String env;
	

	@GetMapping("/first")
	public String getString() {
	
		System.out.print(env);
		return "first demo";
	}
}
