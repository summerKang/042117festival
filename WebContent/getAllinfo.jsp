<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Reservation ��ü����</title>
</head>
<center>
<body>
<h1>���� ���� ����</h1>
<table border=1 cellspacing=0 cellpading=0>
	<tr>
		<td>
		 	 <form action="getAllinfo.do"><input type="submit" value="��κ���"></form>
		</td>
		<td colspan=7>
		 	 <a href="keulWriting.jsp"><input type="submit" value="�߰�"></a>        
		</td>
	</tr>
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
<c:forEach items="${alist1}" var="vo1">
   	<tr align=center>
	   <td><a href="keulSearchOne.do?fnum=${vo1.fnum}">${vo1.fnum}</td>
	   <td>${vo1.fname}</td>
	   <td>${vo1.city}</td>
	   <td>${vo1.sdate}</a></td>
	   <td>${vo1.edate}</a></td>
	   <td>${vo1.capa}</td>
	   <td>${vo1.ftel}</td>
	   <td>${vo1.home}</td>
	</tr>

</c:forEach>	

</table>
</body>
</center>
</html>