<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>sal 리스트2</h1>
	<table width="50%" border="1">
		<tr>
			<!-- 테이블의 상단에 들어갈 컬럼명들 -->
			<td>이름</td>
			<td>월급</td>
			<td>등급</td>
			
		</tr>
		<c:forEach var="sal" items="${salEmpList}">
			<c:forEach var="emp" items="${sal.empList}">
				<tr>

					<td>${emp.ename}</td>
					<td>${emp.sal}</td>
					<td>${sal.grade}</td>

				</tr>
			</c:forEach>
		</c:forEach>
	</table>
</body>
</html>