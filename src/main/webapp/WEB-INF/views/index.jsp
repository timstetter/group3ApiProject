<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="styles.css" rel="stylesheet"/>
		<script src="script.js"></script>
		<title>Group 3 API Project | Events</title>
	</head>
	<body>
		<h1>Events</h1>
		
		<a href="/bucketlist">Go to Bucket List</a><br /><br />
		
		
		<form method="post" action="/">
			<input name="keyword" placeholder="text search" type="text" value="<c:out value="${ keyword }"/>" />
			<input name="postalCode" placeholder="postal code search" type="text" value="<c:out value="${ postalCode }"/>" />
			<button>Search</button>
		</form>
		
		
		<c:if test="${ eRep.getPage().getTotalElements() != 0 }">
			<table id="myTable">
				<tr>
					<th onclick="sortTable(0)">Name</th>
					<th onclick="sortTable(1)">Date</th>
					<th onclick="sortTable(2)">Venue</th>
					<th>Info</th>
					<th>Add to Bucket List</th>
				</tr>
				
				<c:forEach var="event" items="${ eRep.get_embedded().getEvents()  }">
				 	<tr>
						<td><a href="${ event.getUrl() }">${ event.getName() }</a></td>	
				
				
						<td><fmt:formatDate pattern ="MM/dd/yyyy" value ="${ event.getDates().getStart().getLocalDate() }" /></td>
					
					<c:forEach var="venue" items="${ event.get_embedded().getVenues() }">
					
						<td>${ venue.getName() }</td>
						
					</c:forEach> 
					<td><a href="/info/${ event.getId() }">Info</a></td> 
					<td><a href="/add/${ event.getId() }">Add to Bucket List</a></td>	
					
					</tr>		
				</c:forEach>
			
			</table>
		</c:if>
		
		<c:url value="/" var="firsturl">
			<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getFirst().getHref() }" />
		</c:url>
		
		<c:if test="${eRep.getPage().getNumber() > 1 }">
			<a href="${ firsturl }">First Page</a>&nbsp;
		</c:if>
		
		<c:url value="/" var="prevurl">
			<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getPrev().getHref() }" />
		</c:url>
		
		<c:if test="${eRep.getPage().getNumber() > 0 }">
			<a href="${ prevurl }">Previous Page</a>&nbsp;
		</c:if>
		
		<c:if test="${ eRep.getPage().getTotalElements() > 20}">

			<c:url value="/" var="nexturl">
				<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getNext().getHref() }" />
			</c:url>	
			<a href="${ nexturl }">Next Page</a>&nbsp;
		</c:if>
		
	<!--  For some reason this isn't working, getting results limit exceeded  	
		<c:url value="/" var="lasturl">
			<c:param name="url" value="https://app.ticketmaster.com${eRep.get_links().getLast().getHref() }" />
		</c:url>	
		<a href="${ lasturl }">Last Page</a>  
	-->	
		<c:if test="${ eRep.getPage().getTotalElements() != 0 }">
			<p>Page ${ eRep.getPage().getNumber() + 1 } of ${ eRep.getPage().getTotalPages() }</p>
		</c:if>
		<p>Total Results: ${ eRep.getPage().getTotalElements() }</p>
	
	</body>
</html>