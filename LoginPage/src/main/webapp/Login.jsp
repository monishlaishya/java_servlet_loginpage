<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" href="style.css"></link>
</head>
<body>
    <form id="login"  method="get">
        
        <div id="img">
    <img src="main.jpg" alt="login_page"  width="400" height="300">
    <input type="submit" id="but" formaction="login">
</div>
<div id="blc">
    <label id="uid">User_id</label>
    <input type="text" id="b1" name="uname">
    <br>
    <label id="pid">Password</label>
    <input type="password" id="b2" name="password">
    

</div>

    </form>

    
</body>

</html>