
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/admin/assets/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/admin/assets/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/admin/assets/plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/admin/assets/plugins/fontawesome-free/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.css">
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










            /* style nav bar  request */

            /* colors */
            /* tab setting */
            /* breakpoints */
            /* selectors relative to radio inputs */
            body {
                background: #efefef;
                color: #333;

            }
            body h1 {
                text-align: center;
                color: #428bff;
                font-weight: 100;
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





            tr{
                border: 1px solid #003300;
            }
            th{
                border: 1px solid #003300;
            }
            td{
                border: 1px solid #003300;
            }

            table {
                table-layout: fixed;
            }

            table td {
                text-overflow: ellipsis;
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



            <!--End Of Header -->

            <c:if test="${sessionScope.userCommon.role eq 1}">
                <jsp:include page="mentor/mentor_header.jsp"></jsp:include>
            </c:if>
            <c:if test="${sessionScope.userCommon.role eq 2}">
                <jsp:include page="mentee/mentee_header.jsp"></jsp:include>
            </c:if>
            <div class="mdk-header-layout__content">

                <div data-push data-responsive-width="992px" class="mdk-drawer-layout js-mdk-drawer-layout">
                    <!--Page content -->         
                    <div class="mdk-drawer-layout__content page ">
                        <div class="container-fluid page__container">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/mentee/home">Home</a></li>
                                <li class="breadcrumb-item active">Request Mentor</li>
                            </ol>

                            <div class="card-header flex-container " 
                                 style=" background: #9eabe4; border-radius: 20px; background-image: linear-gradient(315deg, #9eabe4 0%, #77eed8 74%);">
                                <div class="media align-items-center">
                                    <div class="media-body">
                                        <h4 class="card-title">List of Request</h4>                                        
                                    </div>
                                    <div class="media-right mt-2 mt-xs-plus-0">
                                        <a class="btn-grad" href="${pageContext.request.contextPath}/createRequest">Create a request</a>
                                    </div>
                                </div>
                                <div class="tabs">

                                    <input type="radio" id="tab1" name="tab-control" checked>
                                    <input type="radio" id="tab2" name="tab-control" >

                                    <ul>
                                        <li ><label for="tab1" role="button">
                                                <svg viewBox="0 0 24 24"></svg>
                                                <br>           
                                                <span>On-going Request</span>
                                            </label>
                                        </li>

                                        <li >
                                            <label for="tab2" role="button">
                                                <svg viewBox="0 0 24 24"></svg>
                                                <br>
                                                <span>Closed Request</span>
                                            </label>
                                        </li>    
                                    </ul>

                                    <div class="slider">
                                        <div class="indicator">                                           
                                        </div>                                            
                                    </div>
                                    <div class="content">                                   
                                        <section>
                                            <div class="row justify-content-center tab-content round" style="margin: 0 0 0 0">
                                                <table class=" col-lg-12 table-hover" id="example2">
                                                    <thead>
                                                        <tr>
                                                            <th>reqTime</th>
                                                            <th>subjectName</th>
                                                            <th>startTime</th>
                                                            <th>endTime</th>
                                                            <th>description</th>                                                
                                                            <th>learnType</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>

                                                    <c:forEach var="rOList" items="${requestScope.rOList}">
                                                        <tr>
                                                            <td>${rOList.reqTime}</td>
                                                            <td>${rOList.subject.subjectName} - ${rOList.subject.level}</td>
                                                            <td>${rOList.startTime}</td>
                                                            <td>${rOList.endTime}</td>
                                                            <td>${rOList.description}</td>                                                            
                                                            <td>${rOList.learnType}</td>
                                                            <td><a href="editRequest?id=${rOList.requestID}">EDIT</a></td>
                                                        </tr>
                                                    </c:forEach>

                                                </table>

                                            </div>
                                        </section>  
                                        <section>
                                            <div class="row d-flex justify-content-center tab-content round " style="margin: 0 0 0 0">
                                                <table class="col-md-12 table-hover " id="example3">
                                                    <thead>
                                                        <tr>
                                                            <!--<th>requestID</th>-->
                                                            <!--<th>userID</th>-->
                                                            <th>reqTime</th>
                                                            <th>subjectName</th>
                                                            <th>moneyPerSlot</th>
                                                            <th>timePerSlot</th>
                                                            <!--<th>startTime</th>-->
                                                            <!--<th>endTime</th>-->
                                                            <th>description</th>
                                                            <!--<th>status</th>-->
                                                            <th>learnType</th>
                                                        </tr>
                                                    </thead>
                                                    <c:forEach var="rAList" items="${requestScope.rAList}">
                                                        <tr>
                                                            <!--<th>${rAList.requestID}</th>-->
                                                            <!--<th>${rAList.userID}</th>-->
                                                            <th>${rAList.reqTime}</th>
                                                            <th>${rAList.subject.subjectName} - ${rAList.subject.level}</th>
                                                            <th>${rAList.moneyPerSlot}</th> 
                                                            <th>${rAList.timePerSlot}</th>
                                                            <!--<th>${rAList.startTime}</th>-->
                                                            <!--<th>${rAList.endTime}</th>-->
                                                            <th>${rAList.description}</th>
<!--                                                            <th>${rAList.status}</th>-->
                                                            <th>${rAList.learnType}</th>
                                                        </tr>
                                                    </c:forEach>
                                                </table>

                                            </div>
                                        </section>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- End Page content-->




                    <!--Nav Tab-->
                    <c:if test="${sessionScope.userCommon.role eq 1}">
                        <jsp:include page="mentor/mentor_tab.jsp"></jsp:include>
                    </c:if>
                    <c:if test="${sessionScope.userCommon.role eq 2}">
                        <jsp:include page="mentee/mentee_tab.jsp"></jsp:include>
                    </c:if>

                    <!--End Of Nav Tab-->
                </div>
            </div>
        </div>
        <!--     
        
        
        
        <table>
            <tr>
                <th>requestID</th>
                        <th>userID</th>
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
        <c:forEach var="rOList" items="${requestScope.rOList}">
                <tr>
                <th>${rOList.requestID}</th>
                <th>${rOList.userID}</th>
                <th>${rOList.subject.subjectName} - ${rOList.subject.level}</th>
                <th>${rOList.moneyPerSlot}</th> 
                <th>${rOList.timePerSlot}</th>
                <th>${rOList.startTime}</th>
                <th>${rOList.endTime}</th>
                <th>${rOList.description}</th>
                <th>${rOList.status}</th>
                <th>${rOList.learnType}</th>
                <th>${rOList.reqTime}</th>
                <th><a href="editRequest?id=${rOList.requestID}">EDIT</a></th>
            </tr>
                    </c:forEach>
    </table>-->

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
                    
                    
        <!-- DataTables  & Plugins -->
                    

        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/jszip/jszip.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/pdfmake/pdfmake.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/pdfmake/vfs_fonts.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-buttons/js/buttons.html5.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-buttons/js/buttons.print.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script>
            $(function () {
                $('#example2').DataTable({
                    "paging": true,
                    "lengthChange": false,
                    "searching": false,
                    "ordering": true,
                    "info": true,
                    "autoWidth": true,
                    "responsive": true,
                });
            });
        </script>
        <script>
            $(function () {
                $('#example3').DataTable({
                    "paging": true,
                    "lengthChange": false,
                    "searching": false,
                    "ordering": true,
                    "info": true,
                    "autoWidth": false,
                    "responsive": true,
                });
            });
        </script>
    </body>
</html>
