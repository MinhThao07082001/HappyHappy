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
                .pagination a.active {
                background-color: #006cfa;
                color: white;
              }
            .pagination a:hover:not(.active) {
                background-color: lightskyblue;
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
        <!-- Header Layout -->
        <div class="mdk-header-layout js-mdk-header-layout">
            <!-- Header -->
            <c:set var="user" value="${sessionScope.user}"/>
            <jsp:include page="mentee_header.jsp"/>
            <!-- Header Layout Content -->
            <div class="mdk-header-layout__content">
                <div data-push data-responsive-width="992px" class="mdk-drawer-layout js-mdk-drawer-layout">
                    <div class="mdk-drawer-layout__content page ">
                        <div class="container-fluid page__container">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/mentee/home">Home</a></li>
                                <li class="breadcrumb-item active">Dashboard</li>
                            </ol>
                            <h1 class="h2" style="width: auto;
                                height: auto;
                                background: #EDCBCB;
                                border-radius: 200px;">&nbsp; &nbsp;Welcome ${sessionScope.user.name}</h1>
                            <!-- <div class="card border-left-3 border-left-primary card-2by1">
                               <div class="card-body">
                                   <div class="media flex-wrap align-items-center">
                                       <div class="media-left">
                                           <i class="material-icons text-muted-light">credit_card</i>
                                       </div>
                                       <div class="media-body" style="min-width: 180px">
                                           Your subscription ends on <strong>25 February 2015</strong>
                                       </div>
                                       <div class="media-right mt-2 mt-xs-plus-0">
                                           <a class="btn btn-success"
                                               href="student-account-billing-upgrade.html">Upgrade</a>
                                       </div>
                                   </div>
                               </div>
                               </div>--> 
                            <!-- Mentor Recommend tab -->
                            <div class="card-header">
                                <div class="media align-items-center">
                                    <div class="media-body">
                                        <h4 class="card-title">Mentor Suggestions</h4>
                                        <p class="card-subtitle">Choose the list of mentors recommend by US!</p>
                                    </div>
                                </div>
                            </div>
                            <!--End of recom tab -->
                            <!--List of mentors -->
                            <div class="row">
                                <c:forEach var="mtor" items="${requestScope.data}">
                                    <div class="col-md-6">
                                        <div class="card">
                                            <div class="card-body">
                                                <div class="d-flex flex-column flex-sm-row">
                                                    <a href="../rate?id=${mtor.mentorID}"
                                                       class="avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3">
                                                        <img src="${mtor.imgAvt}" alt="Card image cap"
                                                             class="avatar-img rounded">
                                                    </a>
                                                    <a href="../conversation?id=${mtor.mentorID}">
                                                        <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#000000"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M15 4v7H5.17L4 12.17V4h11m1-2H3c-.55 0-1 .45-1 1v14l4-4h10c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm5 4h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7c0-.55-.45-1-1-1z"/></svg>
                                                    </a>
                                                    <div class="flex" style="min-width: 200px;">
                                                        <!-- <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Learn Vue.js</strong></a></h5> -->
                                                        <h4 class="card-title mb-1"><a href="${pageContext.request.contextPath}/user/instructor-course-edit.html">${mtor.name}
                                                                <c:if test="${mtor.authen eq 1}">
                                                                    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#0000FF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z"/></svg>
                                                                </c:if>
                                                            </a>
                                                        </h4>
                                                        <p class="text-black-70">${mtor.description}
                                                        </p>
                                                        <div class="d-flex align-items-end">
                                                            <div class="d-flex flex flex-column mr-3">
                                                                <div class="d-flex align-items-center py-1 border-bottom">
                                                                    <c:forEach var="sList" items="${mtor.listMajor}">
                                                                        <small class="text-black-70 mr-2">${sList.subjectName}</small>
                                                                    </c:forEach>
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
                                <!--                  
                                                  <div class="col-md-6">
                                                     <div class="card">
                                                        <div class="card-body">
                                                           <div class="d-flex flex-column flex-sm-row">
                                                              <a href="instructor-course-edit.html"
                                                                 class="avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3">
                                                              <img src="assets/images/nodejs.png" alt="Card image cap"
                                                                 class="avatar-img rounded">
                                                              </a>
                                                              <div class="flex" style="min-width: 200px;">
                                                                  <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Npm &amp; Gulp Advanced Workflow</strong></a></h5> 
                                                                 <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Npm
                                                                    &amp; Gulp Advanced Workflow</a>
                                                                 </h4>
                                                                 <p class="text-black-70">Learn the basics of Github and become a power
                                                                    Github developer.
                                                                 </p>
                                                                 <div class="d-flex align-items-end">
                                                                    <div class="d-flex flex flex-column mr-3">
                                                                       <div class="d-flex align-items-center py-1 border-bottom">
                                                                          <small class="text-black-70 mr-2">&dollar;421/mo</small>
                                                                          <small class="text-black-50">12 SALES</small>
                                                                       </div>
                                                                       <div class="d-flex align-items-center py-1">
                                                                          <small class="text-muted mr-2">GULP</small>
                                                                          <small class="text-muted">INTERMEDIATE</small>
                                                                       </div>
                                                                    </div>
                                                                    <div class="text-center">
                                                                       <a href="instructor-course-edit.html"
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
                                                              <a class="dropdown-item" href="instructor-course-edit.html">Edit course</a>
                                                              <a class="dropdown-item" href="#">Course Insights</a>
                                                              <div class="dropdown-divider"></div>
                                                              <a class="dropdown-item text-danger" href="#">Delete course</a>
                                                           </div>
                                                        </div>
                                                     </div>
                                                  </div>
                                                  <div class="col-md-6">
                                                     <div class="card">
                                                        <div class="card-body">
                                                           <div class="d-flex flex-column flex-sm-row">
                                                              <a href="instructor-course-edit.html"
                                                                 class="avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3">
                                                              <img src="assets/images/github.png" alt="Card image cap"
                                                                 class="avatar-img rounded">
                                                              </a>
                                                              <div class="flex" style="min-width: 200px;">
                                                                  <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Github Webhooks for Beginners</strong></a></h5> 
                                                                 <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Github
                                                                    Webhooks for Beginners</a>
                                                                 </h4>
                                                                 <p class="text-black-70">Developing static website with fast and
                                                                    advanced gulp setup.
                                                                 </p>
                                                                 <div class="d-flex align-items-end">
                                                                    <div class="d-flex flex flex-column mr-3">
                                                                       <div class="d-flex align-items-center py-1 border-bottom">
                                                                          <small class="text-black-70 mr-2">&dollar;2,191/mo</small>
                                                                          <small class="text-black-50">50 SALES</small>
                                                                       </div>
                                                                       <div class="d-flex align-items-center py-1">
                                                                          <small class="text-muted mr-2">GULP</small>
                                                                          <small class="text-muted">INTERMEDIATE</small>
                                                                       </div>
                                                                    </div>
                                                                    <div class="text-center">
                                                                       <a href="instructor-course-edit.html"
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
                                                              <a class="dropdown-item" href="instructor-course-edit.html">Edit course</a>
                                                              <a class="dropdown-item" href="#">Course Insights</a>
                                                              <div class="dropdown-divider"></div>
                                                              <a class="dropdown-item text-danger" href="#">Delete course</a>
                                                           </div>
                                                        </div>
                                                     </div>
                                                  </div>
                                                  <div class="col-md-6">
                                                     <div class="card">
                                                        <div class="card-body">
                                                           <div class="d-flex flex-column flex-sm-row">
                                                              <a href="instructor-course-edit.html"
                                                                 class="avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3">
                                                              <img src="assets/images/gulp.png" alt="Card image cap"
                                                                 class="avatar-img rounded">
                                                              </a>
                                                              <div class="flex" style="min-width: 200px;">
                                                                  <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Gulp &amp; Slush Workflows</strong></a></h5> 
                                                                 <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Gulp
                                                                    &amp; Slush Workflows</a>
                                                                 </h4>
                                                                 <p class="text-black-70">Let’s start with a quick tour of Vue’s data
                                                                    binding features.
                                                                 </p>
                                                                 <div class="d-flex align-items-end">
                                                                    <div class="d-flex flex flex-column mr-3">
                                                                       <div class="d-flex align-items-center py-1 border-bottom">
                                                                          <small class="text-black-70 mr-2">&dollar;300/mo</small>
                                                                          <small class="text-black-50">5 SALES</small>
                                                                       </div>
                                                                       <div class="d-flex align-items-center py-1">
                                                                          <small class="text-muted mr-2">GULP</small>
                                                                          <small class="text-muted">INTERMEDIATE</small>
                                                                       </div>
                                                                    </div>
                                                                    <div class="text-center">
                                                                       <a href="instructor-course-edit.html"
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
                                                              <a class="dropdown-item" href="instructor-course-edit.html">Edit course</a>
                                                              <a class="dropdown-item" href="#">Course Insights</a>
                                                              <div class="dropdown-divider"></div>
                                                              <a class="dropdown-item text-danger" href="#">Delete course</a>
                                                           </div>
                                                        </div>
                                                     </div>
                                                  </div>-->
                            </div>
                            <!-- End of List of mentors -->
                            <!-- Pagination -->
                             <ul class="pagination justify-content-center pagination-sm">
                                  <li class="page-item ">
                                    <a class="page-link" href="#" aria-label="Previous">
                                        <span aria-hidden="true" class="material-icons">chevron_left</span>
                                        <span>Prev</span>
                                    </a>
                                </li>
                            <c:forEach begin="1" end="${requestScope.num}" var="i">                                                        
                                <li class="page-item">
                                    <a class="${requestScope.page==i?"active":""} page-link" href="home?page=${i}">
                                        <span>${i}</span>
                                    </a>
                               </li>                              
                            </c:forEach>
                                <li class="page-item">
                                    <a class="page-link" href="#" aria-label="Next">
                                        <span>Next</span>
                                        <span aria-hidden="true" class="material-icons">chevron_right</span>
                                    </a>
                                </li> 
                            </ul>
                           
                            <!-- end of pagination -->
                            <div class="row">
                                <div class="col-lg-7">
                                    <div class="card">
                                        <div class="card-header">
                                            <div class="media align-items-center">
                                                <div class="media-body">
                                                    <h4 class="card-title">Courses</h4>
                                                    <p class="card-subtitle">Your recent courses</p>
                                                </div>
                                                <div class="media-right">
                                                    <a class="btn btn-sm btn-primary" href="${pageContext.request.contextPath}/user/student-my-courses.html">My
                                                        courses</a>
                                                </div>
                                            </div>
                                        </div>
                                        <ul class="list-group list-group-fit mb-0" style="z-index: initial;">
                                            <li class="list-group-item" style="z-index: initial;">
                                                <div class="d-flex align-items-center">
                                                    <a href="${pageContext.request.contextPath}/user/student-take-course.html"
                                                       class="avatar avatar-4by3 avatar-sm mr-3">
                                                        <img src="${pageContext.request.contextPath}/user/assets/images/gulp.png" alt="course"
                                                             class="avatar-img rounded">
                                                    </a>
                                                    <div class="flex">
                                                        <a href="${pageContext.request.contextPath}/user/student-take-course.html" class="text-body"><strong>Learn
                                                                Vue.js Fundamentals</strong></a>
                                                        <div class="d-flex align-items-center">
                                                            <div class="progress" style="width: 100px;">
                                                                <div class="progress-bar bg-primary" role="progressbar"
                                                                     style="width: 25%" aria-valuenow="25" aria-valuemin="0"
                                                                     aria-valuemax="100"></div>
                                                            </div>
                                                            <small class="text-muted ml-2">25%</small>
                                                        </div>
                                                    </div>
                                                    <div class="dropdown ml-3">
                                                        <a href="#" class="dropdown-toggle text-muted" data-caret="false"
                                                           data-toggle="dropdown">
                                                            <i class="material-icons">more_vert</i>
                                                        </a>
                                                        <div class="dropdown-menu dropdown-menu-right">
                                                            <a class="dropdown-item"
                                                               href="${pageContext.request.contextPath}/user/student-take-course.html">Continue</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li class="list-group-item" style="z-index: initial;">
                                                <div class="d-flex align-items-center">
                                                    <a href="${pageContext.request.contextPath}/user/student-take-course.html"
                                                       class="avatar avatar-4by3 avatar-sm mr-3">
                                                        <img src="${pageContext.request.contextPath}/user/assets/images/vuejs.png" alt="course"
                                                             class="avatar-img rounded">
                                                    </a>
                                                    <div class="flex">
                                                        <a href="${pageContext.request.contextPath}/user/student-take-course.html" class="text-body"><strong>Angular
                                                                in Steps</strong></a>
                                                        <div class="d-flex align-items-center">
                                                            <div class="progress" style="width: 100px;">
                                                                <div class="progress-bar bg-success" role="progressbar"
                                                                     style="width: 100%" aria-valuenow="100"
                                                                     aria-valuemin="0" aria-valuemax="100"></div>
                                                            </div>
                                                            <small class="text-muted ml-2">100%</small>
                                                        </div>
                                                    </div>
                                                    <div class="dropdown ml-3">
                                                        <a href="#" class="dropdown-toggle text-muted" data-caret="false"
                                                           data-toggle="dropdown">
                                                            <i class="material-icons">more_vert</i>
                                                        </a>
                                                        <div class="dropdown-menu dropdown-menu-right">
                                                            <a class="dropdown-item"
                                                               href="${pageContext.request.contextPath}/user/student-take-course.html">Continue</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li class="list-group-item" style="z-index: initial;">
                                                <div class="d-flex align-items-center">
                                                    <a href="${pageContext.request.contextPath}/user/student-take-course.html"
                                                       class="avatar avatar-4by3 avatar-sm mr-3">
                                                        <img src="${pageContext.request.contextPath}/user/assets/images/nodejs.png" alt="course"
                                                             class="avatar-img rounded">
                                                    </a>
                                                    <div class="flex">
                                                        <a href="${pageContext.request.contextPath}/user/student-take-course.html"
                                                           class="text-body"><strong>Bootstrap Foundations</strong></a>
                                                        <div class="d-flex align-items-center">
                                                            <div class="progress" style="width: 100px;">
                                                                <div class="progress-bar bg-warning" role="progressbar"
                                                                     style="width: 80%" aria-valuenow="80" aria-valuemin="0"
                                                                     aria-valuemax="100"></div>
                                                            </div>
                                                            <small class="text-muted ml-2">80%</small>
                                                        </div>
                                                    </div>
                                                    <div class="dropdown ml-3">
                                                        <a href="#" class="dropdown-toggle text-muted" data-caret="false"
                                                           data-toggle="dropdown">
                                                            <i class="material-icons">more_vert</i>
                                                        </a>
                                                        <div class="dropdown-menu dropdown-menu-right">
                                                            <a class="dropdown-item"
                                                               href="${pageContext.request.contextPath}/user/student-take-course.html">Continue</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-lg-5">
                                    <div class="card card-2by1">
                                        <div class="card-header">
                                            <h4 class="card-title">Rewards</h4>
                                            <p class="card-subtitle">Your latest achievements</p>
                                        </div>
                                        <div class="card-body text-center">
                                            <div class="btn btn-primary btn-circle"><i class="material-icons">thumb_up</i>
                                            </div>
                                            <div class="btn btn-danger btn-circle"><i class="material-icons">grade</i></div>
                                            <div class="btn btn-success btn-circle"><i
                                                    class="material-icons">bubble_chart</i></div>
                                            <div class="btn btn-warning btn-circle"><i
                                                    class="material-icons">keyboard_voice</i></div>
                                            <div class="btn btn-info btn-circle"><i
                                                    class="material-icons">event_available</i></div>
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

                                    <!-- Wrapper for slides -->
                                    <div class="carousel-inner">
                                        <div class="item active">
                                            <img src="${pageContext.request.contextPath}/user/assets/images/1.png" alt="Anime">
                                        </div>

                                        <div class="item">
                                            <img src="${pageContext.request.contextPath}/user/assets/images/2.png" alt="Anime">
                                        </div>

                                        <div class="item">
                                            <img src="${pageContext.request.contextPath}/user/assets/images/4.png" alt="Anime">
                                        </div>
                                    </div>
                                    <!-- Controls -->
                                    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                                        <span class="glyphicon glyphicon-chevron-left"></span>
                                    </a>
                                    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                                        <span class="glyphicon glyphicon-chevron-right"></span>
                                    </a>
                                </div><!--Kết thúc slider-->
                            </div>
                        </div>
                    </div>
                    <jsp:include page="mentee_tab.jsp"/>
                </div>
            </div>
        </div>
                
                <!-- App Settings FAB -->
                <!--                <div id="app-settings">
                   <app-settings layout-active="default"
                                 :layout-location="{
                   'fixed': 'fixed-student-dashboard.html',
                   'default': 'student-dashboard.html'
                   }"
                                 sidebar-variant="bg-transparent border-0"></app-settings>
                   </div>-->
                <!-- Nav Tab active-->
                
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