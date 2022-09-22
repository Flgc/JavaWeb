<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>System Login</title>
<script type="text/javascript" src="fieldValidation.js">

</script>
</head>
<body>

	<form action="Login" method="post" name="loginform"> 
		<p align="center">
		<table cellpadding="4">
			<tr>
				<td>User:</td>
				<td><input type="text" name="txtUser"/> </td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="txtPassword"/> </td>
			</tr>
			<tr>
				<td colspan="2" align="center"> <input type="submit" value="Login" onClick="loginValidation()"/> </td>
			</tr>			
		</table>
		</p>
	</form>

</body>
</html>