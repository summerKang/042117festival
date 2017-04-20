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
<h1>축제 정보</h1>
 <table border=1 cellspacing=0 cellpading=0>
    <tr align=center>
	   <td>축제번호</td>
	   <td>축제명</td>
	   <td>지역</td>
	   <td>개최일</td>
	   <td>폐막일</td>
	   <td>일당 수용인원</td>
	   <td>연락처</td>
	   <td>홈페이지</td>
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
			<input type="submit" value="수정">
			<input type="reset" value="수정취소">
 		</td>
	</tr>          
 </table>
<table border=0>
<tr>
<td><a href="getAllinfo.jsp">[모두보기]</a></td>
<td><a href="keulDeleting.do?fnum=${sv1.fnum}">[삭제]</a></td>
</tr>
</table>  
</body>
</center>
</html>