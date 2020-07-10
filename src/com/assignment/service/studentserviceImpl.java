package com.assignment.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
	public boolean updateAdmintable(int x) {
		
		System.out.println(x);
		String status="Taken";
		
		String sql = "update adminstudentrecord set status = \'"+status+"'"+"where uniID="+x;
	try {
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.execute();
		
	
		
	}
	catch(SQLException e ) {
		e.printStackTrace();
	}
		
		
		
		
		
		return false;
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
	@Override
	public List<studentinfo> getstudentDetailbyID(int stdid) {
		
		List<studentinfo> st_info = new ArrayList<>();
		String sql = "select * from studentinfo where clzID=?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				studentinfo sinfo = new studentinfo();
				BigInteger cid =  BigInteger.valueOf(rs.getInt("clzID"));
				sinfo.setClzId(cid);
				sinfo.setName(rs.getString(""));
				sinfo.setEmail(rs.getString(""));
				sinfo.setDob(rs.getDate(""));
				sinfo.setGender(rs.getString(""));
				sinfo.setAdd_city(rs.getString(""));
				sinfo.setAdd_state(rs.getString(""));
				sinfo.setZipCode(rs.getString(""));
				sinfo.setPassWord(rs.getString(""));
				sinfo.setPhone(rs.getString(""));
				st_info.add(sinfo);
				
			
			
				
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return st_info;
	}
	@Override
	public boolean studentloginIn(BigInteger clzid, String Password) {
		
		System.out.println(clzid);
		System.out.println(Password);
		boolean x= false;
		
		
		String sql = "select clzID,passWord from studentinfo where clzID="+clzid;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				if((clzid==BigInteger.valueOf(rs.getInt("clzID")))&&(rs.getString("passWord").equals(Password)))
//				{
//				rs.getInt("clzID");
//				rs.getString("passWord");
					System.out.println(rs.getInt("clzID"));
					System.out.println(rs.getString("passWord"));
//					System.out.println("helo");
					x=true;
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "Invalid username");
//					x=false;
//				}
				
					
				
						
				
			}
			
			
		}
		catch(SQLException e) {
//			e.printStackTrace();
			
		}
		
		return true;
	}


	
	



}
