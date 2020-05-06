package com.assignment.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;

public class Event {
	private String name;
	private Date starton;
	private Date Endon;
	private Time startTime;
	private String organisedby;
	private String venue;
	private Blob photo;
	private String eventinfo;
	private String clubname;
	
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStarton() {
		return starton;
	}
	public void setStarton(Date starton) {
		this.starton = starton;
	}
	public Date getEndon() {
		return Endon;
	}
	public void setEndon(Date endon) {
		Endon = endon;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public String getOrganisedby() {
		return organisedby;
	}
	public void setOrganisedby(String organisedby) {
		this.organisedby = organisedby;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getEventinfo() {
		return eventinfo;
	}
	public void setEventinfo(String eventinfo) {
		this.eventinfo = eventinfo;
	}
	

}
