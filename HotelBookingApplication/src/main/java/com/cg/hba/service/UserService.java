package com.cg.hba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hba.entity.User;
import com.cg.hba.exceptions.RemoveUserException;
import com.cg.hba.exceptions.UserNotFoundException;


@Service
public interface UserService {

	public User addUser(User user );
	public String removeUser(Integer user_id) throws RemoveUserException;
	public List<User> ShowAllUser() throws UserNotFoundException;
	public User ShowUser(Integer user_id) throws UserNotFoundException;
	public User updateUser(Integer user_id , User user)throws UserNotFoundException;


}
