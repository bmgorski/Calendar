package com.briangorski.calendar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.briangorski.calendar.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController extends com.briangorski.calendar.controller.Controller {
	@RequestMapping(value = "/user/new", method = RequestMethod.GET)
	public String newUser(@ModelAttribute("command") User user, Model model) {
		model.addAttribute("new", true);
		
		return "userNew";
	}
	
	@RequestMapping(value = "/user/new", method = RequestMethod.POST)
	public String newUserPost(@Valid @ModelAttribute("command") User user, BindingResult result, Model model, HttpServletRequest request) {
		model.addAttribute("new", true);
		
		if(result.hasErrors()){
			return "userNew";
		}
		
		request.getSession().setAttribute("user", user);
		
		_userManager.insertUser(user);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/user/edit", method = RequestMethod.GET)
	public String editUSer(@ModelAttribute("command") User user, BindingResult result, Model model, HttpServletRequest request) {
		model.addAttribute("edit", true);
		user = (User)request.getSession().getAttribute("user");
		return "userNew";
	}
}
