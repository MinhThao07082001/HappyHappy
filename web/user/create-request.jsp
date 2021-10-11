<%-- 
    Document   : mentee-create-request
    Created on : Oct 11, 2021, 1:14:25 PM
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
        <form action="createRequest" method="POST">
            <select name="subject">
                <c:forEach var="sub" items="${requestScope.sList}">
                    <option value="${sub.subjectID}">${sub.subjectName}</option>
                </c:forEach>
            </select>
            Money Per Slot: <input type="number" name="moneyPerSlot">
            timePerSlot:    <input type="number" name="timePerSlot">
            startTime: <input type="date" name="startTime">
            endTime:  <input type="date" name="endTime">
            Note:  <input type="text" name="description">
            LearnType:
            <select name="learnType">
                <option value="1">Offline</option>
                <option value="2">Online</option>
            </select>
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
                    <td><input type="time" name="2" class="time"></td>
                    <td><input type="time" name="3" class="time"></td>
                    <td><input type="time" name="4" class="time"></td>
                    <td><input type="time" name="5" class="time"></td>
                    <td><input type="time" name="6" class="time"></td>
                    <td><input type="time" name="7" class="time"></td>
                    <td><input type="time" name="8" class="time"></td>
                </tr>
                <tr>
                    <td>To</td>
                    <td><input type="time" name="2" class="time"></td>
                    <td><input type="time" name="3" class="time"></td>
                    <td><input type="time" name="4" class="time"></td>
                    <td><input type="time" name="5" class="time"></td>
                    <td><input type="time" name="6" class="time"></td>
                    <td><input type="time" name="7" class="time"></td>
                    <td><input type="time" name="8" class="time"></td>

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
                        to: document.getElementsByName(i)[1].value
                    };
                    arr.push(day);
                }
                var jsonArr = JSON.stringify(arr);
                var inputTime = document.getElementById("timeJson");
                inputTime.value = jsonArr;
            }
            for (var i = 0; i < elements.length; i++) {
                elements[i].addEventListener('input', func, false);
            }
        </script>
    </body>
</html>
