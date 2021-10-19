<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AdminLTE 3 | General Form Elements</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <!-- Navbar -->

            <!-- /.navbar -->

            <!-- Main Sidebar Container -->

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper" style="margin: 0">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row">
                            <!-- left column -->
                            <div class="col-md-6">
                                <p style="color: red">${requestScope.error}</p>
                                <div class="card card-info">
                                    <div class="card-header">
                                        <h3 class="card-title">Horizontal Form</h3>
                                    </div>
                                    <!-- /.card-header -->
                                    <!-- form start -->

                                    <form class="form-horizontal" action="signin" method="post">
                                        <div class="card-body">
                                            <div class="form-group row">
                                                <label for="inputEmail3" class="col-sm-2 col-form-label">Username</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="inputEmail3" placeholder="Username" name="username">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
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
                                            <button type="submit" class="btn btn-info">Sign in</button>
                                            <button type="submit" class="btn btn-default float-right">Cancel</button>
                                        </div>
                                        <!-- /.card-footer -->
                                    </form>
                                </div>
                                <!-- /.card -->

                            </div>
                            <!--/.col (left) -->
                            <!-- right column -->

                            <!--/.col (right) -->
                        </div>
                        <!-- /.row -->
                    </div>
                </section>

                <!-- Main content -->

                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->

            <!-- Control Sidebar -->
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->

        <!-- jQuery -->
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
</html>
