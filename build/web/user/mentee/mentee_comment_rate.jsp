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
                    <div class="mdk-drawer-layout__content page ">

                        <div class="container-fluid page__container">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="instructor-dashboard.html">Home</a></li>
                                <li class="breadcrumb-item active">Profile</li>
                            </ol>

                            <div class="text-center">
                                <a href="#"><img src="assets/images/people/110/guy-8.jpg"
                                                 alt=""
                                                 class="rounded-circle"></a>
                                <h1 class="h2 mb-0 mt-1">Adrian Demian</h1>
                                <p class="lead text-muted mb-0">Florida, USA</p>
                                <div class="badge badge-primary ">INSTRUCTOR</div>
                                <hr>
                                <h5 class="text-muted mb-1">Instructor Rating</h5>
                                <div class="rating">
                                    <i class="material-icons text-success">star</i>
                                    <i class="material-icons text-success">star</i>
                                    <i class="material-icons text-success">star</i>
                                    <i class="material-icons text-muted-light">star_border</i>
                                    <i class="material-icons text-muted-light">star_border</i>
                                </div>
                            </div>
                            <hr>
                            <h4>Courses by Adrian</h4>
                            <div class="card-columns">
                                <div class="card">
                                    <div class="card-header">
                                        <div class="media align-items-center">
                                            <div class="media-left">
                                                <a href="instructor-take-course.html">
                                                    <img src="assets/images/vuejs.png"
                                                         alt="Card image cap"
                                                         width="100"
                                                         class="rounded">
                                                </a>
                                            </div>
                                            <div class="media-body">
                                                <h4 class="card-title mb-0"><a href="instructor-take-course.html">Learn VueJs</a></h4>
                                                <div class="rating">
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star_border</i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header">
                                        <div class="media align-items-center">
                                            <div class="media-left">
                                                <a href="instructor-take-course.html">
                                                    <img src="assets/images/nodejs.png"
                                                         alt="Card image cap"
                                                         width="100"
                                                         class="rounded">
                                                </a>
                                            </div>
                                            <div class="media-body">
                                                <h4 class="card-title mb-0"><a href="instructor-take-course.html">Npm &amp; Gulp Advanced Workflow</a></h4>
                                                <div class="rating">
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star_border</i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="card">
                                    <div class="card-header">
                                        <div class="media align-items-center">
                                            <div class="media-left">
                                                <a href="instructor-take-course.html">
                                                    <img src="assets/images/github.png"
                                                         alt="Card image cap"
                                                         width="100"
                                                         class="rounded">
                                                </a>
                                            </div>
                                            <div class="media-body">
                                                <h4 class="card-title mb-0"><a href="instructor-take-course.html">Github Webhooks for Beginners</a></h4>
                                                <div class="rating">
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star_border</i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header">
                                        <div class="media align-items-center">
                                            <div class="media-left">
                                                <a href="instructor-take-course.html">
                                                    <img src="assets/images/gulp.png"
                                                         alt="Card image cap"
                                                         width="100"
                                                         class="rounded">
                                                </a>
                                            </div>
                                            <div class="media-body">
                                                <h4 class="card-title mb-0"><a href="instructor-take-course.html">Gulp &amp; Slush Workflows</a></h4>
                                                <div class="rating">
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star</i>
                                                    <i class="material-icons">star_border</i>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="row">
                                        <div class="col-2"> <img src="https://i.imgur.com/xELPaag.jpg" width="70" class="rounded-circle mt-2"> </div>
                                        <div class="col-10">
                                            <div class="comment-box ml-2">
                                                <h4>Add a comment</h4>
                                                <div class="rating">
                                                    <input type="radio" name="rating" value="5" id="5">
                                                    <label for="5">☆</label> 
                                                    <input type="radio" name="rating" value="4" id="4">
                                                    <label for="4">☆</label> 
                                                    <input type="radio" name="rating" value="3" id="3">
                                                    <label for="3">☆</label> 
                                                    <input type="radio" name="rating" value="2" id="2">
                                                    <label for="2">☆</label> 
                                                    <input type="radio" name="rating" value="1" id="1">
                                                    <label for="1">☆</label> 
                                                </div>
                                                <div class="comment-area"> <textarea class="form-control" placeholder="what is your view?" rows="4"></textarea> </div>
                                                <div class="comment-btns mt-2">
                                                    <div class="row">
                                                        <div class="col-6">
                                                            <div class="pull-left"> <button class="btn btn-success btn-sm">Cancel</button> </div>
                                                        </div>
                                                        <div class="col-6">
                                                            <div class="pull-right"> <button class="btn btn-success send btn-sm">Send <i class="fa fa-long-arrow-right ml-1"></i></button> </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
<%@include file="mentee_tab.jsp" %> 
                        </div>

                        <!--Nav Tab-->
                        <!-- // END Components Menu -->

                        
                    </div>

                </div>
            </div>

            <!-- App Settings FAB -->
            <div id="app-settings">
                <app-settings layout-active="default"
                              :layout-location="{
                              'fixed': 'fixed-instructor-profile.html',
                              'default': 'instructor-profile.html'
                              }"
                              sidebar-variant="bg-transparent border-0"></app-settings>
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
</body>


<!-- Mirrored from learnplus.demo.frontendmatter.com/instructor-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:09 GMT -->
</html>