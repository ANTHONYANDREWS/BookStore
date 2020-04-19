<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link type="text/css" rel="stylesheet" href="./css/bookslist.css">
</head>
<body>
<center>
	<h1>List of your Masterpiece</h1>
	<br>
	<h2>
	<a href="${pageContext.request.contextPath}/authorhome">Go to Home Page</a>
	 &nbsp;&nbsp;&nbsp;
	 <a href="${pageContext.request.contextPath}/addbook">Add New Books</a>
	</h2>
	</center>
	<div align ="center">
		<table border="1" cellpadding="5">
		<caption><h2>List of Books</h2></caption>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Book Price</th>
			<th>Published Year</th>
		</tr>
		<c:forEach var="authorbook" items="${listbooks}">
		<tr>
			<td><c:out value="${authorbook.id}"/></td>
			<td><c:out value="${authorbook.bookname}"/></td>
			<td><c:out value="${authorbook.price}"/></td>
			<td><c:out value="${authorbook.publishedyear}"/></td>
			<td>
			<a name="id" href="editbook?id=${authorbook.id}"><button type="button" id="edit">EDIT</button>
			 &nbsp;&nbsp;&nbsp;&nbsp;
			<a name="id" href="deletebook?id=${authorbook.id}">Delete</a>
			
			
			</td>
			</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>