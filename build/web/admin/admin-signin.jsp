<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en"
      dir="ltr">


    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:28 GMT -->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Happy Happy Admin</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
    </head>
        <style>
            body{
                background-image: url('${pageContext.request.contextPath}/user/assets/images/background.jpg') ;

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
                            <img src="${pageContext.request.contextPath}/user/assets/images/logo/logo.svg" class="mr-2pt" style="width: 90px;height: 50px" alt="LearnPlus" />

                              
                        </div>
                    </div>

                    <div class="card-header text-center">
                       
                        <p class="card-subtitle" style="color: gray">Access admin account</p>
                    </div>

                    <div class="card-body">

                        <form class="form-horizontal" action="signin" method="post">
                                        <div class="card-body">
                                            <div class="form-group row">
                                                <label for="inputEmail3" class="col-md-6 col-form-label" style="color: grey">Username</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="inputEmail3" placeholder="Username" name="username">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label for="inputPassword3" class="col-md-6 col-form-label" style="color: grey">Password</label>
                                                <div class="col-sm-10">
                                                    <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="password">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="offset-sm-2 col-sm-10">
                                                    <div class="form-check">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- /.card-body -->
                                        <div class="card-footer">
                                            <button type="submit" class="btn btn-info" style="background-color:#94B85E">Sign in</button>
                                            <button type="submit" class="btn btn-default float-right" style="background-color: #94B85E">Cancel</button>
                                        </div>
                                        <!-- /.card-footer -->
                                    </form>
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
        <script src="assets/plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- bs-custom-file-input -->
        <script src="assets/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
        <!-- AdminLTE App -->
        <script src="assets/dist/js/adminlte.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="assets/dist/js/demo.js"></script>
        <!-- Page specific script -->
        <script>
            $(function () {
                bsCustomFileInput.init();
            });
        </script>

    </body>


    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:29 GMT -->
</html>