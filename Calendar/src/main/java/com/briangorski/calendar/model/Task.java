package com.briangorski.calendar.model;

import java.util.Date;

public interface Task {
	void setTaskID(Long taskID);
	Long getTaskID();
	
	void setDueDate(Date dueDate);
	Date dueDate();
	
	void setDescription(String description);
	String getDescription();
	
	String type();
}
