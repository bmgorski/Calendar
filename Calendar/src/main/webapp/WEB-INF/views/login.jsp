<%@ include file="parts/top.jsp"%>
<form action="<%=request.getContextPath() %>/user/login/proccess" method="POST">
	<fieldset>
		<legend>Login</legend>

		<div class="row">
			<div class="large-12 columns">
				<label>User Name</label> <input type="text" name="j_username" />
			</div>
			<div class="large-12 columns">
				<label>Password</label> <input type="password" name="j_password" />
			</div>
		</div>
		<div class="large-12 columns">
			<input type="submit" class="button" value="Submit">
		</div>
		<script type="text/javascript">
			$(".error").each(function() {
				$(this).parent().addClass("error");
			});
		</script>
	</fieldset>
</form>


<jsp:include page="parts/bottom.jsp" />