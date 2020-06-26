package com.assignment.service;

import com.assignment.model.studentinfo;

public interface studentService {
	
	boolean newRegister(studentinfo student);
	boolean addStudentadmin(int uniId, String Name);

}
