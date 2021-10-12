
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <h1>Hello World!</h1>
        <table>
            <tr>
                <th>requestID</th>
                <!--<th>userID</th>-->
                <th>subjectName</th>
                <th>moneyPerSlot</th>
                <th>timePerSlot</th>
                <th>startTime</th>
                <th>endTime</th>
                <th>description</th>
                <th>status</th>
                <th>learnType</th>
                <th>reqTime</th>
                <th>EDIT</th>
            </tr>
            <c:forEach var="rList" items="${requestScope.rList}">
                <tr>
                    <th>${rList.requestID}</th>
                    <!--<th>${rList.userID}</th>-->
                    <th>${rList.subject.subjectName}</th>
                    <th>${rList.moneyPerSlot}</th>
                    <th>${rList.timePerSlot}</th>
                    <th>${rList.startTime}</th>
                    <th>${rList.endTime}</th>
                    <th>${rList.description}</th>
                    <th>${rList.status}</th>
                    <th>${rList.learnType}</th>
                    <th>${rList.reqTime}</th>
                    <th><a href="editRequest?id=${rList.requestID}">EDIT</a></th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>