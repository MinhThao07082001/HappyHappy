<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <title>Mentor Request Detai</title>
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
                                <li class="breadcrumb-item active">Request Detail</li>
                            </ol>

                            <div class="row">
                                <c:forEach var="mtor" items="${requestScope.mtorList}">
                                    <div class="col-md-6">
                                        <div class="card">
                                            <div class="card-body">
                                                <div class="d-flex flex-column flex-sm-row">
                                                    <a href="?id=${mtor.mentorID}"
                                                       class="avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3">
                                                        <img src="${mtor.imgAvt}" alt="Card image cap"
                                                             class="avatar-img rounded">
                                                    </a>
                                                    <a href="../conversation?id=${mtor.mentorID}">
                                                        <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#000000"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M15 4v7H5.17L4 12.17V4h11m1-2H3c-.55 0-1 .45-1 1v14l4-4h10c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm5 4h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7c0-.55-.45-1-1-1z"/></svg>
                                                    </a>
                                                    <div class="flex" style="min-width: 200px;">

                                                        <h4 class="card-title mb-1">
                                                        </h4>
                                                        <p class="text-black-70">${mtor.description}
                                                        </p>
                                                        <div class="d-flex align-items-end">
                                                            <div class="d-flex flex flex-column mr-3">
                                                                <div class="d-flex align-items-center py-1 border-bottom">

                                                                </div>
                                                                <div class="d-flex align-items-center py-1">
                                                                    <small class="text-muted mr-2">${mtor.yearExperiment} years experience</small>
                                                                    <br/>
                                                                    <small class="text-muted">${mtor.education}</small>
                                                                </div>
                                                            </div>
                                                            <div class="text-center">
                                                                <a href="${pageContext.request.contextPath}/user/instructor-course-edit.html"
                                                                   class="btn btn-sm btn-white">Edit</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="card__options dropdown right-0 pr-2">
                                                <a href="#" class="dropdown-toggle text-muted" data-caret="false"
                                                   data-toggle="dropdown">
                                                    <i class="material-icons">more_vert</i>
                                                </a>
                                                <div class="dropdown-menu dropdown-menu-right">
                                                    <a class="dropdown-item" href="${pageContext.request.contextPath}/user/instructor-course-edit.html">Edit course</a>
                                                    <a class="dropdown-item" href="#">Course Insights</a>
                                                    <div class="dropdown-divider"></div>
                                                    <a class="dropdown-item text-danger" href="#">Delete course</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>

                            </div>

                            <div class="row">
                                <div class="col-lg-7">
                                    <div class="card">
                                        <div class="card-header">
                                            <div class="media align-items-center">
                                                <div class="media-body">
                                                    <h4 class="card-title">E-Contact (Hợp đồng dạy học)</h4>
                                                    <p class="card-subtitle">Your recent courses</p>
                                                </div>

                                            </div>
                                        </div>
                                        <div class="mdk-drawer-layout__content page ">

                                            <div class="container-fluid page__container p-0">
                                                <div class="row m-0">
                                                    <div class="col-lg container-fluid page__container">


                                                        <div class="list-group list-group-fit">
                                                            <div class="list-group-item ">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Gia sư</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">nope</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Học viên</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">nope</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <hr>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">môn học yêu cầu</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">Toán</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Trình độ</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">Lớp 3</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Chi phí</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">Lớp 3</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Độ dài khóa</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">Lớp 3</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Thời lượng 1 buổi</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <div class="flex">Lớp 3</div>
                                                                        <a href="student-account-billing-upgrade.html"
                                                                           class="text-secondary">Change plan</a>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Billing cycle</label>
                                                                    <div class="col-sm-9">
                                                                        <p class="mb-1">You will be charged $9 on Aug 20, 2018</p>
                                                                        <div class="custom-control custom-checkbox">
                                                                            <input type="checkbox"
                                                                                   class="custom-control-input"
                                                                                   checked
                                                                                   id="customCheck1">
                                                                            <label class="custom-control-label"
                                                                                   for="customCheck1">
                                                                                <strong>Enable automatic renewal</strong>
                                                                            </label>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3">Payment information</label>
                                                                    <div class="col-sm-9 d-flex align-items-center">
                                                                        <img src="assets/images/visa.svg"
                                                                             alt="visa"
                                                                             width="40"
                                                                             class="mr-16pt">
                                                                        <div class="flex">Visa ending with 2819</div>
                                                                        <a href="student-account-billing-payment-information.html"
                                                                           class="text-secondary">Change method</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="list-group-item">
                                                                <div class="form-group row mb-0">
                                                                    <label class="col-form-label form-label col-sm-3"></label>
                                                                    <div class="col-sm-9">

                                                                        <button class="btn btn-outline-secondary">accept</button>

                                                                        <button class="btn btn-outline-secondary">cancel</button>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>

                                                </div>
                                            </div>

                                        </div>  
                                    </div>
                                </div>
                                <div class="col-lg-5">
                                    <div class="card card-2by1">
                                        <div class="card-header">
                                            <h4 class="card-title">Nội dung yêu cầu tìm gia sư</h4>
                                            <p class="card-subtitle">Your Best Choice</p>
                                        </div>
                                      

                                            <div class="container-fluid page__container p-0">
                                                <div class="row m-0">
                                                    <div class="col-lg container-fluid page__container">

                                                        <div class="card">
                                                            <div class="list-group list-group-fit">
                                                                <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Ngày đăng</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">21/02/2015</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                 <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Tiêu đề Yêu cầu</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">21/02/2015</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                               <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">môn học Yêu cầu</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">Toán</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                 <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Trình độ:</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">lớp 3</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                 <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Ngân sách</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">100.000</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                 <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Thời lượng 1 buổi học</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">2</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                 <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Ngày kết thúc</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <div class="flex">21/02/2015</div>
                                                                            <a href="student-account-billing-upgrade.html"
                                                                               class="text-secondary">Change plan</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Billing cycle</label>
                                                                        <div class="col-sm-9">
                                                                            <p class="mb-1">You will be charged $9 on Aug 20, 2018</p>
                                                                            <div class="custom-control custom-checkbox">
                                                                                <input type="checkbox"
                                                                                       class="custom-control-input"
                                                                                       checked
                                                                                       id="customCheck1">
                                                                                <label class="custom-control-label"
                                                                                       for="customCheck1">
                                                                                    <strong>Enable automatic renewal</strong>
                                                                                </label>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Payment information</label>
                                                                        <div class="col-sm-9 d-flex align-items-center">
                                                                            <img src="assets/images/visa.svg"
                                                                                 alt="visa"
                                                                                 width="40"
                                                                                 class="mr-16pt">
                                                                            <div class="flex">Visa ending with 2819</div>
                                                                            <a href="student-account-billing-payment-information.html"
                                                                               class="text-secondary">Change method</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
<!--                                                                <div class="list-group-item">
                                                                    <div class="form-group row mb-0">
                                                                        <label class="col-form-label form-label col-sm-3">Cancel</label>
                                                                        <div class="col-sm-9">
                                                                            <a href="#"
                                                                               class="btn btn-outline-secondary">Cancel subscription</a>
                                                                        </div>
                                                                    </div>
                                                                </div>-->
                                                            </div>
                                                        </div>
                                                    </div>
                                                   
                                                </div>
                                            </div>

                                    </div>
                                </div>
                                <div style="width: 80%;margin: 0 auto;" id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                    <!-- Indicators -->
                                    <ol class="carousel-indicators">
                                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                                    </ol>


                                </div><!--Kết thúc slider-->
                            </div>
                        </div>
                    </div>
                    <jsp:include page="mentor_tab.jsp"/>
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
                <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:01 GMT -->
                </html>