<!DOCTYPE html>
<html lang="en" dir="ltr">


<!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:12:12 GMT -->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Student - Dashboard</title>

    <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
    <meta name="robots" content="noindex">

    <!-- Custom Fonts -->
    <link
        href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap"
        rel="stylesheet">

    <!-- Perfect Scrollbar -->
    <link type="text/css" href="assets/vendor/perfect-scrollbar.css" rel="stylesheet">

    <!-- Material Design Icons -->
    <link type="text/css" href="assets/css/material-icons.css" rel="stylesheet">

    <!-- Font Awesome Icons -->
    <link type="text/css" href="assets/css/fontawesome.css" rel="stylesheet">

    <!-- Preloader -->
    <link type="text/css" href="assets/vendor/spinkit.css" rel="stylesheet">

    <!-- App CSS -->
    <link type="text/css" href="assets/css/app.css" rel="stylesheet">

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

        <div id="header" data-fixed class="mdk-header js-mdk-header mb-0">
            <div class="mdk-header__content">

                <!-- Navbar -->
                <nav id="default-navbar" class="navbar navbar-expand navbar-dark bg-primary m-0">
                    <div class="container-fluid">
                        <!-- Toggle sidebar -->
                        <button class="navbar-toggler d-block" data-toggle="sidebar" type="button">
                            <span class="material-icons">menu</span>
                        </button>

                        <!-- Brand -->
                        <a href="student-dashboard.html" class="navbar-brand">
                            <img src="assets/images/logo/white.svg" class="mr-2" alt="LearnPlus" />
                            <span class="d-none d-xs-md-block">LearnPlus</span>
                        </a>

                        <!-- Search -->
                        <form class="search-form d-none d-md-flex">
                            <input type="text" class="form-control" placeholder="Search">
                            <button class="btn" type="button"><i
                                    class="material-icons font-size-24pt">search</i></button>
                        </form>
                        <!-- // END Search -->

                        <div class="flex"></div>

                        <!-- Menu -->
                        <ul class="nav navbar-nav flex-nowrap d-none d-lg-flex">
                            <li class="nav-item">
                                <a class="nav-link" href="student-forum.html">Forum</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="student-help-center.html">Get Help</a>
                            </li>
                        </ul>

                        <!-- Menu -->
                        <ul class="nav navbar-nav flex-nowrap">

                            <li class="nav-item d-none d-md-flex">
                                <a href="student-cart.html" class="nav-link">
                                    <i class="material-icons">shopping_cart</i>
                                </a>
                            </li>

                            <!-- Notifications dropdown -->
                            <li class="nav-item dropdown dropdown-notifications dropdown-menu-sm-full">
                                <button class="nav-link btn-flush dropdown-toggle" type="button" data-toggle="dropdown"
                                    data-dropdown-disable-document-scroll data-caret="false">
                                    <i class="material-icons">notifications</i>
                                    <span class="badge badge-notifications badge-danger">2</span>
                                </button>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <div data-perfect-scrollbar class="position-relative">
                                        <div class="dropdown-header"><strong>Messages</strong></div>
                                        <div class="list-group list-group-flush mb-0">

                                            <a href="student-messages.html"
                                                class="list-group-item list-group-item-action unread">
                                                <span class="d-flex align-items-center mb-1">
                                                    <small class="text-muted">5 minutes ago</small>

                                                    <span class="ml-auto unread-indicator bg-primary"></span>

                                                </span>
                                                <span class="d-flex">
                                                    <span class="avatar avatar-xs mr-2">
                                                        <img src="assets/images/people/110/woman-5.jpg" alt="people"
                                                            class="avatar-img rounded-circle">
                                                    </span>
                                                    <span class="flex d-flex flex-column">
                                                        <strong>Michelle</strong>
                                                        <span class="text-black-70">Clients loved the new design.</span>
                                                    </span>
                                                </span>
                                            </a>

                                            <a href="student-messages.html"
                                                class="list-group-item list-group-item-action unread">
                                                <span class="d-flex align-items-center mb-1">
                                                    <small class="text-muted">5 minutes ago</small>

                                                    <span class="ml-auto unread-indicator bg-primary"></span>

                                                </span>
                                                <span class="d-flex">
                                                    <span class="avatar avatar-xs mr-2">
                                                        <img src="assets/images/people/110/woman-5.jpg" alt="people"
                                                            class="avatar-img rounded-circle">
                                                    </span>
                                                    <span class="flex d-flex flex-column">
                                                        <strong>Michelle</strong>
                                                        <span class="text-black-70">🔥 Superb job..</span>
                                                    </span>
                                                </span>
                                            </a>

                                        </div>

                                        <div class="dropdown-header"><strong>System notifications</strong></div>
                                        <div class="list-group list-group-flush mb-0">

                                            <a href="student-messages.html"
                                                class="list-group-item list-group-item-action border-left-3 border-left-danger">
                                                <span class="d-flex align-items-center mb-1">
                                                    <small class="text-muted">3 minutes ago</small>

                                                </span>
                                                <span class="d-flex">
                                                    <span class="avatar avatar-xs mr-2">
                                                        <span class="avatar-title rounded-circle bg-light">
                                                            <i
                                                                class="material-icons font-size-16pt text-danger">account_circle</i>
                                                        </span>
                                                    </span>
                                                    <span class="flex d-flex flex-column">

                                                        <span class="text-black-70">Your profile information has not
                                                            been synced correctly.</span>
                                                    </span>
                                                </span>
                                            </a>

                                            <a href="student-messages.html"
                                                class="list-group-item list-group-item-action">
                                                <span class="d-flex align-items-center mb-1">
                                                    <small class="text-muted">5 hours ago</small>

                                                </span>
                                                <span class="d-flex">
                                                    <span class="avatar avatar-xs mr-2">
                                                        <span class="avatar-title rounded-circle bg-light">
                                                            <i
                                                                class="material-icons font-size-16pt text-success">group_add</i>
                                                        </span>
                                                    </span>
                                                    <span class="flex d-flex flex-column">
                                                        <strong>Adrian. D</strong>
                                                        <span class="text-black-70">Wants to join your private
                                                            group.</span>
                                                    </span>
                                                </span>
                                            </a>

                                            <a href="student-messages.html"
                                                class="list-group-item list-group-item-action">
                                                <span class="d-flex align-items-center mb-1">
                                                    <small class="text-muted">1 day ago</small>

                                                </span>
                                                <span class="d-flex">
                                                    <span class="avatar avatar-xs mr-2">
                                                        <span class="avatar-title rounded-circle bg-light">
                                                            <i
                                                                class="material-icons font-size-16pt text-warning">storage</i>
                                                        </span>
                                                    </span>
                                                    <span class="flex d-flex flex-column">

                                                        <span class="text-black-70">Your deploy was successful.</span>
                                                    </span>
                                                </span>
                                            </a>

                                        </div>
                                    </div>
                                </div>
                            </li>
                            <!-- // END Notifications dropdown -->
                            <!-- User dropdown -->
                            <li class="nav-item dropdown ml-1 ml-md-3">
                                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button"><img
                                        src="assets/images/people/50/guy-6.jpg" alt="Avatar" class="rounded-circle"
                                        width="40"></a>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a class="dropdown-item" href="student-account-edit.html">
                                        <i class="material-icons">edit</i> Edit Account
                                    </a>
                                    <a class="dropdown-item" href="student-profile.html">
                                        <i class="material-icons">person</i> Public Profile
                                    </a>
                                    <a class="dropdown-item" href="guest-login.html">
                                        <i class="material-icons">lock</i> Logout
                                    </a>
                                </div>
                            </li>
                            <!-- // END User dropdown -->

                        </ul>
                        <!-- // END Menu -->
                    </div>
                </nav>
                <!-- // END Navbar -->

            </div>
        </div>

        <!-- // END Header -->

        <!-- Header Layout Content -->
        <div class="mdk-header-layout__content">

            <div data-push data-responsive-width="992px" class="mdk-drawer-layout js-mdk-drawer-layout">
                <div class="mdk-drawer-layout__content page ">

                    <div class="container-fluid page__container">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="student-dashboard.html">Home</a></li>
                            <li class="breadcrumb-item active">Dashboard</li>
                        </ol>
                        <h1 class="h2" style="width: auto;
                            height: auto;
                            
                            background: #EDCBCB;
                            border-radius: 200px;">&nbsp; &nbsp;Welcome Pham Thi Vjnh</h1>
