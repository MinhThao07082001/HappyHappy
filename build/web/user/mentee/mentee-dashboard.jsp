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
        <title>Mentee - Dashboard</title>
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
                                <c:forEach var="mtorItem" items="${requestScope.mtorList}">
                                    <c:set var="mtor" value="${mtorItem.key}"></c:set>
                                        <div class="col-md-6 Paginate module-name">

                                        <div class="card">
                                             
                                                <div class=" card-body">

                                                    <div class=" d-flex flex-column flex-sm-row">
                                                        <h4>${mtorItem.value} ???</h4>  
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
                                                                <a href="../rate?id=${mtor.mentorID}"
                                                                   class="btn btn-sm btn-white">View Detail</a>
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
                            <ul class="pagination justify-content-center pagination-sm">
                                <li class="page-item disabled" id="prevBtn">
                                    <a class="page-link"
                                       href="#0"
                                       aria-label="Previous"
                                       onclick="paginate(document.getElementById('pageNow').innerHTML - 1)">
                                        <span aria-hidden="true"
                                              class="material-icons">chevron_left</span>
                                        <span>Prev</span>
                                    </a>
                                </li>
                                <li class="page-item">
                                    <a class="page-link"
                                       href="#0"
                                       aria-label="1"
                                       onclick="paginate(1)">
                                        1
                                    </a>
                                </li>
                                <li class="page-item">
                                    <a class="page-link"
                                       href="#0"
                                       aria-label="1"
                                       onclick="paginate(2)">
                                        <span>2</span>
                                    </a>
                                </li>
                                <li class="page-item">
                                    <a class="page-link"
                                       href="#0"
                                       aria-label="1"
                                       onclick="paginate(3)">
                                        <span>3</span>
                                    </a>
                                </li>
                                <li class="page-item" id="nextBtn">
                                    <a class="page-link"
                                       href="#0"
                                       aria-label="Next"
                                       onclick="paginate(Number(document.getElementById('pageNow').innerHTML) + 1)">
                                        <span>Next</span>
                                        <span aria-hidden="true"
                                              class="material-icons">chevron_right</span>
                                    </a>
                                </li>
                            </ul>
                            <h1 style="display: none" id="pageNow">1</h1>
                            <!--                                <div class="page" >
                                                            <a href="#">1</a>&nbsp;                                                                   
                                                            <a href="#">2</a>&nbsp;                                
                                                            <a href="#">3</a>&nbsp;                    
                                                            <a href="#">4</a>&nbsp;
                                                        </div>-->






                            <%--</c:forEach>--%>
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
                                                                 <p class="text-black-70">Let????????s start with a quick tour of Vue????????s data
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
                            
                            <!-- End of List of mentors -->
                            <!-- Pagination -->
                            <!--                            <ul class="pagination justify-content-center pagination-sm">
                                <li class="page-item ">
                                    <a class="page-link" href="#" aria-label="Previous">
                                        <span aria-hidden="true" class="material-icons">chevron_left</span>
                                        <span>Prev</span>
                                    </a>
                                </li>
                            
                            <%--<c:forEach begin="1" end="${requestScope.num}" var="i">                                                    
                                    <li class="page-item">
                                        <a class="${requestScope.page==i?"active":""} page-link" href="home?page=${i}">
                                            <span>${i}</span>
                                        </a>
                                    </li>                              
                            </c:forEach>--%>
                                <li class="page-item">
                                    <a class="page-link" href="#" aria-label="Next">
                                        <span>Next</span>
                                        <span aria-hidden="true" class="material-icons">chevron_right</span>
                                    </a>
                                </li> 
                        </ul>-->










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
                                                    <a class="btn btn-sm btn-primary"href="${pageContext.request.contextPath}/listCourse">My
                                                        courses</a>
                                                </div>
                                            </div>
                                        </div>
                                        <ul class="list-group list-group-fit mb-0" style="z-index: initial;">
                                            <c:forEach var="course" items="${requestScope.courseList}">
                                                <li class="list-group-item" style="z-index: initial;">
                                                <div class="d-flex align-items-center">
                                                    <a href="${pageContext.request.contextPath}/user/student-take-course.html"
                                                       class="avatar avatar-4by3 avatar-sm mr-3">
                                                        <img src="${pageContext.request.contextPath}/user/assets/images/gulp.png" alt="course"
                                                             class="avatar-img rounded">
                                                    </a>
                                                    <div class="flex">
                                                        <a href="${pageContext.request.contextPath}/course?id=${course.courseID}" class="text-body"><strong>
                                                            ${course.subject.subjectName}
                                                            </strong></a>
                                                        <div class="d-flex align-items-center">
                                                            <div class="progress" style="width: 100px;">
                                                                <div class="progress-bar bg-primary" role="progressbar"
                                                                     style="width: ${course.slotDone/course.slots*100.0}%" aria-valuenow="${course.slotDone/course.slots}" aria-valuemin="0"
                                                                     aria-valuemax="100"></div>
                                                            </div>
                                                            <small class="text-muted ml-2"><fmt:formatNumber type="number" maxFractionDigits="2" value="${course.slotDone/course.slots*100.0}"/>%</small>
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
                                            </c:forEach>

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



        <script src="//cdnjs.cloudflare.com/ajax/libs/list.js/1.5.0/list.min.js"></script>
        <script>
//            var mkeyList = new List('easyPaginateList', {
//                valueNames: ['module-name'],
//                page: 1,
//                pagination: true
//            });
//
//            $('.nav').append('<div class="btn-next"> > </div><div class="btn-last"> >> </div>');
//            $('.nav').prepend('<div class="btn-first"> << </div><div class="btn-prev"> < </div>');
//
//            $('.btn-next').on('click', function () {
//                $('.pagination .active').next().trigger('click');
//            })
//            $('.btn-prev').on('click', function () {
//                $('.pagination .active').prev().trigger('click');
//            })
//            $('.btn-first').on('click', function () {
//                //
//            })
//            $('.btn-last').on('click', function () {
//                //
//            })

        </script>

        <script type="text/javascript">
            var numPerPage = 4;          
            function paginate(page) {
                var items = [];
                var pageitems = [];
                pageitems = document.getElementsByClassName("page-item");
                for (var i = 0; i < pageitems.length; i++) {
                    pageitems[i].className = "page-item";
                }
                pageitems[page].className = "page-item active";
                if (page === 3) {
                    document.getElementById("nextBtn").className = "page-item disabled";
                } else {
                    document.getElementById("nextBtn").className = "page-item active";
                }
                if (page === 1) {
                    document.getElementById("prevBtn").className = "page-item disabled";
                } else {
                    document.getElementById("prevBtn").className = "page-item active";
                }
                items = document.getElementsByClassName("Paginate");
                for (var i = 0; i < items.length; i++) {
                    items[i].style.display = "none"
                }
                for (var i = (page - 1) * 4; i < page * 4; i++) {
                    if (i === items.length) {
                        break;
                    }
                    items[i].style.display = "block"
                }
                if (page <= 3 && page >= 1)
                    document.getElementById("pageNow").innerHTML = page;
            }
            paginate(1);


        </script>
    </body>
    <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:01 GMT -->
</html>
