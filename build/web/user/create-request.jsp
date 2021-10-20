<html lang="en"
      dir="ltr">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Instructor - Public profile</title>

        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
        <meta name="robots"
              content="noindex">

        <!-- Custom Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap"
              rel="stylesheet">
        <!-- Perfect Scrollbar -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/vendor/perfect-scrollbar.css"
              rel="stylesheet">
        <!-- Material Design Icons -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/material-icons.css"
              rel="stylesheet">
        <!-- Font Awesome Icons -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/fontawesome.css"
              rel="stylesheet">
        <!-- Preloader -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/vendor/spinkit.css"
              rel="stylesheet">
        <!-- App CSS -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/app.css"
              rel="stylesheet">

        <style>
            div th td{
                display:flex;
                justify-content:flex-end;
            }
        </style>

    </head>


    <body class=" layout-fluid" style="background-color: #eaf4fc">

        <div class="preloader">
            <div class="sk-chase">
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
            </div>
        </div>
        <div class="mdk-header-layout js-mdk-header-layout">
            <jsp:include page="mentee/mentee_header.jsp"/>

            <div class="mdk-header-layout__content">

                <div data-push
                     data-responsive-width="992px"
                     class="mdk-drawer-layout js-mdk-drawer-layout">

                    <div class="mdk-drawer-layout__content page ">
                        <div class="container-fluid page__container">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/user/home">Home</a></li>
                                <li class="breadcrumb-item active">Request Mentor</li>
                            </ol>

                            <div class="card-header flex-container " >
                                <div class="media align-items-center">
                                    <div class="media-body">
                                        <h4 class="card-title " style="font-weight: bold ;text-transform: uppercase">Request Form</h4>                                        
                                    </div>  

                                </div>
                                </br>
                                <p><strong>1.Subject's Information</strong></p>


                                <form action="createRequest" method="POST">
                                    Subject: <select name="subject">
                                        <c:forEach items="${requestScope.sNameList}" var="sName">
                                            <option value="${sName}">${sName}</option>
                                        </c:forEach>
                                    </select>
                                    Level: <select name="level">
                                        <c:forEach begin="1" end="12" var="i">
                                            <option value="${i}">
                                            Grade ${i}
                                        </option>
                                        </c:forEach>
                                    </select>

                                    </br>
                                    </br>
                                    CourseType: 
                                    <select name="learnType">
                                        <option value="1">Offline</option>
                                        <option value="2">Online</option>
                                    </select>
                                    </br>
                                    </br>
                                    <p><strong>2.Time and Fees</strong></p>


                                    Budget per lesson: </br>
                                    <input type="number" name="moneyPerSlot" style="border-radius:  5px"> </br></br> 
                                    Length of each lesson: </br> 
                                    <input type="number" id="timePerSlot" name="timePerSlot" style="border-radius:  5px"></br></br>
                                    <div class="row">     
                                        <div class=" col-6">
                                            Start Time: <input  type="date" name="startTime">
                                        </div>
                                        <div class="col-6">
                                            End Time: <input  type="date" name="endTime">
                                        </div>
                                    </div>

                                    </br> 

                                    <table>
                                        <tr>
                                            <td></td>
                                            <td>Monday</td>
                                            <td>Tuesday</td>
                                            <td>Wednesday</td>
                                            <td>Thursday</td>
                                            <td>Friday</td>
                                            <td>Saturday</td>
                                            <td>Sunday</td>
                                        </tr>

                                        <tr>
                                            <td>From</td>
                                            <td><input type="time" name="2" class="time time-start"></td>
                                            <td><input type="time" name="3" class="time time-start"></td>
                                            <td><input type="time" name="4" class="time time-start"></td>
                                            <td><input type="time" name="5" class="time time-start"></td>
                                            <td><input type="time" name="6" class="time time-start"></td>
                                            <td><input type="time" name="7" class="time time-start"></td>
                                            <td><input type="time" name="8" class="time time-start"></td>
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
                                    </br>
                                    <p><strong> 3.Mentee's expectation from Mentor</strong></p>

                                    Detail Description: </br>
                                    <textarea type="text" name="description" rows="4" cols="70"> </textarea></br>   
                                    <input type="text" id="timeJson" name="timeJson" hidden>
                                    <div class="form-group " style="text-align: center;">
                                        <button type="submit " style="border-radius: 5px; width: 10%;"
                                                class="btn btn-primary">
                                            Submit
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!--Nav Tab-->
                    <jsp:include page="mentee/mentee_tab.jsp"/>
                    <!--End of Nav Tab-->
                </div>
            </div>
        </div>

        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/popper.min.js"></script>
        <script src="${pageContext.request.contextPath}/user/assets/vendor/bootstrap.min.js"></script>
        <!-- Perfect Scrollbar -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/perfect-scrollbar.min.js"></script>
        <!-- MDK -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/dom-factory.js"></script>
        <script src="${pageContext.request.contextPath}/user/assets/vendor/material-design-kit.js"></script>
        <!-- App JS -->
        <script src="${pageContext.request.contextPath}/user/assets/js/app.js"></script>
        <!-- Highlight.js -->
        <script src="${pageContext.request.contextPath}/user/assets/js/hljs.js"></script>
        <!-- App Settings (safe to remove) -->
        <script src="${pageContext.request.contextPath}/user/assets/js/app-settings.js"></script>
        <!-- Global Settings -->
        <script src="${pageContext.request.contextPath}/user/assets/js/settings.js"></script>
        <!-- Moment.js -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/moment.min.js"></script>
        <script src="${pageContext.request.contextPath}/user/assets/vendor/moment-range.js"></script>
        <!-- Chart.js -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/Chart.min.js"></script>
        <script src="${pageContext.request.contextPath}/user/assets/js/chartjs.js"></script>
        <!-- Student Dashboard Page JS -->
        <!-- <script src="assets/js/chartjs-rounded-bar.js"></script> -->
        <script src="${pageContext.request.contextPath}/user/assets/js/page.student-dashboard.js"></script>

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
        <script>
            document.querySelectorAll('.time-start').forEach(item => {
                item.addEventListener('input', event => {
                    //handle click
                    var time = document.getElementById("timePerSlot").value.length === 0 ? 0 : document.getElementById("timePerSlot").value;
                    var toTime = document.getElementsByName(item.name)[1];
                    const timeArr = item.value.split(":");
                    var min = parseInt(timeArr[0]) * 60 + parseInt(timeArr[1]) + parseInt(time);
                    if (min > 1440) {
                        alert("Fix time per slot")
                    } else {
                        toTime.value = parseInt(min / 60) + ":" + min % 60;
                    }

//                    console.log(parseInt(timeArr[0])*60 + parseInt(timeArr[1]) + parseInt(time))

//                    alert("blah");
                })
            })

        </script>
    </body>
</html>
