package com.briangorski.calendar.dao;

import com.briangorski.calendar.model.Notification;

public interface NotificationManager {
	void insertEvent(Notification notification);
	void updateEvent(Notification notification);
	void deleteEvent(Notification notification);
}