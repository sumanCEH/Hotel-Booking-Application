package com.cg.hba.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hba.entity.Admin;
import com.cg.hba.repositoy.AdminRepository;

@Service
@Transactional

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	Admin admin ;

	@Override
	public Admin signin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin signout(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
