package com.assignment.service;

import java.math.BigInteger;
import java.util.List;

import com.assignment.model.studentinfo;


public interface studentService {
	
	boolean newRegister(studentinfo student,int courseID, int semID, int sectionID);
	boolean addStudentadmin(int uniId, String Name);
	long getuniIDdb(BigInteger id);
	boolean updateAdmintable(int uniID);
	boolean checkstatuscolumn_of_studentadminrecord(int checkid);
	List<studentinfo> getstudentDetailbyID(int stdid);
	boolean studentloginIn(BigInteger clzid, String Password);
	String getdatafromstudentadminrecord_clzid();


}
