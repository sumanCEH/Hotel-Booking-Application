package com.cg.hba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hba.entity.User;


@Service
public interface UserService {

	public User addUser(User user );
	public String removeUser(Integer user_id);
	public List<User> ShowAllUser();
	public User ShowUser(Integer user_id);
	public User updateUser(Integer user_id , User user);


}
