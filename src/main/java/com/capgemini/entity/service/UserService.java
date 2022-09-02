package com.capgemini.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.entity.User;
import com.capgemini.exception.RemoveUserException;
import com.capgemini.exception.UserNotFoundException;


@Service
public interface UserService {

	public User addUser(User user );
	public String removeUser(Integer user_id) throws RemoveUserException;
	public List<User> ShowAllUser() throws UserNotFoundException;
	public User ShowUser(Integer user_id) throws UserNotFoundException;
	public User updateUser(Integer user_id , User user)throws UserNotFoundException;


}
