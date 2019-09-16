<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>ADD ALIEN</h3>
	<form action="addAlien">
		ID:<input type="text" name="aId"></input><br>
		NAME:<input type="text" name="aName"></input><br>
		TECH:<input type="text" name="tech"></input><br>
		<input type="submit" value="Submit"></input>
	</form>
	<hr>
	<h3>Find ALIEN</h3>
	<form action="findAlien">
		ID:<input type="text" name="aId"></input><br>
		<input type="submit" value="Find"></input>
	</form>
	<hr>
	<h3>Delete Alien</h3>
	<form action="deleteAlien">
		ID:<input type="text" name="aId"></input><br>
		<input type="submit" value="Delete"></input>
	</form>
	<hr>
	<h3>Update Alien</h3>
	<form action="updateAlien">
		ID:<input type="text" name="aId"></input><br>
		NEW NAME:<input type="text" name="aName"></input><br>
		<input type="submit" value="update"></input>
	</form>
	
</body>
</html>