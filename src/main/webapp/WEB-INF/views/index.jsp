<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Group 3 API Project | Events</title>
</head>
<body>
	<h1>All Events</h1>
	<c:forEach var="event" items="${ events }">
		${event.name } <br />
	</c:forEach>
</body>
</html>