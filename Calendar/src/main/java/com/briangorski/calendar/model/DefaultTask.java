package com.briangorski.calendar.model;

import java.util.Date;

public class DefaultTask implements Task {
	private Long taskID;
	private Date dueDate;
	private String description;

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
	public String type() {
		return "Default Type";
	}
}
