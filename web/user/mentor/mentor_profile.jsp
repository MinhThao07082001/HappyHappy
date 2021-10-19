<!DOCTYPE html>
<html lang="en"
   dir="ltr">
   <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible"
         content="IE=edge">
      <meta name="viewport"
         content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <title>Student Profile</title>
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
   <body class=" fixed-layout">
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
         <jsp:include page="mentor_header.jsp" />
         <!-- // END Header -->
         <!-- Header Layout Content -->
         <div class="mdk-header-layout__content d-flex flex-column">
            <div class="page__header">
               <div class="navbar bg-dark navbar-dark navbar-expand-sm d-none2 d-md-flex2">
                  <div class="container">
                     <div class="navbar-collapse collapse"
                        id="navbarsExample03">
                        <ul class="nav navbar-nav">
                           <li class="nav-item dropdown">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Student</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="fixed-student-dashboard.html">Dashboard</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-browse-courses.html">Browse Courses</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-view-course.html">View Course</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-take-course.html">Take Course</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-take-quiz.html">Take a Quiz</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-quiz-results.html">Quiz Results</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-my-courses.html">My Courses</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-billing.html">Billing</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-pay.html">Payment</a>
                              </div>
                           </li>
                           <li class="nav-item dropdown">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Instructor</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="fixed-instructor-dashboard.html">Dashboard</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-courses.html">Course Manager</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-quizzes.html">Quiz Manager</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-earnings.html">Earnings</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-statement.html">Statement</a>
                              </div>
                           </li>
                           <li class="nav-item dropdown">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Account</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="fixed-student-account-edit.html">Edit Account</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-account-edit-basic.html">Basic Information</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-account-edit-profile.html">Profile &amp; Privacy</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-account-billing-subscription.html">Subscription</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-account-billing-upgrade.html">Upgrade Account</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-account-billing-payment-information.html">Payment Information</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-billing.html">Payment History</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-invoice.html">Student Invoice</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-invoice.html">Instructor Invoice</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-edit-invoice.html">Edit Invoice</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-messages.html">Messages</a>
                                 <div class="dropdown-divider"></div>
                                 <a class="dropdown-item"
                                    href="guest-login.html">Login</a>
                                 <a class="dropdown-item"
                                    href="guest-signup.html">Signup</a>
                                 <a class="dropdown-item"
                                    href="guest-forgot-password.html">Forgot Password</a>
                              </div>
                           </li>
                           <li class="nav-item dropdown active">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Community</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="fixed-student-forum.html">Forum</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-forum-thread.html">Discussion</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-forum-ask.html">Ask Question</a>
                                 <div class="dropdown-divider"></div>
                                 <a class="dropdown-item active"
                                    href="fixed-student-profile.html">Student Profile - Courses</a>
                                 <a class="dropdown-item"
                                    href="fixed-student-profile-posts.html">Student Profile - Posts</a>
                                 <a class="dropdown-item"
                                    href="fixed-instructor-profile.html">Instructor Profile</a>
                                 <div class="dropdown-divider"></div>
                                 <a class="dropdown-item"
                                    href="fixed-student-help-center.html">Help Center</a>
                              </div>
                           </li>
                           <li class="nav-item dropdown">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Components</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="fixed-ui-avatars.html">Avatars</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-forms.html">Forms</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-loaders.html">Loaders</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-tables.html">Tables</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-cards.html">Cards</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-tabs.html">Tabs</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-icons.html">Icons</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-buttons.html">Buttons</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-alerts.html">Alerts</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-badges.html">Badges</a>
                                 <!-- <a class="dropdown-item" href="fixed-ui-modals.html">- Modals</a> -->
                                 <a class="dropdown-item"
                                    href="fixed-ui-progress.html">Progress</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-pagination.html">Pagination</a>
                              </div>
                           </li>
                           <li class="nav-item dropdown">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Plugins</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="fixed-ui-charts.html">Charts</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-drag.html">Drag &amp; Drop</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-calendar.html">Calendar</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-nestable.html">Nestable</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-tree.html">Tree</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-maps-vector.html">Vector Maps</a>
                                 <a class="dropdown-item"
                                    href="fixed-ui-sweet-alert.html">Sweet Alert</a>
                              </div>
                           </li>
                           <li class="nav-item dropdown">
                              <a href="#"
                                 class="nav-link dropdown-toggle"
                                 data-toggle="dropdown">Layouts</a>
                              <div class="dropdown-menu">
                                 <a class="dropdown-item"
                                    href="student-profile.html">Fluid</a>
                                 <a class="dropdown-item active"
                                    href="fixed-student-profile.html">Fixed</a>
                              </div>
                           </li>
                        </ul>
                     </div>
                     <button class="navbar-toggler"
                        data-toggle="collapse"
                        data-target="#navbarsExample03"
                        type="button">
                     <span class="material-icons">menu</span>
                     </button>
                  </div>
               </div>
            </div>
            <div class="page pt-0">
               <div class="bg-primary mdk-box js-mdk-box mb-0"
                  style="height: 192px;"
                  data-effects="parallax-background blend-background">
                  <div class="mdk-box__bg">
                     <div class="mdk-box__bg-front"
                        style="background-image: url(${pageContext.request.contextPath}/user/assets/images/1280_rsz_aman-dhakal-205796-unsplash.jpg); background-position: center;"></div>
                  </div>
               </div>
               <div class="container page__container d-flex align-items-end position-relative mb-4">
                  <div class="avatar avatar-xxl position-absolute bottom-0 left-0 right-0">
                     <img src="${pageContext.request.contextPath}/user/assets/images/256_rsz_clem-onojeghuo-150467-unsplash.jpg"
                        alt="avatar"
                        class="avatar-img rounded-circle border-3">
                  </div>
                  <ul class="nav nav-tabs-links flex"
                     style="margin-left: 265px;">
                     <li class="nav-item">
                        <a href="fixed-student-profile.html"
                           class="nav-link active">Courses</a>
                     </li>
                     <li class="nav-item">
                        <a href="fixed-student-profile-posts.html"
                           class="nav-link">Posts</a>
                     </li>
                  </ul>
               </div>
               <div class="container page__container mb-3">
                  <div class="row flex-sm-nowrap">
                     <div class="col-sm-auto mb-3 mb-sm-0"
                        style="width: 265px;">
                        <h1 class="h2 mb-1">Laza Bogdan</h1>
                        <p class="d-flex align-items-center mb-4">
                           <a href="#"
                              class="btn btn-sm btn-success mr-2">Follow @LazaBogdan</a>
                        </p>
                        <div class="text-muted d-flex align-items-center mb-2">
                           <i class="material-icons mr-1">account_box</i>
                           <div class="flex">Student since 2012</div>
                        </div>
                        <div class="text-muted d-flex align-items-center mb-4">
                           <i class="material-icons mr-1">location_on</i>
                           <div class="flex">Romania, Europe</div>
                        </div>
                        <h4>About me</h4>
                        <p class="text-black-70 measure-paragraph">Fueled by my passion for understanding the nuances of cross-cultural advertising, I consider myself a forever student, eager to both build on my academic foundations in psychology and sociology and stay in tune with the latest digital marketing strategies through continued coursework.</p>
                        <h4>Connect</h4>
                        <p class="text-black-70 measure-paragraph">I?m currently working as a freelance marketing director and always interested in a challenge. Here?s how to reach out and connect.</p>
                     </div>
                     <div class="col-sm">
                        <!-- <div class="flex search-form search-form--light mb-4">
                           <button class="btn pr-3" type="button" role="button"><i class="material-icons">search</i></button>
                           <input type="text" class="form-control" placeholder="Search" id="searchSample02">
                           </div> -->
                        <div class="card">
                           <div class="card-header">
                              <div class="d-flex align-items-center">
                                 <a href="fixed-student-take-course.html"
                                    class="mr-3">
                                 <img src="${pageContext.request.contextPath}/user/assets/images/vuejs.png"
                                    width="100"
                                    alt=""
                                    class="rounded">
                                 </a>
                                 <div class="flex">
                                    <h4 class="card-title mb-0"><a href="fixed-student-take-course.html">VueJs</a></h4>
                                    <span class="badge badge-primary">Advanced</span>
                                 </div>
                              </div>
                           </div>
                           <ul class="list-group list-group-fit">
                              <li class="list-group-item">
                                 <a href="fixed-student-view-course.html"
                                    class="text-body text-decoration-0 d-flex align-items-center">
                                 <strong>Basics of Vue.js</strong>
                                 <i class="material-icons text-muted ml-auto"
                                    style="font-size: inherit;">check</i>
                                 </a>
                              </li>
                              <li class="list-group-item">
                                 <a href="fixed-student-view-course.html"
                                    class="text-body text-decoration-0 d-flex align-items-center">
                                 <strong>Intermediate Vue.js</strong>
                                 <i class="material-icons text-muted ml-auto"
                                    style="font-size: inherit;">check</i>
                                 </a>
                              </li>
                              <li class="list-group-item">
                                 <a href="fixed-student-view-course.html"
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
                                 <a href="fixed-student-take-course.html"
                                    class="mr-3">
                                 <img src="${pageContext.request.contextPath}/user/assets/images/nodejs.png"
                                    alt=""
                                    class="rounded"
                                    width="100">
                                 </a>
                                 <div class="flex">
                                    <h4 class="card-title mb-0"><a href="fixed-student-take-course.html">NodeJs</a></h4>
                                    <span class="badge badge-success">Beginner</span>
                                 </div>
                              </div>
                           </div>
                           <ul class="list-group list-group-fit">
                              <li class="list-group-item">
                                 <a href="fixed-student-view-course.html"
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
                                 <a href="fixed-student-take-course.html"
                                    class="mr-3">
                                 <img src="${pageContext.request.contextPath}/user/assets/images/github.png"
                                    alt=""
                                    class="rounded"
                                    width="100">
                                 </a>
                                 <div class="media-body">
                                    <h4 class="card-title mb-0"><a href="fixed-student-take-course.html">GitHub</a></h4>
                                    <span class="badge badge-warning">Intermediate</span>
                                 </div>
                              </div>
                           </div>
                           <ul class="list-group list-group-fit">
                              <li class="list-group-item">
                                 <a href="fixed-student-view-course.html"
                                    class="text-body text-decoration-0 d-flex align-items-center">
                                 <strong>Github Step by Step</strong>
                                 <i class="material-icons text-muted ml-auto"
                                    style="font-size: inherit;">check</i>
                                 </a>
                              </li>
                              <li class="list-group-item">
                                 <a href="fixed-student-view-course.html"
                                    class="text-body text-decoration-0 d-flex align-items-center">
                                 <strong>Working as a Team with GitHub</strong>
                                 <i class="material-icons text-muted ml-auto"
                                    style="font-size: inherit;">check</i>
                                 </a>
                              </li>
                           </ul>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="container page__container">
                  <div class="footer">
                     Copyright &copy; 2016 - <a href="http://themeforest.net/item/learnplus-learning-management-application/15287372?ref=mosaicpro">Purchase LearnPlus</a>
                  </div>
               </div>
            </div>
         </div>
         <!-- // END Header Layout Content -->
      </div>
      <!-- // END Header Layout -->
      <div class="mdk-drawer js-mdk-drawer"
         id="default-drawer">
         <div class="mdk-drawer__content ">
            <div class="sidebar sidebar-left sidebar-dark bg-dark o-hidden"
               data-perfect-scrollbar>
               <div class="sidebar-p-y">
                  <div class="sidebar-heading">APPLICATIONS</div>
                  <ul class="sidebar-menu sm-active-button-bg">
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-dashboard.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">account_box</i> Student
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-instructor-dashboard.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">school</i> Instructor
                        </a>
                     </li>
                  </ul>
                  <!-- Account menu -->
                  <div class="sidebar-heading">Account</div>
                  <ul class="sidebar-menu">
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button sidebar-js-collapse"
                           data-toggle="collapse"
                           href="#account_menu">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">person_outline</i>
                        Account
                        <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse"
                           id="account_menu">
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="guest-login.html">
                              <span class="sidebar-menu-text">Login</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="guest-signup.html">
                              <span class="sidebar-menu-text">Sign Up</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="guest-forgot-password.html">
                              <span class="sidebar-menu-text">Forgot Password</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-account-edit.html">
                              <span class="sidebar-menu-text">Edit Account</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-account-edit-basic.html">
                              <span class="sidebar-menu-text">Basic Information</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-account-edit-profile.html">
                              <span class="sidebar-menu-text">Profile &amp; Privacy</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-account-billing-subscription.html">
                              <span class="sidebar-menu-text">Subscription</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-account-billing-upgrade.html">
                              <span class="sidebar-menu-text">Upgrade Account</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-account-billing-payment-information.html">
                              <span class="sidebar-menu-text">Payment Information</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-billing.html">
                              <span class="sidebar-menu-text">Payment History</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-invoice.html">
                              <span class="sidebar-menu-text">Student Invoice</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-instructor-invoice.html">
                              <span class="sidebar-menu-text">Instructor Invoice</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-instructor-edit-invoice.html">
                              <span class="sidebar-menu-text">Edit Invoice</span>
                              </a>
                           </li>
                        </ul>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           data-toggle="collapse"
                           href="#messages_menu">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">comment</i> Messages
                        <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse"
                           id="messages_menu">
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-messages.html">
                              <span class="sidebar-menu-text">Conversation</span>
                              <span class="sidebar-menu-badge badge badge-primary badge-notifications ml-auto">2</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-messages-2.html">
                              <span class="sidebar-menu-text">Conversation - 2</span>
                              </a>
                           </li>
                        </ul>
                     </li>
                  </ul>
                  <div class="sidebar-heading">Student</div>
                  <ul class="sidebar-menu sm-active-button-bg">
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-browse-courses.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">search</i> Browse Courses
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-view-course.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">import_contacts</i> View Course
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-take-course.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">class</i> Take Course
                        <span class="sidebar-menu-badge badge badge-primary ml-auto">PRO</span>
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-take-quiz.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">dvr</i> Take a Quiz
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-quiz-results.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">poll</i> Quiz Results
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-my-courses.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">school</i> My Courses
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           data-toggle="collapse"
                           href="#forum_menu">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">chat_bubble_outline</i>
                        Community
                        <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse"
                           id="forum_menu">
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-forum.html">
                              <span class="sidebar-menu-text">Forum</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-forum-thread.html">
                              <span class="sidebar-menu-text">Discussion</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-forum-ask.html">
                              <span class="sidebar-menu-text">Ask Question</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item active">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-profile.html">
                              <span class="sidebar-menu-text">Student Profile - Courses</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-student-profile-posts.html">
                              <span class="sidebar-menu-text">Student Profile - Posts</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-instructor-profile.html">
                              <span class="sidebar-menu-text">Instructor Profile</span>
                              </a>
                           </li>
                        </ul>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="fixed-student-help-center.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">live_help</i> Get Help
                        </a>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="guest-login.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">lock_open</i> Logout
                        </a>
                     </li>
                  </ul>
                  <!-- Components menu -->
                  <div class="sidebar-heading">Components</div>
                  <ul class="sidebar-menu">
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button sidebar-js-collapse"
                           data-toggle="collapse"
                           href="#components_menu">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">tune</i>
                        Components
                        <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse"
                           id="components_menu">
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-avatars.html">
                              <span class="sidebar-menu-text">Avatars</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-forms.html">
                              <span class="sidebar-menu-text">Forms</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-loaders.html">
                              <span class="sidebar-menu-text">Loaders</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-tables.html">
                              <span class="sidebar-menu-text">Tables</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-cards.html">
                              <span class="sidebar-menu-text">Cards</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-tabs.html">
                              <span class="sidebar-menu-text">Tabs</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-icons.html">
                              <span class="sidebar-menu-text">Icons</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-buttons.html">
                              <span class="sidebar-menu-text">Buttons</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-alerts.html">
                              <span class="sidebar-menu-text">Alerts</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-badges.html">
                              <span class="sidebar-menu-text">Badges</span>
                              </a>
                           </li>
                           <!-- <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button" href="fixed-ui-modals.html">
                                <span class="sidebar-menu-text">- Modals</span>
                              </a>
                              </li> -->
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-progress.html">
                              <span class="sidebar-menu-text">Progress Bars</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-pagination.html">
                              <span class="sidebar-menu-text">Pagination</span>
                              </a>
                           </li>
                        </ul>
                     </li>
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button sidebar-js-collapse"
                           data-toggle="collapse"
                           href="#plugins_menu">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">folder</i>
                        Plugins
                        <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse"
                           id="plugins_menu">
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-charts.html">
                              <span class="sidebar-menu-text">Charts</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-drag.html">
                              <span class="sidebar-menu-text">Drag &amp; Drop</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-calendar.html">
                              <span class="sidebar-menu-text">Calendar</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-nestable.html">
                              <span class="sidebar-menu-text">Nestable</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-tree.html">
                              <span class="sidebar-menu-text">Tree</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-maps-vector.html">
                              <span class="sidebar-menu-text">Vector Maps</span>
                              </a>
                           </li>
                           <li class="sidebar-menu-item">
                              <a class="sidebar-menu-button"
                                 href="fixed-ui-sweet-alert.html">
                              <span class="sidebar-menu-text">Sweet Alert</span>
                              </a>
                           </li>
                        </ul>
                     </li>
                  </ul>
                  <!-- // END Components Menu -->
                  <div class="sidebar-heading">Layout</div>
                  <ul class="sidebar-menu">
                     <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="student-profile.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">dashboard</i> Fluid Layout
                        </a>
                     </li>
                     <li class="sidebar-menu-item active">
                        <a class="sidebar-menu-button"
                           href="fixed-student-profile.html">
                        <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">dashboard</i> Fixed Layout
                        </a>
                     </li>
                  </ul>
               </div>
            </div>
         </div>
      </div>
      <!-- App Settings FAB -->
      <!--        <div id="app-settings">
         <app-settings layout-active="fixed"
                       :layout-location="{
         'fixed': 'fixed-student-profile.html',
         'default': 'student-profile.html'
         }"-->
      sidebar-variant="bg-transparent border-0"></app-settings>
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
   <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-profile.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->
</html>