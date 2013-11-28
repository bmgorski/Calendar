package com.briangorski.calendar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;

@Controller
public class CalendarController extends com.briangorski.calendar.controller.Controller{
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String calendar() {
		return "calendar";
	}
	
	@RequestMapping(value = "/user/events", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Event> getUserEvents() {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		return _eventManager.getEventsByUser(user);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/user/event/add", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
    public ResponseEntity addUserEvent(@Valid @RequestBody Event event, Errors errors) {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
        if (errors.hasErrors()) {
            return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
        }
        
        event.getUsers().add(user);
        
        _eventManager.insertEvent(event);
        
        return new ResponseEntity("success", HttpStatus.CREATED);
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/user/event/update", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
    public ResponseEntity updateUserEvent(@Valid @RequestBody Event event, Errors errors) {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (errors.hasErrors()) {
            return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
        }
        
        event.getUsers().add(user);
        
        _eventManager.updateEvent(event);
        
        return new ResponseEntity("success", HttpStatus.CREATED);
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/user/event/delete", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
    public ResponseEntity deleteUserEvent(@Valid @RequestBody Event event, Errors errors) {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
        if (errors.hasErrors()) {
            return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
        }
        
        event.getUsers().add(user);
        _eventManager.deleteEvent(event);
        
        return new ResponseEntity("success", HttpStatus.CREATED);
    }
}
