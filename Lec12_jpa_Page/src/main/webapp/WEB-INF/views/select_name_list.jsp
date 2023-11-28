<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

총글의 갯수 : ${totalElments} <br>
총 페이지 : ${totalPages} <br>
사이즈 : ${size} <br>
페이지 넘버 : ${pageNumber} <br>
content 갯수 : ${numberOfElements} <br>

    <c:forEach var="lists" items="${lists}">
        ${lists.email} / ${lists.name}
        <hr>
        </c:forEach>
</body>
</html>