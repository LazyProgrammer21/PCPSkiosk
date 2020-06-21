package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assignment.db.database;
import com.assignment.model.studentinfo;


public class studentserviceImpl implements studentService{


	Connection con = null;
	
	public studentserviceImpl() {
		
		con = database.getDBConnection();
	
	}
	@Override
	public boolean newRegister(studentinfo student) {
		String sql = "insert into studentinfo(clzID,Name,Email,DOB,Gender,Add_city,Add_state,zipCode,passWord) values(?,?,?,?,?,?,?,?,?)";
		
		   try 
		   {
			   PreparedStatement stmt = con.prepareStatement(sql);
			
			   stmt.setInt(1, student.getClzId());
			   stmt.setString(3, student.getName());
			   stmt.setString(4, student.getEmail());
			   stmt.setDate(5, student.getDob());
			   stmt.setString(6, student.getGender());
			   stmt.setString(7, student.getAdd_city());
			   stmt.setString(8,student.getAdd_state());
			   stmt.setString(9, student.getZipCode());
//			   stmt.setInt(10, student.getPhone());
			   stmt.setString(11, student.getPassWord());
			   
			   stmt.execute();
			   
			   return true;
			
			} 
		   catch (SQLException e) {
			
			      System.out.println(e);
		    }
			
		
		
		
		return false;
	}

}
