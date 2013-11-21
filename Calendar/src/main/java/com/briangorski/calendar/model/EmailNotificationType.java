package com.briangorski.calendar.model;


public class EmailNotificationType extends NotificationType {
	@Override
	public Long getNotificationTypeID() {
		return 1l;
	}
	
	@Override
	public void sendMessage() {}
}
