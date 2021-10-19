<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en"
      dir="ltr">


    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:28 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Sign In</title>

        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
        <meta name="robots"
              content="noindex">

        <!-- Custom Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap"
              rel="stylesheet">

        <!-- Perfect Scrollbar -->
        <link type="text/css"
              href="user/assets/vendor/perfect-scrollbar.css"
              rel="stylesheet">

        <!-- Material Design Icons -->
        <link type="text/css"
              href="user/assets/css/material-icons.css"
              rel="stylesheet">

        <!-- Font Awesome Icons -->
        <link type="text/css"
              href="user/assets/css/fontawesome.css"
              rel="stylesheet">

        <!-- Preloader -->
        <link type="text/css"
              href="user/assets/vendor/spinkit.css"
              rel="stylesheet">

        <!-- App CSS -->
        <link type="text/css"
              href="user/assets/css/app.css"
              rel="stylesheet">
        <style>
            body{
                background-image: url('user/assets/images/background.jpg') ;

            }
            .logo{
                width: 100%;
                height: 100%
            }


        </style>
    </head>

    <body class="login">
        <div class="d-flex align-items-center"
             style="min-height: 100vh">
            <div class="col-sm-8 col-md-6 col-lg-4 mx-auto"
                 style="min-width: 300px;">
                <% 
                    if(request.getAttribute("mess")!=null){
                %>
                <script> alert("<%= request.getAttribute("mess")%>")</script>
                <%
                  }
                %>

                <div class="card navbar-shadow form" style="border-radius: 20px;">
                    <div class="text-center mt-5 mb-1">
                        <div class="avatar avatar-lg">
                            <img class="logo"  src="user/assets/images/logo/logo.svg"

                                 alt="LearnPlus" />
                        </div>
                    </div>

                    <div class="card-header text-center">
                        <h4 class="card-title">Sign In</h4>
                        <p class="card-subtitle">Access your account</p>
                    </div>

                    <div class="card-body">

                        <form action="signin" method="post">
                            <div class="form-group">
                                <label class="form-label"
                                       for="email">Your email address:<span style="color:red">*</span></label>
                                <div class="input-group input-group-merge">
                                    <input id="email"
                                           type="email"
                                           name="email"
                                           required=""
                                           class="form-control form-control-prepended"
                                           placeholder="Your email address">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">
                                            <span class="far fa-envelope"></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="form-label"
                                       for="password">Your password:<span style="color:red">*</span></label>
                                <div class="input-group input-group-merge">
                                    <input id="password"
                                           type="password"
                                           name="password"
                                           required=""
                                           class="form-control form-control-prepended"
                                           placeholder="Your password">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">
                                            <span class="far fa-key"></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group " style="text-align: center;" >
                                <button type="submit " style="border-radius: 10px; background-color: #94B85E; width: 30%; "
                                        class="btn btn-primary btn-block">
                                    Sign In
                                </button>
                            </div>
                            <div class="text-center">
                                <a href="confirm"
                                   class="text-black-70"
                                   style="text-decoration: underline;">Forgot Password?</a>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer text-center text-black-50">
                        Not yet an user? <a style="color:#94B85E;" href="signup">Sign Up</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- jQuery -->
        <script src="user/assets/vendor/jquery.min.js"></script>

        <!-- Bootstrap -->
        <script src="user/assets/vendor/popper.min.js"></script>
        <script src="user/assets/vendor/bootstrap.min.js"></script>

        <!-- Perfect Scrollbar -->
        <script src="user/assets/vendor/perfect-scrollbar.min.js"></script>

        <!-- MDK -->
        <script src="user/assets/vendor/dom-factory.js"></script>
        <script src="user/assets/vendor/material-design-kit.js"></script>

        <!-- App JS -->
        <script src="user/assets/js/app.js"></script>

        <!-- Highlight.js -->
        <script src="user/assets/js/hljs.js"></script>

        <!-- App Settings (safe to remove) -->
        <script src="user/assets/js/app-settings.js"></script>

    </body>


    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:29 GMT -->
</html>