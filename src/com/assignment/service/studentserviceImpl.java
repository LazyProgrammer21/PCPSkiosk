package com.assignment.service;

import java.math.BigInteger;
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
	public boolean newRegister(studentinfo student, int courseID, int semID, int sectionID) {
		String sql = "insert into studentinfo(clzID,Name,Email,DOB,Gender,Add_city,Add_state,zipCode,phone,passWord,courseID,semID,sectionID) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		   try 
		   {
			   PreparedStatement stmt = con.prepareStatement(sql);
			   long longval = student.getClzId().longValue();
			
			   stmt.setLong(1, longval);
			   stmt.setString(2, student.getName());
			   stmt.setString(3, student.getEmail());
			   stmt.setDate(4, student.getDob());
			   stmt.setString(5, student.getGender());
			   stmt.setString(6, student.getAdd_city());
			   stmt.setString(7,student.getAdd_state());
			   stmt.setString(8, student.getZipCode());
			   stmt.setString(9, student.getPhone());
			   stmt.setString(10, student.getPassWord());
			   stmt.setInt(11, courseID);
			   stmt.setInt(12, semID);
			   stmt.setInt(13, sectionID);
			   
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
	public long getuniIDdb(BigInteger uid) {
			
			long longvalue_of_uid = uid.longValue();
			long id;
			long acvalue=0;
		String sql = "select uniID from AdminStudentrecord ";
				
			Statement s;
			try {
				s = con.createStatement();
				ResultSet rs = s.executeQuery(sql);
				while(rs.next()) {
				 id = rs.getLong(1);
				if(id==longvalue_of_uid) {
					acvalue=id;
				}
				 					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

		return acvalue;
	}
	@Override
	public boolean updateAdmintable(String status,int x) {
		boolean value=false;
		System.out.println(status);
		
		String sql = "update adminstudentrecord set status = \'"+status+"'"+"where uniID="+x;
	try {
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.execute();
		value=true;
		stmt.close();
		con.close();
		
	}
	catch(SQLException e ) {
		e.printStackTrace();
	}
		
		
		
		
		
		return value;
	}
	@Override
	public boolean checkstatuscolumn_of_studentadminrecord(BigInteger x) {
		boolean stv=true;
//		System.out.println(x);
		
		
		
		try {
			String sql ="select status from adminstudentrecord where uniID="+x;
			
			Statement st1 = con.createStatement();
			ResultSet rrset = st1.executeQuery(sql);
			
			rrset.next();
	
			String xu = rrset.getString("status");
			if(xu.equals("Taken")) {
				stv=false;
			}
			System.out.println(xu);

			
		}
		catch(SQLException e) {
//		System.out.println("Data Fetch Failed");
			e.printStackTrace();
		}

		
		
		return stv;
	}


	
	



}
