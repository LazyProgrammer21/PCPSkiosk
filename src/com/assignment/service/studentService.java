package com.assignment.service;

import java.math.BigInteger;


import com.assignment.model.studentinfo;


public interface studentService {
	
	boolean newRegister(studentinfo student,int courseID, int semID, int sectionID);
	boolean addStudentadmin(int uniId, String Name);
	long getuniIDdb(BigInteger id);
	boolean updateAdmintable(String status,int uniID);
	boolean checkstatuscolumn_of_studentadminrecord(BigInteger checkid);



}
