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
<h1>SNS 글 하나 입력하기 </h1>
 <form action="keulWriting.do" >
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
	   <td></td>	   
	   <td><input type="text" name="fname"></td>
	   <td><input type="text" name="city"></td>	   
	   <td><input type="text" name="sdate"></td>	   
	   <td><input type="text" name="edate"></td>	   
	   <td><input type="text" name="capa"></td>	   
	   <td><input type="text" name="ftel"></td>	   
	   <td><input type="text" name="home"></td>	 	   
	</tr>
	<tr>
		<td colspan="8">		
			<input type="submit" value="추가">
			<input type="reset" value="입력취소">        
 		</td>
	</tr>
          
	 </table>
	 </form>
<table border=0>
<tr>
<td><a href="getAllinfo.jsp">[모두보기]</a></td>
</tr>
</table>  
</body>
</center>
</html>