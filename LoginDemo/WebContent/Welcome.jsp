<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body >
<% 
if (null == session.getAttribute("name"))
{response.sendRedirect("loginPage.jsp");}%>
<h1>Welcome User</h1><br/>

<form action = "Videos.jsp">
<input type = "submit" value = "videos"/>

</form>
<form action = "Logout">
<input type = "submit" value = "logout"/>
</form>
</body>
</html>