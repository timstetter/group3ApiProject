<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Group 3 API Project | Info</title>
</head>
<body>

	<h2><a href="${ event.getUrl() }">${ event.getName() }</a></h2>
	
		<p>Date: <fmt:formatDate pattern ="MM/dd/yyyy" value ="${ event.getDates().getStart().getLocalDate() }" /></p>
				
		<c:forEach var="venue" items="${ event.get_embedded().getVenues() }">
					
						<p>Location: ${ venue.getName() }, ${ venue.getCity().getName() }, ${ venue.getState().getStateCode() }</p>
						
		</c:forEach> 
		
		
		<h3>Additional Information</h3><p>${ event.getInfo() }</p>
		
		<a href="/">Return to Events List</a>
		
		
		
		
	

</body>
</html>