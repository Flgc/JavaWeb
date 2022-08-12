<%@ page isErrorPage="true"%>
<%@ page import="java.util.Enumeration" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login error</title>
</head>
<body>
	<h2>User name or password invalid!</h2>
	<div align="center">
		<div id="head">Head</div>
		<div id="body">
			<img src="img/error1.jpg" />
			<hr />
			Error:
			<%=exception.getMessage()%>
			Exception occurred:
			<%=exception.getClass()%>
			<br />
			<hr />
			<a href=login.jsp>Try again</a>
		</div>
		<div id="baseboard">baseboard</div>
	</div>

</body>
</html>