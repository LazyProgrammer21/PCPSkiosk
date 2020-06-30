package com.assignment.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.assignment.db.database;


public class courseSubjectImpl implements course {
	
	Connection con = null;
	public courseSubjectImpl() {
		con=database.getDBConnection();
	}

	@Override
	public int getcourseNameID(String course_name) {
		int c_id;
		String c_name;
		int setthisvalue=0;
		String sql = "select * from subjectCourse";
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				c_name=rs.getString(2);
				if(course_name.equals(c_name)) {
					
					c_id=rs.getInt(1);
					setthisvalue=c_id;
				}
				
				
				
			}
		}
		catch(SQLException e) {
			System.out.println("data fetch failed");
		}
		

		return setthisvalue;
	}

}
