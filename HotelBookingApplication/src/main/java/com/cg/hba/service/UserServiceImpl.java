package com.cg.hba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hba.entity.User;
import com.cg.hba.repositoy.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	User user ;

	@Override
	public User addUser(User user, UserRepository userRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Integer user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User removeUser(Integer user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> ShowAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User ShowUser(Integer user_id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
