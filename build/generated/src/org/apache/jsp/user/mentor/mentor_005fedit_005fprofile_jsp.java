package org.apache.jsp.user.mentor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mentor_005fedit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\"\r\n");
      out.write("   dir=\"ltr\">\r\n");
      out.write("   <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-account-edit.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\"\r\n");
      out.write("         content=\"IE=edge\">\r\n");
      out.write("      <meta name=\"viewport\"\r\n");
      out.write("         content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("      <title>Student - Edit account - Fixed layout</title>\r\n");
      out.write("      <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\r\n");
      out.write("      <meta name=\"robots\"\r\n");
      out.write("         content=\"noindex\">\r\n");
      out.write("      <!-- Custom Fonts -->\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\"\r\n");
      out.write("         rel=\"stylesheet\">\r\n");
      out.write("      <!-- Perfect Scrollbar -->\r\n");
      out.write("      <link type=\"text/css\"\r\n");
      out.write("         href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.css\"\r\n");
      out.write("         rel=\"stylesheet\">\r\n");
      out.write("      <!-- Material Design Icons -->\r\n");
      out.write("      <link type=\"text/css\"\r\n");
      out.write("         href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/material-icons.css\"\r\n");
      out.write("         rel=\"stylesheet\">\r\n");
      out.write("      <!-- Font Awesome Icons -->\r\n");
      out.write("      <link type=\"text/css\"\r\n");
      out.write("         href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/fontawesome.css\"\r\n");
      out.write("         rel=\"stylesheet\">\r\n");
      out.write("      <!-- Preloader -->\r\n");
      out.write("      <link type=\"text/css\"\r\n");
      out.write("         href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/spinkit.css\"\r\n");
      out.write("         rel=\"stylesheet\">\r\n");
      out.write("      <!-- App CSS -->\r\n");
      out.write("      <link type=\"text/css\"\r\n");
      out.write("         href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/app.css\"\r\n");
      out.write("         rel=\"stylesheet\">\r\n");
      out.write("   </head>\r\n");
      out.write("   <body class=\" layout-fluid\">\r\n");
      out.write("      <div class=\"preloader\">\r\n");
      out.write("         <div class=\"sk-chase\">\r\n");
      out.write("            <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("            <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("            <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("            <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("            <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("            <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- <div class=\"sk-bounce\">\r\n");
      out.write("            <div class=\"sk-bounce-dot\"></div>\r\n");
      out.write("            <div class=\"sk-bounce-dot\"></div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("         <!-- More spinner examples at https://github.com/tobiasahlin/SpinKit/blob/master/examples.html -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Header Layout -->\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentor_header.jsp", out, false);
      out.write("\r\n");
      out.write("      <!-- // END Header -->\r\n");
      out.write("      <!-- Header Layout Content -->\r\n");
      out.write("      <div class=\"mdk-header-layout__content\">\r\n");
      out.write("         <div data-push\r\n");
      out.write("            data-responsive-width=\"992px\"\r\n");
      out.write("            class=\"mdk-drawer-layout js-mdk-drawer-layout\">\r\n");
      out.write("            <div class=\"mdk-drawer-layout__content page \">\r\n");
      out.write("               <div class=\"container-fluid page__container\">\r\n");
      out.write("                  <ol class=\"breadcrumb\">\r\n");
      out.write("                     <li class=\"breadcrumb-item\"><a href=\"student-dashboard.html\">Home</a></li>\r\n");
      out.write("                     <li class=\"breadcrumb-item active\">Edit Account</li>\r\n");
      out.write("                  </ol>\r\n");
      out.write("                  <h1 class=\"h2\">Edit Account</h1>\r\n");
      out.write("                  <div class=\"card\">\r\n");
      out.write("                     <ul class=\"nav nav-tabs nav-tabs-card\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                           <a class=\"nav-link active\"\r\n");
      out.write("                              href=\"#first\"\r\n");
      out.write("                              data-toggle=\"tab\">Account</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                           <a class=\"nav-link\"\r\n");
      out.write("                              href=\"#second\"\r\n");
      out.write("                              data-toggle=\"tab\">Billing</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                     </ul>\r\n");
      out.write("                     <div class=\"tab-content card-body\">\r\n");
      out.write("                        <div class=\"tab-pane active\"\r\n");
      out.write("                           id=\"first\">\r\n");
      out.write("                           <form action=\"editprofile\" method=\"post\"  enctype='multipart/form-data'\r\n");
      out.write("                              class=\"form-horizontal\">\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"avatar\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Avatar</label>\r\n");
      out.write("                                 <div class=\"col-sm-9\">\r\n");
      out.write("                                    <div class=\"media align-items-center\">\r\n");
      out.write("                                       <div class=\"media-left\">\r\n");
      out.write("                                          <div class=\"icon-block rounded\">\r\n");
      out.write("                                             <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.imgAvt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 50px; height: 50px\" >\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-body\">\r\n");
      out.write("                                          <div class=\"custom-file\"\r\n");
      out.write("                                             style=\"width: auto;\">\r\n");
      out.write("                                             <input type=\"file\"\r\n");
      out.write("                                                id=\"avatar\"\r\n");
      out.write("                                                class=\"custom-file-input\"\r\n");
      out.write("                                                name=\"imgAvt\">\r\n");
      out.write("                                             <label for=\"avatar\"\r\n");
      out.write("                                                class=\"custom-file-label\">Choose file</label>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"name\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Full Name</label>\r\n");
      out.write("                                 <div class=\"col-sm-8\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                       <div class=\"col-md-6\">\r\n");
      out.write("                                          <input id=\"name\"\r\n");
      out.write("                                             type=\"text\"\r\n");
      out.write("                                             class=\"form-control\"\r\n");
      out.write("                                             value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                             name=\"name\">\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"email\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Email</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-6\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                       <div class=\"input-group-prepend\">\r\n");
      out.write("                                          <div class=\"input-group-text\">\r\n");
      out.write("                                             <i class=\"material-icons md-18 text-muted\">mail</i>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <input type=\"email\"\r\n");
      out.write("                                          id=\"email\"\r\n");
      out.write("                                          class=\"form-control\"\r\n");
      out.write("                                          value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                          disabled>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"dob\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">D.O.B</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                       <div class=\"input-group-prepend\">\r\n");
      out.write("                                          <div class=\"input-group-text\">\r\n");
      out.write("                                             <i class=\"material-icons md-18 text-muted\">language</i>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <input id=\"dob\" type=\"date\" name=\"dob\" max=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"address\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Address</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                       <div class=\"input-group-prepend\">\r\n");
      out.write("                                          <div class=\"input-group-text\">\r\n");
      out.write("                                             <i class=\"material-icons md-18 home\"></i>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <input id=\"address\" type=\"text\" name=\"address\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"phone\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Phone</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                       <div class=\"input-group-prepend\">\r\n");
      out.write("                                          <div class=\"input-group-text\">\r\n");
      out.write("                                             <i class=\"material-icons md-18 phone\"></i>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <input id=\"phone\" type=\"text\" pattern=\"[0][0-9]{9}\" name=\"phone\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"description\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Description</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                       <div class=\"input-group-prepend\">\r\n");
      out.write("                                          <div class=\"input-group-text\">\r\n");
      out.write("                                             <i class=\"material-icons md-18 description\"></i>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <input id=\"description\" type=\"text\" name=\"description\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <div class=\"col-sm-8 offset-sm-3\">\r\n");
      out.write("                                    <div class=\"media align-items-center\">\r\n");
      out.write("                                       <div class=\"media-left\">\r\n");
      out.write("                                          <input type=\"submit\" value=\"Save changes\">\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-body pl-1\">\r\n");
      out.write("                                          <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                             <input id=\"subscribe\"\r\n");
      out.write("                                                type=\"checkbox\"\r\n");
      out.write("                                                class=\"custom-control-input\"\r\n");
      out.write("                                                checked>\r\n");
      out.write("                                             <label for=\"subscribe\"\r\n");
      out.write("                                                class=\"custom-control-label\">Subscribe to Newsletter</label>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"tab-pane\"\r\n");
      out.write("                           id=\"second\">\r\n");
      out.write("                           <form action=\"#\"\r\n");
      out.write("                              class=\"form-horizontal\">\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"name_on_invoice\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Name on Invoice</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <input id=\"name_on_invoice\"\r\n");
      out.write("                                       type=\"text\"\r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"Adrian Demian\">\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"billing_address\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Address</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <input id=\"billing_address\"\r\n");
      out.write("                                       type=\"text\"\r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"Sunny Street, 21, Miami, Florida\">\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <label for=\"billing_country\"\r\n");
      out.write("                                    class=\"col-sm-3 col-form-label form-label\">Country</label>\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                    <select id=\"billing_country\"\r\n");
      out.write("                                       class=\"custom-control custom-select form-control\">\r\n");
      out.write("                                       <option value=\"1\"\r\n");
      out.write("                                          selected>USA</option>\r\n");
      out.write("                                       <option value=\"2\">India</option>\r\n");
      out.write("                                       <option value=\"3\">United Kingdom</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group row\">\r\n");
      out.write("                                 <div class=\"col-sm-6 col-md-4 offset-sm-3\">\r\n");
      out.write("                                    <a href=\"#\"\r\n");
      out.write("                                       class=\"btn btn-success\"> Update Billing</a>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </form>\r\n");
      out.write("                           <div class=\"card mt-2\">\r\n");
      out.write("                              <div class=\"card-header\">\r\n");
      out.write("                                 <div class=\"media align-items-center\">\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                       <h4 class=\"card-title\">Payment Info</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"media-right\">\r\n");
      out.write("                                       <a href=\"#\"\r\n");
      out.write("                                          class=\"btn btn-sm btn-outline-primary\"><i class=\"material-icons\">add</i></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <ul class=\"card-footer p-0 list-group list-group-fit\">\r\n");
      out.write("                                 <li class=\"list-group-item active\">\r\n");
      out.write("                                    <div class=\"media align-items-center\">\r\n");
      out.write("                                       <div class=\"media-left\">\r\n");
      out.write("                                          <span class=\"btn btn-primary btn-circle\"><i class=\"material-icons\">credit_card</i></span>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-body\">\r\n");
      out.write("                                          <p class=\"mb-0\">**** **** **** 2422</p>\r\n");
      out.write("                                          <small>Updated on 12/02/2016</small>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-right\">\r\n");
      out.write("                                          <a href=\"#\"\r\n");
      out.write("                                             class=\"btn btn-primary btn-sm\">\r\n");
      out.write("                                          <i class=\"material-icons btn__icon--left\">edit</i> EDIT\r\n");
      out.write("                                          </a>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </li>\r\n");
      out.write("                                 <li class=\"list-group-item\">\r\n");
      out.write("                                    <div class=\"media align-items-center\">\r\n");
      out.write("                                       <div class=\"media-left\">\r\n");
      out.write("                                          <span class=\"btn btn-white btn-circle\"><i class=\"material-icons\">credit_card</i></span>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-body\">\r\n");
      out.write("                                          <p class=\"mb-0\">**** **** **** 6321</p>\r\n");
      out.write("                                          <small class=\"text-muted\">Updated on 11/01/2016</small>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-right\">\r\n");
      out.write("                                          <a href=\"#\"\r\n");
      out.write("                                             class=\"btn btn-white btn-sm\">\r\n");
      out.write("                                          <i class=\"material-icons btn__icon--left\">edit</i> EDIT\r\n");
      out.write("                                          </a>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </li>\r\n");
      out.write("                              </ul>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Nav Tab-->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentor_tab.jsp", out, false);
      out.write("\r\n");
      out.write("            <!--End Of Nab Tab-->\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- App Settings FAB -->\r\n");
      out.write("<!--         <div id=\"app-settings\">\r\n");
      out.write("            <app-settings layout-active=\"default\"\r\n");
      out.write("               :layout-location=\"{\r\n");
      out.write("               'fixed': 'fixed-student-account-edit.html',\r\n");
      out.write("               'default': 'student-account-edit.html'\r\n");
      out.write("               }\"\r\n");
      out.write("               sidebar-variant=\"bg-transparent border-0\"></app-settings>\r\n");
      out.write("         </div>-->\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- jQuery -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/jquery.min.js\"></script>\r\n");
      out.write("      <!-- Bootstrap -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/popper.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("      <!-- Perfect Scrollbar -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("      <!-- MDK -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/dom-factory.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/material-design-kit.js\"></script>\r\n");
      out.write("      <!-- App JS -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app.js\"></script>\r\n");
      out.write("      <!-- Highlight.js -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/hljs.js\"></script>\r\n");
      out.write("      <!-- App Settings (safe to remove) -->\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app-settings.js\"></script>\r\n");
      out.write("   </body>\r\n");
      out.write("   <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-student-account-edit.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:14:56 GMT -->\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
