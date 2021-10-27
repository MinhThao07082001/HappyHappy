<!DOCTYPE html>
<html lang="en"
      dir="ltr">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>

    <!-- Mirrored from learnplus.demo.frontendmatter.com/instructor-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:08 GMT -->
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
        <!--Comment CSS-->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/Comment.css"
              rel="stylesheet">
    </head>



    <body class=" layout-fluid">

        <div class="preloader">
            <div class="sk-chase">
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
            </div>

            <!-- <div class="sk-bounce">
    <div class="sk-bounce-dot"></div>
    <div class="sk-bounce-dot"></div>
  </div> -->

            <!-- More spinner examples at https://github.com/tobiasahlin/SpinKit/blob/master/examples.html -->
        </div>

        <!-- Header Layout -->
        <div class="mdk-header-layout js-mdk-header-layout">

            <!-- Header -->

            <!--Header-->
            <%@include file="mentee_header.jsp" %>
            <!-- // END Header -->

            <!-- Header Layout Content -->
            <div class="mdk-header-layout__content">

                <div data-push
                     data-responsive-width="992px"
                     class="mdk-drawer-layout js-mdk-drawer-layout">
                    <div class="mdk-drawer-layout__content page pt-0">

                        <div class="bg-primary mdk-box js-mdk-box mb-0"
                             style="height: 192px;"
                             data-effects="parallax-background blend-background">
                            <div class="mdk-box__bg">
                                <div class="mdk-box__bg-front"
                                     style="background-image: url(assets/images/1280_rsz_aman-dhakal-205796-unsplash.jpg); background-position: center;"></div>
                            </div>
                        </div>
                        <div class="container-fluid page__container d-flex align-items-end position-relative mb-4">
                            <div class="avatar avatar-xxl position-absolute bottom-0 left-0 right-0">
                                <img src="${requestScope.mentor.imgAvt}"
                                     alt="avatar"
                                     class="avatar-img rounded-circle border-3">
                            </div>
                            <ul class="nav nav-tabs-links flex"
                                style="margin-left: 265px;">
                                <li class="nav-item">
                                    <a href="student-profile.html"
                                       class="nav-link active">Courses</a>
                                </li>
                                <li class="nav-item">
                                    <a href="student-profile-posts.html"
                                       class="nav-link">Posts</a>
                                </li>
                            </ul>
                        </div>

                        <div class="container-fluid page__container mb-3">
                            <div class="row flex-sm-nowrap">
                                <div class="col-sm-auto mb-3 mb-sm-0"
                                     style="width: 265px;">
                                    <h1 class="h2 mb-1">${requestScope.mentor.name}</h1>
                                    <div class="text-muted d-flex align-items-center mb-2">
                                        <i class="material-icons mr-1">account_box</i>
                                        <div class="flex">${requestScope.mentor.education}</div>
                                    </div>
                                    <div class="text-muted d-flex align-items-center mb-4">
                                        <i class="material-icons mr-1">location_on</i>
                                        <div class="flex">${requestScope.mentor.address}</div>
                                    </div>

                                    <h4>About me</h4>
                                    <p class="text-black-70 measure-paragraph">${requestScope.mentor.intro}</p>
                                </div>
                                <div class="col-sm">
                                    <!-- <div class="flex search-form search-form--light mb-4">
  <button class="btn pr-3" type="button" role="button"><i class="material-icons">search</i></button>
  <input type="text" class="form-control" placeholder="Search" id="searchSample02">
