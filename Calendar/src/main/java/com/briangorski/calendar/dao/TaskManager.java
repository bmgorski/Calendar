package com.briangorski.calendar.dao;

import com.briangorski.calendar.model.Task;

public interface TaskManager {
	void insertEvent(Task task);
	void updateEvent(Task task);
	void deleteEvent(Task task);
}