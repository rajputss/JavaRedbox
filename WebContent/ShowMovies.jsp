<%@page import="com.training.java.redbox.domain.Movie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Header.jsp" %>
	<table>
		<tr>
		<%
			List<Movie> movies = (List<Movie>) request.getAttribute("movies");
			for (Movie movie : movies)
			{
		%>
	
			<td><img alt="<%=movie.getTitle() %>" src="<%=movie.getImageLocation()%>" width="225" height="275"></td>
		
		<% } %>
		</tr>
	</table>
	<hr>
	
	<%@include file="Footer.jsp" %>
	

</body>
</html>