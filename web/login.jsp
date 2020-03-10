<%--
  Created by IntelliJ IDEA.
  User: K2
  Date: 12.02.2020
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Zaloguj sie</h1>
    <form action="LoginServlet" method="post">
        Nazwa użytkownika: <input type="text" placeholder="username" name="username">
        <br>
        Hasło: <input type="password" placeholder="password" name="userpass">
        <input type="submit" value="zaloguj" >
    </form>
</body>
</html>
