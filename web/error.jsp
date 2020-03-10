<%--
  Created by IntelliJ IDEA.
  User: K2
  Date: 08.02.2020
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>error</title>
</head>
<body>
    <h1>Nastąpił błąd</h1>
    <jsp:useBean id="Link" class="pl.kaj2.model.Link" scope="request">
        <jsp:setProperty name="Link" property="link"/>
        <jsp:setProperty name="Link" property="title"/>
        <jsp:setProperty name="Link" property="description"/>
    </jsp:useBean>
        <p>Wpis
            Link: <jsp:getProperty name="Link" property="link"/>
            <br>
            Tytuł: <jsp:getProperty name="Link" property="title"/>
            <br>
            Opis: <jsp:getProperty name="Link" property="description"/>
        </p>
    <p>Nie nastąpił</p>
</body>
</html>
