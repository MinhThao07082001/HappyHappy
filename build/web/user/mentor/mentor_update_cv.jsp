<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en"
      dir="ltr">
    <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-account-edit.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Student - Edit account - Fixed layout</title>
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
        <jsp:include page="mentor_header.jsp"/>
        <!-- // END Header -->
        <!-- Header Layout Content -->
        <div class="mdk-header-layout__content">
            <div data-push
                 data-responsive-width="992px"
                 class="mdk-drawer-layout js-mdk-drawer-layout">
                <div class="mdk-drawer-layout__content page ">
                    <div class="container-fluid page__container">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/user/student-dashboard.html">Home</a></li>
                            <li class="breadcrumb-item active">Update CV</li>
                        </ol>
                        <h1 class="h2">Update CV</h1>
                        <div class="card">
                            <ul class="nav nav-tabs nav-tabs-card">
                                <li class="nav-item">
                                    <a class="nav-link active"
                                       href="#first"
                                       data-toggle="tab">CV</a>
                                </li>
                            </ul>
                            <input type="hidden" name ="mentor" value="${sessionScope.user}" reaonly style="display:none">
                            <div class="tab-content card-body">
                                <div class="tab-pane active"
                                     id="first">
                                    <form action="updatecv" method="post"  enctype='multipart/form-data'
                                          class="form-horizontal">
                                        <div class="form-group row">
                                            <div class="col-sm-9">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="education"
                                                   class="col-sm-3 col-form-label form-label">Education</label>
                                            <div class="col-sm-8">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <input id="education"
                                                               type="text"
                                                               class="form-control"
                                                               value="${mentor.education}"
                                                               name="education">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="yearExperiment"
                                                   class="col-sm-3 col-form-label form-label">Year Experiment</label>
                                            <div class="col-sm-8">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <input id="yearExperiment"
                                                               type="text"
                                                               pattern="\d{1,2}"
                                                               class="form-control"
                                                               value="${mentor.yearExperiment}"
                                                               name="yearExperiment">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="intro"
                                                   class="col-sm-3 col-form-label form-label">Intro</label>
                                            <div class="col-sm-8">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <input id="intro"
                                                               type="text"
                                                               class="form-control"
                                                               value="${mentor.intro}"
                                                               name="intro">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-sm-8 offset-sm-3">
                                                <div class="media align-items-center">
                                                    <div class="media-left">
                                                        <input type="submit" value="Save changes">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--Nav Tab-->
                <jsp:include page="mentor_tab.jsp"/>
                <!--End Of Nab Tab-->
            </div>
            <!-- App Settings FAB -->
            <!--         <div id="app-settings">
                        <app-settings layout-active="default"
                           :layout-location="{
                           'fixed': 'fixed-student-account-edit.html',
                           'default': 'student-account-edit.html'
                           }"
                           sidebar-variant="bg-transparent border-0"></app-settings>
                     </div>-->
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
</body>
<!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-account-edit.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->
</html>