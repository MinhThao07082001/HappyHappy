
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
                <th>Action</th>
            </tr>
            <c:forEach var="rList" items="${requestScope.rList}">
                <tr>
                    <th>${rList.requestID}</th>
                    <!--<th>${rList.userID}</th>-->
                    <th>${rList.subject.subjectName} - ${rList.subject.level}</th>
                    <th>${rList.moneyPerSlot}</th>
                    <th>${rList.timePerSlot}</th>
                    <th>${rList.startTime}</th>
                    <th>${rList.endTime}</th>
                    <th>${rList.description}</th>
                    <th>${rList.status}</th>
                    <th>${rList.learnType}</th>
                    <th>${rList.reqTime}</th>
                   
                    <th>
                         <c:if test="${rList.status ne 1}"><a href="editRequest?id=${rList.requestID}">EDIT</a></c:if>
                         <a href="${pageContext.request.contextPath}/listRequest?detail=${rList.requestID}">Details</a>
                    </th>
                    
                    
                    
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
