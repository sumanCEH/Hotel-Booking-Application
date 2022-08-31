package com.cg.hba.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hba.entity.User;
import com.cg.hba.exceptions.RemoveUserException;
import com.cg.hba.exceptions.UserNotFoundException;
import com.cg.hba.repositoy.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	User user ;

	
	//add user
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
		
	}

	
	//update user
	
	@Override
	public User updateUser(Integer user_id , User user) throws UserNotFoundException {
		
		
        User userDB = userRepository.findById(user_id).get();
		
		// checking if passed User object properties are null or blank
		if(Objects.nonNull(user.getUser_name()) && !"".equalsIgnoreCase(user.getUser_name())) {
			userDB.setUser_name(user.getUser_name());
		}
		
		if(Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
			userDB.setEmail(user.getEmail());
		}
		
		if(Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {
			userDB.setPassword(user.getPassword());
		}
		

		if(Objects.nonNull(user.getRole()) && !"".equalsIgnoreCase(user.getRole())) {
			userDB.setRole(user.getRole());
		}
		
		if(Objects.nonNull(user.getMobile()) && !"".equalsIgnoreCase(user.getMobile())) {
			userDB.setMobile(user.getMobile());
		}
		
		if(Objects.nonNull(user.getAddress()) && !"".equalsIgnoreCase(user.getAddress())) {
			userDB.setAddress(user.getAddress());
		}
		
		return userRepository.save(userDB);	}

	
	
	//remove user
	
	@Override
	public String removeUser(Integer user_id) throws RemoveUserException {
		
		if(userRepository.findById(user_id).isPresent()) {
		userRepository.deleteById(user_id);
		 return "deleted user";
		}else {
			throw new RemoveUserException("User Not Found");
			
		}

	}

	
	//Show all user
	
	@Override
	public List<User> ShowAllUser() throws UserNotFoundException {
		List<User> list=(List<User>) userRepository.findAll();
		if(list.isEmpty()) {
			throw new UserNotFoundException("No User Found");
		}
        return list;
	}

	
	
	//show user
	
	@Override
	public User ShowUser(Integer user_id) throws UserNotFoundException {
		
		if(userRepository.findById(user_id).isPresent()) {
			User user = userRepository.findById(user_id).get();
			return user;	
		}
		else throw new UserNotFoundException("User Not Found");
		
	}

	
}
