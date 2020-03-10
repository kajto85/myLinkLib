<%--
  Created by IntelliJ IDEA.
  User: K2
  Date: 08.02.2020
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Wsuwak</title>
  </head>
  <body>
  <h1>myLibLink</h1>
  <form action="LibServlet" method="post">
    Link <input type="text" placeholder="link" name="link"><p>* polew wymagane</p>
    <br>
    Tytuł <input type="text" placeholder="title" name="title"><p>* polew wymagane</p>
    <br>
    Opis <input type="text" placeholder="description" name="description">
    <br>
    Dodaj do Listy:<input type="radio" name="option" value="add">
    <br>
    Modyfikuj:<input type="radio" name="option" value="update">
    <br>
    Odczytaj:<input type="radio" name="option" value="read">
    <br>
    Usun:<input type="radio" name="option" value="delete">
    <br>
    <input type="submit" value="Wyślji">
  </form>
  </body>
</html>
