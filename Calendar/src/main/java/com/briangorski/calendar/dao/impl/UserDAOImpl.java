package com.briangorski.calendar.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.briangorski.calendar.dao.UserDAO;
import com.briangorski.calendar.model.User;
/**
 * The Class UserDAOImpl.
 *
 * @author bmgorski
 */
@Repository
public class UserDAOImpl implements UserDAO {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserDAO#insertUser(com.briangorski.usertracker.model.User)
	 */
	@Override
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserDAO#updateUser(com.briangorski.usertracker.model.User)
	 */
	@Override
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserDAO#deleteUser(com.briangorski.usertracker.model.User)
	 */
	@Override
	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserDAO#getUserByID(long)
	 */
	@Override
	public User getUserByID(long userID) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from User where id = :userID");
		query.setParameter("userID", userID);

		return (User) query.list().get(0);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserDAO#getUsers(java.lang.Boolean)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers(Boolean ownershipType) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);

		return criteria.list();
	}
}
