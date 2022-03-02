<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	if(session.getAttribute("manager")==null){
		response.sendRedirect("managerlogin");
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= session.getAttribute("manager") %>
</body>
</html>