<%-- 
    Document   : mentor-detail
    Created on : Oct 12, 2021, 7:48:19 AM
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
        <h1>Mentor details</h1>
        <c:set var="mtor" value="${requestScope.mtor}"/>
        <h3>Name :${mtor.name}</h3>
        <h3>Email :${mtor.email}</h3>
        <h3>DOB: ${mtor.dob} </h3>
        <h3>Gender: ${mtor.sex}</h3>
        <h3>${mtor.education}</h3>
        <h3>${mtor.yearExperiment}</h3>
        <h3>${mtor.address}</h3>
        <h3>${mtor.imgAuthen1}</h3>
        <h3>${mtor.imgAuthen2}</h3>
        <h3>${mtor.createTime}</h3>
        <h3>Authen: ${mtor.authen}</h3>
        <c:forEach var="sub" items="${mtor.listMajor}">
            <h5>${sub.subjectName}</h5>
        </c:forEach>
        <h3>${mtor.sex}</h3>
        <form action="processAuthen" method="POST">
            <input type="text" value="${mtor.mentorID}" name="id" hidden>
            <input type="submit" value="Verify">
        </form>
    </body>
</html>
