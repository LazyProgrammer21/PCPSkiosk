package com.assignment.model;

import java.sql.Blob;

public class Collegedetail {
	
	private String collegeIntro;
	private String courses;
	private String contact;
	private String Aboutus;
	private Blob logo;
	
	
	public Blob getLogo() {
		return logo;
	}
	public void setLogo(Blob logo) {
		this.logo = logo;
	}
	public String getCollegeIntro() {
		return collegeIntro;
	}
	public void setCollegeIntro(String collegeIntro) {
		this.collegeIntro = collegeIntro;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAboutus() {
		return Aboutus;
	}
	public void setAboutus(String aboutus) {
		Aboutus = aboutus;
	}
	

}
