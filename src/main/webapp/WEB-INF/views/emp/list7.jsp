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
	<h1>emp 리스트7</h1>
	<table width="50%" border="1">
		<tr>
			<td>사원이름</td>
			<td>월급</td>
			<td>부서번호</td>
			<td>부서위치</td>
			<td>부서이름</td>
		</tr>

		<c:forEach var="vo" items="${empList}">
			<tr>
				<td>${vo.emp.ename}</td>
				<td><fmt:formatNumber value="${vo.emp.sal}" type="number"/></td>
				<td>${vo.emp.deptno}</td>
				<td>${vo.dept.loc}</td>
				<td>${vo.dept.dname}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>