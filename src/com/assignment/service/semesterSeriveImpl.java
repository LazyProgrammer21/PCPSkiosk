package com.assignment.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.assignment.db.database;

public class semesterSeriveImpl implements semesterService {

	Connection con = null;
	public semesterSeriveImpl() {
		con=database.getDBConnection();
	}
	@Override
	public int getsemesterID(String sem) {
		
		int sem_id;
		String sem_name;
		int setthisvalue=0;
		String sql = "select * from subjectCourse";
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				sem_name=rs.getString(2);
				if(sem.equals(sem_name)) {
					
					sem_id=rs.getInt(1);
					setthisvalue=sem_id;
				}
				
				
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

		return setthisvalue;
	}

}
