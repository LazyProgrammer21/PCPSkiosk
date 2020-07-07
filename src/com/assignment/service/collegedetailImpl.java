package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.assignment.db.database;
import com.assignment.model.collegeinfo;

public class collegedetailImpl implements collegedetailService {
	
	
	Connection con = null;
	
	public collegedetailImpl() {
		con=database.getDBConnection();
	}
	
	

	@Override
	public String getalldetails() {
		String detail = null;
		String intermission = "@@intermission@@";

		String sql = "select * from collegedetail where id=1";
		try {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();
		
		String x = rs.getString(2);
		
		String y = rs.getString(3);
		
		String contactus = rs.getString(4);
		
		detail = x +intermission+ y+ intermission+contactus;
		System.out.println(detail);
		}
		catch(SQLException e) {
			e.printStackTrace();
//			System.out.println("data fetch error!! Check your Internet Connection");
		}
		
		
		
		return detail;
	}



	@Override
	public boolean updatethedetails(collegeinfo clzdetail) {
		
		String x =clzdetail.getClzintro();
		String y = clzdetail.getAboutus();
		String z = clzdetail.getContactus();
		
		String sql = "update collegedetail set ClzIntro=?, AboutUs=?,ContactUs=?  where id=1";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,x );
			stmt.setString(2, y);
			stmt.setString(3,z);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}


}
