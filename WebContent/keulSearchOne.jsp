<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<center>
<body>
<h1>���� ����</h1>
 <table border=1 cellspacing=0 cellpading=0>
    <tr align=center>
	   <td>������ȣ</td>
	   <td>������</td>
	   <td>����</td>
	   <td>������</td>
	   <td>����</td>
	   <td>�ϴ� �����ο�</td>
	   <td>����ó</td>
	   <td>Ȩ������</td>
	</tr>
   	<tr align=center>
   		<td>${sv1.fnum}</td>
   		<td>${sv1.fname}</td>
		<td>${sv1.city}</td>
	   <td>${sv1.sdate}</a></td>
	   <td>${sv1.edate}</a></td>	   
	   <td>${sv1.capa}</td>
	   <td>${sv1.ftel}</td>
	   <td>${sv1.home}</td>
	</tr>
	<tr>
		<td colspan="8">
			<a href="keulBonaegi.do?fnum=${sv1.fnum}" >
			<input type="submit" value="����">
			<input type="reset" value="�������">
 		</td>
	</tr>          
 </table>
<table border=0>
<tr>
<td><a href="getAllinfo.jsp">[��κ���]</a></td>
<td><a href="keulDeleting.do?fnum=${sv1.fnum}">[����]</a></td>
</tr>
</table>  
</body>
</center>
</html>