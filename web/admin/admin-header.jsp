<nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
        </li>
        <li class="nav-item d-none d-sm-inline-block">
            <a href="home" class="nav-link">Home</a>
        </li>
        <li class="nav-item d-none d-sm-inline-block">
            <a href="#" class="nav-link">Contact</a>
        </li>
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
        <!-- Navbar Search -->
        <li class="nav-item">
            <a class="nav-link" data-widget="navbar-search" href="#" role="button">
                <i class="fas fa-search"></i>
            </a>
            <div class="navbar-search-block" >
                <form class="form-inline" action="search" method="GET">
                    <div class="input-group input-group-sm">

                        <input class="form-control form-control-navbar" name="searchString" type="text" placeholder="Search" aria-label="Search">

                        <div class="input-group-append">
                            <button class="btn btn-navbar" type="submit">
                                <i class="fas fa-search"></i>
                            </button>
                            <button class="btn btn-navbar" type="button" data-widget="navbar-search">
                                <i class="fas fa-times"></i>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </li>

        <!-- Messages Dropdown Menu -->
        <li class="nav-item dropdown">
            <a class="nav-link" data-toggle="dropdown" href="#">
                <i class="far fa-comments"></i>
                <span class="badge badge-danger navbar-badge">3</span>
            </a>
            <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                <a href="#" class="dropdown-item">
                    <!-- Message Start -->
                    <div class="media">
                        <img src="assets/dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
                        <div class="media-body">
                            <h3 class="dropdown-item-title">
                                Brad Diesel
                                <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                            </h3>
                            <p class="text-sm">Call me whenever you can...</p>
                            <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                        </div>
                    </div>
                    <!-- Message End -->
                </a>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item">
                    <!-- Message Start -->
                    <div class="media">
                        <img src="assets/dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                        <div class="media-body">
                            <h3 class="dropdown-item-title">
                                John Pierce
                                <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                            </h3>
                            <p class="text-sm">I got your message bro</p>
                            <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                        </div>
                    </div>
                    <!-- Message End -->
                </a>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item">
                    <!-- Message Start -->
                    <div class="media">
                        <img src="assets/dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
                        <div class="media-body">
                            <h3 class="dropdown-item-title">
                                Nora Silvester
                                <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                            </h3>
                            <p class="text-sm">The subject goes here</p>
                            <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                        </div>
                    </div>
                    <!-- Message End -->
                </a>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
            </div>
        </li>
        <!-- Notifications Dropdown Menu -->
        <li class="nav-item dropdown">
            <a class="nav-link" data-toggle="dropdown" href="#">
                <i class="far fa-bell"></i>
                <span class="badge badge-warning navbar-badge">15</span>
            </a>
            <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                <span class="dropdown-item dropdown-header">15 Notifications</span>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item">
                    <i class="fas fa-envelope mr-2"></i> 4 new messages
                    <span class="float-right text-muted text-sm">3 mins</span>
                </a>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item">
                    <i class="fas fa-users mr-2"></i> 8 friend requests
                    <span class="float-right text-muted text-sm">12 hours</span>
                </a>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item">
                    <i class="fas fa-file mr-2"></i> 3 new reports
                    <span class="float-right text-muted text-sm">2 days</span>
                </a>
                <div class="dropdown-divider"></div>
                <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
            </div>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-widget="fullscreen" href="#" role="button">
                <i class="fas fa-expand-arrows-alt"></i>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
                <i class="fas fa-th-large"></i>
            </a>
        </li>
    </ul>
