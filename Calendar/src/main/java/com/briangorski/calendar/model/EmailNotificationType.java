package com.briangorski.calendar.model;

public class EmailNotificationType implements NotificationType {
	private Long type = 1l;

	@Override
	public Long getType() {
		return this.type;
	}

	@Override
	public void setType(Long type) {
		
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}
}
