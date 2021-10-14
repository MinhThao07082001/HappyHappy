package org.apache.jsp.user.mentee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mentee_002ddashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("      dir=\"ltr\">\r\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:12:12 GMT -->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\r\n");
      out.write("              content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\"\r\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Student - Dashboard</title>\r\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\r\n");
      out.write("        <meta name=\"robots\"\r\n");
      out.write("              content=\"noindex\">\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <!-- Perfect Scrollbar -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <!-- Material Design Icons -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/material-icons.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <!-- Font Awesome Icons -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/fontawesome.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/spinkit.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <!-- App CSS -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/app.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\" layout-fluid\">\r\n");
      out.write("        <div class=\"preloader\">\r\n");
      out.write("            <div class=\"sk-chase\">\r\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Header Layout -->\r\n");
      out.write("        <div class=\"mdk-header-layout js-mdk-header-layout\">\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee_header.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- Header Layout Content -->\r\n");
      out.write("            <div class=\"mdk-header-layout__content\">\r\n");
      out.write("                <div data-push data-responsive-width=\"992px\" class=\"mdk-drawer-layout js-mdk-drawer-layout\">\r\n");
      out.write("                    <div class=\"mdk-drawer-layout__content page \">\r\n");
      out.write("                        <div class=\"container-fluid page__container\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"student-dashboard.html\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\">Dashboard</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                            <h1 class=\"h2\" style=\"width: auto;\r\n");
      out.write("                                height: auto;\r\n");
      out.write("                                background: #EDCBCB;\r\n");
      out.write("                                border-radius: 200px;\">&nbsp; &nbsp;Welcome Pham Thi Vjnh</h1>\r\n");
      out.write("                            <!-- <div class=\"card border-left-3 border-left-primary card-2by1\">\r\n");
      out.write("                               <div class=\"card-body\">\r\n");
      out.write("                                   <div class=\"media flex-wrap align-items-center\">\r\n");
      out.write("                                       <div class=\"media-left\">\r\n");
      out.write("                                           <i class=\"material-icons text-muted-light\">credit_card</i>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-body\" style=\"min-width: 180px\">\r\n");
      out.write("                                           Your subscription ends on <strong>25 February 2015</strong>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                       <div class=\"media-right mt-2 mt-xs-plus-0\">\r\n");
      out.write("                                           <a class=\"btn btn-success\"\r\n");
      out.write("                                               href=\"student-account-billing-upgrade.html\">Upgrade</a>\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                               </div>\r\n");
      out.write("                               </div>--> \r\n");
      out.write("                            <!-- Mentor Recommend tab -->\r\n");
      out.write("                            <div class=\"card-header\">\r\n");
      out.write("                                <div class=\"media align-items-center\">\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h4 class=\"card-title\">Mentor Suggestions</h4>\r\n");
      out.write("                                        <p class=\"card-subtitle\">Choose the list of mentors recommend by US!</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--End of recom tab -->\r\n");
      out.write("                            <!--List of mentors -->\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <!--                  \r\n");
      out.write("                                                  <div class=\"col-md-6\">\r\n");
      out.write("                                                     <div class=\"card\">\r\n");
      out.write("                                                        <div class=\"card-body\">\r\n");
      out.write("                                                           <div class=\"d-flex flex-column flex-sm-row\">\r\n");
      out.write("                                                              <a href=\"instructor-course-edit.html\"\r\n");
      out.write("                                                                 class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\r\n");
      out.write("                                                              <img src=\"assets/images/nodejs.png\" alt=\"Card image cap\"\r\n");
      out.write("                                                                 class=\"avatar-img rounded\">\r\n");
      out.write("                                                              </a>\r\n");
      out.write("                                                              <div class=\"flex\" style=\"min-width: 200px;\">\r\n");
      out.write("                                                                  <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Npm &amp; Gulp Advanced Workflow</strong></a></h5> \r\n");
      out.write("                                                                 <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">Npm\r\n");
      out.write("                                                                    &amp; Gulp Advanced Workflow</a>\r\n");
      out.write("                                                                 </h4>\r\n");
      out.write("                                                                 <p class=\"text-black-70\">Learn the basics of Github and become a power\r\n");
      out.write("                                                                    Github developer.\r\n");
      out.write("                                                                 </p>\r\n");
      out.write("                                                                 <div class=\"d-flex align-items-end\">\r\n");
      out.write("                                                                    <div class=\"d-flex flex flex-column mr-3\">\r\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1 border-bottom\">\r\n");
      out.write("                                                                          <small class=\"text-black-70 mr-2\">&dollar;421/mo</small>\r\n");
      out.write("                                                                          <small class=\"text-black-50\">12 SALES</small>\r\n");
      out.write("                                                                       </div>\r\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1\">\r\n");
      out.write("                                                                          <small class=\"text-muted mr-2\">GULP</small>\r\n");
      out.write("                                                                          <small class=\"text-muted\">INTERMEDIATE</small>\r\n");
      out.write("                                                                       </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"text-center\">\r\n");
      out.write("                                                                       <a href=\"instructor-course-edit.html\"\r\n");
      out.write("                                                                          class=\"btn btn-sm btn-white\">Edit</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                 </div>\r\n");
      out.write("                                                              </div>\r\n");
      out.write("                                                           </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"card__options dropdown right-0 pr-2\">\r\n");
      out.write("                                                           <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
      out.write("                                                              data-toggle=\"dropdown\">\r\n");
      out.write("                                                           <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("                                                           </a>\r\n");
      out.write("                                                           <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\r\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\r\n");
      out.write("                                                              <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                                              <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\r\n");
      out.write("                                                           </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                                  <div class=\"col-md-6\">\r\n");
      out.write("                                                     <div class=\"card\">\r\n");
      out.write("                                                        <div class=\"card-body\">\r\n");
      out.write("                                                           <div class=\"d-flex flex-column flex-sm-row\">\r\n");
      out.write("                                                              <a href=\"instructor-course-edit.html\"\r\n");
      out.write("                                                                 class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\r\n");
      out.write("                                                              <img src=\"assets/images/github.png\" alt=\"Card image cap\"\r\n");
      out.write("                                                                 class=\"avatar-img rounded\">\r\n");
      out.write("                                                              </a>\r\n");
      out.write("                                                              <div class=\"flex\" style=\"min-width: 200px;\">\r\n");
      out.write("                                                                  <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Github Webhooks for Beginners</strong></a></h5> \r\n");
      out.write("                                                                 <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">Github\r\n");
      out.write("                                                                    Webhooks for Beginners</a>\r\n");
      out.write("                                                                 </h4>\r\n");
      out.write("                                                                 <p class=\"text-black-70\">Developing static website with fast and\r\n");
      out.write("                                                                    advanced gulp setup.\r\n");
      out.write("                                                                 </p>\r\n");
      out.write("                                                                 <div class=\"d-flex align-items-end\">\r\n");
      out.write("                                                                    <div class=\"d-flex flex flex-column mr-3\">\r\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1 border-bottom\">\r\n");
      out.write("                                                                          <small class=\"text-black-70 mr-2\">&dollar;2,191/mo</small>\r\n");
      out.write("                                                                          <small class=\"text-black-50\">50 SALES</small>\r\n");
      out.write("                                                                       </div>\r\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1\">\r\n");
      out.write("                                                                          <small class=\"text-muted mr-2\">GULP</small>\r\n");
      out.write("                                                                          <small class=\"text-muted\">INTERMEDIATE</small>\r\n");
      out.write("                                                                       </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"text-center\">\r\n");
      out.write("                                                                       <a href=\"instructor-course-edit.html\"\r\n");
      out.write("                                                                          class=\"btn btn-sm btn-white\">Edit</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                 </div>\r\n");
      out.write("                                                              </div>\r\n");
      out.write("                                                           </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"card__options dropdown right-0 pr-2\">\r\n");
      out.write("                                                           <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
      out.write("                                                              data-toggle=\"dropdown\">\r\n");
      out.write("                                                           <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("                                                           </a>\r\n");
      out.write("                                                           <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\r\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\r\n");
      out.write("                                                              <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                                              <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\r\n");
      out.write("                                                           </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                                  <div class=\"col-md-6\">\r\n");
      out.write("                                                     <div class=\"card\">\r\n");
      out.write("                                                        <div class=\"card-body\">\r\n");
      out.write("                                                           <div class=\"d-flex flex-column flex-sm-row\">\r\n");
      out.write("                                                              <a href=\"instructor-course-edit.html\"\r\n");
      out.write("                                                                 class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\r\n");
      out.write("                                                              <img src=\"assets/images/gulp.png\" alt=\"Card image cap\"\r\n");
      out.write("                                                                 class=\"avatar-img rounded\">\r\n");
      out.write("                                                              </a>\r\n");
      out.write("                                                              <div class=\"flex\" style=\"min-width: 200px;\">\r\n");
      out.write("                                                                  <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Gulp &amp; Slush Workflows</strong></a></h5> \r\n");
      out.write("                                                                 <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">Gulp\r\n");
      out.write("                                                                    &amp; Slush Workflows</a>\r\n");
      out.write("                                                                 </h4>\r\n");
      out.write("                                                                 <p class=\"text-black-70\">Let’s start with a quick tour of Vue’s data\r\n");
      out.write("                                                                    binding features.\r\n");
      out.write("                                                                 </p>\r\n");
      out.write("                                                                 <div class=\"d-flex align-items-end\">\r\n");
      out.write("                                                                    <div class=\"d-flex flex flex-column mr-3\">\r\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1 border-bottom\">\r\n");
      out.write("                                                                          <small class=\"text-black-70 mr-2\">&dollar;300/mo</small>\r\n");
      out.write("                                                                          <small class=\"text-black-50\">5 SALES</small>\r\n");
      out.write("                                                                       </div>\r\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1\">\r\n");
      out.write("                                                                          <small class=\"text-muted mr-2\">GULP</small>\r\n");
      out.write("                                                                          <small class=\"text-muted\">INTERMEDIATE</small>\r\n");
      out.write("                                                                       </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"text-center\">\r\n");
      out.write("                                                                       <a href=\"instructor-course-edit.html\"\r\n");
      out.write("                                                                          class=\"btn btn-sm btn-white\">Edit</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                 </div>\r\n");
      out.write("                                                              </div>\r\n");
      out.write("                                                           </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"card__options dropdown right-0 pr-2\">\r\n");
      out.write("                                                           <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
      out.write("                                                              data-toggle=\"dropdown\">\r\n");
      out.write("                                                           <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("                                                           </a>\r\n");
      out.write("                                                           <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\r\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\r\n");
      out.write("                                                              <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                                              <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\r\n");
      out.write("                                                           </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                  </div>-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End of List of mentors -->\r\n");
      out.write("                            <!-- Pagination -->\r\n");
      out.write("                            <ul class=\"pagination justify-content-center pagination-sm\">\r\n");
      out.write("                                <li class=\"page-item disabled\">\r\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                        <span aria-hidden=\"true\" class=\"material-icons\">chevron_left</span>\r\n");
      out.write("                                        <span>Prev</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"page-item active\">\r\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"1\">\r\n");
      out.write("                                        <span>1</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"page-item\">\r\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"1\">\r\n");
      out.write("                                        <span>2</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"page-item\">\r\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                                        <span>Next</span>\r\n");
      out.write("                                        <span aria-hidden=\"true\" class=\"material-icons\">chevron_right</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- end of pagination -->\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-7\">\r\n");
      out.write("                                    <div class=\"card\">\r\n");
      out.write("                                        <div class=\"card-header\">\r\n");
      out.write("                                            <div class=\"media align-items-center\">\r\n");
      out.write("                                                <div class=\"media-body\">\r\n");
      out.write("                                                    <h4 class=\"card-title\">Courses</h4>\r\n");
      out.write("                                                    <p class=\"card-subtitle\">Your recent courses</p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"media-right\">\r\n");
      out.write("                                                    <a class=\"btn btn-sm btn-primary\" href=\"student-my-courses.html\">My\r\n");
      out.write("                                                        courses</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <ul class=\"list-group list-group-fit mb-0\" style=\"z-index: initial;\">\r\n");
      out.write("                                            <li class=\"list-group-item\" style=\"z-index: initial;\">\r\n");
      out.write("                                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                                    <a href=\"student-take-course.html\"\r\n");
      out.write("                                                       class=\"avatar avatar-4by3 avatar-sm mr-3\">\r\n");
      out.write("                                                        <img src=\"assets/images/gulp.png\" alt=\"course\"\r\n");
      out.write("                                                             class=\"avatar-img rounded\">\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                    <div class=\"flex\">\r\n");
      out.write("                                                        <a href=\"student-take-course.html\" class=\"text-body\"><strong>Learn\r\n");
      out.write("                                                                Vue.js Fundamentals</strong></a>\r\n");
      out.write("                                                        <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                                            <div class=\"progress\" style=\"width: 100px;\">\r\n");
      out.write("                                                                <div class=\"progress-bar bg-primary\" role=\"progressbar\"\r\n");
      out.write("                                                                     style=\"width: 25%\" aria-valuenow=\"25\" aria-valuemin=\"0\"\r\n");
      out.write("                                                                     aria-valuemax=\"100\"></div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <small class=\"text-muted ml-2\">25%</small>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"dropdown ml-3\">\r\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
      out.write("                                                           data-toggle=\"dropdown\">\r\n");
      out.write("                                                            <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                                            <a class=\"dropdown-item\"\r\n");
      out.write("                                                               href=\"student-take-course.html\">Continue</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"list-group-item\" style=\"z-index: initial;\">\r\n");
      out.write("                                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                                    <a href=\"student-take-course.html\"\r\n");
      out.write("                                                       class=\"avatar avatar-4by3 avatar-sm mr-3\">\r\n");
      out.write("                                                        <img src=\"assets/images/vuejs.png\" alt=\"course\"\r\n");
      out.write("                                                             class=\"avatar-img rounded\">\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                    <div class=\"flex\">\r\n");
      out.write("                                                        <a href=\"student-take-course.html\" class=\"text-body\"><strong>Angular\r\n");
      out.write("                                                                in Steps</strong></a>\r\n");
      out.write("                                                        <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                                            <div class=\"progress\" style=\"width: 100px;\">\r\n");
      out.write("                                                                <div class=\"progress-bar bg-success\" role=\"progressbar\"\r\n");
      out.write("                                                                     style=\"width: 100%\" aria-valuenow=\"100\"\r\n");
      out.write("                                                                     aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <small class=\"text-muted ml-2\">100%</small>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"dropdown ml-3\">\r\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
      out.write("                                                           data-toggle=\"dropdown\">\r\n");
      out.write("                                                            <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                                            <a class=\"dropdown-item\"\r\n");
      out.write("                                                               href=\"student-take-course.html\">Continue</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"list-group-item\" style=\"z-index: initial;\">\r\n");
      out.write("                                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                                    <a href=\"student-take-course.html\"\r\n");
      out.write("                                                       class=\"avatar avatar-4by3 avatar-sm mr-3\">\r\n");
      out.write("                                                        <img src=\"assets/images/nodejs.png\" alt=\"course\"\r\n");
      out.write("                                                             class=\"avatar-img rounded\">\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                    <div class=\"flex\">\r\n");
      out.write("                                                        <a href=\"student-take-course.html\"\r\n");
      out.write("                                                           class=\"text-body\"><strong>Bootstrap Foundations</strong></a>\r\n");
      out.write("                                                        <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                                            <div class=\"progress\" style=\"width: 100px;\">\r\n");
      out.write("                                                                <div class=\"progress-bar bg-warning\" role=\"progressbar\"\r\n");
      out.write("                                                                     style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\"\r\n");
      out.write("                                                                     aria-valuemax=\"100\"></div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <small class=\"text-muted ml-2\">80%</small>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"dropdown ml-3\">\r\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
      out.write("                                                           data-toggle=\"dropdown\">\r\n");
      out.write("                                                            <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                                            <a class=\"dropdown-item\"\r\n");
      out.write("                                                               href=\"student-take-course.html\">Continue</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-lg-5\">\r\n");
      out.write("                                    <div class=\"card card-2by1\">\r\n");
      out.write("                                        <div class=\"card-header\">\r\n");
      out.write("                                            <h4 class=\"card-title\">Rewards</h4>\r\n");
      out.write("                                            <p class=\"card-subtitle\">Your latest achievements</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"card-body text-center\">\r\n");
      out.write("                                            <div class=\"btn btn-primary btn-circle\"><i class=\"material-icons\">thumb_up</i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"btn btn-danger btn-circle\"><i class=\"material-icons\">grade</i></div>\r\n");
      out.write("                                            <div class=\"btn btn-success btn-circle\"><i\r\n");
      out.write("                                                    class=\"material-icons\">bubble_chart</i></div>\r\n");
      out.write("                                            <div class=\"btn btn-warning btn-circle\"><i\r\n");
      out.write("                                                    class=\"material-icons\">keyboard_voice</i></div>\r\n");
      out.write("                                            <div class=\"btn btn-info btn-circle\"><i\r\n");
      out.write("                                                    class=\"material-icons\">event_available</i></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee_tab.jsp", out, false);
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- App Settings FAB -->\r\n");
      out.write("                <!--                <div id=\"app-settings\">\r\n");
      out.write("                   <app-settings layout-active=\"default\"\r\n");
      out.write("                                 :layout-location=\"{\r\n");
      out.write("                   'fixed': 'fixed-student-dashboard.html',\r\n");
      out.write("                   'default': 'student-dashboard.html'\r\n");
      out.write("                   }\"\r\n");
      out.write("                                 sidebar-variant=\"bg-transparent border-0\"></app-settings>\r\n");
      out.write("                   </div>-->\r\n");
      out.write("                <!-- jQuery -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/jquery.min.js\"></script>\r\n");
      out.write("                <!-- Bootstrap -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/popper.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("                <!-- Perfect Scrollbar -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("                <!-- MDK -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/dom-factory.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/material-design-kit.js\"></script>\r\n");
      out.write("                <!-- App JS -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app.js\"></script>\r\n");
      out.write("                <!-- Highlight.js -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/hljs.js\"></script>\r\n");
      out.write("                <!-- App Settings (safe to remove) -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app-settings.js\"></script>\r\n");
      out.write("                <!-- Global Settings -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/settings.js\"></script>\r\n");
      out.write("                <!-- Moment.js -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment-range.js\"></script>\r\n");
      out.write("                <!-- Chart.js -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/Chart.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/chartjs.js\"></script>\r\n");
      out.write("                <!-- Student Dashboard Page JS -->\r\n");
      out.write("                <!-- <script src=\"assets/js/chartjs-rounded-bar.js\"></script> -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/page.student-dashboard.js\"></script>\r\n");
      out.write("                </body>\r\n");
      out.write("                <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:01 GMT -->\r\n");
      out.write("                </html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("user");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("mtor");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mtorList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-md-6\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                                <div class=\"d-flex flex-column flex-sm-row\">\r\n");
          out.write("                                                    <a href=\"?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.mentorID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                                       class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\r\n");
          out.write("                                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.imgAvt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\"\r\n");
          out.write("                                                             class=\"avatar-img rounded\">\r\n");
          out.write("                                                    </a>\r\n");
          out.write("                                                             <a href=\"../conversation?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.mentorID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                                 <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"24px\" viewBox=\"0 0 24 24\" width=\"24px\" fill=\"#000000\"><path d=\"M0 0h24v24H0V0z\" fill=\"none\"/><path d=\"M15 4v7H5.17L4 12.17V4h11m1-2H3c-.55 0-1 .45-1 1v14l4-4h10c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm5 4h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7c0-.55-.45-1-1-1z\"/></svg>\r\n");
          out.write("                                                             </a>\r\n");
          out.write("                                                    <div class=\"flex\" style=\"min-width: 200px;\">\r\n");
          out.write("                                                        <!-- <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Learn Vue.js</strong></a></h5> -->\r\n");
          out.write("                                                        <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            </a>\r\n");
          out.write("                                                        </h4>\r\n");
          out.write("                                                        <p class=\"text-black-70\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                        </p>\r\n");
          out.write("                                                        <div class=\"d-flex align-items-end\">\r\n");
          out.write("                                                            <div class=\"d-flex flex flex-column mr-3\">\r\n");
          out.write("                                                                <div class=\"d-flex align-items-center py-1 border-bottom\">\r\n");
          out.write("                                                                    ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                                </div>\r\n");
          out.write("                                                                <div class=\"d-flex align-items-center py-1\">\r\n");
          out.write("                                                                    <small class=\"text-muted mr-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.yearExperiment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" years experience</small>\r\n");
          out.write("                                                                    <br/>\r\n");
          out.write("                                                                    <small class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.education}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\r\n");
          out.write("                                                                </div>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <div class=\"text-center\">\r\n");
          out.write("                                                                <a href=\"instructor-course-edit.html\"\r\n");
          out.write("                                                                   class=\"btn btn-sm btn-white\">Edit</a>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"card__options dropdown right-0 pr-2\">\r\n");
          out.write("                                                <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\r\n");
          out.write("                                                   data-toggle=\"dropdown\">\r\n");
          out.write("                                                    <i class=\"material-icons\">more_vert</i>\r\n");
          out.write("                                                </a>\r\n");
          out.write("                                                <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
          out.write("                                                    <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\r\n");
          out.write("                                                    <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\r\n");
          out.write("                                                    <div class=\"dropdown-divider\"></div>\r\n");
          out.write("                                                    <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.authen eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"24px\" viewBox=\"0 0 24 24\" width=\"24px\" fill=\"#0000FF\"><path d=\"M0 0h24v24H0V0z\" fill=\"none\"/><path d=\"M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z\"/></svg>\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("sList");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.listMajor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                        <small class=\"text-black-70 mr-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sList.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\r\n");
          out.write("                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
