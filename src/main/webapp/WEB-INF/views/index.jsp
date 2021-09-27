<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Marhabane bik</h3>
	<c:forEach items="${persons}" var="person" varStatus="Status">
	 	
	 	${us.getNaissance()}
	 	${person.getName()} 
	</c:forEach>
				 
		
	
	<form action="/addPerson" method="post">
		<label for="name" >Adresse mail</label>
		<input type="text" name="name" id="name">
		<label for="sexe" >Nom d'utilisateur</label>
		<input type="text" name="sexe" id="sexe">
		<label for="date" >Mot de passe</label>
		<input type="date" name="date" id="date">
		<button type="submit" > Soumettre</button>
	</form>
</body>
</html>