</div> -->

                                    <div class="card">
                                        <div class="card-header">
                                            <div class="d-flex align-items-center">
                                                <a href="student-take-course.html"
                                                   class="mr-3">
                                                    <img src="assets/images/vuejs.png"
                                                         width="100"
                                                         alt=""
                                                         class="rounded">
                                                </a>
                                                <div class="flex">
                                                    <h4 class="card-title mb-0"><a href="student-take-course.html">VueJs</a></h4>
                                                    <span class="badge badge-primary">Advanced</span>
                                                </div>
                                            </div>
                                        </div>
                                        <ul class="list-group list-group-fit">
                                            <li class="list-group-item">
                                                <a href="student-view-course.html"
                                                   class="text-body text-decoration-0 d-flex align-items-center">
                                                    <strong>Basics of Vue.js</strong>
                                                    <i class="material-icons text-muted ml-auto"
                                                       style="font-size: inherit;">check</i>
                                                </a>
                                            </li>
                                            <li class="list-group-item">
                                                <a href="student-view-course.html"
                                                   class="text-body text-decoration-0 d-flex align-items-center">
                                                    <strong>Intermediate Vue.js</strong>
                                                    <i class="material-icons text-muted ml-auto"
                                                       style="font-size: inherit;">check</i>
                                                </a>
                                            </li>
                                            <li class="list-group-item">
                                                <a href="student-view-course.html"
                                                   class="text-body text-decoration-0 d-flex align-items-center">
                                                    <strong>Realtime Apps with Vue.js</strong>
                                                    <i class="material-icons text-muted ml-auto"
                                                       style="font-size: inherit;">check</i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">
                                            <div class="d-flex align-items-center">
                                                <a href="student-take-course.html"
                                                   class="mr-3">
                                                    <img src="assets/images/nodejs.png"
                                                         alt=""
                                                         class="rounded"
                                                         width="100">
                                                </a>
                                                <div class="flex">
                                                    <h4 class="card-title mb-0"><a href="student-take-course.html">NodeJs</a></h4>
                                                    <span class="badge badge-success">Beginner</span>
                                                </div>
                                            </div>
                                        </div>
                                        <ul class="list-group list-group-fit">
                                            <li class="list-group-item">
                                                <a href="student-view-course.html"
                                                   class="text-body text-decoration-0 d-flex align-items-center">
                                                    <strong>Getting started with Node</strong>
                                                    <i class="material-icons text-muted ml-auto"
                                                       style="font-size: inherit;">check</i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">
                                            <div class="d-flex align-items-center">
                                                <a href="student-take-course.html"
                                                   class="mr-3">
                                                    <img src="assets/images/github.png"
                                                         alt=""
                                                         class="rounded"
                                                         width="100">
                                                </a>
                                                <div class="media-body">
                                                    <h4 class="card-title mb-0"><a href="student-take-course.html">GitHub</a></h4>
                                                    <span class="badge badge-warning">Intermediate</span>
                                                </div>
                                            </div>
                                        </div>
                                        <ul class="list-group list-group-fit">
                                            <li class="list-group-item">
                                                <a href="student-view-course.html"
                                                   class="text-body text-decoration-0 d-flex align-items-center">
                                                    <strong>Github Step by Step</strong>
                                                    <i class="material-icons text-muted ml-auto"
                                                       style="font-size: inherit;">check</i>
                                                </a>
                                            </li>
                                            <li class="list-group-item">
                                                <a href="student-view-course.html"
                                                   class="text-body text-decoration-0 d-flex align-items-center">
                                                    <strong>Working as a Team with GitHub</strong>
                                                    <i class="material-icons text-muted ml-auto"
                                                       style="font-size: inherit;">check</i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>

                                    <!--COmment Section-->
                                    <%--<c:if test="${sessionScope.user == '2' }">--%>
                                    <form action="rate" method="POST">
                                        <div class="card">
                                            <div class="row comment">
                                                <div class="col-2"> <img src="https://i.imgur.com/xELPaag.jpg" width="70" class="rounded-circle mt-2"> </div>
                                                <div class="col-10">
                                                    <div class="comment-box ml-2">
                                                        <h3 style="color:red" >${requestScope.errorComment}</h3>
                                                        <c:if test="${requestScope.errorComment eq null}">
                                                            <h4>Add a comment</h4>
                                                            <input type="text" name="mtorid" value="${requestScope.mentor.mentorID}" reaonly "> 
                                                                   <input type="text" name ="mentee" value="${sessionScope.user.menteeID}" reaonly ">
                                                                   <input type="text" name ="id" value="${param.id}" reaonly ">
                                                                   <div class="rating">
                                                                <input type="radio" name="star" value="5" id="5">
                                                                <label for="5">☆</label> 
                                                                <input type="radio" name="star" value="4" id="4">
                                                                <label for="4">☆</label> 
                                                                <input type="radio" name="star" value="3" id="3">
                                                                <label for="3">☆</label> 
                                                                <input type="radio" name="star" value="2" id="2">
                                                                <label for="2">☆</label> 
                                                                <input type="radio" name="star" value="1" id="1">
                                                                <label for="1">☆</label> 
                                                            </div>
                                                            <div class="comment-area"> 
                                                                <textarea class="form-control" name="comment" placeholder="what is your view?" rows="4"></textarea>                                                        

                                                            </div>
                                                            <div class="comment-btns mt-2">
                                                                <div class="row">
                                                                    <div class="col-6">
                                                                        <div class="pull-right"> <button type="submit" class="btn btn-success send btn-sm">Send <i class="fa fa-long-arrow-right ml-1"></i></button> </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </c:if>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                    <%--</c:if>--%>


                                    <!--end of comment section-->
                                </div>
                            </div>

                        </div>

                    </div>

                    <%@include file="mentee_tab.jsp" %>

                </div>

                <!-- App Settings FAB -->

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
    </body>


    <!-- Mirrored from learnplus.demo.frontendmatter.com/instructor-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:09 GMT -->
</html>