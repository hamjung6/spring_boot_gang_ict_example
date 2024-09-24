<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script src="${pageContext.request.contextPath}/js/boajsrd."></script>

<script type="text/javascript">
	$(document).ready(function() {

		let board = boardService();
		//board.list();
		//board.get(1021)

		let boardObj = {
			bid: 2067,
			bname : "아햏햏해해햏햏",
			bcontent : "아햏햏하오",
			btitle : "음매에 ~~~"
		}

		/* board.add(boardObj); */

		/* board.del(2094);
		board.del(2095); */
		board.update(boardObj); // type : PUT

	});
</script>

</head>
<body>
	<h1>Restful 게시판 연습</h1>
</body>
</html>