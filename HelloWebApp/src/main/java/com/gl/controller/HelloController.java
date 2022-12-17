package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //Sterotype annotation component

public class HelloController {
	
	@RequestMapping("/") //adding request mapping-->URL
	public String giveWelcomeMessage() {
		return "Welcome";
	}
	
	
	@RequestMapping("/hello") //adding request mapping-->URL
	public String giveHelloMessage() {
		return "Hello";
	}
	
	@RequestMapping("/goodbye") //adding request mapping-->URL
	public String givegoodbyeMessage() {
		return "Goodbye";
	}
	
	

}
