package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/msg")
@Slf4j
public class ConfigController {


	@Value("${env}")
	String env;
	
	@GetMapping("/v1")
	public String getMessage() {
		log.info("value from properties file"+env);
		log.info("value from properties file"+env);
		log.info("value from properties file"+env);
		log.info("value from properties file"+env);
		log.info("value from properties file"+env);
		log.info("value from properties file"+env);
		log.debug("debug mode"+env);
		
		log.debug("warning in app"+env);
		
		try {
			
			
		}catch(Exception e) {
			log.error("error", e.getMessage());
		}
		
		//System.out.println("value from properties file"+env);
		return env;
	}
}
