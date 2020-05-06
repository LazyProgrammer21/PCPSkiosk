package com.assignment.model;

import java.sql.Date;

public class Noticeboard {
	
	private int id;
	private Date dateissued;
	private String subject;
	private String noticeinfo;
	private String issuedby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateissued() {
		return dateissued;
	}
	public void setDateissued(Date dateissued) {
		this.dateissued = dateissued;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getNoticeinfo() {
		return noticeinfo;
	}
	public void setNoticeinfo(String noticeinfo) {
		this.noticeinfo = noticeinfo;
	}
	public String getIssuedby() {
		return issuedby;
	}
	public void setIssuedby(String issuedby) {
		this.issuedby = issuedby;
	}
	

}
