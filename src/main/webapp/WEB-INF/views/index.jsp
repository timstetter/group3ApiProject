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
	
	<c:forEach var="event" items="${ eRep.get_embedded().getEvents()  }">
		<b>Event Name:</b> 
			${ event.getName() } 		
		<b>Event Date:</b> 
		
			<fmt:formatDate pattern ="MM/dd/yyyy" value ="${event.getDates().getStart().getLocalDate() }" />
			
		<b>Venue:</b> 
		
			<c:forEach var="venue" items="${ event.get_embedded().getVenues() }">
				${ venue.getName() } 
			</c:forEach>  
			
				<br />
	</c:forEach>
	
	<c:url value="/" var="nexturl">
		<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getNext().getHref() }" />
	</c:url>
	
	<a href="${ nexturl }">Next Page</a>
	
</body>
</html>