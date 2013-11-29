package com.briangorski.calendar.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.GroupDAO;
import com.briangorski.calendar.dao.TaskManager;
import com.briangorski.calendar.model.Task;

public class TaskManagerImpl implements TaskManager {
	@Autowired
	GroupDAO groupDAO;
	
	@Override
	public void insertEvent(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEvent(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEvent(Task task) {
		// TODO Auto-generated method stub
		
	}
}
