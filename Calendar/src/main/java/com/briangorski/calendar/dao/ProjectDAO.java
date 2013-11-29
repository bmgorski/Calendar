package com.briangorski.calendar.dao;

import com.briangorski.calendar.model.Project;

public interface ProjectDAO {
	void insertEvent(Project project);
	void updateEvent(Project project);
	void deleteEvent(Project project);
}