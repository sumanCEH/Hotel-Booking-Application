package com.cg.hba.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class EntryController {
	
	

	@GetMapping("/hello")
	public String sayhello() {
		return "hello everyone";
	}
	
}
