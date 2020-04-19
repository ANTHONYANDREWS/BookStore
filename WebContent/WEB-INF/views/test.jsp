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
	
	 <c:if test="${authorbook == null}">
	 
		<form action ="addbook" method="post">
			<label for="id">Book id</label>
			<input type="text" name="id">
			
			<label for="bookname">Book Name</label>
			<input type="text" name="bookname">
			
			<label for="bookprice">Book Price</label>
			<input type="text" name="bookprice">
			
			<label for="publishedyear">Published Price</label>
			<input type="text" name="publishedyear">
			
			 <button class="button"><i class="fas fa-plus-circle"></i>Add Book</button>  
			  </c:if>
    </div>
    
   		<c:if test="${authorbook != null}">
            <form action="${pageContext.request.contextPath}/AuthorBookUpdate" method="post">
        </c:if>
        <c:if test="${authorbook == null}">
            <form action="${pageContext.request.contextPath}/addbook" method="post">
        </c:if>
 		<c:if test="${authorbook != null}">
  		<input type="hidden" name="id" value=${authorbook.getId()}" />
   		</c:if> 
   		<c:if test="${authorbook != null}">
            			Edit Author
            		</c:if>
						<c:if test="${authorbook == null}">
            			Add New Blog
            		</c:if>
   					
			
	
	</form>
		
		</form>
	
	<div>
	</div>	
	
	</div>

</body>
</html>