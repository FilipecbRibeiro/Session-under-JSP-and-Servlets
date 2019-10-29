

<%@page import="org.light.bean2.UserMember"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member List</title>
</head>
<body>
<%UserMember user=(UserMember) request.getSession().getAttribute("ref");%>

<%="Name:" + user.getName() %>

<%="Password:" + user.getKeyword() %>


</body>
</html>