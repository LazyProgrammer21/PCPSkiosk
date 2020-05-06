package com.assignment.service;

import com.assignment.model.Student;

public interface studentSerive {

	boolean newRegistration(Student std);
	boolean updateStudent(Student std);
	boolean deleteStudent(int id);
	
	
	
	
}
