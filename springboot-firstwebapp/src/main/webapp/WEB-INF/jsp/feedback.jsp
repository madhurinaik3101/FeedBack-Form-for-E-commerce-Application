<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>
	
	<header style="text-align:center;font-size:100px">Customer FeedBack Form</header>
	<div class="container">


		<form:form method="post" commandName="feedback">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="fname">First Name</form:label>
				<form:input path="fname" type="text" class="form-control"
					required="required" />
				<form:errors path="fname" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="lname">Last Name</form:label>
				<form:input path="lname" type="text" class="form-control"
					required="required" />
				<form:errors path="lname" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="email">Email</form:label>
				<form:input path="email" type="email" class="form-control"
					required="required" />
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="address">Address</form:label>
				<form:input path="address" type="text" class="form-control"
					required="required" />
				<form:errors path="address" cssClass="text-warning" />
			</fieldset>
			
				
			<fieldset class="form-group">
				<form:label path="product">What product did you purchase from our company?</form:label>
				<form:input path="product" type="text" class="form-control"
					required="required" />
				<form:errors path="product" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="value">Did you get your product delivered at your place on time?</form:label>
				<form:input path="value" type="text" class="form-control"
					required="required" />
				<form:errors path="value" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="sati">Are you satisfied with our service?</form:label>
				<form:input path="sati" type="text" class="form-control"
					required="required" />
				<form:errors path="sati" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="pros">List any pros of using our application if any</form:label>
				<form:input path="pros" type="text" class="form-control"
					required="required" />
				<form:errors path="pros" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="changes">Are there any changes we can make to improve our service?</form:label>
				<form:input path="changes" type="text" class="form-control"
					required="required" />
				<form:errors path="changes" cssClass="text-warning" />
			</fieldset>
			
			<center>
			<button type="submit" class="btn btn-danger">Submit</button>
			</center>
		</form:form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	

</body>
</html>
