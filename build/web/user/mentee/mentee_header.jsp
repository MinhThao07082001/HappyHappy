<%-- 
   Document   : student_header
   Created on : Sep 30, 2021, 1:56:05 AM
   Author     : Admin
   --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <a href="${pageContext.request.contextPath}/mentee/home" class="navbar-brand">
                <img src="${pageContext.request.contextPath}/user/assets/images/logo/logo.svg" class="mr-2pt" style="width: 90px;height: 50px" alt="LearnPlus" />
<!--            <span class="d-none d-xs-md-block">LearnPlus</span>-->
            </a>
            <!-- Search -->
            
            
            <!-- // END Search -->
            <div class="flex"></div>
            <!-- Menu -->
            <ul class="nav navbar-nav flex-nowrap d-none d-lg-flex">
         
               
            </ul>
            <!-- Menu -->
            <ul class="nav navbar-nav flex-nowrap">
               
            </ul>
               <!-- Notifications dropdown -->
             
              
               <li class="nav-item dropdown ml-1 ml-md-3">
                  <a class="nav-link dropdown-toggle"
                     data-toggle="dropdown"
                     href="#"
                     role="button"><img src="${sessionScope.user.img}"
                     alt="Avatar"
                     class="rounded-circle"
                     width="40"></a>
                  <div class="dropdown-menu dropdown-menu-right">
                     <a class="dropdown-item"
                        href="${pageContext.request.contextPath}/user/mentee/editprofile">
                     <i class="material-icons">edit</i> Edit Account
                     </a>
                     <a class="dropdown-item"
                        href="${pageContext.request.contextPath}/user/student-profile.html">
                     <i class="material-icons">person</i> Public Profile
                     </a>
                     <a class="dropdown-item"
                        href="${pageContext.request.contextPath}/signout">
                     <i class="material-icons">lock</i> Logout
                     </a>
                  </div>
               </li>
               <!-- // END User dropdown -->
            
            <!-- // END Menu -->
         </div>
      </nav>
      <!-- // END Navbar -->
   </div>
</div>