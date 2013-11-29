package com.briangorski.calendar.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.NotificationDAO;
import com.briangorski.calendar.dao.NotificationManager;
import com.briangorski.calendar.model.Notification;

public class NotificationManagerImpl implements NotificationManager {
	@Autowired
	NotificationDAO notificationDAO;

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
