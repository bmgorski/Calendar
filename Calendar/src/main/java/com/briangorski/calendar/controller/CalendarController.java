package com.briangorski.calendar.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briangorski.calendar.model.Event;
import com.briangorski.calendar.model.User;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class CalendarController extends com.briangorski.calendar.controller.Controller{
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String calendar(Model model) throws JsonGenerationException, JsonMappingException, IOException {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ObjectMapper objectMapper = new ObjectMapper();
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
		
		objectMapper.setDateFormat(dateFormat);
		Set<Event> events = new HashSet<Event>();
		
		try{
			events = _userManager.getUserEvents(user.getUsername());
		}
		catch(Exception e){
			
		}
		
		
		model.addAttribute("event",  objectMapper.writeValueAsString(events.toArray()));
		return "calendar";
	}
	
	@RequestMapping(value = "/user/events", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Set<Event> getUserEvents() throws JsonGenerationException, JsonMappingException, IOException {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		logger.info(Long.toString(user.getUserID()));
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		objectMapper.writeValueAsString(Arrays.asList("one","two","three","four","five"));
		
		Set<Event> events = new HashSet<Event>();
		
		try{
			events = _userManager.getUserEvents(user.getUsername());
		}
		catch(Exception e){
			
		}

		return events;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/user/event/add", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
    public ResponseEntity addUserEvent(@Valid @RequestBody Event event, Errors errors) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
        if (errors.hasErrors()) {
            return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
        }
        
        event.setOwner(user);
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
