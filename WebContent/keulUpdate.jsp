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
<h1>SNS �� �ϳ� �Է��ϱ� </h1>
<form action="keulUpdating.do">  
 <table border=1 cellspacing=0 cellpading=0>
    <tr>
	   <td>������ȣ</td>
	   <td>������</td>
	   <td>����</td>
	   <td>������</td>
	   <td>����</td>
	   <td>�ϴ� �����ο�</td>
	   <td>����ó</td>
	   <td>Ȩ������</td>
	</tr>
   	<tr>
		<td><input type="hidden" name="fnum" value="${sv1.fnum}"></td>
		<td><input type="text" name="fname" value="${sv1.fname}"></td>
		<td><input type="text" name="city" value="${sv1.city}"></td>
	   <td><input type="text" name="sdate" value="${sv1.sdate}"></td>
	   <td><input type="text" name="edate" value="${sv1.edate}"></td>
	   <td><input type="text" name="capa" value="${sv1.capa}"></td>
	   <td><input type="text" name="ftel" value="${sv1.ftel}"></td> 
		<td><input type="text" name="home" value="${sv1.home}"></td>
	</tr>
	<tr>
		<td colspan="5">		
			<input type="submit" value="����">
			<input type="reset" value="�������">        
		</td>
	</tr>          
 </table>
</form>
<table border=0>
<tr>
<td><a href="getAllinfo.jsp">[��κ���]</a></td>
<td><a href="keulDeleting.do?fnum=${sv1.fnum}">[����]</a></td>
</tr>
</table>  
</body>
</center>
</html>