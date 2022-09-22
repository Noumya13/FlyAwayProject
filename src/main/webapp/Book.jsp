<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp">
		<jsp:param value="Flight Booking Register Page" name="header"/>
	</jsp:include>/
<h1 >Please Enter your details</h1>
<br><br>
<form action="display" method="get">
Name:<input type="text" name="name" ><br><br>
DOB:<input type="date" name="dob"><br><br>
Flightno:<input type="text" name="flightno"><br>
<br><br>
Adhaar No:<input type="number" value="adhaar"><br>
<br>
<br>
<tr>
			<td colspan="2" align="center"> 
				<input type="submit" value="Make Payment">
	
				
			</td>
		</tr>
		</form>
		
</body>
</html>