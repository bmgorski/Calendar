package com.briangorski.calendar.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.EventDAO;
import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;

public class EventDAOImpl implements EventDAO{
	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertEvent(Event event) {
		sessionFactory.getCurrentSession().save(event);
	}

	@Override
	public void updateEvent(Event event) {
		sessionFactory.getCurrentSession().update(event);
	}

	@Override
	public void deleteEvent(Event event) {
		sessionFactory.getCurrentSession().delete(event);
	}

	@Override
	public User getEventByID(long eventID) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from Event where eventID = :eventID");
		query.setParameter("eventID", eventID);

		return (User) query.list().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Event> getEvents() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Event.class);

		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Event> getEventsByUser(User user) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"select e from Event e " +
                "join e.users u " +
                "where u.userID = (:userID)");
		query.setParameter("userID", user.getUserID());

		return query.list();
	}

}
