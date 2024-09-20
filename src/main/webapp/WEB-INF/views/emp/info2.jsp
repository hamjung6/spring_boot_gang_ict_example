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
	<h1>info2 리스트</h1>

	<table width="50%" border="1">
		<tr> <!-- 테이블의 상단에 들어갈 컬럼명들 -->
			<td>이름</td>
			<td>월급</td>
			<td>부서번호</td>
			<td>부서위치</td>
			<td>부서등급</td>
		</tr>

		<c:forEach var="emp" items="${empSalGradeList}">
			<tr>
				<td>${emp.ename}</td>
				<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
				<td>${emp.deptno}</td>
				<td>${emp.dept.loc}</td>
				<td>${emp.salgrade.grade}</td>
			
			</tr>
		</c:forEach>

	</table>
</body>
</html>