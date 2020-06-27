package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.assignment.db.database;
import com.assignment.model.studentinfo;


public class studentserviceImpl implements studentService{


	Connection con = null;
	
	public studentserviceImpl() {
		
		con = database.getDBConnection();
	
	}
	@Override
	public boolean newRegister(studentinfo student) {
		String sql = "insert into studentinfo(clzID,Name,Email,DOB,Gender,Add_city,Add_state,zipCode,phone,passWord) values(?,?,?,?,?,?,?,?,?,?)";
		
		   try 
		   {
			   PreparedStatement stmt = con.prepareStatement(sql);
			
			   stmt.setInt(1, student.getClzId());
			   stmt.setString(2, student.getName());
			   stmt.setString(3, student.getEmail());
			   stmt.setDate(4, student.getDob());
			   stmt.setString(5, student.getGender());
			   stmt.setString(6, student.getAdd_city());
			   stmt.setString(7,student.getAdd_state());
			   stmt.setString(8, student.getZipCode());
			   stmt.setString(9, student.getPhone());
			   stmt.setString(10, student.getPassWord());
			   
			   stmt.execute();
			   
			   return true;
			
			} 
		   catch (SQLException e) {
			
			      System.out.println(e);
		    }
			
		
		
		
		return false;
	}
	@Override
	public boolean addStudentadmin(int uniId, String Name) {
		String sql = "insert into AdminStudentrecord(uniID,StudentName) values(?,?)";
		  try 
		   {
			   PreparedStatement stmt = con.prepareStatement(sql);
			
			   stmt.setInt(1,uniId);
			   stmt.setString(2,Name);
		
			   
			   stmt.execute();
			   
			   return true;
			
			} 
		   catch (SQLException e) {
			
			      System.out.println(e);
		    }
		return false;
	}
	@Override
	public int getuniIDdb(int uid) {
		
		int id=0;
		
		String sql = "select uniID from AdminStudentrecord ";
		
		
			Statement s;
			try {
				s = con.createStatement();
				ResultSet rs = s.executeQuery(sql);
				while(rs.next()) {
				 id = rs.getInt(1);
				if(id==uid)
				{
					break;
				}
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

		return id;
	}
	



}
