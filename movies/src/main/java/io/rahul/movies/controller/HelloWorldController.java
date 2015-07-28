package io.rahul.movies.controller;

import io.rahul.movies.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	GreetingService greetingService;
	
	@RequestMapping("/")
	public String hello() {
		return String.format("%s World!", greetingService.getGreeting());
	}

}
