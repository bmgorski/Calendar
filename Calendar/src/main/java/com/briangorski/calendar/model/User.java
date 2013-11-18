package com.briangorski.calendar.model;

import java.util.Set;

public class User {
	private long userID;
	private String firstName;
	private String lastName;
	private String username;
	private Set<Event> events;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public Set<Event> getEvents() {
		return events;
	}
	public void setEvents(Set<Event> events) {
		this.events = events;
	}
}
