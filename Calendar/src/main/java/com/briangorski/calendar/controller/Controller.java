package com.briangorski.calendar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.briangorski.calendar.dao.EventManager;
import com.briangorski.calendar.dao.UserManager;

public class Controller {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserManager _userManager;
	
	@Autowired
	EventManager _eventManager;
	
}
