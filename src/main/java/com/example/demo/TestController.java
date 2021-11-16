package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	@GetMapping
	public String testController() {
		return "알라밍스~~!";
	}
	
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "Hello aramings! ID : " + testRequestBodyDTO.getId() + " Message :" + testRequestBodyDTO.getMessage();
	}
}
