package com.briangorski.calendar.dao;

import com.briangorski.calendar.model.Group;

public interface GroupManager {
	void insertEvent(Group group);
	void updateEvent(Group group);
	void deleteEvent(Group group);
}