package com.assignment.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
	
	public static Connection getDBConnection()
	{
		
	
		try 
		{
			
			
				
			    return DriverManager.getConnection("jdbc:mysql://localhost:3306/kioskdb","root","");
			
				
		
		} 
		
		catch (SQLException e) 
		{
		    e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}
