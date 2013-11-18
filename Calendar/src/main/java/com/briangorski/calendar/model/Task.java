package com.briangorski.calendar.model;

import java.util.Date;

public interface Task {
	Date dueDate();
	String description();
	String type();
}
