<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<c:set var="root" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
<link href="${root}/css/guest/write.css" rel="stylesheet">
<script type="text/javascript" src="${root }/javascript/guest/guest.js"></script>
</head>
<body>
	<jsp:include page="../../../index.jsp" />
	<h3>
	count : ${count },
	currentPage :${currentPage }, 
	boardSize :${boardSize }
	</h3>

	<div align="center" style="margin: 100px auto;">
		
		<c:if test="${count == 0 || currentPage==1 }">
			<form class="form" action="${root }/guest/writeOk.do" method="get">
				<%-- 데이터가 넘어가야되기때문에 form태그  --%>
				<div class="title">
					<span>이름</span>
					<input type="text" name="name" size="12" />
					<span style="margin-left: 50px;">비밀번호</span> 
					<input type="password"name="password" size="12" />
				</div>
				<div class="content">
					<textarea rows="5" cols="53" name="message"></textarea>
				</div>
				<div class="title" style="text-align: right;">
					<input type="submit" value="확인"> <input type="reset" value="취소">
				</div>
			</form>
		</c:if>
		
		<c:if test="${count >0 }">
			<c:forEach var="guestDto" items="${guestList }">
				<div  class="form" style="margin: 100px auto; border-width: 1px;">
				
					<div class="title">
					${guestDto.num}&nbsp;&nbsp;
					<fmt:formatDate value="${guestDto.writeDate}" pattern="yyyy-MM-dd HH:mm:ss" />
					<a href="javascript:updateCheck('${root}','${guestDto.num}','${currentPage}')">수정</a>
					<a href="javascript:deleteCheck('${root}','${guestDto.num}','${currentPage}')">삭제</a>
					</div>
					
					<div class="content">
					${guestDto.message }
					</div>
				</div>
			</c:forEach>
		</c:if>
	</div>
	<%-- 
		페이지 번호 
	1.총페이지수 : 전체 레코드수(count)와 페이지당 게시물수(boardSize)
	2.페이지 블럭: 시작번호 ~ 끝번호 Ex)10 [1] ~ [10]
	3. 
	 
	 --%>
	 <div align="center">
	 	<c:if test="${count > 0 }">
	 	<%-- 총페이지수 : count/boardSize --%>
	 	
	 	<fmt:parseNumber var="pageCount" integerOnly="true" value="${count/boardSize+(count%boardSize==0 ? 0:1) }"></fmt:parseNumber>
	 
	 	<%--2. 페이지 블록 --%>
	 	<c:set var="pageBlock" value="${3 }"></c:set>
	 	<%--2. 페이지 블럭/ 시작 ,끝 번호 --%>
	 	<%-- 페이지 1을 클릭하면 1~10 나오게 11을 클릭하면 11~20  int startPage = (int)(currentPage-1)/pageblock) * pageblock +1
	 												  int endPage= startPage+pageBlock-1;  
	 	
	 	 --%>
	 	 <fmt:parseNumber var="rs" value="${(currentPage-1)/pageBlock}" integerOnly="true" />
		<c:set var="startPage" value="${rs*pageBlock+1 }" />
		<c:set var="endPage" value="${startpage+pageBlock-1 }" />
		
		<%-- 3. 총레코드수 :270 /10 =27 요청 페이지 :25(start21,end 30) --%> 	
	 	<c:if test="${endPage > PageCount }">
	 	<c:set var="endPage" value="${pageCount}" /> 
	 	</c:if>
	 	<%--다음  --%>
	 	<c:if test="${endPage < pageCount }">
	 	<a href="${root }/guest/write.do?pageNumber=${startPage+pageBlock}">[다음]</a>
	 	</c:if>

		<c:forEach var="i" begin="${startPage }" end="${endPage }">
		<a href="${root }/guest/write.do?pageNumber=${i}">[${i }]</a>
		
		</c:forEach>
	
	 	<%--이전 --%>
	 	<c:if test="${startPage > pageBlock }">
	 	<a href="${root }/guest/write.do?pageNumber=${startPage-pageBlock }">[이전]</a>
	 	</c:if>
	 	</c:if>
	 </div>
</body>
</html>