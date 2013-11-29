package com.briangorski.calendar.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.GroupDAO;
import com.briangorski.calendar.dao.GroupManager;
import com.briangorski.calendar.model.Group;

public class GroupManagerImpl implements GroupManager {
	@Autowired
	GroupDAO groupDAO;
	
	@Override
	public void insertEvent(Group group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEvent(Group group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEvent(Group group) {
		// TODO Auto-generated method stub

	}
}
