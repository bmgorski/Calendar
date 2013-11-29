<%@ include file="parts/top.jsp" %>
<style>
	#calendar{
		width: 95%;
		margin: 0 auto;
	}
	
/* We use this to get basic styling on all basic form elements */
input,
textarea {
  border-radius: 0;
  background-color: white;
  font-family: inherit;
  border: 1px solid #cccccc;
  -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
  color: rgba(0, 0, 0, 0.75);
  display: block;
  font-size: 0.875em;
  margin: 0 0 1em 0;
  padding: 0.5em;
  height: 2.3125em;
  width: 100%;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  -webkit-transition: -webkit-box-shadow 0.45s, border-color 0.45s ease-in-out;
  -moz-transition: -moz-box-shadow 0.45s, border-color 0.45s ease-in-out;
  transition: box-shadow 0.45s, border-color 0.45s ease-in-out; }
</style>
<script>
	var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();

	
	function dateTimeToDate(date, time){
		console.log(date.getTime());
		var date2 = Date.parse(date);
		
		
		var pm = false;
		if(time.indexOf("pm") !== -1){
			pm = true;
			time = time.replace("pm", "");
		}
		else{
			time = time.replace("am", "");
		}
		
		
		var timeSplit = time.split(":");
		var hour = parseInt(timeSplit[0]);
		
		if(hour === 12){
			hour = hour - 12;
		}
		else{
			hour - hour - 1;
		}
		
		var min = parseInt(timeSplit[1]);
		
		if(pm){
			hour = hour + 12;
		}
		date.setHours(hour,min,0,0);
		date.setMinutes(min);
		
		return date;
	}
	
	function postEvent(title, start, end, allDay, description){
		$.ajax({
		    type: "POST",
		    url: "user/event/add",
		    data: JSON.stringify({ "title" : title, "start" : start, "end" : end, "allDay" : allDay, "description" : description  }),
		    contentType: "application/json; charset=utf-8",
		    dataType: "json",
		    success: function(data){alert(data);},
		    failure: function(errMsg) {
		        alert(errMsg);
		    }
		});
	}
	
	$(document).ready(function() {
		
		var calendar = $('#calendar').fullCalendar({
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay'
			},
			selectable: true,
			selectHelper: true,
			select: function(start, end, allDay) {
				var disEventWrap = $(templates.event.eventForm());
				var disEvent = disEventWrap.find("form");
				
				var startDate = disEvent.find(".startDate");
				var endDate = disEvent.find(".endDate");
				startDate.datepicker({"defaultDate" : start}).datepicker("setDate", start);
				endDate.datepicker({"defaultDate" : end}).datepicker("setDate", end);
								
				disEvent.submit(function(e){
					e.preventDefault();
					
					title = disEvent.find(".title").val();
					start = startDate.datepicker("getDate");
					end = endDate.datepicker("getDate");
					
					allDay = disEvent.find(".allday").is(':checked');
					
					if(!allDay){
						var  startTime = disEvent.find(".startTime").val();
						var  endTime = disEvent.find(".endTime").val();
												
						start = dateTimeToDate(start, startTime);
						end = dateTimeToDate(end, endTime);
					}
					
					description = disEvent.find(".description").val();
					
					if (title && title != "") {
						calendar.fullCalendar('renderEvent',
							{
								title: title,
								start: start,
								end: end,
								allDay: allDay
							},
							true // make the event "stick"
						);
					}
					
					
					postEvent(title, start, end, allDay, description);
					
					calendar.fullCalendar('unselect');
					
					disEventWrap.dialog("close");
				});
				
				disEventWrap.dialog({'width' : '1000px', modal: true });
			},
			editable: true,
			events: ${event},
			eventClick: function(calEvent, jsEvent, view) {
				
		        return false;
		    }
		});
		
	});

</script>

<div id="calendar"></div>

<%@ include file="parts/bottom.jsp" %>