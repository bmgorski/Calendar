package com.briangorski.calendar.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event {
	private Long eventID;
	private Date startTime;
	private Date endTime;
	private String title;
	private String description;
	private boolean allDayEvent = false;
	private Set<Notification> notifications;
	private User owner;
	private Set<User> users = new HashSet<User>();
	private Set<Task> tasks;
	private Set<Integer> accepted;
	
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
	public Long getEventID() {
		return eventID;
	}
	public void setEventID(Long eventID) {
		this.eventID = eventID;
	}
	public Set<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	public Set<Integer> getAccepted() {
		return accepted;
	}
	public void setAccepted(Set<Integer> accepted) {
		this.accepted = accepted;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAllDayEvent() {
		return allDayEvent;
	}
	public void setAllDayEvent(boolean allDayEvent) {
		this.allDayEvent = allDayEvent;
	}
}
