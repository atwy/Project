<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Videos</title>
</head>
<body>
<% 
if (null == session.getAttribute("name"))
{response.sendRedirect("loginPage.jsp");}%>
<ul>
<li><a href = "www.google.com">Video1</a></li>
<li><a href = "www.google.com">Video2</a></li>
<li><a href = "www.google.com">Video3</a></li>
<li><a href = "www.google.com">Video4</a></li>
<form action = "Logout">
<input type = "submit" value = "logout"/>
</form>

</ul>
</body>
</html>