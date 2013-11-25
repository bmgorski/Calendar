package com.briangorski.calendar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.briangorski.calendar.dao.UserManager;

public class Controller {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserManager _userManager;
	
}
