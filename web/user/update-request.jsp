<%-- 
    Document   : update-request
    Created on : Oct 12, 2021, 2:05:58 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="editRequest" method="POST">
            ID:<input type="text" value="${req.requestID}"  disabled><br/>
            <input type="text" name="reqID" value="${req.requestID}"  hidden>
            <select name="subject">
                <option value="${req.subject.subjectID}">${req.subject.subjectName} ${req.subject.level}</option>
                <c:forEach var="sub" items="${requestScope.sub}">
                    <option value="${sub.subjectID}">${sub.subjectName} ${sub.level}</option>
                </c:forEach>
            </select><br/>
            Money Per Slot   <input type="number" value="${req.moneyPerSlot}"name="moneyPerSlot"><br/>
            timePerSlot:   <input type="number" value="${req.timePerSlot}" name="timePerSlot"><br/>

            startTime: <input type="date" value="${fn:substring(req.startTime,0, 10)}" name="startTime"><br/>
            endTime:  <input type="date" value="${fn:substring(req.endTime,0, 10)}" name="endTime"><br/>
            Note:  <input type="text" name="description" value="${req.description}"><br/>
            LearnType:
            <select name="learnType">
                <option value="${req.learnType}">${req.learnType eq 1?"Offline":"Online"}</option>
                <option value="1">Offline</option>
                <option value="2">Online</option>
            </select><br/>
            <!--<input type="text" name="2" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}">-->
            Create Date: <input type="text" disabled value="${req.reqTime}"><br/>

            <table>
                <tr>
                    <th></th>
                    <th>Monday</th>
                    <th>Tuesday</th>
                    <th>Wednesday</th>
                    <th>Thursday</th>
                    <th>Friday</th>
                    <th>Saturday</th>
                    <th>Sunday</th>
                </tr>
                <tr>
                    <td>From</td>
                    <c:forEach begin="2" end="8" var="i">
                        <td><input type="time" name="${i}" class="time" value="${fn:substring(req.listSlotTime[i-2].slotFrom,0, 5)}"></td>
                        </c:forEach>
    <!--                    <td><input type="time" name="2" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>
                        <td><input type="time" name="3" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>
                        <td><input type="time" name="4" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>
                        <td><input type="time" name="5" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>
                        <td><input type="time" name="6" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>
                        <td><input type="time" name="7" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>
                        <td><input type="time" name="8" class="time" value="${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}"></td>-->
                </tr>
                <tr>
                    <td>To</td>
                    <c:forEach begin="2" end="8" var="i">
                        <td><input type="time" name="${i}" class="time" value="${fn:substring(req.listSlotTime[i-2].slotTo,0, 5)}"></td>
                        </c:forEach>
                    <!--                    <td><input type="time" name="2" class="time"></td>
                                        <td><input type="time" name="3" class="time"></td>
                                        <td><input type="time" name="4" class="time"></td>
                                        <td><input type="time" name="5" class="time"></td>
                                        <td><input type="time" name="6" class="time"></td>
                                        <td><input type="time" name="7" class="time"></td>
                                        <td><input type="time" name="8" class="time"></td>-->

                </tr>
            </table>
                <input type="text" id="timeJson" name="timeJson" hidden>
            <input type="submit">
        </form>
        <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script>
            $(document).ready(function () {
                var arr = [];
                for (let i = 2; i <= 8; i++) {
                    const day = {
                        day: i,
                        from: document.getElementsByName(i)[0].value,
                        to: document.getElementsByName(i)[1].value
                    };
                    arr.push(day);
                }
                var jsonArr = JSON.stringify(arr);
                var inputTime = document.getElementById("timeJson");
                inputTime.value = jsonArr;
            });
        </script>
        <script>
            var elements = document.getElementsByClassName("time");
            var func = function () {
                var arr = [];
                for (let i = 2; i <= 8; i++) {
                    const day = {
                        day: i,
                        from: document.getElementsByName(i)[0].value,
                        to: document.getElementsByName(i)[1].value,
                    };
                    arr.push(day);
                }
                var jsonArr = JSON.stringify(arr);
                var inputTime = document.getElementById("timeJson");
                inputTime.value = jsonArr;
            }
//            func;
            for (var i = 0; i < elements.length; i++) {
                elements[i].addEventListener('input', func, false);
            }
        </script>        
    </body>
</html>
