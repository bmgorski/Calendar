package com.briangorski.calendar.model;

public interface NotificationType {
	Long getType();
	void setType(Long type);
	
	void sendMessage();
}
