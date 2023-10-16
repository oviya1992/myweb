package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myweb1Controller {

	
	@GetMapping(value = "/hi")
	public String  show() {
		return "hello";
	}
}
