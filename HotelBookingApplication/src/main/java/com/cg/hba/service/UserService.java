package com.cg.hba.service;

import java.util.List;

import com.cg.hba.entity.User;
import com.cg.hba.repositoy.UserRepository;



public interface UserService {

	public User addUser(User user , UserRepository userRepository);
	public User updateUser(Integer user_id);
	public User removeUser(Integer user_id);
	public List<User> ShowAllUser();
	public User ShowUser(Integer user_id);


}
