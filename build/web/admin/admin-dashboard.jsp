<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Happy Happy </title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome Icons -->
        <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
        <!-- IonIcons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
    </head>
    <!--
    `body` tag options:
      Apply one or more of the following classes to to the body tag
      to get the desired effect
      * sidebar-collapse
      * sidebar-mini
    -->
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <!-- Navbar -->
          
            <!-- /.navbar -->

            <!-- Main Sidebar Container -->
            <jsp:include page="admin-header.jsp"/>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0">Admin Dashboard</h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/admin/home">Home</a></li>
                                    <li class="breadcrumb-item active">Admin Dashboard</li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <div class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="card">
                                    <div class="card-header border-0">
                                        <div class="d-flex justify-content-between">
                                            <h3 class="card-title">New users</h3>
                                            <!--<a href="javascript:void(0);">View Report</a>-->
                                        </div>
                                    </div>
                                    <div class="card-body">
                                        <div class="d-flex">
                                            <p class="d-flex flex-column">
                                                <span id="num-user" class="text-bold text-lg"></span>
                                                <span >New users last 7 days</span>
                                            </p>
                                            <p class="ml-auto d-flex flex-column text-right">
                                                <span id="text-percent" class="text-success">
                                                    <i class="fas fa-arrow-up"></i> <span id="percent">12.5</span>%
                                                </span>
                                                <span class="text-muted">Since last 7 days</span>
                                            </p>
                                        </div>
                                        <!-- /.d-flex -->

                                        <div class="position-relative mb-4">
                                            <canvas id="visitors-chart" height="200"></canvas>
                                        </div>
                                        <input hidden="" type="text" id="lastWeek" value="${requestScope.lastWeekUser}"/>
                                        <input hidden="" type="text" id="thisWeek" value="${requestScope.thisWeekUser}"/>
                                        <div class="d-flex flex-row justify-content-end">
                                            <span class="mr-2">
                                                <i class="fas fa-square text-primary"></i> Last 7 days
                                            </span>

                                            <span>
                                                <i class="fas fa-square text-gray"></i> Last 14 days
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <!-- /.card -->

                                
                                <!-- /.card -->
                            </div>
                            <!-- /.col-md-6 -->
                            <div class="col-lg-6">
                                 <div class="card">
                                    <div class="card-header border-0">
                                        <h3 class="card-title">Products</h3>
                                        <div class="card-tools">
                                            <a href="#" class="btn btn-tool btn-sm">
                                                <i class="fas fa-download"></i>
                                            </a>
                                            <a href="#" class="btn btn-tool btn-sm">
                                                <i class="fas fa-bars"></i>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="card-body table-responsive p-0">
                                        <table class="table table-striped table-valign-middle">
                                            <thead>
                                                <tr>
                                                    <th>Product</th>
                                                    <th>Price</th>
                                                    <th>Sales</th>
                                                    <th>More</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <img src="dist/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2">
                                                        Some Product
                                                    </td>
                                                    <td>$13 USD</td>
                                                    <td>
                                                        <small class="text-success mr-1">
                                                            <i class="fas fa-arrow-up"></i>
                                                            12%
                                                        </small>
                                                        12,000 Sold
                                                    </td>
                                                    <td>
                                                        <a href="#" class="text-muted">
                                                            <i class="fas fa-search"></i>
                                                        </a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <img src="dist/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2">
                                                        Another Product
                                                    </td>
                                                    <td>$29 USD</td>
                                                    <td>
                                                        <small class="text-warning mr-1">
                                                            <i class="fas fa-arrow-down"></i>
                                                            0.5%
                                                        </small>
                                                        123,234 Sold
                                                    </td>
                                                    <td>
                                                        <a href="#" class="text-muted">
                                                            <i class="fas fa-search"></i>
                                                        </a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <img src="dist/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2">
                                                        Amazing Product
                                                    </td>
                                                    <td>$1,230 USD</td>
                                                    <td>
                                                        <small class="text-danger mr-1">
                                                            <i class="fas fa-arrow-down"></i>
                                                            3%
                                                        </small>
                                                        198 Sold
                                                    </td>
                                                    <td>
                                                        <a href="#" class="text-muted">
                                                            <i class="fas fa-search"></i>
                                                        </a>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <img src="dist/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2">
                                                        Perfect Item
                                                        <span class="badge bg-danger">NEW</span>
                                                    </td>
                                                    <td>$199 USD</td>
                                                    <td>
                                                        <small class="text-success mr-1">
                                                            <i class="fas fa-arrow-up"></i>
                                                            63%
                                                        </small>
                                                        87 Sold
                                                    </td>
                                                    <td>
                                                        <a href="#" class="text-muted">
                                                            <i class="fas fa-search"></i>
                                                        </a>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <!-- /.card -->
                            </div>
                               
                                <!-- /.card -->

                               
                            </div>
                            <!-- /.col-md-6 -->
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
            <jsp:include page="admin-footer.jsp"/>
        </div>
        <!-- ./wrapper -->

        <!-- REQUIRED SCRIPTS -->

        <!-- jQuery -->
        <script src="assets/plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- AdminLTE -->
        <script src="assets/dist/js/adminlte.js"></script>

        <!-- OPTIONAL SCRIPTS -->
        <script src="assets/plugins/chart.js/Chart.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="assets/dist/js/demo.js"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="assets/dist/js/pages/dashboard3.js"></script>
    </body>
</html>