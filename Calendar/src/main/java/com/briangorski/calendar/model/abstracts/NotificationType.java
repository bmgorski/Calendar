package com.briangorski.calendar.model.abstracts;

public abstract class NotificationType {
	private Long notificationTypeID;
	
	public abstract void sendMessage();

	public Long getNotificationTypeID() {
		return notificationTypeID;
	}

	public void setNotificationTypeID(Long notificationTypeID) {
		this.notificationTypeID = notificationTypeID;
	}
}
