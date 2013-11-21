package com.briangorski.calendar.model;

import java.util.Set;

public class Group {
	private long groupID;
	private String name;
	private String description;
	private Set<User> users;
	private Set<Project> projects;
	
	public long getGroupID() {
		return groupID;
	}
	public void setGroupID(long groupID) {
		this.groupID = groupID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
}