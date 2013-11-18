package com.briangorski.calendar.model;

import java.util.Date;
import java.util.Set;

public class Event {
	private Long eventID;
	private Date startTime;
	private Date endTime;
	private String description;
	private Set<User> users;
	private Set<NotificationType> notificationTypes;
	
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Set<NotificationType> getNotificationTypes() {
		return notificationTypes;
	}
	public void setNotificationTypes(Set<NotificationType> notificationTypes) {
		this.notificationTypes = notificationTypes;
	}
	public Long getEventID() {
		return eventID;
	}
	public void setEventID(Long eventID) {
		this.eventID = eventID;
	}
}
