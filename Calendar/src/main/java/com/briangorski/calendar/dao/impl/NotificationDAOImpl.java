package com.briangorski.calendar.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.NotificationDAO;
import com.briangorski.calendar.model.Notification;

public class NotificationDAOImpl implements NotificationDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertEvent(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEvent(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEvent(Notification notification) {
		// TODO Auto-generated method stub
		
	}
}
