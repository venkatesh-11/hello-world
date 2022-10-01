package com.example.jocata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/get")
	public String getName() {
		
		return "This is venkatesh";
	}
	
	
	@RequestMapping("/id")
	public String getId() {
		
		return "Venaktesh id is : 101";
	}
}
