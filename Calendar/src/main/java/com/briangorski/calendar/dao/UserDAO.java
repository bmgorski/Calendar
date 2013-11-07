package com.briangorski.calendar.dao;


import java.util.List;

import com.briangorski.calendar.model.User;

/**
 * The Interface UserDAO.
 */
public interface UserDAO {
	

	/**
	 * Insert user.
	 *
	 * @param user the user
	 */
	void insertUser(User user);

	/**
	 * Update user.
	 *
	 * @param user the user
	 */
	void updateUser(User user);

	/**
	 * Delete user.
	 *
	 * @param user the user
	 */
	void deleteUser(User user);

	/**
	 * Gets the user by id.
	 *
	 * @param userID the user id
	 * @return the user by id
	 */
	User getUserByID(long userID);

	/**
	 * Gets the users.
	 *
	 * @param ownershipType the ownership type
	 * @return the users
	 */
	List<User> getUsers(Boolean ownershipType);
}
