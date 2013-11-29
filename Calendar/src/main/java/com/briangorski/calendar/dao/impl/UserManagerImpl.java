package com.briangorski.calendar.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.briangorski.calendar.dao.UserDAO;
import com.briangorski.calendar.dao.UserManager;
import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;


// TODO: Auto-generated Javadoc
/**
 * The Class UserManagerImpl.
 */
@Service
public class UserManagerImpl implements UserManager {

	/** The user dao. */
	@Autowired
	private UserDAO userDAO;

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserManager#insertUser(com.briangorski.usertracker.model.User)
	 */
	@Override
	@Transactional
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserManager#updateUser(com.briangorski.usertracker.model.User)
	 */
	@Override
	@Transactional
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserManager#deleteUser(com.briangorski.usertracker.model.User)
	 */
	@Override
	@Transactional
	public void deleteUser(User user) {
		userDAO.deleteUser(user);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserManager#getUserByID(long)
	 */
	@Override
	@Transactional
	public User getUserByID(long userID) {
		return userDAO.getUserByID(userID);
	}

	/* (non-Javadoc)
	 * @see com.briangorski.usertracker.dao.UserManager#getUsers(java.lang.Boolean)
	 */
	@Override
	@Transactional
	public List<User> getUsers(Boolean ownershipType) {
		return userDAO.getUsers(ownershipType);
	}

	@Override
	@Transactional
	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

	@Override
	@Transactional
	public Set<Event> getUserEvents(String username) {
		return userDAO.getUserEvents(username);
	}
	
}
