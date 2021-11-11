<%-- 
    Document   : mentor_header
    Created on : Sep 30, 2021, 2:03:39 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="header"
     data-fixed
     class="mdk-header js-mdk-header mb-0">
    <div class="mdk-header__content">

        <!-- Navbar -->
        <nav id="default-navbar"
             class="navbar navbar-expand navbar-dark bg-primary m-0">
            <div class="container-fluid">
                <!-- Toggle sidebar -->
                <button class="navbar-toggler d-block"
                        data-toggle="sidebar"
                        type="button">
                    <span class="material-icons">menu</span>
                </button>

                <!-- Brand -->
                <a href="${pageContext.request.contextPath}/mentor/home" class="navbar-brand">
                <img src="${pageContext.request.contextPath}/user/assets/images/logo/logo.svg" class="mr-2pt" style="width: 90px;height: 50px" alt="LearnPlus" />
<!--            <span class="d-none d-xs-md-block">LearnPlus</span>-->
            </a>


                


                <div class="flex"></div>

                <!-- Menu -->
               

                <!-- Menu -->
                <ul class="nav navbar-nav flex-nowrap">

                   
                    <!-- User dropdown -->
                    <li class="nav-item dropdown ml-1 ml-md-3">
                        <a class="nav-link dropdown-toggle"
                           data-toggle="dropdown"
                           href="#"
                           role="button"><img src="${user.imgAvt}"
                                           alt="Avatar"
                                           class="rounded-circle"
                                           width="40">
                        </a>
                        <div class="dropdown-menu dropdown-menu-right">
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/user/mentor/editprofile">
                                <i class="material-icons">edit</i> Edit Account
                            </a>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/user/mentor/profile">
                                <i class="material-icons">person</i> Public Profile
                            </a>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/signout">
                                <i class="material-icons">lock</i> Logout
                            </a>
                        </div>
                    </li>
                    <!-- // END User dropdown -->
                </ul>
            </div>
        </nav>
        <!-- // END Navbar -->

    </div>
</div>