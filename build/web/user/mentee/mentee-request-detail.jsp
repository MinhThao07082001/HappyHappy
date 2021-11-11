
<%-- 
    Document   : mentee_request
    Created on : Oct 3, 2021, 11:43:47 PM
    Author     : WacMac
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en"
      dir="ltr">


    <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:12:12 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Student - Dashboard</title>

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

            .btn-grad {background-image: linear-gradient(to right, #314755 0%, #26a0da  51%, #314755  100%)}
            .btn-grad {
                margin: 10px;
                padding: 10px 20px;
                text-align: center;
                transition: 0.5s;
                background-size: 200% auto;
                color: white;            
                box-shadow: 0 0 20px #eee;
                border-radius: 10px;
                display: block;
            }

            .btn-grad:hover {
                background-position: right center; /* change the direction of the change here */
                color: #77eed8;
                text-decoration: none;
            }

            .dropdown {
                margin-bottom: 20px;
            }
            td{
                margin-bottom: 20px;
                text-align: center;
            }
            .justify-content-center{
                border-bottom: 5px solid #9eabe4;
            }


            body {
                background: #efefef;
                color: #333;


            }
            body h1 {
                text-align: center;
                color: #428bff;
                font-weight: 300;
                padding: 40px 0 20px 0;
                margin: 0;
            }


            .tabs {
                left: 50%;
                transform: translateX(-50%);
                position: relative;
                background: white;
                width: 100%;

                box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);
                border-radius: 10px;
                min-width: 240px;
            }

            .tabs input[name="tab-control"] {
                display: none;
            }
            .tabs .content section h2, .tabs ul li label {
                font-family: "Montserrat";
                font-weight: bold;
                font-size: 18px;
                color: #428bff;
            }
            .tabs ul {
                list-style-type: none;
                padding-left: 0;
                display: flex;
                flex-direction: row;
                margin-bottom: 10px;
                justify-content: space-between;
                align-items: flex-end;
                flex-wrap: wrap;
            }
            .tabs ul li {
                box-sizing: border-box;
                flex: 1;
                width: 25%;
                padding: 0 10px;
                text-align: center;
            }
            .tabs ul li label {
                transition: all 0.3s ease-in-out;
                color: #f01d0d;
                padding: 1px auto;
                overflow: hidden;
                text-overflow: ellipsis;
                display: block;
                cursor: pointer;
                transition: all 0.2s ease-in-out;
                white-space: nowrap;
                -webkit-touch-callout: none;
            }
            .tabs ul li label br {
                display: none;
            }
            .tabs ul li label svg {
                fill: #f01d0d;
                height: 1.2em;
                vertical-align: bottom;
                margin-right: 0.1em;
                transition: all 0.2s ease-in-out;
            }
            .tabs ul li label:hover, .tabs ul li label:focus, .tabs ul li label:active {
                outline: 0;

                color: red;
            }
            .tabs ul li label:hover svg, .tabs ul li label:focus svg, .tabs ul li label:active svg {

                fill: #4586c2;
            }
            .tabs .slider {
                position: relative;
                width: 25%;
                transition: all 0.33s cubic-bezier(0.38, 0.8, 0.32, 1.07);
            }
            .tabs .slider .indicator {
                position: relative;
                width: 50px;
                max-width: 100%;
                margin: 0 auto;
                height: 4px;
                background: #428bff;
                border-radius: 1px;
            }
            .tabs .content {
                margin-top: 30px;
            }
            .tabs .content section {
                display: none;
                animation-name: content;
                animation-direction: normal;
                animation-duration: 0.3s;
                animation-timing-function: ease-in-out;
                animation-iteration-count: 1;
                line-height: 1.4;
            }
            .tabs .content section h2 {
                color: #428bff;
                display: none;
            }
            .tabs .content section h2::after {
                content: "";
                position: relative;
                display: block;
                width: 30px;
                height: 3px;
                background: #428bff;
                margin-top: 5px;
                left: 1px;
            }
            .tabs input[name="tab-control"]:nth-of-type(1):checked ~ ul > li:nth-child(1) > label {
                cursor: default;
                color: #428bff;
            }
            .tabs input[name="tab-control"]:nth-of-type(1):checked ~ ul > li:nth-child(1) > label svg {
                fill: #428bff;
            }
            @media (max-width: 600px) {
                .tabs input[name="tab-control"]:nth-of-type(1):checked ~ ul > li:nth-child(1) > label {
                    background: rgba(0, 0, 0, 0.08);
                }
            }
            .tabs input[name="tab-control"]:nth-of-type(1):checked ~ .slider {
                transform: translateX(55%);
            }
            .tabs input[name="tab-control"]:nth-of-type(1):checked ~ .content > section:nth-child(1) {
                display: block;
            }
            .tabs input[name="tab-control"]:nth-of-type(2):checked ~ ul > li:nth-child(2) > label {
                cursor: default;
                color: #428bff;
            }
            .tabs input[name="tab-control"]:nth-of-type(2):checked ~ ul > li:nth-child(2) > label svg {
                fill: #428bff;
            }
            @media (max-width: 600px) {
                .tabs input[name="tab-control"]:nth-of-type(2):checked ~ ul > li:nth-child(2) > label {
                    background: rgba(0, 0, 0, 0.08);
                }
            }
            .tabs input[name="tab-control"]:nth-of-type(2):checked ~ .slider {
                transform: translateX(255%);
            }
            .tabs input[name="tab-control"]:nth-of-type(2):checked ~ .content > section:nth-child(2) {
                display: block;
            }


            @keyframes content {
                from {
                    opacity: 0;
                    transform: translateY(5%);
                }
                to {
                    opacity: 1;
                    transform: translateY(0%);
                }
            }
            @media (max-width: 1000px) {
                .tabs ul li label {
                    white-space: initial;
                }
                .tabs ul li label br {
                    display: initial;
                }
                .tabs ul li label svg {
                    height: 1.5em;
                }
            }
            @media (max-width: 600px) {
                .tabs ul li label {
                    padding: 5px;
                    border-radius: 5px;
                }
                .tabs ul li label span {
                    display: none;
                }
                .tabs .slider {
                    display: none;
                }
                .tabs .content {
                    margin-top: 20px;
                }
                .tabs .content section h2 {
                    display: block;
                }
            }
            /* style nav bar request*/
            table, th, td{
                border: 1px black solid;
            }
        </style>
    </head>

    <body class="layout-fluid" style="background-color: #eaf4fc">

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
        <!--Header-->
        <div class="mdk-header-layout js-mdk-header-layout">

            <!-- Header -->
            <c:set var="user" value="${sessionScope.user}"/>
            <c:if test="${requestScope.role eq 1}">
                <jsp:include page="mentor/mentor_header.jsp"></jsp:include>
            </c:if>
            <c:if test="${requestScope.role eq 2}">
                <jsp:include page="mentee/mentee_header.jsp"></jsp:include>
            </c:if>

            <!--End Of Header -->


            <div class="mdk-header-layout__content" style="margin-right:100px">



                <c:set var="req" value="${requestScope.req}"/>

                <h3>Subject: ${req.subject.subjectName}</h3>
                <p>Level: ${req.subject.level}</p>
                <p>Money: ${req.moneyPerSlot} per slot</p>
                <table>
                    <tr>
                        <c:forEach var="reqSlotTime" items="${req.listSlotTime}">
                            <td>${reqSlotTime.day}</td>
                        </c:forEach>
                    </tr>

                    <tr>
                        <c:forEach var="reqSlotTime" items="${req.listSlotTime}">
                            <td>${fn:substring(reqSlotTime.slotFrom, 0,5)}</td>
                        </c:forEach>

                    </tr>
                    <tr>
                        <c:forEach var="reqSlotTime" items="${req.listSlotTime}">
                            <td>${fn:substring(reqSlotTime.slotTo, 0,5)}</td>
                        </c:forEach>

                    </tr>


                </table>
                <p>StartTime: ${fn:substring(req.startTime, 0,10)}</p>
                <p>EndTime: ${fn:substring(req.endTime, 0,10)} </p>
                <p>description: ${req.description} </p>
                <c:if test="${req.status ne 1}">
                    <form action="listRequest" method="POST">
                        <input type="text" hidden value="${req.requestID}" name="id"/>
                        <input type="submit" value="Accept"/>
                    </form>
                </c:if>
                <c:forEach var="reqMentor" items="${requestScope.reqMentor}">
                    <form method="POST" action="listRequest">
                        <input type="submit" value="Accept ID: ${reqMentor.requestID}"/>
                        <input name="menteeReq" value="${req.requestID}" hidden/>
                        <input name="mentorReqAccept" value="${reqMentor.requestID}" hidden/>
                    </form>

                </c:forEach>






            </div>
            <c:if test="${requestScope.role eq 1}">
                <jsp:include page="mentor/mentor_tab.jsp"></jsp:include>
            </c:if>
            <c:if test="${requestScope.role eq 2}">
                <jsp:include page="mentee/mentee_tab.jsp"></jsp:include>
            </c:if>
            <!--End Of Nav Tab-->

        </div>



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

    </body>
</html>