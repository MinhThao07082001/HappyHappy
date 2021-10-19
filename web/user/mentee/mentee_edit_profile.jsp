<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en"
   dir="ltr">
   <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-account-edit.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->
   <head>
      <meta charset="utf-8">
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
      <meta http-equiv="X-UA-Compatible"
         content="IE=edge">
      <meta name="viewport"
         content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <title>Student - Edit account - Fixed layout</title>
      <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
      <meta name="robots"
         content="noindex">
      <!-- Custom Fonts -->
      <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap"
         rel="stylesheet">
      <!-- Perfect Scrollbar -->
      <link type="text/css"
         href="${pageContext.request.contextPath}/user/assets/vendor/perfect-scrollbar.css"
         rel="stylesheet">
      <!-- Material Design Icons -->
      <link type="text/css"
         href="${pageContext.request.contextPath}/user/assets/css/material-icons.css"
         rel="stylesheet">
      <!-- Font Awesome Icons -->
      <link type="text/css"
         href="${pageContext.request.contextPath}/user/assets/css/fontawesome.css"
         rel="stylesheet">
      <!-- Preloader -->
      <link type="text/css"
         href="${pageContext.request.contextPath}/user/assets/vendor/spinkit.css"
         rel="stylesheet">
      <!-- App CSS -->
      <link type="text/css"
         href="${pageContext.request.contextPath}/user/assets/css/app.css"
         rel="stylesheet">
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
      <jsp:include page="mentee_header.jsp"/>
      <!-- // END Header -->
      <!-- Header Layout Content -->
      <div class="mdk-header-layout__content">
         <div data-push
            data-responsive-width="992px"
            class="mdk-drawer-layout js-mdk-drawer-layout">
            <div class="mdk-drawer-layout__content page ">
               <div class="container-fluid page__container">
                  <ol class="breadcrumb">
                     <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/user/student-dashboard.html">Home</a></li>
                     <li class="breadcrumb-item active">Edit Account</li>
                  </ol>
                  <h1 class="h2">Edit Account</h1>
                  <div class="card">
                     <ul class="nav nav-tabs nav-tabs-card">
                        <li class="nav-item">
                           <a class="nav-link active"
                              href="#first"
                              data-toggle="tab">Account</a>
                        </li>
                        <li class="nav-item">
                           <a class="nav-link"
                              href="#second"
                              data-toggle="tab">Billing</a>
                        </li>
                     </ul>
                     <div class="tab-content card-body">
                        <div class="tab-pane active"
                           id="first">
                           <form action="editprofile" method="post"  enctype='multipart/form-data'
                              class="form-horizontal">
                              <div class="form-group row">
                                 <label for="avatar"
                                    class="col-sm-3 col-form-label form-label">Avatar</label>
                                 <div class="col-sm-9">
                                    <div class="media align-items-center">
                                       <div class="media-left">
                                          <div class="icon-block rounded">
                                             <img src="${user.img}" style="width: 50px; height: 50px" >
                                          </div>
                                       </div>
                                       <div class="media-body">
                                          <div class="custom-file"
                                             style="width: auto;">
                                             <input type="file"
                                                id="avatar"
                                                class="custom-file-input"
                                                name="imgAvt">
                                             <label for="avatar"
                                                class="custom-file-label">Choose file</label>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="name"
                                    class="col-sm-3 col-form-label form-label">Full Name</label>
                                 <div class="col-sm-8">
                                    <div class="row">
                                       <div class="col-md-6">
                                          <input id="name"
                                             type="text"
                                             class="form-control"
                                             value="${user.name}"
                                             name="name">
                                       </div>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="email"
                                    class="col-sm-3 col-form-label form-label">Email</label>
                                 <div class="col-sm-6 col-md-6">
                                    <div class="input-group">
                                       <div class="input-group-prepend">
                                          <div class="input-group-text">
                                             <i class="material-icons md-18 text-muted">mail</i>
                                          </div>
                                       </div>
                                       <input type="text"
                                          id="email"
                                          class="form-control"
                                          value="${user.email}"
                                          readonly>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="dob"
                                    class="col-sm-3 col-form-label form-label">D.O.B</label>
                                 <div class="col-sm-6 col-md-4">
                                    <div class="input-group">
                                       <div class="input-group-prepend">
                                          <div class="input-group-text">
                                             <i class="material-icons md-18 text-muted">language</i>
                                          </div>
                                       </div>
                                       <input id="dob" type="date" name="dob" max="${now}" class="form-control" value="${user.dob}">
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="address"
                                    class="col-sm-3 col-form-label form-label">Address</label>
                                 <div class="col-sm-6 col-md-4">
                                    <div class="input-group">
                                       <div class="input-group-prepend">
                                          <div class="input-group-text">
                                             <i class="material-icons md-18 home"></i>
                                          </div>
                                       </div>
                                       <input id="address" type="text" name="address" class="form-control" value="${user.address}">
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="phone"
                                    class="col-sm-3 col-form-label form-label">Phone</label>
                                 <div class="col-sm-6 col-md-4">
                                    <div class="input-group">
                                       <div class="input-group-prepend">
                                          <div class="input-group-text">
                                             <i class="material-icons md-18 phone"></i>
                                          </div>
                                       </div>
                                       <input id="phone" type="text" name="phone" class="form-control" value="${user.phone}" readonly>
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="description"
                                    class="col-sm-3 col-form-label form-label">description</label>
                                 <div class="col-sm-6 col-md-4">
                                    <div class="input-group">
                                       <div class="input-group-prepend">
                                          <div class="input-group-text">
                                             <i class="material-icons md-18 description"></i>
                                          </div>
                                       </div>
                                       <input id="description" type="text" name="description" class="form-control" value="${user.description}">
                                    </div>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <div class="col-sm-8 offset-sm-3">
                                    <div class="media align-items-center">
                                       <div class="media-left">
                                          <input type="submit" value="Save changes">
                                       </div>
                                       <div class="media-body pl-1">
                                          <div class="custom-control custom-checkbox">
                                             <input id="subscribe"
                                                type="checkbox"
                                                class="custom-control-input"
                                                checked>
                                             <label for="subscribe"
                                                class="custom-control-label">Subscribe to Newsletter</label>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </form>
                        </div>
                        <div class="tab-pane"
                           id="second">
                           <form action="#"
                              class="form-horizontal">
                              <div class="form-group row">
                                 <label for="name_on_invoice"
                                    class="col-sm-3 col-form-label form-label">Name on Invoice</label>
                                 <div class="col-sm-6 col-md-4">
                                    <input id="name_on_invoice"
                                       type="text"
                                       class="form-control"
                                       value="Adrian Demian">
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="billing_address"
                                    class="col-sm-3 col-form-label form-label">Address</label>
                                 <div class="col-sm-6 col-md-4">
                                    <input id="billing_address"
                                       type="text"
                                       class="form-control"
                                       value="Sunny Street, 21, Miami, Florida">
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <label for="billing_country"
                                    class="col-sm-3 col-form-label form-label">Country</label>
                                 <div class="col-sm-6 col-md-4">
                                    <select id="billing_country"
                                       class="custom-control custom-select form-control">
                                       <option value="1"
                                          selected>USA</option>
                                       <option value="2">India</option>
                                       <option value="3">United Kingdom</option>
                                    </select>
                                 </div>
                              </div>
                              <div class="form-group row">
                                 <div class="col-sm-6 col-md-4 offset-sm-3">
                                    <a href="#"
                                       class="btn btn-success"> Update Billing</a>
                                 </div>
                              </div>
                           </form>
                           <div class="card mt-2">
                              <div class="card-header">
                                 <div class="media align-items-center">
                                    <div class="media-body">
                                       <h4 class="card-title">Payment Info</h4>
                                    </div>
                                    <div class="media-right">
                                       <a href="#"
                                          class="btn btn-sm btn-outline-primary"><i class="material-icons">add</i></a>
                                    </div>
                                 </div>
                              </div>
                              <ul class="card-footer p-0 list-group list-group-fit">
                                 <li class="list-group-item active">
                                    <div class="media align-items-center">
                                       <div class="media-left">
                                          <span class="btn btn-primary btn-circle"><i class="material-icons">credit_card</i></span>
                                       </div>
                                       <div class="media-body">
                                          <p class="mb-0">**** **** **** 2422</p>
                                          <small>Updated on 12/02/2016</small>
                                       </div>
                                       <div class="media-right">
                                          <a href="#"
                                             class="btn btn-primary btn-sm">
                                          <i class="material-icons btn__icon--left">edit</i> EDIT
                                          </a>
                                       </div>
                                    </div>
                                 </li>
                                 <li class="list-group-item">
                                    <div class="media align-items-center">
                                       <div class="media-left">
                                          <span class="btn btn-white btn-circle"><i class="material-icons">credit_card</i></span>
                                       </div>
                                       <div class="media-body">
                                          <p class="mb-0">**** **** **** 6321</p>
                                          <small class="text-muted">Updated on 11/01/2016</small>
                                       </div>
                                       <div class="media-right">
                                          <a href="#"
                                             class="btn btn-white btn-sm">
                                          <i class="material-icons btn__icon--left">edit</i> EDIT
                                          </a>
                                       </div>
                                    </div>
                                 </li>
                              </ul>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
            <!--Nav Tab-->
            <jsp:include page="mentee_tab.jsp"/>
            <!--End Of Nab Tab-->
         </div>
         <!-- App Settings FAB -->
