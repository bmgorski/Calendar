package com.briangorski.calendar.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.briangorski.calendar.dao.EventDAO;
import com.briangorski.calendar.dao.EventManager;
import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;

public class EventManagerImpl implements EventManager{
	
	@Autowired
	EventDAO eventDAO;
	
	@Override
	@Transactional
	public void insertEvent(Event event) {
		eventDAO.insertEvent(event);
	}

	@Override
	@Transactional
	public void updateEvent(Event event) {
		eventDAO.updateEvent(event);
	}

	@Override
	@Transactional
	public void deleteEvent(Event event) {
		eventDAO.deleteEvent(event);
	}

	@Override
	@Transactional
	public User getEventByID(long userID) {
		return eventDAO.getEventByID(userID);
	}

	@Override
	@Transactional
	public List<Event> getEvents() {
		return eventDAO.getEvents();
	}

	@Override
	@Transactional
	public List<Event> getEventsByUser(User user) {
		return eventDAO.getEventsByUser(user);
	}

}
