package com.cg.hba.service;

import com.cg.hba.entity.Admin;

public interface AdminService {

	public String signIn(String adminName, String adminPassword);
	public Admin register(Admin admin);
	
}
