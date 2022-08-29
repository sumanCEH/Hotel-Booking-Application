package com.cg.hba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hba.entity.User;
import com.cg.hba.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	User user;
	
	@GetMapping("/getEmployee/{id}")
	public  ResponseEntity<User> viewEmployeeById(@PathVariable(value = "id") Integer user_id)  {
		return new ResponseEntity<>(userService.ShowUser(user_id),HttpStatus.OK);
	}
}
