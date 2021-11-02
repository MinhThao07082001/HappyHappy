<%-- 
    Document   : course-detail
    Created on : Nov 2, 2021, 2:55:33 AM
    Author     : vinh1
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            html {
                font-family: sans-serif;
                font-size: 15px;
                line-height: 1.4;
                color: #444;
            }

            body {
                margin: 0;
                font-size: 1em;
            }

            .wrapper {
                margin: 15px auto;
                max-width: 1100px;
            }

            .container-calendar {
                background: #ffffff;
                padding: 15px;
                max-width: 475px;
                margin: 0 auto;
                overflow: auto;
            }

            .button-container-calendar button {
                cursor: pointer;
                display: inline-block;
                zoom: 1;
                background: #00a2b7;
                color: #fff;
                border: 1px solid #0aa2b5;
                border-radius: 4px;
                padding: 5px 10px;
            }

            .table-calendar {
                border-collapse: collapse;
                width: 100%;
            }

            .table-calendar td, .table-calendar th {
                padding: 5px;
                border: 1px solid #e2e2e2;
                text-align: center;
                vertical-align: top;
            }

            .date-picker.selected {
                font-weight: bold;
                outline: 1px dashed #00BCD4;
            }

            .date-picker.selected span {
                border-bottom: 2px solid currentColor;
            }

            /* sunday */
            .date-picker:nth-child(1) {
                color: red;
            }

            /* friday */
            .date-picker:nth-child(6) {
                color: green;
            }

            #monthAndYear {
                text-align: center;
                margin-top: 0;
            }

            .button-container-calendar {
                position: relative;
                margin-bottom: 1em;
                overflow: hidden;
                clear: both;
            }

            #previous {
                float: left;
            }

            #next {
                float: right;
            }

            .footer-container-calendar {
                margin-top: 1em;
                border-top: 1px solid #dadada;
                padding: 10px 0;
            }

            .footer-container-calendar select {
                cursor: pointer;
                display: inline-block;
                zoom: 1;
                background: #ffffff;
                color: #585858;
                border: 1px solid #bfc5c5;
                border-radius: 3px;
                padding: 5px 1em;
            }
            .has-slot{
                background-color: bisque;
            }
        </style>
    </head>

    <body>
        <c:set var="c" value="${requestScope.course}"/>
        <h1>${c.subject.subjectName}</h1>
        <%--<c:forEach var="slot" items="${c.listCourseSlot}"></c:forEach>--%>
        <input type="text" hidden id="slots" value="${requestScope.slots}">
        <input type="text" hidden id="dates" value="${requestScope.dates}">
        <div class="wrapper">
            <div class="container-calendar">
                <h3 id="monthAndYear"></h3>

                <div class="button-container-calendar">
                    <button id="previous" onclick="previous()">&#8249;</button>
                    <button id="next" onclick="next()">&#8250;</button>
                </div>

                <table class="table-calendar" id="calendar" data-lang="en">
                    <thead id="thead-month"></thead>
                    <tbody id="calendar-body"></tbody>
                </table>

                <div class="footer-container-calendar">
                    <label for="month">Jump To: </label>
                    <select id="month" onchange="jump()">
                        <option value="0">Jan</option>
                        <option value="1">Feb</option>
                        <option value="2">Mar</option>
                        <option value="3">Apr</option>
                        <option value="4">May</option>
                        <option value="5">Jun</option>
                        <option value="6">Jul</option>
                        <option value="7">Aug</option>
                        <option value="8">Sep</option>
                        <option value="9">Oct</option>
                        <option value="10">Nov</option>
                        <option value="11">Dec</option>
                    </select>
                    <select id="year" onchange="jump()"></select>
                </div>
            </div>
        </div>
    </body>
    <script>
        console.log();
        console.log(document.getElementById("dates").value);

        console.log(slots.length);
        console.log(dates.length);

        console.log(findDate("2022-01-27"))
        console.log(dates[64])
    </script>
    <script>
        var slots = [];
        var dates = [];
        slots = document.getElementById("slots").value.split(";");
        dates = document.getElementById("dates").value.split(";");
        function findDate(date) {
            for (var i = 0; i < dates.length; i++) {
                if (date === dates[i]) {
                    return i;
                }
            }
            return -1;
        }
        function generate_year_range(start, end) {
            var years = "";
            for (var year = start; year <= end; year++) {
                years += "<option value='" + year + "'>" + year + "</option>";
            }
            return years;
        }

        today = new Date();
        currentMonth = today.getMonth();
        currentYear = today.getFullYear();
        selectYear = document.getElementById("year");
        selectMonth = document.getElementById("month");


        createYear = generate_year_range(1970, 2050);
        /** or
         * createYear = generate_year_range( 1970, currentYear );
         */

        document.getElementById("year").innerHTML = createYear;

        var calendar = document.getElementById("calendar");
        var lang = calendar.getAttribute('data-lang');

        var months = "";
        var days = "";

        var monthDefault = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

        var dayDefault = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

        if (lang == "en") {
            months = monthDefault;
            days = dayDefault;
        } else if (lang == "id") {
            months = ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"];
            days = ["Ming", "Sen", "Sel", "Rab", "Kam", "Jum", "Sab"];
        } else if (lang == "fr") {
            months = ["Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"];
            days = ["dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"];
        } else {
            months = monthDefault;
            days = dayDefault;
        }


        var $dataHead = "<tr>";
        for (dhead in days) {
            $dataHead += "<th data-days='" + days[dhead] + "'>" + days[dhead] + "</th>";
        }
        $dataHead += "</tr>";