<!--         <div id="app-settings">
            <app-settings layout-active="default"
               :layout-location="{
               'fixed': 'fixed-student-account-edit.html',
               'default': 'student-account-edit.html'
               }"
               sidebar-variant="bg-transparent border-0"></app-settings>
         </div>-->
      </div>
      </div>
      <!-- jQuery -->
      <script src="${pageContext.request.contextPath}/user/assets/vendor/jquery.min.js"></script>
      <!-- Bootstrap -->
      <script src="${pageContext.request.contextPath}/user/assets/vendor/popper.min.js"></script>
      <script src="${pageContext.request.contextPath}/user/assets/vendor/bootstrap.min.js"></script>
      <!-- Perfect Scrollbar -->
      <script src="${pageContext.request.contextPath}/user/assets/vendor/perfect-scrollbar.min.js"></script>
      <!-- MDK -->
      <script src="${pageContext.request.contextPath}/user/assets/vendor/dom-factory.js"></script>
      <script src="${pageContext.request.contextPath}/user/assets/vendor/material-design-kit.js"></script>
      <!-- App JS -->
      <script src="${pageContext.request.contextPath}/user/assets/js/app.js"></script>
      <!-- Highlight.js -->
      <script src="${pageContext.request.contextPath}/user/assets/js/hljs.js"></script>
      <!-- App Settings (safe to remove) -->
      <script src="${pageContext.request.contextPath}/user/assets/js/app-settings.js"></script>
   </body>
   <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-account-edit.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->
</html>