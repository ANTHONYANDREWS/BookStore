<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Author</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">

</head>
<body>
<nav>
	
	<ul>
	<li><a href="${pageContext.request.contextPath}/author">Login</a>
	<li><a href="${pageContext.request.contextPath}/authorsignup">Sign up</a>
	</ul>
	</nav>
	<div class="welcome-back">WELCOME</div>
	<div class="login-form">
		<div class ="title">Login</div>
		<form action="${pageContext.request.contextPath}/author" method="post">
		<label class="label" for="email">Email</label>
		<input type="text" name="email" id="email">
		<label class="label" for="password">Password</label>
		<input type="password" name="password" id="password">
		<button class="button" type="submit">Login</button>
		<a class="forgot-password" href="">Forgot Password</a>
		</form>
	</div>
</body>
</html>