<div class="mdk-drawer js-mdk-drawer" id="default-drawer">
    <div class="mdk-drawer__content ">
        <div class="sidebar sidebar-left sidebar-dark bg-dark o-hidden" data-perfect-scrollbar>
            <div class="sidebar-p-y">
                <ul class="sidebar-menu sm-active-button-bg">
                    <li class="sidebar-menu-item active">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/mentor/home">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">home</i>
                            Home
                        </a>
                    </li>
                </ul>
                <!-- Account menu -->


                <div class="sidebar-heading">Mentor</div>
                <ul class="sidebar-menu sm-active-button-bg">
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/mentor/mentor_request.jsp">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">search</i>
                            Find Mentee
                        </a>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/listCourse">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">import_contacts</i>
                            Courses
                        </a>
                    </li>
                    
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/mentorAuthen">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">credit_card</i>
                            Mentor Authentication
                        </a>
                    </li>

                </ul>
                <div class="sidebar-heading">Account</div>
                <ul class="sidebar-menu">
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button sidebar-js-collapse"
                           data-toggle="collapse" href="#account_menu">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">person_outline</i>
                            Your Account
                            <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse" id="account_menu">
                            <li class="sidebar-menu-item">
                                <a class="sidebar-menu-button"
                                   href="${pageContext.request.contextPath}/user/mentor/editprofile">
                                    <span class="sidebar-menu-text">Edit Account</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item">
                                <a class="sidebar-menu-button"
                                   href="${pageContext.request.contextPath}/user/mentor/updatecv">
                                    <span class="sidebar-menu-text">Update CV</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item">
                                <a class="sidebar-menu-button"
                                   href="${pageContext.request.contextPath}/user/mentor/profile">
                                    <span class="sidebar-menu-text">Public Profile</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item">
                                <a class="sidebar-menu-button"
                                   href="${pageContext.request.contextPath}/changepassword">
                                    <span class="sidebar-menu-text">Change Password</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item">
                                <a class="sidebar-menu-button"
                                   href="${pageContext.request.contextPath}/user">
                                    <span class="sidebar-menu-text">Contract</span>
                                </a>
                            </li>




                        </ul>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"
                           href="${pageContext.request.contextPath}/conversation">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">comment</i>
                            Messages
                        </a>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button"  href="${pageContext.request.contextPath}/signout">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">lock_open</i>
                            Logout
                        </a>
                    </li>
                </ul>
                <!-- App Settings FAB -->
            </div>
        </div>
    </div>
</div>
<!--End Of Navbar-->