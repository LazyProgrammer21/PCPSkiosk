package com.assignment.model;

import java.sql.Date;

public class Feedback {
	
	private int id;
	private Date todaydate;
	private String topic;
	private String feedbackdetail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTodaydate() {
		return todaydate;
	}
	public void setTodaydate(Date todaydate) {
		this.todaydate = todaydate;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getFeedbackdetail() {
		return feedbackdetail;
	}
	public void setFeedbackdetail(String feedbackdetail) {
		this.feedbackdetail = feedbackdetail;
	}
	

}
