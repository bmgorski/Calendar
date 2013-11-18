package com.briangorski.calendar.model;

import java.util.Date;
import java.util.Set;

public interface Task {
	void setTaskID(Long taskID);
	Long getTaskID();
	
	void setDueDate(Date dueDate);
	Date dueDate();
	
	void setDescription(String description);
	String getDescription();
	
	String getType();
    void setType(String type);
    
    Set<User> getUsers();
    void setUsers(Set<User> users);
}
