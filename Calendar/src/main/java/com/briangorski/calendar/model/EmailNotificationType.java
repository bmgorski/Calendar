package com.briangorski.calendar.model;

import com.briangorski.calendar.model.abstracts.NotificationType;

public class EmailNotificationType extends NotificationType {
	@Override
	public Long getNotificationTypeID() {
		return 1l;
	}
	
	@Override
	public void sendMessage() {}
}
