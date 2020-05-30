package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assignment.db.database;
import com.assignment.model.AdminPassword;

public class adminPassServiceImpl implements AdminPassService{
	Connection con = null;

	
	public adminPassServiceImpl() {
		
		con = database.getDBConnection();	
	}
	@Override
	public boolean adminLogin(AdminPassword pw) {
		
		
		
		
		return false;
	}

	
	@Override
	public AdminPassword getbyID(int id) {
		String sql = "select * from AdminRecord where id = ?";
		AdminPassword pw = new AdminPassword();
		
		try {
			    PreparedStatement stmt = con.prepareStatement(sql);
			    stmt.setInt(1, id);
			    ResultSet resultSet = stmt.executeQuery();
			    
			    if(resultSet.next())
			    {
			    	   pw.setId(resultSet.getInt("adminid"));
			    	   pw.setPassword(resultSet.getString("password"));
			    	  
			    	 
			    }
			
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return pw;
	}
	

}
