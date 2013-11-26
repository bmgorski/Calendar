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
public class AuthController extends com.briangorski.calendar.controller.Controller {	
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String loginUser(@ModelAttribute("command") User user, BindingResult result, Model model, HttpServletRequest request) {
		model.addAttribute("login", true);
		user = (User)request.getSession().getAttribute("user");
		return "login";
	}
	
	@RequestMapping(value = "/user/login/error", method = RequestMethod.GET)
	public String loginUserError(@ModelAttribute("command") User user, BindingResult result, Model model, HttpServletRequest request) {
		model.addAttribute("errorLogin", true);
		user = (User)request.getSession().getAttribute("user");
		return "login";
	}
}
