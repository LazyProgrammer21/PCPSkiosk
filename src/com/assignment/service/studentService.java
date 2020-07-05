package com.assignment.service;

import java.math.BigInteger;
import java.util.List;

import com.assignment.model.studentinfo;


public interface studentService {
	
	boolean newRegister(studentinfo student);
	boolean addStudentadmin(int uniId, String Name);
	long getuniIDdb(BigInteger id);
	boolean setPKofSubject(int subject_id,int section_id,int sem_id);


}
