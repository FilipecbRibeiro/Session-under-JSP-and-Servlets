
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member List</title>
</head>
<body>
<jsp:useBean id="listUser" class="org.light.bean2.UserMember" scope="application"></jsp:useBean>
<jsp:setProperty property="*" name="listUser"/>
Login:<jsp:getProperty property="name" name="listUser"/>
PassWord:<jsp:getProperty property="password" name="listUser"/>
</body>
</html>