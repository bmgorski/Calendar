package com.briangorski.calendar.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalendarController extends com.briangorski.calendar.controller.Controller{
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "calendar";
	}
}
