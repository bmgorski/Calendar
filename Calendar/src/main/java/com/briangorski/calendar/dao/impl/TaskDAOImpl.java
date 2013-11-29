package com.briangorski.calendar.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.TaskDAO;
import com.briangorski.calendar.model.Task;

public class TaskDAOImpl implements TaskDAO {
	@Autowired
	private SessionFactory sessionFactory;

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
