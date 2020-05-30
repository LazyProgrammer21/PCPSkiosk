package com.assignment.service;

import com.assignment.model.AdminPassword;

public interface AdminPassService {
	boolean adminLogin (AdminPassword pw);
	
	AdminPassword getbyID (int id);
	
}
