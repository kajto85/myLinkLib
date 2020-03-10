<%--
  Created by IntelliJ IDEA.
  User: K2
  Date: 19.02.2020
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body>
    <h1>Witaj nowy uzytkowniku !</h1>
    <h3>Zarejestruj sie</h3>
    <form action="SigninServlet" method="post">
        UserName:<input type="text" placeholder="username" name="username">
        <br>
        <br>
        Password:<input type="password" placeholder="password" name="password">
        <br>
        <br>
        Repit Password: <input type="password" placeholder="password" name="passwordConfirm">
        <br>
        <br>
        <input type="submit" value="sign in">
    </form>
</body>
</html>
