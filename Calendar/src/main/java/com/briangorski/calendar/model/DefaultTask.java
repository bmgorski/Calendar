package com.briangorski.calendar.model;

import java.util.Date;
import java.util.Set;

public class DefaultTask implements Task {
	private Long taskID;
	private Date dueDate;
	private String description;
	private String type;
	private Set<User> users;

	@Override
	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}

	@Override
	public Long getTaskID() {
		return this.taskID;
	}

	@Override
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public Date dueDate() {
		return this.dueDate;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Set<User> getUsers() {
		return this.users;
	}

	@Override
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
