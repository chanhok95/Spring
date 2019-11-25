<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${root}/member/register.do">회원가입</a>
	<a href="${root}/member/login.do">로그인</a>
	
	
	<a href="${root}/board/write.do">글쓰기</a>
	<a href="${root}/board/list.do">글목록</a>
	
	
	
</body>
</html>