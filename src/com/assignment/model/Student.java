package com.assignment.model;

import java.sql.Blob;
import java.sql.Date;

public class Student {
	
	private int id;
	private String Name;
	private Blob photo;
	private Date dob;
	private String Gender;
	private String Add_city;
	private String Add_state;
	private String password;
	private String zipcode;
	private int phonenumber;
	private int total_event_participated;
	private String level_class;	
	private String status; //if a student has booked a event or not;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAdd_city() {
		return Add_city;
	}
	public void setAdd_city(String add_city) {
		Add_city = add_city;
	}
	public String getAdd_state() {
		return Add_state;
	}
	public void setAdd_state(String add_state) {
		Add_state = add_state;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTotal_event_participated() {
		return total_event_participated;
	}
	public void setTotal_event_participated(int total_event_participated) {
		this.total_event_participated = total_event_participated;
	}
	public String getLevel_class() {
		return level_class;
	}
	public void setLevel_class(String level_class) {
		this.level_class = level_class;
	}
	
	
	

}
