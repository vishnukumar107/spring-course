<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action = "processForm" modelAttribute = "student">
	
	First name : <form:input path = "firstName"/><br><br>
	Last name : <form:input path = "lastName"/><br><br>
	
	Country : 
	<form:select path = "country">
		<form:options items = "${student.countryOptions }"/> 
	</form:select>
	<br><br>
	
	Favorite Language:
	
	<form:radiobuttons path = "favoriteLanguage" items = "${student.favoriteLanguageOptions }"/> 

	<%-- Java <form:radiobutton path = "favoriteLanguage" value = "Java" />
	C++ <form:radiobutton path = "favoriteLanguage" value = "C++" />
	PHP <form:radiobutton path = "favoriteLanguage" value = "PHP" />
	Ruby <form:radiobutton path = "favoriteLanguage" value = "Ruby" /> --%>
	
	<br><br>
	Operating Systems:
	
	Linux <form:checkbox path = "operatingSystems" value = "linux" />
	Mac OS <form:checkbox path = "operatingSystems" value = "Mac OS" />
	Windows <form:checkbox path = "operatingSystems" value = "Windows" />
	
	<br><br>
	<input type = "submit" value = "Submit" />
	
	</form:form>
</body>
</html>