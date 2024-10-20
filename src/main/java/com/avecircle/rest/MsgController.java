package com.avecircle.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String msg="Welcome to Home";
		
		return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String msg="Good Mornig...";
		
		return msg;
	}

	@GetMapping("/")
	public String getHomeMsg()
	{
		String msg="Home Page...";
		
		return msg;
	}
}
