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
	<h1>절대 경로 상대경로 테스트</h1>
	
	<img src="${pageContext.request.contextPath}/images/404/404.png"><br>
	
	<img src="${pageContext.request.contextPath}/images/404/404.png">
</body>
</html>