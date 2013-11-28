<%@ include file="parts/top.jsp" %>
<style>
	#calendar{
		width: 95%;
		margin: 0 auto;
	}
</style>
<script>
	var defaultEvent = new Object(){
		title = "Untitled Event";
	}

	function eventWindow(thisEvent){
		thisEvent = $.extend( true, defaultEvent, thisEvent );
	}
	$(document).ready(function() {
		
		var date = new Date();
		var d = date.getDate();
		var m = date.getMonth();
		var y = date.getFullYear();
		
		$(document).ready(function() {
			
			var date = new Date();
			var d = date.getDate();
			var m = date.getMonth();
			var y = date.getFullYear();
			
			var calendar = $('#calendar').fullCalendar({
				header: {
					left: 'prev,next today',
					center: 'title',
					right: 'month,agendaWeek,agendaDay'
				},
				selectable: true,
				selectHelper: true,
				select: function(start, end, allDay) {
					
					var title = prompt('Event Title:');
					if (title) {
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
					calendar.fullCalendar('unselect');
				},
				editable: true,
			    eventSources: [
                   {
                       url: '<%=request.getContextPath()%>' + '/user/events',
                       type: 'GET',
                       data: {
                           month_load: 0,
                       },
                       error: function() {
                           alert('there was an error while fetching events!');
                       },
                       color: 'yellow',   // a non-ajax option
                       textColor: 'black' // a non-ajax option
                   }
               ],
				eventClick: function(calEvent, jsEvent, view) {
					
			        return false;
			    }
			});
			
		});


		
	});

</script>

<div id="calendar"></div>

<%@ include file="parts/bottom.jsp" %>