//alert($dataHead);
        document.getElementById("thead-month").innerHTML = $dataHead;


        monthAndYear = document.getElementById("monthAndYear");
        showCalendar(currentMonth, currentYear);



        function next() {
            currentYear = (currentMonth === 11) ? currentYear + 1 : currentYear;
            currentMonth = (currentMonth + 1) % 12;
            showCalendar(currentMonth, currentYear);
        }

        function previous() {
            currentYear = (currentMonth === 0) ? currentYear - 1 : currentYear;
            currentMonth = (currentMonth === 0) ? 11 : currentMonth - 1;
            showCalendar(currentMonth, currentYear);
        }

        function jump() {
            currentYear = parseInt(selectYear.value);
            currentMonth = parseInt(selectMonth.value);
            showCalendar(currentMonth, currentYear);
        }

        function showCalendar(month, year) {

            var firstDay = (new Date(year, month)).getDay();

            tbl = document.getElementById("calendar-body");


            tbl.innerHTML = "";


            monthAndYear.innerHTML = months[month] + " " + year;
            selectYear.value = year;
            selectMonth.value = month;

            // creating all cells
            var date = 1;
            for (var i = 0; i < 6; i++) {

                var row = document.createElement("tr");


                for (var j = 0; j < 7; j++) {
                    if (i === 0 && j < firstDay) {
                        cell = document.createElement("td");
                        cellText = document.createTextNode("");
                        cell.appendChild(cellText);
                        row.appendChild(cell);
                    } else if (date > daysInMonth(month, year)) {
                        break;
                    } else {
                        cell = document.createElement("td");
                        cell.setAttribute("data-date", date);
                        cell.setAttribute("data-month", month + 1);
                        cell.setAttribute("data-year", year);
                        cell.setAttribute("data-month_name", months[month]);
                        cell.className = "date-picker";




//                        console.log(today.getDate() + "   " + year + "    " + (today.getMonth() + 1));
                        if (date === today.getDate() && year === today.getFullYear() && month === today.getMonth()) {
                            cell.className = "date-picker selected";
                        }
                        var dateTime = year + "-" + (((month + 1) < 10) ? ('0' + (month + 1)) : (month + 1)) + "-" + ((date < 10) ? '0' + date : date)
                        var infoSlot;
                        var index = findDate(dateTime);
                        if (index !== -1) {
                            infoSlot = slots[index];
                            cell.innerHTML = "<span>" + date + "<br/>" + infoSlot + "</span>";
                            cell.className = "date-picker has-slot";
                        } else {
                            cell.innerHTML = "<span>" + date + "</span>";
                        }
                        row.appendChild(cell);
                        date++;
                    }


                }

                tbl.appendChild(row);
            }

        }

        function daysInMonth(iMonth, iYear) {
            return 32 - new Date(iYear, iMonth, 32).getDate();
        }
    </script>
</html>
