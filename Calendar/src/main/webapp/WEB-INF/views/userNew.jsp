<%@ include file="parts/top.jsp" %>
<form:form action="" method="POST">
  <fieldset>
    <legend>Sign up now</legend>
	
    <div class="row">
      <div class="large-12 columns">
        <label>First Name</label>
        <form:input path="firstName" cssErrorClass="error" placeholder="First Name"/>
        <small><form:errors path="firstName" /></small>
      </div>
      <div class="large-12 columns">
        <label>Last Name</label>
        <form:input path="lastName" cssErrorClass="error" placeholder="Last Name"/>
        <small><form:errors path="lastName" /></small>
      </div>
      <c:if test="${edit }">
      	<c:set var="disabled" value="true" ></c:set>
      </c:if>
      <div class="large-12 columns">
        <label>User Name</label>
        <form:input disabled="${disabled}" path="username" cssErrorClass="error" placeholder="User Name"/>
        <small><form:errors path="username" /></small>
      </div>
      <div class="large-12 columns">
      	<input type="submit" class="button" value="Submit">
      </div>
    </div>
    <script type="text/javascript">
		$(".error").each(function(){
			$(this).parent().addClass("error");
		});
    </script>
  </fieldset>
</form:form>


<jsp:include page="parts/bottom.jsp" />