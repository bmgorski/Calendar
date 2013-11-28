package com.briangorski.calendar.model;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7130814009429852942L;
	
	private long userID;
	@NotEmpty
	@Size(min = 4, max = 4000)
	private String firstName;
	@NotEmpty
	@Size(min = 4, max = 4000)
	private String lastName;
	@NotEmpty
	@Size(min = 4, max = 4000)
	private String username;
	private Set<Event> events;
	private Set<Group> groups;
	
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
		this.username = username.toLowerCase();
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
	public Set<Group> getGroups() {
		return groups;
	}
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}
}
