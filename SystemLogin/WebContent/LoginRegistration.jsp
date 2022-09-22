<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<script type="text/javascript" src="fieldValidation.js"></script>
</head>
<body>
	<h2>Login Registration</h2>
	<form name="loginform" action="LoginRegistration" method="post">
		<table>
			<tr>
				<td>Name.:</td>
				<td><input type="text" name="txtUser"></td>
				<td>Password.:</td>
				<td><input type="password" name="txtPassword"></td>

				<tb colspan="2"> <input type="submit" value="Include" /></tb>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Login" onClick="loginValidation()" /></td>
			</tr>
		</table>
	</form>
</body>
</html>