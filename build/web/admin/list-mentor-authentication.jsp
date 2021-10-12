<%-- 
    Document   : list-mentor-authentication
    Created on : Oct 12, 2021, 7:21:59 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>UserName</th>
                <th>UserImg1</th>
                <th>UserImg2</th>
                <th>Edit</th>
            </tr>
            <c:forEach var="mtor" items="${requestScope.mtor}">
                <tr>
                    <td>${mtor.name}</td>
                    <td><img style="width: 100px; height: 100px" src="${mtor.imgAuthen1}"></td>
                    <td><img style="width: 100px; height: 100px"src="${mtor.imgAuthen2}"></td>
                    <td><a href="mtorDetail?id=${mtor.mentorID}">Details</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
