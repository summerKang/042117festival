<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login</title>
</head>
<body>
<h3> Login </h3>
<form action="<%=request.getContextPath( )%>/LoginController" method="post">
	
	<table>
	<tr>
		<td align=center>ID : </td>
		<td><input type="text" name="id" required></td>
		<td rowspan='2'><input type="submit" value="login">
	<tr>
		<td align=center>Password : </td>
		<td><input type="password" name="pw" required><br>
	</table>
</form>
</body>
</html>