<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	hello ${msg }
	<br />
	<br />

	<c:forEach var="item" items="${bookList}">
	         ${item} <br />
	</c:forEach>
	<br />
	<br />

	<!-- 输出Map -->
	<c:forEach items="${map}" var="node">  
        姓名：${node.key}
        住址：${node.value}
        <br />
	</c:forEach>
</body>
</html>