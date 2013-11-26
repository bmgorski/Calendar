package com.briangorski.calendar.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.briangorski.calendar.dao.EventDAO;
import com.briangorski.calendar.dao.EventManager;
import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;

@Repository
public class EventManagerImpl implements EventManager{
	
	@Autowired
	EventDAO eventDAO;
	
	@Override
	@Transactional
	public MultiValueMap<Object, Object> insertEvent(Event event) {
		eventDAO.insertEvent(event);
		
		MultiValueMap<Object, Object> map = new LinkedMultiValueMap<Object, Object>();
		map.add("event", event);
		
		return map;
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
	public User getEventByID(long eventID) {
		return eventDAO.getEventByID(eventID);
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