</nav>
<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="home" class="brand-link">
        <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
        <span class="brand-text font-weight-light">AdminLTE 3</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
                <img src="data:image/jpeg;base64,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" class="img-circle elevation-2" alt="User Image">

            </div>
            <div class="info">
                <a href="#" class="d-block">${sessionScope.admin.username}</a>
            </div>
        </div>

        <!-- SidebarSearch Form -->
        <div class="form-inline">
            <div class="input-group" data-widget="sidebar-search">
                <input class="form-control form-control-sidebar" type="search" placeholder="Search" aria-label="Search">
                <div class="input-group-append">
                    <button class="btn btn-sidebar">
                        <i class="fas fa-search fa-fw"></i>
                    </button>
                </div>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                <!-- Add icons to the links using the .nav-icon class
                     with font-awesome or any other icon font library -->
                <li class="nav-item menu-open">
                    <a href="home" class="nav-link active">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            Dashboard
                        </p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-table"></i>
                        <p>
                            User
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="../admin/mentor" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Mentor</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="../admin/mentee" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Mentee</p>
                            </a>
                        </li>
                    </ul>

                </li>
                <li class="nav-item">
                    <a href="pages/widgets.html" class="nav-link">
                        <i class="nav-icon fas fa-th"></i>
                        <p>
                            Widgets
                            <span class="right badge badge-danger">New</span>
                        </p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-copy"></i>
                        <p>
                            Layout Options
                            <i class="fas fa-angle-left right"></i>
                            <span class="badge badge-info right">6</span>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/layout/top-nav.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Top Navigation</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/top-nav-sidebar.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Top Navigation + Sidebar</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/boxed.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Boxed</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/fixed-sidebar.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Fixed Sidebar</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/fixed-sidebar-custom.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Fixed Sidebar <small>+ Custom Area</small></p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/fixed-topnav.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Fixed Navbar</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/fixed-footer.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Fixed Footer</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/layout/collapsed-sidebar.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Collapsed Sidebar</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            Charts
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/charts/chartjs.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>ChartJS</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/charts/flot.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Flot</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/charts/inline.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Inline</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/charts/uplot.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>uPlot</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-tree"></i>
                        <p>
                            UI Elements
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/UI/general.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>General</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/icons.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Icons</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/buttons.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Buttons</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/sliders.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Sliders</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/modals.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Modals & Alerts</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/navbar.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Navbar & Tabs</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/timeline.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Timeline</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/UI/ribbons.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Ribbons</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-edit"></i>
                        <p>
                            Forms
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/forms/general.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>General Elements</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/forms/advanced.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Advanced Elements</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/forms/editors.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Editors</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/forms/validation.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Validation</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-table"></i>
                        <p>
                            Tables
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/tables/simple.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Simple Tables</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/tables/data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>DataTables</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/tables/jsgrid.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>jsGrid</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-header">EXAMPLES</li>
                <li class="nav-item">
                    <a href="pages/calendar.html" class="nav-link">
                        <i class="nav-icon far fa-calendar-alt"></i>
                        <p>
                            Calendar
                            <span class="badge badge-info right">2</span>
                        </p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="pages/gallery.html" class="nav-link">
                        <i class="nav-icon far fa-image"></i>
                        <p>
                            Gallery
                        </p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="pages/kanban.html" class="nav-link">
                        <i class="nav-icon fas fa-columns"></i>
                        <p>
                            Kanban Board
                        </p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon far fa-envelope"></i>
                        <p>
                            Mailbox
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/mailbox/mailbox.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Inbox</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/mailbox/compose.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Compose</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/mailbox/read-mail.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Read</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-book"></i>
                        <p>
                            Pages
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/examples/invoice.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Invoice</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/profile.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Profile</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/e-commerce.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>E-commerce</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/projects.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Projects</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/project-add.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Project Add</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/project-edit.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Project Edit</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/project-detail.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Project Detail</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/contacts.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Contacts</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/faq.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>FAQ</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/contact-us.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Contact us</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon far fa-plus-square"></i>
                        <p>
                            Extras
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>
                                    Login & Register v1
                                    <i class="fas fa-angle-left right"></i>
                                </p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="pages/examples/login.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Login v1</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="pages/examples/register.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Register v1</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="pages/examples/forgot-password.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Forgot Password v1</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="pages/examples/recover-password.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Recover Password v1</p>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>
                                    Login & Register v2
                                    <i class="fas fa-angle-left right"></i>
                                </p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="pages/examples/login-v2.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Login v2</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="pages/examples/register-v2.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Register v2</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="pages/examples/forgot-password-v2.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Forgot Password v2</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="pages/examples/recover-password-v2.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Recover Password v2</p>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/lockscreen.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Lockscreen</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/legacy-user-menu.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Legacy User Menu</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/language-menu.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Language Menu</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/404.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Error 404</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/500.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Error 500</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/pace.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Pace</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/examples/blank.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Blank Page</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="starter.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Starter Page</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-search"></i>
                        <p>
                            Search
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/search/simple.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Simple Search</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/search/enhanced.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Enhanced</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-header">MISCELLANEOUS</li>
                <li class="nav-item">
                    <a href="iframe.html" class="nav-link">
                        <i class="nav-icon fas fa-ellipsis-h"></i>
                        <p>Tabbed IFrame Plugin</p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="https://adminlte.io/docs/3.1/" class="nav-link">
                        <i class="nav-icon fas fa-file"></i>
                        <p>Documentation</p>
                    </a>
                </li>
                <li class="nav-header">MULTI LEVEL EXAMPLE</li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="fas fa-circle nav-icon"></i>
                        <p>Level 1</p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-circle"></i>
                        <p>
                            Level 1
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Level 2</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>
                                    Level 2
                                    <i class="right fas fa-angle-left"></i>
                                </p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="#" class="nav-link">
                                        <i class="far fa-dot-circle nav-icon"></i>
                                        <p>Level 3</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="#" class="nav-link">
                                        <i class="far fa-dot-circle nav-icon"></i>
                                        <p>Level 3</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="#" class="nav-link">
                                        <i class="far fa-dot-circle nav-icon"></i>
                                        <p>Level 3</p>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Level 2</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="fas fa-circle nav-icon"></i>
                        <p>Level 1</p>
                    </a>
                </li>
                <li class="nav-header">LABELS</li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon far fa-circle text-danger"></i>
                        <p class="text">Important</p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon far fa-circle text-warning"></i>
                        <p>Warning</p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon far fa-circle text-info"></i>
                        <p>Informational</p>
                    </a>
                </li>
            </ul>
        </nav>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
</aside>