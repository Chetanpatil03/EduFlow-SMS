<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Login | EduFlow</title>
<link rel="stylesheet" href="../style/auth.css">
</head>
<body>
	<div class="container">
		<form action="<%=request.getContextPath()%>/StudentLogin" method="post">
			<h2>Student Login</h2>
			<input type="text" placeholder="E-mail" name="email">
			<input type="password" name="pass" id="" placeholder="*************">
			<p>Note : If your are new your password will be your email.</p>
			<input type="submit" value="Login">
		</form>
	</div>
</body>
</html>