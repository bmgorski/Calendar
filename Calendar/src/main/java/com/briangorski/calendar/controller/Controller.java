package com.briangorski.calendar.controller;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.briangorski.calendar.dao.EventManager;
import com.briangorski.calendar.dao.UserManager;

public class Controller {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	protected UserManager _userManager;
	
	@Autowired
	protected EventManager _eventManager;
	
}
