package com.assignment.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.assignment.db.database;


public class sectionServiceImpl implements sectionService {
	Connection con = null;
	public sectionServiceImpl() {
		con=database.getDBConnection();
	}

	@Override
	public int getsecvalue(String sec) {
		int s_id;
		String s_name;
		int setthisvalue=0;
		String sql = "select * from Section";
		
		Statement stmt;
		try {
			stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				s_name=rs.getString(2);
				if(sec.equals(s_name)) {
					s_id=rs.getInt(1);
					setthisvalue=s_id;
				
			}
		}
		}
			catch(SQLException e) {
				System.out.println("Database COnnection Intrupeted");
				e.printStackTrace();
			}
			
		

		
		
		
		return setthisvalue;
	}

}
