package com.capgemini.entity.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Admin;
import com.capgemini.entity.repository.AdminRepository;

@Service
@Transactional

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
//	@Autowired
//	Admin admin ;

	@Override
	public Admin register(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public String signIn(String adminName, String adminPassword) {
		
		Admin adminDb = adminRepository.getCredentials(adminName, adminPassword);
		
		if (adminDb != null) {
			if(adminDb.getAdmin_name().equals(adminName) == true && adminDb.getPassword().equals(adminPassword) == true) {
				return "okk";
			}
			else {
				return "unauthorised access";
			}
		}
		return "invalid credentials";
	}

}
