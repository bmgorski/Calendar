package com.briangorski.calendar.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.GroupDAO;
import com.briangorski.calendar.dao.ProjectManager;
import com.briangorski.calendar.model.Project;

public class ProjectManagerImpl implements ProjectManager {
	@Autowired
	GroupDAO groupDAO;

	@Override
	public void insertEvent(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEvent(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEvent(Project project) {
		// TODO Auto-generated method stub
		
	}
}