<!
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
                                                <a class="btn btn-sm btn-primary" href="student-my-courses.html">My
                                                    courses</a>
                                            </div>
                                        </div>
                                    </div>

                                    <ul class="list-group list-group-fit mb-0" style="z-index: initial;">

                                        <li class="list-group-item" style="z-index: initial;">
                                            <div class="d-flex align-items-center">
                                                <a href="student-take-course.html"
                                                    class="avatar avatar-4by3 avatar-sm mr-3">
                                                    <img src="assets/images/gulp.png" alt="course"
                                                        class="avatar-img rounded">
                                                </a>
                                                <div class="flex">
                                                    <a href="student-take-course.html" class="text-body"><strong>Learn
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
                                                            href="student-take-course.html">Continue</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="list-group-item" style="z-index: initial;">
                                            <div class="d-flex align-items-center">
                                                <a href="student-take-course.html"
                                                    class="avatar avatar-4by3 avatar-sm mr-3">
                                                    <img src="assets/images/vuejs.png" alt="course"
                                                        class="avatar-img rounded">
                                                </a>
                                                <div class="flex">
                                                    <a href="student-take-course.html" class="text-body"><strong>Angular
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
                                                            href="student-take-course.html">Continue</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="list-group-item" style="z-index: initial;">
                                            <div class="d-flex align-items-center">
                                                <a href="student-take-course.html"
                                                    class="avatar avatar-4by3 avatar-sm mr-3">
                                                    <img src="assets/images/nodejs.png" alt="course"
                                                        class="avatar-img rounded">
                                                </a>
                                                <div class="flex">
                                                    <a href="student-take-course.html"
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
                                                            href="student-take-course.html">Continue</a>
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
                        </div>

                        <div class="card-header">
                            <div class="media align-items-center">
                                <div class="media-body">
                                    <h4 class="card-title">Mentor Recommendation</h4>
                                    <p class="card-subtitle">Choose the list of mentors recommend by US!</p>
                                </div>

                            </div>
                        </div>
                        
                        <!--List of mentors -->
                        <div class="row">

                            <div class="col-md-6">
                                <div class="card">
                                    <div class="card-body">

                                        <div class="d-flex flex-column flex-sm-row">
                                            <a href="instructor-course-edit.html"
                                                class="avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3">
                                                <img src="assets/images/vuejs.png" alt="Card image cap"
                                                    class="avatar-img rounded">
                                            </a>
                                            <div class="flex" style="min-width: 200px;">
                                                <!-- <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Learn Vue.js</strong></a></h5> -->
                                                <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Learn
                                                        Vue.js</a></h4>
                                                <p class="text-black-70">Let’s start with a quick tour of Vue’s data
                                                    binding features.</p>
                                                <div class="d-flex align-items-end">
                                                    <div class="d-flex flex flex-column mr-3">
                                                        <div class="d-flex align-items-center py-1 border-bottom">
                                                            <small class="text-black-70 mr-2">&dollar;1,230/mo</small>
                                                            <small class="text-black-50">34 SALES</small>
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
                                                <img src="assets/images/nodejs.png" alt="Card image cap"
                                                    class="avatar-img rounded">
                                            </a>
                                            <div class="flex" style="min-width: 200px;">
                                                <!-- <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Npm &amp; Gulp Advanced Workflow</strong></a></h5> -->
                                                <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Npm
                                                        &amp; Gulp Advanced Workflow</a></h4>
                                                <p class="text-black-70">Learn the basics of Github and become a power
                                                    Github developer.</p>
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
                                                <!-- <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Github Webhooks for Beginners</strong></a></h5> -->
                                                <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Github
                                                        Webhooks for Beginners</a></h4>
                                                <p class="text-black-70">Developing static website with fast and
                                                    advanced gulp setup.</p>
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
                                                <!-- <h5 class="card-title text-base m-0"><a href="instructor-course-edit.html"><strong>Gulp &amp; Slush Workflows</strong></a></h5> -->
                                                <h4 class="card-title mb-1"><a href="instructor-course-edit.html">Gulp
                                                        &amp; Slush Workflows</a></h4>
                                                <p class="text-black-70">Let’s start with a quick tour of Vue’s data
                                                    binding features.</p>
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
                            </div>

                        </div>
                        <!-- Pagination -->
                        <ul class="pagination justify-content-center pagination-sm">
                            <li class="page-item disabled">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true" class="material-icons">chevron_left</span>
                                    <span>Prev</span>
                                </a>
                            </li>
                            <li class="page-item active">
                                <a class="page-link" href="#" aria-label="1">
                                    <span>1</span>
                                </a>
                            </li>
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="1">
                                    <span>2</span>
                                </a>
                            </li>
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span>Next</span>
                                    <span aria-hidden="true" class="material-icons">chevron_right</span>
                                </a>
                            </li>
                        </ul>

                    </div>

                </div>





                <div class="mdk-drawer js-mdk-drawer" id="default-drawer">
                    <div class="mdk-drawer__content ">
                        <div class="sidebar sidebar-left sidebar-dark bg-dark o-hidden" data-perfect-scrollbar>
                            <div class="sidebar-p-y">
                                <ul class="sidebar-menu sm-active-button-bg">
                                    <li class="sidebar-menu-item active">
                                        <a class="sidebar-menu-button" href="student-dashboard.html">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">account_box</i>
                                            Student
                                        </a>
                                    </li>
                                </ul>
                                <!-- Account menu -->
                                <div class="sidebar-heading">Account</div>
                                <ul class="sidebar-menu">
                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button sidebar-js-collapse" data-toggle="collapse"
                                            href="#account_menu">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">person_outline</i>
                                            Account
                                            <span class="ml-auto sidebar-menu-toggle-icon"></span>
                                        </a>
                                        <ul class="sidebar-submenu sm-indent collapse" id="account_menu">
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="guest-login.html">
                                                    <span class="sidebar-menu-text">Login</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="guest-signup.html">
                                                    <span class="sidebar-menu-text">Sign Up</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="guest-forgot-password.html">
                                                    <span class="sidebar-menu-text">Forgot Password</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-account-edit.html">
                                                    <span class="sidebar-menu-text">Edit Account</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-account-edit-basic.html">
                                                    <span class="sidebar-menu-text">Basic Information</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-account-edit-profile.html">
                                                    <span class="sidebar-menu-text">Profile &amp; Privacy</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button"
                                                    href="student-account-billing-subscription.html">
                                                    <span class="sidebar-menu-text">Subscription</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button"
                                                    href="student-account-billing-upgrade.html">
                                                    <span class="sidebar-menu-text">Upgrade Account</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button"
                                                    href="student-account-billing-payment-information.html">
                                                    <span class="sidebar-menu-text">Payment Information</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-billing.html">
                                                    <span class="sidebar-menu-text">Payment History</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-invoice.html">
                                                    <span class="sidebar-menu-text">Student Invoice</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="instructor-invoice.html">
                                                    <span class="sidebar-menu-text">Instructor Invoice</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="instructor-edit-invoice.html">
                                                    <span class="sidebar-menu-text">Edit Invoice</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" data-toggle="collapse" href="#messages_menu">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">comment</i>
                                            Messages
                                            <span class="ml-auto sidebar-menu-toggle-icon"></span>
                                        </a>
                                        <ul class="sidebar-submenu sm-indent collapse" id="messages_menu">
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-messages.html">
                                                    <span class="sidebar-menu-text">Conversation</span>
                                                    <span
                                                        class="sidebar-menu-badge badge badge-primary badge-notifications ml-auto">2</span>
                                                </a>
                                            </li>
                                            <li class="sidebar-menu-item">
                                                <a class="sidebar-menu-button" href="student-messages-2.html">
                                                    <span class="sidebar-menu-text">Conversation - 2</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                                <div class="sidebar-heading">Student</div>
                                <ul class="sidebar-menu sm-active-button-bg">
                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="student-browse-courses.html">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">search</i>
                                            Search Course
                                        </a>
                                    </li>
                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="student-view-course.html">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">import_contacts</i>
                                            View Course
                                        </a>
                                    </li>

                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="student-my-courses.html">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">school</i>
                                            My Courses
                                        </a>
                                    </li>

                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="student-help-center.html">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">live_help</i>
                                            Get Help
                                        </a>
                                    </li>
                                    <li class="sidebar-menu-item">
                                        <a class="sidebar-menu-button" href="guest-login.html">
                                            <i
                                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">lock_open</i>
                                            Logout
                                        </a>
                                    </li>
                                </ul>

                                <!-- App Settings FAB -->

                            </div>

                            <!-- jQuery -->
                            <script src="assets/vendor/jquery.min.js"></script>

                            <!-- Bootstrap -->
                            <script src="assets/vendor/popper.min.js"></script>
                            <script src="assets/vendor/bootstrap.min.js"></script>

                            <!-- Perfect Scrollbar -->
                            <script src="assets/vendor/perfect-scrollbar.min.js"></script>

                            <!-- MDK -->
                            <script src="assets/vendor/dom-factory.js"></script>
                            <script src="assets/vendor/material-design-kit.js"></script>

                            <!-- App JS -->
                            <script src="assets/js/app.js"></script>

                            <!-- Highlight.js -->
                            <script src="assets/js/hljs.js"></script>

                            <!-- App Settings (safe to remove) -->
                            <script src="assets/js/app-settings.js"></script>

                            <!-- Global Settings -->
                            <script src="assets/js/settings.js"></script>

                            <!-- Moment.js -->
                            <script src="assets/vendor/moment.min.js"></script>
                            <script src="assets/vendor/moment-range.js"></script>

                            <!-- Chart.js -->
                            <script src="assets/vendor/Chart.min.js"></script>
                            <script src="assets/js/chartjs.js"></script>

                            <!-- Student Dashboard Page JS -->
                            <!-- <script src="assets/js/chartjs-rounded-bar.js"></script> -->
                            <script src="assets/js/page.student-dashboard.js"></script>

</body>


<!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:01 GMT -->

</html>