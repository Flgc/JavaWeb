<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Logged</title>
</head>
<body>
	<h2>Successfully logged in!</h2>

	<form name="loginform" action="LoginRegistration.jsp" method="post">
		<tb colspan="2"> <input type="submit" value="Include" /></tb>
	</form>
</body>
<%
	String userName = (String) session.getAttribute("UserAuthentication");
	if (userName == null)
		throw new ServletException("No user logged in!");
%>
Welcome:
<%=userName%>
|
<a href="to_remove.jsp"> Exit</a>
</html>