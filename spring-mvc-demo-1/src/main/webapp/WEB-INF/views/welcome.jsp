<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<c:forEach items="${welcomeMessages}" var="message">
    <c:out value="${message}"></c:out>
</c:forEach>
</html>