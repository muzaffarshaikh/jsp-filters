<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Login Filter Demo</title>
	</head>
	<body>
		<div align="center">
			<h1>User Data Insert Form</h1>
			<form action="insertdata">
				<label>User ID : </label>
				<input type="text" name="id">
				<br><br>
				<label>Username : </label>
				<input type="text" name="uname">
				<br><br>
				<label>Email : </label>
				<input type="text" name="email">
				<br><br>
				<input type="submit" name="insert" value="Insert User Data">
			</form>
		</div>
	</body>
</html>