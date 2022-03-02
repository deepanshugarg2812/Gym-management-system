<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.owner.Owner" %>

<% 
	if(session.getAttribute("owner")==null){
		response.sendRedirect("ownerlogin");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>

<h1>Owner home</h1>
<%= session.getAttribute("owner") %>
</body>
</html>