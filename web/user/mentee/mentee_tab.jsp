<div class="mdk-drawer js-mdk-drawer" id="default-drawer">
    <div class="mdk-drawer__content ">
        <div class="sidebar sidebar-left sidebar-dark bg-dark o-hidden" data-perfect-scrollbar>
            <div class="sidebar-p-y">
                <ul class="sidebar-menu sm-active-button-bg">
                    <li class="sidebar-menu-item active">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/student-dashboard.html">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">home</i>
                            Home
                        </a>
                    </li>
                </ul>
                <!-- Account menu -->


                <div class="sidebar-heading">Mentee</div>
                <ul class="sidebar-menu sm-active-button-bg">
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/mentee/mentee_request.jsp">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">search</i>
                            Find Mentor
                        </a>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/student-view-course.html">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">import_contacts</i>
                            Courses
                        </a>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/student-my-courses.html">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">schedule</i>
                            My Schedule
                        </a>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/student-help-center.html">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">credit_card</i>
                            Payment
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
                                   href="${pageContext.request.contextPath}/user/mentee/editprofile">
                                    <span class="sidebar-menu-text">Edit Account</span>
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
                        <a class="sidebar-menu-button" data-toggle="collapse"
                           href="#messages_menu">
                            <i
                                class="sidebar-menu-icon sidebar-menu-icon--left material-icons">comment</i>
                            Messages
                            <span class="ml-auto sidebar-menu-toggle-icon"></span>
                        </a>
                        <ul class="sidebar-submenu sm-indent collapse" id="messages_menu">
                            <li class="sidebar-menu-item">
                                <a class="sidebar-menu-button" href="${pageContext.request.contextPath}/user/student-messages.html">
                                    <span class="sidebar-menu-text">Conversation</span>
                                    <span
                                        class="sidebar-menu-badge badge badge-primary badge-notifications ml-auto">2</span>
                                </a>
                            </li>
                        </ul>
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