<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Author Sign up</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">

</head>
<body>
<nav>
		<ul>
		<li> <a href="${pageContext.request.contextPath}/author">Login</a></li>
		<li> <a href="${pageContext.request.contextPath}/authorsignup">Sign Up</a></li>
		</ul>
	</nav>
	<div class="welcome-back">READ. EAT. REPEAT</div>
	</div>
	<div class="signup-form">
		<div class="title">SIGN UP</div>
		<form action="${pageContext.request.contextPath}/authorsignup" method="post">
			<label class="label" for="email">Email</label>
			<input type="text" name="email" id="email">
			<label class="label" for="password">Password</label>
			<input type="password" name="password" id="password">
			<div class="password-hint">Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter
			</div>
			<label class="label" for="password">Confirm Password</label>
			<input type="password" name="confirmPassword" id="password">
			${message}
			<button class="button" type="submit">Sign IN</button>
		</form>
	</div>
</body>
</html>