<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Page</title>
</head>
<body>
 The Student is confirmed : ${student.firstName} ${student.lastName}
 <br><br>
 Country : ${student.country}
 <br><br>
 Favorite Language : ${student.favoriteLanguage }
 
 	<br><br>
 	
 	Operating Systems:
 	<ul>
 		<c:forEach var = "temp"  items = "${student.operatingSystems }">
 			<li>${temp } </li>
 			
 		</c:forEach>
 
 	</ul>
 	
</body>
</html>