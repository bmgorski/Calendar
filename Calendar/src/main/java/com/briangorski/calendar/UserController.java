package com.briangorski.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController extends com.briangorski.calendar.Controller {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/user/new", method = RequestMethod.GET)
	public String newUser(Model model) {
		model.addAttribute("type", "add");
		
		return "user";
	}
}
