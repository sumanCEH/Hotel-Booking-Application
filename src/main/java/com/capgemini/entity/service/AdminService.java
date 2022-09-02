package com.capgemini.entity.service;

import com.capgemini.entity.Admin;

public interface AdminService {

	public String signIn(String adminName, String adminPassword);
	public Admin register(Admin admin);
	
}
