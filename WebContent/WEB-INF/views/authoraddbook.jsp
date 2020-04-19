<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Book</title>
<link rel="stylesheet" href="https://cdjns.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
<link type="text/css" rel="stylesheet" href="./css/addbook.css">

</head>
<body>
	<center>
	<h1>We are excited for your new Book :)</h1>
	<br>
	<h2>
	<a href="${pageContext.request.contextPath}/authorhome">Go to Home Page</a>
	 &nbsp;&nbsp;&nbsp;
	 <a href="${pageContext.request.contextPath}/authorbooks">View Added Books</a>
	</h2>
	</center>
	
	
	<div align="center">
	
	 <c:if test="${authorbook != null}">
   <form action="AuthorBookUpdate" method="post">
        </c:if>
        <c:if test="${authorbook == null}">
        <form action="addbook" method="post">
        </c:if>
        <caption>
        <h2>
         <c:if test="${authorbook != null}">
               Edit Book
              </c:if>
              <c:if test="${authorbook == null}">
               Add New Book
              </c:if>
	</h2>
	</caption>
	
	<c:if test="${authorbook != null}">
           <input type="hidden" name="id" value="<c:out value='${authorbook.id}' />" />
          </c:if>         
	 <c:if test="${authorbook == null}">
		<form action ="addbook" method="post">
		        </c:if>
		
			<label for="id">Book id</label>
			<input type="text" name="id">
			
			<label for="bookname">Book Name</label>
			<input type="text" name="bookname" 
			value="<c:out value='${authorbook.bookname}' />"
			/>
			
			<label for="bookprice">Book Price</label>
			<input type="text" name="bookprice" value="<c:out value='${authorbook.price}'/>"/>
			
			<label for="publishedyear">Published Price</label>
			<input type="text" name="publishedyear" value="<c:out value='${authorbook.publishedyear}'/>"/>
			              <input type="submit" value="Save" />
			

	</form>
		
		</form>
	
	<div>
	</div>	
	
	</div>

</body>
</html>