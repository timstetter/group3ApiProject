<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<link href="styles.css" rel="stylesheet"/>
<script src="script.js"></script>
<title>Group 3 API Project | Bucket List</title>
	</head>
	<body>
		<h1>Bucket List</h1>
		
		
			<table id="myTable">
				<tr>
					<th onclick="sortTable(0)">Name</th>
					<th>Remove from Bucket List</th>
				</tr>
				
				<c:forEach var="event" items="${ events  }">
				 	<tr>
						<td><a href="${ event.getUrl() }">${ event.getName() }</a></td>	
											
					<td><a href="/delete/${ event.getId() }">Remove from Bucket List</a></td>	
					</tr>		
				</c:forEach>
			
			</table><br />
			
			<a href="/">Return to Events List</a>
	</body>
</html>