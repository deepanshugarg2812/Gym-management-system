<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ page isErrorPage="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Owner Login</title>
</head>

<body>
	<h1>Owner login</h1>
	<% 
		if(request.getAttribute("error")!=null){
			%>
			
			<%= request.getAttribute("error") %>
			
			<%
		}
	%>
	<form method="post" action="ownerLogin" >
		<input type="text" placeholder="Enter your username" name="username">
		<input type="password" placeholder="Enter your password" name="password">
		<button type="submit">Login</button>
	</form>
</body>
</html>