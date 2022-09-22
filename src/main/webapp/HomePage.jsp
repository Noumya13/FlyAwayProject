<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="lightblue">

<jsp:include page="Header.jsp">
		<jsp:param value="Flight Booking" name="header"/>
	</jsp:include>
<h1>Welcome to FlyAway Portal</h1>
<TABLE align='center' WIDTH='50%' CELLSPACING='2' CELLPADDING='4'>
<tr><td><a href="CustomerSearch.jsp">
<input type="Submit" value="Search for a flight">
</a></td>
<td><a href="AdminLogin.jsp">
<input type="Submit" value="Admin Login">
</a></td></tr></table>



<jsp:include page="Footer.jsp">
		<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © FoodBox™ Ltd. All rights reserved." name="footer"/>
	</jsp:include>
</body>
</html>