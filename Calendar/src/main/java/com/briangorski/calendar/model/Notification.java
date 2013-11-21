package com.briangorski.calendar.model;

import java.util.Date;

public class Notification {
	private long notificationID;
	private Date notificationTime;
	private String title;
	private String message;
	private NotificationType notificationType;
	
	public Date getNotificationTime() {
		return notificationTime;
	}
	public void setNotificationTime(Date notificationTime) {
		this.notificationTime = notificationTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public NotificationType getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}
	public long getNotificationID() {
		return notificationID;
	}
	public void setNotificationID(long notificationID) {
		this.notificationID = notificationID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
