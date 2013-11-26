package com.briangorski.calendar.dao;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;

public interface EventManager {
	@SuppressWarnings("rawtypes")
	MultiValueMap insertEvent(Event event);
	void updateEvent(Event event);
	void deleteEvent(Event event);
	User getEventByID(long eventID);
	List<Event> getEvents();
	List<Event> getEventsByUser(User user);
}