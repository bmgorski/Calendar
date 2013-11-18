package com.briangorski.calendar.model;

import java.util.Date;

public class DefaultTask implements Task {
	private String description;
	private Date dueDate;
	
	@Override
	public Date dueDate() {
		return this.dueDate;
	}

	@Override
	public String description() {
		return this.description;
	}

	@Override
	public String type() {
		return "Default Type";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
