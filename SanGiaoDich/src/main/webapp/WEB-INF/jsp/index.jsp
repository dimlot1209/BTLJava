<%-- 
    Document   : index
    Created on : Sep 1, 2022, 1:26:52 PM
    Author     : Lọt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
        <link href="<core:url value="/css/style.css"/>" rel="stylesheet"  />
    </head>
    <body>
        <a href="<core:url value="/test"/>"> REDIRECT / FORWARD</a>
        <ul>
            <core:forEach var="cat" items="${category}">
                <li>${cat.id} - ${cat.name}</li>
            </core:forEach>
        </ul>
    </body>
</html>
