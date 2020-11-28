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
	<table>
		<tr>
			<th>Name</th>
			<th>Date</th>
			<th>Venue</th>
		</tr>
		
		<c:forEach var="event" items="${ eRep.get_embedded().getEvents()  }">
		 	<tr>
				<td><a href="${ event.getUrl() }">${ event.getName() }</a></td>	
		
		
				<td><fmt:formatDate pattern ="MM/dd/yyyy" value ="${ event.getDates().getStart().getLocalDate() }" /></td>
			
				<c:forEach var="venue" items="${ event.get_embedded().getVenues() }">
					<td>${ venue.getName() }, ${ venue.getCity().getName() }, ${ venue.getState().getStateCode() }</td>
				</c:forEach>  
			
			</tr>		
		</c:forEach>
	
	</table>
	<c:url value="/" var="firsturl">
		<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getFirst().getHref() }" />
	</c:url>
	<c:if test="${eRep.getPage().getNumber() > 1 }">
		<a href="${ firsturl }">First Page</a>
	</c:if>
	
	<c:url value="/" var="prevurl">
		<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getPrev().getHref() }" />
	</c:url>
	<c:if test="${eRep.getPage().getNumber() > 0 }">
		<a href="${ prevurl }">Previous Page</a>
	</c:if>
	
	<c:url value="/" var="nexturl">
		<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getNext().getHref() }" />
	</c:url>	
	<a href="${ nexturl }">Next Page</a>
	
<!--  For some reason this isn't working, getting results limit exceeded  	
	<c:url value="/" var="lasturl">
		<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getLast().getHref() }" />
	</c:url>	
	<a href="${ lasturl }">Last Page</a>  
-->	
	<p>Page ${ eRep.getPage().getNumber() + 1 } of ${ eRep.getPage().getTotalPages() }</p>
	<p>Total Results: ${ eRep.getPage().getTotalElements() }</p>
	
</body>
</html>