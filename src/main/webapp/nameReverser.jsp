<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Reverser</title>
</head>
<body>
	<h1>Name Reverser</h1>
	<form action="getNamesBServlet" method="post">
		Enter the name you would like to reverse: <input type="text" name="userName" size="17"> <input type="submit" value="Reverse Name" />
	</form>
	
	<a href="index.jsp">Back to the menu</a>

</body>
</html>