<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation</title>
</head>
<body>
	The Customer is confirmed : ${customer.firstName} ${customer.lastName}
	<br><br>
	FreePasses : ${customer.freePasses }
	<br><br>
	PostalCode : ${customer.postalCode}
	
	<br><br>
	CourseCode : ${customer.courseCode}
</body>
</html>