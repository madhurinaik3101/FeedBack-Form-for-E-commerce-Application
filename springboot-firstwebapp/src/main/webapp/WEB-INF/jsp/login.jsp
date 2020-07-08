<html>

<head>
<title>First Web Application</title>
</head>

<body style="text-align:center;font-family:lucida console;font-size:40px">
	<header style="text-align:center">Enter User Credentials</header><br><br>
	<font color="red">${errorMessage}</font>
	<form method="post">
		Name : <input type="text" name="name" /><br><br>
		Password : <input type="password" name="password" /> <br><br>
		<button style="height:80 ;width:100" type="submit" class="btn btn-danger">Login</button>
	</form>
</body>

</html>