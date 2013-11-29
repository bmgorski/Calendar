package com.briangorski.calendar.dao;

import com.briangorski.calendar.model.Notification;

public interface NotificationDAO {
	void insertEvent(Notification notification);
	void updateEvent(Notification notification);
	void deleteEvent(Notification notification);
}