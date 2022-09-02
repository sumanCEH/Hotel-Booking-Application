package com.capgemini.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Admin;
import com.capgemini.entity.service.AdminService;



@RestController
@RequestMapping("/")
public class EntryController {
	
	

	@GetMapping("/hello")
	public String sayhello() {
		return "hello everyone";
	}
	

	@Autowired
	AdminService adminService;


	@PostMapping("/register")
	public ResponseEntity<Admin>register(@RequestBody Admin admin) {

		return new ResponseEntity<>(adminService.register(admin),HttpStatus.OK);

	}
	
	@PostMapping("/signin")
	public ResponseEntity<String>signIn(@RequestParam String adminName, @RequestParam String adminPassword) {
	
		return new ResponseEntity<>(adminService.signIn(adminName, adminPassword),HttpStatus.OK);
	}

}