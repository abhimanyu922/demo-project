package com.myproject.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
	
	
	
	@GetMapping("/hellpworld")
	public String helloworld() {
		return "hello world";
	}
	
	@GetMapping("sayhi")
	public String sayhi() {
		return "hi from springboot";
		
	
	}

}
