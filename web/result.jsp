<%--
  Created by IntelliJ IDEA.
  User: K2
  Date: 08.02.2020
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.kaj2.model.Link"%>


<% Link link = (Link) request.getAttribute("linkAtr"); %>
<% String operation = (String)request.getAttribute("operation"); %>
<html>
<head>
    <title>Wynik</title>
</head>
<body>
    <h1>Rezultat zapytania</h1>
    <jsp:useBean id="Link" class="pl.kaj2.model.Link" scope="request">
        <jsp:setProperty name="Link" property="link"/>
        <jsp:setProperty name="Link" property="title"/>
        <jsp:setProperty name="Link" property="description"/>
    </jsp:useBean>
    <p>${requestScope.operation}</p>
    <p>
        Link: <jsp:getProperty name="Link" property="link"/>
        <br>
        Tytuł: <jsp:getProperty name="Link" property="title"/>
        <br>
        Opis: <jsp:getProperty name="Link" property="description"/>
    </p>
</body>
</html>
