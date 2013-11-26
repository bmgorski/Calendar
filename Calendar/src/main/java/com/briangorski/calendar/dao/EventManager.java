package com.briangorski.calendar.dao;

import java.util.List;

import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;

public interface EventManager {
	void insertEvent(Event event);
	void updateEvent(Event event);
	void deleteEvent(Event event);
	User getEventByID(long userID);
	List<Event> getEvents();
	List<Event> getEventsByUser(User user);
}