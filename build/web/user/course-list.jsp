

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Course</title>
    </head>
    <body class=" layout-fluid" style="background-color: #eaf4fc">
        <h1>Done List</h1>
        <c:forEach var="c" items="${requestScope.doneList}">
            ${c.subject.subjectName}
        </c:forEach>
        <h1>Not Done List</h1>
         <c:forEach var="c" items="${requestScope.notDoneList}">
            ${c.subject.subjectName}
        </c:forEach>
        <h1>Future List</h1>
         <c:forEach var="c" items="${requestScope.futureList}">
            ${c.subject.subjectName}
        </c:forEach>
    </body>
</html>
