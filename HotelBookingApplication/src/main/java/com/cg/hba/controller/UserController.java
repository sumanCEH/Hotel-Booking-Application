package com.cg.hba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hba.entity.User;
import com.cg.hba.exceptions.RemoveUserException;
import com.cg.hba.exceptions.UserNotFoundException;
import com.cg.hba.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	User user;
	
	
	@GetMapping("/showall")
	public ResponseEntity<?> listUser() throws UserNotFoundException{		
		return new ResponseEntity<>(userService.ShowAllUser(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> adduser(@RequestBody User user) {		
		return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
	}
	
	
	@PutMapping("/update/{user_id}")
	public ResponseEntity<?> updateuser(@PathVariable Integer user_id , @RequestBody User user) throws UserNotFoundException {		
		return new ResponseEntity<>(userService.updateUser(user_id , user), HttpStatus.OK);
	}
	
	@GetMapping("/showuser/{user_id}")
	public  ResponseEntity<?> showUser(@PathVariable("user_id") Integer user_id) throws UserNotFoundException {
		return new ResponseEntity<>(userService.ShowUser(user_id),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/remove/{user_id}")
	public ResponseEntity<?> remove(@PathVariable("user_id") Integer user_id ) throws RemoveUserException{
		return new ResponseEntity<>(userService.removeUser(user_id), HttpStatus.OK);
	}
	
}
