package com.briangorski.calendar.model;

public class EmailNotificationType implements NotificationType {
	@Override
	public String type() {
		return "EmailNotification";
	}

	@Override
	public void SendMessage() {
		// TODO Auto-generated method stub
		
	}
}
