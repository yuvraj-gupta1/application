package com.springboot.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String root() {
		return "you did it ";
	}
	@RequestMapping("/application")
	public String application() {
		return "you have run application succesfully !!!!!!";
	}
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello !!";
	}

	@RequestMapping("/hi")
	public String hi() {
		return "hi you didi it again !!";
	}
	
}
