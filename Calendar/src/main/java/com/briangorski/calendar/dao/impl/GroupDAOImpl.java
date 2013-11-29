package com.briangorski.calendar.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.GroupDAO;
import com.briangorski.calendar.model.Group;

public class GroupDAOImpl implements GroupDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
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
