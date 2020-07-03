package com.assignment.service;

import java.math.BigInteger;
import java.util.List;

import com.assignment.model.studentinfo;


public interface studentService {
	
	boolean newRegister(studentinfo student,int subj_id,int semid,int secid);
	boolean addStudentadmin(int uniId, String Name);
	long getuniIDdb(BigInteger id);

	boolean updateAdmintable();

}
