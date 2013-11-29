package com.briangorski.calendar.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.ProjectDAO;
import com.briangorski.calendar.model.Project;

public class ProjectDAOImpl implements ProjectDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
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
