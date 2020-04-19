<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link type="text/css" rel="stylesheet"  href="./css/admin.css">
</head>
<body bgcolor="#E6E6FA">
 
<div id="container">
<form action="login" method="post" id="flogin">
 
<h2>Login Form</h2>
 
<label for="uname" id="un">Username:</label>
<input type="text" name="user" placeholder="Enter Username" id="uname"><br/><br/>
 
<label for="upass" id="ps">Password:</label>
<input type="password" name="pass" placeholder="Enter Password" id="upass"><br/><br/>
 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" value="Login"  id="submit" onClick="alert('Login Successfully')">Login</button>
 
 <!-- Note:-use "&amp;nbsp"(use in html) or "margin"(left/right in css in head tag) to adjust the space) -->
 
 
</form>
</div>
 
</body>
</html>