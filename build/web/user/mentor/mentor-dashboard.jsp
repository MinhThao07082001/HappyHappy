<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
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
        <title>Mentor Dashboard</title>

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
        <!-- Header Layout -->
        <div class="mdk-header-layout js-mdk-header-layout">
            <!-- Header -->
            <c:set var="user" value="${sessionScope.user}"/>
            <jsp:include page="mentor_header.jsp"/>
            <!-- Header Layout Content -->
            <div class="mdk-header-layout__content">
                <div data-push data-responsive-width="992px" class="mdk-drawer-layout js-mdk-drawer-layout">
                    <div class="mdk-drawer-layout__content page ">
                        <div class="container-fluid page__container">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/mentor/home">Home</a></li>
                                <li class="breadcrumb-item active">Dashboard</li>
                            </ol>
                                <h1 class="h2" style="width: auto;
                                height: auto;
                                background: #EDCBCB;
                                border-radius: 200px;">&nbsp; &nbsp;Welcome ${sessionScope.user.name}</h1>
                            <h1 class="h2">Dashboard</h1>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="card">
                                        <div class="card-header d-flex align-items-center">
                                            <div class="flex">
                                                <h4 class="card-title">My Revenue</h4>
                                                <p class="card-subtitle"></p>
                                            </div>
                                            <a href="${pageContext.request.contextPath}/listRequest"
                                               class="btn btn-sm btn-primary"><i class="material-icons">trending_up</i></a>
                                        </div>
                                      <div class="card-body">
                                            <div id="legend"
                                                 class="chart-legend mt-0 mb-24pt justify-content-start"></div>
                                           
                                        </div>
                                    </div>
                                    
                                </div>
                                <div class="col-lg-6">
                                    <div class="card">
                                        <div class="card-header d-flex align-items-center">
                                            <div class="flex">
                                                <h4 class="card-title">My Request</h4>
                                                <p class="card-subtitle">by me</p>
                                            </div>
                                            <a class="btn btn-sm btn-primary"
                                               href="${pageContext.request.contextPath}/listRequest">Request</a>
                                        </div>
                                        <ul class="list-group list-group-fit mb-0">
                                            <li class="list-group-item">
                                                <div class="media align-items-center">
                                                    <div class="media-body">
                                                        <a href="${pageContext.request.contextPath}/listRequest"
                                                           class="text-body"><strong>On-going Request</strong></a>
                                                    </div>
                                                    <div class="media-right">
                                                        <div class="text-center">
                                                            <span class="badge badge-pill badge-primary"></span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                    
                                            <li class="list-group-item">
                                                <div class="media align-items-center">
                                                    <div class="media-body">
                                                        <a href="${pageContext.request.contextPath}/user/instructor-course-edit.html"
                                                           class="text-body"><strong>Closed Request</strong></a>
                                                    </div>
                                                    <div class="media-right">
                                                        <div class="text-center">
                                                            <span class="badge badge-pill  badge-danger ">14</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                    
                                </div>
                                         <div id="demo" class="carousel slide" data-ride="carousel" >

                                    <!-- Indicators -->
                                    <ul class="carousel-indicators">
                                        <li data-target="#demo" data-slide-to="0" class="active"></li>
                                        <li data-target="#demo" data-slide-to="1"></li>
                                        <li data-target="#demo" data-slide-to="2"></li>
                                    </ul>

                                    <!-- The slideshow -->
                                    <div class="carousel-inner">
                                        <div class="carousel-item active">
                                            <img src="${pageContext.request.contextPath}/user/assets/images/1.png" alt="Los Angeles">
                                        </div>
                                        <div class="carousel-item">
                                            <img src="${pageContext.request.contextPath}/user/assets/images/2.png" alt="Chicago">
                                        </div>
                                        <div class="carousel-item">
                                            <img src="${pageContext.request.contextPath}/user/assets/images/4.png" alt="New York">
                                        </div>
                                    </div>

                                    <!-- Left and right controls -->
                                    <a class="carousel-control-prev" href="#demo" data-slide="prev">
                                        <span class="carousel-control-prev-icon"></span>
                                    </a>
                                    <a class="carousel-control-next" href="#demo" data-slide="next">
                                        <span class="carousel-control-next-icon"></span>
                                    </a>

                                </div>                  
                            </div>
                        </div>

                    </div>

                    <jsp:include page="mentor_tab.jsp"/>

                </div>

                <!-- App Settings FAB -->
                <!--                <div id="app-settings">
                                    <app-settings layout-active="default"
                                                  :layout-location="{
                      'fixed': 'fixed-instructor-dashboard.html',
                      'default': 'instructor-dashboard.html'
                    }"
                                                  sidebar-variant="bg-transparent border-0"></app-settings>-->
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
    <script src="${pageContext.request.contextPath}/user/assets/js/chartjs-rounded-bar.js"></script>
    <script src="${pageContext.request.contextPath}/user/assets/js/chartjs.js"></script>

    <!-- Instructor Dashboard Page JS -->
    <script src="${pageContext.request.contextPath}/user/assets/js/page.instructor-dashboard.js"></script>

    <!-- List.js -->
    <script src="${pageContext.request.contextPath}/user/assets/vendor/list.min.js"></script>
    <script src="${pageContext.request.contextPath}/user/assets/js/list.js"></script>

</body>


<!-- Mirrored from learnplus.demo.frontendmatter.com/instructor-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->
</html>