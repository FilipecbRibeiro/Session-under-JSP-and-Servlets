<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/WebControllerServlet" method="post">
<%--form sent to servlet --%>

UserName: <input type="text" name="name" value="Enter username"><br>
PassWord: <input type="password" name="password"> <br>
<input type="submit" value="submit">

</form>
</body>
</html>