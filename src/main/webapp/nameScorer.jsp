<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Scorer</title>
</head>
<body>
	<h1>Name Scorer</h1>
	<form action="getNameScoreServlet" method="post">
	<p>The name scoring works as follows... A = 1, B = 2, C = 3, etc. Non-letters are worth 0 points.</p>
		Enter the name you would like to score: <input type="text" name="userName" size="17"> <input type="submit" value="Calculate Score" />
	</form>
	
	<a href="index.jsp">Back to the menu</a>

</body>
</html>