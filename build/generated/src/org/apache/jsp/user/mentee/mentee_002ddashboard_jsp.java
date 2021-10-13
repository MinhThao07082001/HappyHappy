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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\"\n");
      out.write("      dir=\"ltr\">\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:12:12 GMT -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\n");
      out.write("              content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\"\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Student - Dashboard</title>\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\n");
      out.write("        <meta name=\"robots\"\n");
      out.write("              content=\"noindex\">\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- Perfect Scrollbar -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- Material Design Icons -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/material-icons.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/fontawesome.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- Preloader -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/spinkit.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- App CSS -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/css/app.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\" layout-fluid\">\n");
      out.write("        <div class=\"preloader\">\n");
      out.write("            <div class=\"sk-chase\">\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\n");
      out.write("                <div class=\"sk-chase-dot\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Header Layout -->\n");
      out.write("        <div class=\"mdk-header-layout js-mdk-header-layout\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee_header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Header Layout Content -->\n");
      out.write("            <div class=\"mdk-header-layout__content\">\n");
      out.write("                <div data-push data-responsive-width=\"992px\" class=\"mdk-drawer-layout js-mdk-drawer-layout\">\n");
      out.write("                    <div class=\"mdk-drawer-layout__content page \">\n");
      out.write("                        <div class=\"container-fluid page__container\">\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"student-dashboard.html\">Home</a></li>\n");
      out.write("                                <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("                            </ol>\n");
      out.write("                            <h1 class=\"h2\" style=\"width: auto;\n");
      out.write("                                height: auto;\n");
      out.write("                                background: #EDCBCB;\n");
      out.write("                                border-radius: 200px;\">&nbsp; &nbsp;Welcome Pham Thi Vjnh</h1>\n");
      out.write("                            <!-- <div class=\"card border-left-3 border-left-primary card-2by1\">\n");
      out.write("                               <div class=\"card-body\">\n");
      out.write("                                   <div class=\"media flex-wrap align-items-center\">\n");
      out.write("                                       <div class=\"media-left\">\n");
      out.write("                                           <i class=\"material-icons text-muted-light\">credit_card</i>\n");
      out.write("                                       </div>\n");
      out.write("                                       <div class=\"media-body\" style=\"min-width: 180px\">\n");
      out.write("                                           Your subscription ends on <strong>25 February 2015</strong>\n");
      out.write("                                       </div>\n");
      out.write("                                       <div class=\"media-right mt-2 mt-xs-plus-0\">\n");
      out.write("                                           <a class=\"btn btn-success\"\n");
      out.write("                                               href=\"student-account-billing-upgrade.html\">Upgrade</a>\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                               </div>--> \n");
      out.write("                            <!-- Mentor Recommend tab -->\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <div class=\"media align-items-center\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h4 class=\"card-title\">Mentor Recommendation</h4>\n");
      out.write("                                        <p class=\"card-subtitle\">Choose the list of mentors recommend by US!</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--End of recom tab -->\n");
      out.write("                            <!--List of mentors -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <!--                  \n");
      out.write("                                                  <div class=\"col-md-6\">\n");
      out.write("                                                     <div class=\"card\">\n");
      out.write("                                                        <div class=\"card-body\">\n");
      out.write("                                                           <div class=\"d-flex flex-column flex-sm-row\">\n");
      out.write("                                                              <a href=\"instructor-course-edit.html\"\n");
      out.write("                                                                 class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\n");
      out.write("                                                              <img src=\"assets/images/nodejs.png\" alt=\"Card image cap\"\n");
      out.write("                                                                 class=\"avatar-img rounded\">\n");
      out.write("                                                              </a>\n");
      out.write("                                                              <div class=\"flex\" style=\"min-width: 200px;\">\n");
      out.write("                                                                  <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Npm &amp; Gulp Advanced Workflow</strong></a></h5> \n");
      out.write("                                                                 <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">Npm\n");
      out.write("                                                                    &amp; Gulp Advanced Workflow</a>\n");
      out.write("                                                                 </h4>\n");
      out.write("                                                                 <p class=\"text-black-70\">Learn the basics of Github and become a power\n");
      out.write("                                                                    Github developer.\n");
      out.write("                                                                 </p>\n");
      out.write("                                                                 <div class=\"d-flex align-items-end\">\n");
      out.write("                                                                    <div class=\"d-flex flex flex-column mr-3\">\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1 border-bottom\">\n");
      out.write("                                                                          <small class=\"text-black-70 mr-2\">&dollar;421/mo</small>\n");
      out.write("                                                                          <small class=\"text-black-50\">12 SALES</small>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1\">\n");
      out.write("                                                                          <small class=\"text-muted mr-2\">GULP</small>\n");
      out.write("                                                                          <small class=\"text-muted\">INTERMEDIATE</small>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"text-center\">\n");
      out.write("                                                                       <a href=\"instructor-course-edit.html\"\n");
      out.write("                                                                          class=\"btn btn-sm btn-white\">Edit</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                 </div>\n");
      out.write("                                                              </div>\n");
      out.write("                                                           </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"card__options dropdown right-0 pr-2\">\n");
      out.write("                                                           <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
      out.write("                                                              data-toggle=\"dropdown\">\n");
      out.write("                                                           <i class=\"material-icons\">more_vert</i>\n");
      out.write("                                                           </a>\n");
      out.write("                                                           <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\n");
      out.write("                                                              <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                              <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\n");
      out.write("                                                           </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                     </div>\n");
      out.write("                                                  </div>\n");
      out.write("                                                  <div class=\"col-md-6\">\n");
      out.write("                                                     <div class=\"card\">\n");
      out.write("                                                        <div class=\"card-body\">\n");
      out.write("                                                           <div class=\"d-flex flex-column flex-sm-row\">\n");
      out.write("                                                              <a href=\"instructor-course-edit.html\"\n");
      out.write("                                                                 class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\n");
      out.write("                                                              <img src=\"assets/images/github.png\" alt=\"Card image cap\"\n");
      out.write("                                                                 class=\"avatar-img rounded\">\n");
      out.write("                                                              </a>\n");
      out.write("                                                              <div class=\"flex\" style=\"min-width: 200px;\">\n");
      out.write("                                                                  <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Github Webhooks for Beginners</strong></a></h5> \n");
      out.write("                                                                 <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">Github\n");
      out.write("                                                                    Webhooks for Beginners</a>\n");
      out.write("                                                                 </h4>\n");
      out.write("                                                                 <p class=\"text-black-70\">Developing static website with fast and\n");
      out.write("                                                                    advanced gulp setup.\n");
      out.write("                                                                 </p>\n");
      out.write("                                                                 <div class=\"d-flex align-items-end\">\n");
      out.write("                                                                    <div class=\"d-flex flex flex-column mr-3\">\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1 border-bottom\">\n");
      out.write("                                                                          <small class=\"text-black-70 mr-2\">&dollar;2,191/mo</small>\n");
      out.write("                                                                          <small class=\"text-black-50\">50 SALES</small>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1\">\n");
      out.write("                                                                          <small class=\"text-muted mr-2\">GULP</small>\n");
      out.write("                                                                          <small class=\"text-muted\">INTERMEDIATE</small>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"text-center\">\n");
      out.write("                                                                       <a href=\"instructor-course-edit.html\"\n");
      out.write("                                                                          class=\"btn btn-sm btn-white\">Edit</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                 </div>\n");
      out.write("                                                              </div>\n");
      out.write("                                                           </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"card__options dropdown right-0 pr-2\">\n");
      out.write("                                                           <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
      out.write("                                                              data-toggle=\"dropdown\">\n");
      out.write("                                                           <i class=\"material-icons\">more_vert</i>\n");
      out.write("                                                           </a>\n");
      out.write("                                                           <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\n");
      out.write("                                                              <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                              <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\n");
      out.write("                                                           </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                     </div>\n");
      out.write("                                                  </div>\n");
      out.write("                                                  <div class=\"col-md-6\">\n");
      out.write("                                                     <div class=\"card\">\n");
      out.write("                                                        <div class=\"card-body\">\n");
      out.write("                                                           <div class=\"d-flex flex-column flex-sm-row\">\n");
      out.write("                                                              <a href=\"instructor-course-edit.html\"\n");
      out.write("                                                                 class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\n");
      out.write("                                                              <img src=\"assets/images/gulp.png\" alt=\"Card image cap\"\n");
      out.write("                                                                 class=\"avatar-img rounded\">\n");
      out.write("                                                              </a>\n");
      out.write("                                                              <div class=\"flex\" style=\"min-width: 200px;\">\n");
      out.write("                                                                  <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Gulp &amp; Slush Workflows</strong></a></h5> \n");
      out.write("                                                                 <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">Gulp\n");
      out.write("                                                                    &amp; Slush Workflows</a>\n");
      out.write("                                                                 </h4>\n");
      out.write("                                                                 <p class=\"text-black-70\">Let’s start with a quick tour of Vue’s data\n");
      out.write("                                                                    binding features.\n");
      out.write("                                                                 </p>\n");
      out.write("                                                                 <div class=\"d-flex align-items-end\">\n");
      out.write("                                                                    <div class=\"d-flex flex flex-column mr-3\">\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1 border-bottom\">\n");
      out.write("                                                                          <small class=\"text-black-70 mr-2\">&dollar;300/mo</small>\n");
      out.write("                                                                          <small class=\"text-black-50\">5 SALES</small>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                       <div class=\"d-flex align-items-center py-1\">\n");
      out.write("                                                                          <small class=\"text-muted mr-2\">GULP</small>\n");
      out.write("                                                                          <small class=\"text-muted\">INTERMEDIATE</small>\n");
      out.write("                                                                       </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"text-center\">\n");
      out.write("                                                                       <a href=\"instructor-course-edit.html\"\n");
      out.write("                                                                          class=\"btn btn-sm btn-white\">Edit</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                 </div>\n");
      out.write("                                                              </div>\n");
      out.write("                                                           </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"card__options dropdown right-0 pr-2\">\n");
      out.write("                                                           <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
      out.write("                                                              data-toggle=\"dropdown\">\n");
      out.write("                                                           <i class=\"material-icons\">more_vert</i>\n");
      out.write("                                                           </a>\n");
      out.write("                                                           <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\n");
      out.write("                                                              <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\n");
      out.write("                                                              <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                              <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\n");
      out.write("                                                           </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                     </div>\n");
      out.write("                                                  </div>-->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End of List of mentors -->\n");
      out.write("                            <!-- Pagination -->\n");
      out.write("                            <ul class=\"pagination justify-content-center pagination-sm\">\n");
      out.write("                                <li class=\"page-item disabled\">\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("                                        <span aria-hidden=\"true\" class=\"material-icons\">chevron_left</span>\n");
      out.write("                                        <span>Prev</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"page-item active\">\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"1\">\n");
      out.write("                                        <span>1</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"page-item\">\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"1\">\n");
      out.write("                                        <span>2</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"page-item\">\n");
      out.write("                                    <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("                                        <span>Next</span>\n");
      out.write("                                        <span aria-hidden=\"true\" class=\"material-icons\">chevron_right</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <!-- end of pagination -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-7\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header\">\n");
      out.write("                                            <div class=\"media align-items-center\">\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <h4 class=\"card-title\">Courses</h4>\n");
      out.write("                                                    <p class=\"card-subtitle\">Your recent courses</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"media-right\">\n");
      out.write("                                                    <a class=\"btn btn-sm btn-primary\" href=\"student-my-courses.html\">My\n");
      out.write("                                                        courses</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <ul class=\"list-group list-group-fit mb-0\" style=\"z-index: initial;\">\n");
      out.write("                                            <li class=\"list-group-item\" style=\"z-index: initial;\">\n");
      out.write("                                                <div class=\"d-flex align-items-center\">\n");
      out.write("                                                    <a href=\"student-take-course.html\"\n");
      out.write("                                                       class=\"avatar avatar-4by3 avatar-sm mr-3\">\n");
      out.write("                                                        <img src=\"assets/images/gulp.png\" alt=\"course\"\n");
      out.write("                                                             class=\"avatar-img rounded\">\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"flex\">\n");
      out.write("                                                        <a href=\"student-take-course.html\" class=\"text-body\"><strong>Learn\n");
      out.write("                                                                Vue.js Fundamentals</strong></a>\n");
      out.write("                                                        <div class=\"d-flex align-items-center\">\n");
      out.write("                                                            <div class=\"progress\" style=\"width: 100px;\">\n");
      out.write("                                                                <div class=\"progress-bar bg-primary\" role=\"progressbar\"\n");
      out.write("                                                                     style=\"width: 25%\" aria-valuenow=\"25\" aria-valuemin=\"0\"\n");
      out.write("                                                                     aria-valuemax=\"100\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <small class=\"text-muted ml-2\">25%</small>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"dropdown ml-3\">\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
      out.write("                                                           data-toggle=\"dropdown\">\n");
      out.write("                                                            <i class=\"material-icons\">more_vert</i>\n");
      out.write("                                                        </a>\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                            <a class=\"dropdown-item\"\n");
      out.write("                                                               href=\"student-take-course.html\">Continue</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"list-group-item\" style=\"z-index: initial;\">\n");
      out.write("                                                <div class=\"d-flex align-items-center\">\n");
      out.write("                                                    <a href=\"student-take-course.html\"\n");
      out.write("                                                       class=\"avatar avatar-4by3 avatar-sm mr-3\">\n");
      out.write("                                                        <img src=\"assets/images/vuejs.png\" alt=\"course\"\n");
      out.write("                                                             class=\"avatar-img rounded\">\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"flex\">\n");
      out.write("                                                        <a href=\"student-take-course.html\" class=\"text-body\"><strong>Angular\n");
      out.write("                                                                in Steps</strong></a>\n");
      out.write("                                                        <div class=\"d-flex align-items-center\">\n");
      out.write("                                                            <div class=\"progress\" style=\"width: 100px;\">\n");
      out.write("                                                                <div class=\"progress-bar bg-success\" role=\"progressbar\"\n");
      out.write("                                                                     style=\"width: 100%\" aria-valuenow=\"100\"\n");
      out.write("                                                                     aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <small class=\"text-muted ml-2\">100%</small>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"dropdown ml-3\">\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
      out.write("                                                           data-toggle=\"dropdown\">\n");
      out.write("                                                            <i class=\"material-icons\">more_vert</i>\n");
      out.write("                                                        </a>\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                            <a class=\"dropdown-item\"\n");
      out.write("                                                               href=\"student-take-course.html\">Continue</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"list-group-item\" style=\"z-index: initial;\">\n");
      out.write("                                                <div class=\"d-flex align-items-center\">\n");
      out.write("                                                    <a href=\"student-take-course.html\"\n");
      out.write("                                                       class=\"avatar avatar-4by3 avatar-sm mr-3\">\n");
      out.write("                                                        <img src=\"assets/images/nodejs.png\" alt=\"course\"\n");
      out.write("                                                             class=\"avatar-img rounded\">\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"flex\">\n");
      out.write("                                                        <a href=\"student-take-course.html\"\n");
      out.write("                                                           class=\"text-body\"><strong>Bootstrap Foundations</strong></a>\n");
      out.write("                                                        <div class=\"d-flex align-items-center\">\n");
      out.write("                                                            <div class=\"progress\" style=\"width: 100px;\">\n");
      out.write("                                                                <div class=\"progress-bar bg-warning\" role=\"progressbar\"\n");
      out.write("                                                                     style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\"\n");
      out.write("                                                                     aria-valuemax=\"100\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <small class=\"text-muted ml-2\">80%</small>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"dropdown ml-3\">\n");
      out.write("                                                        <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
      out.write("                                                           data-toggle=\"dropdown\">\n");
      out.write("                                                            <i class=\"material-icons\">more_vert</i>\n");
      out.write("                                                        </a>\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                            <a class=\"dropdown-item\"\n");
      out.write("                                                               href=\"student-take-course.html\">Continue</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-5\">\n");
      out.write("                                    <div class=\"card card-2by1\">\n");
      out.write("                                        <div class=\"card-header\">\n");
      out.write("                                            <h4 class=\"card-title\">Rewards</h4>\n");
      out.write("                                            <p class=\"card-subtitle\">Your latest achievements</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body text-center\">\n");
      out.write("                                            <div class=\"btn btn-primary btn-circle\"><i class=\"material-icons\">thumb_up</i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"btn btn-danger btn-circle\"><i class=\"material-icons\">grade</i></div>\n");
      out.write("                                            <div class=\"btn btn-success btn-circle\"><i\n");
      out.write("                                                    class=\"material-icons\">bubble_chart</i></div>\n");
      out.write("                                            <div class=\"btn btn-warning btn-circle\"><i\n");
      out.write("                                                    class=\"material-icons\">keyboard_voice</i></div>\n");
      out.write("                                            <div class=\"btn btn-info btn-circle\"><i\n");
      out.write("                                                    class=\"material-icons\">event_available</i></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee_tab.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- App Settings FAB -->\n");
      out.write("                <!--                <div id=\"app-settings\">\n");
      out.write("                   <app-settings layout-active=\"default\"\n");
      out.write("                                 :layout-location=\"{\n");
      out.write("                   'fixed': 'fixed-student-dashboard.html',\n");
      out.write("                   'default': 'student-dashboard.html'\n");
      out.write("                   }\"\n");
      out.write("                                 sidebar-variant=\"bg-transparent border-0\"></app-settings>\n");
      out.write("                   </div>-->\n");
      out.write("                <!-- jQuery -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/jquery.min.js\"></script>\n");
      out.write("                <!-- Bootstrap -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/popper.min.js\"></script>\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/bootstrap.min.js\"></script>\n");
      out.write("                <!-- Perfect Scrollbar -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.min.js\"></script>\n");
      out.write("                <!-- MDK -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/dom-factory.js\"></script>\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/material-design-kit.js\"></script>\n");
      out.write("                <!-- App JS -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app.js\"></script>\n");
      out.write("                <!-- Highlight.js -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/hljs.js\"></script>\n");
      out.write("                <!-- App Settings (safe to remove) -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app-settings.js\"></script>\n");
      out.write("                <!-- Global Settings -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/settings.js\"></script>\n");
      out.write("                <!-- Moment.js -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment.min.js\"></script>\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment-range.js\"></script>\n");
      out.write("                <!-- Chart.js -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/Chart.min.js\"></script>\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/chartjs.js\"></script>\n");
      out.write("                <!-- Student Dashboard Page JS -->\n");
      out.write("                <!-- <script src=\"assets/js/chartjs-rounded-bar.js\"></script> -->\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/page.student-dashboard.js\"></script>\n");
      out.write("                </body>\n");
      out.write("                <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:01 GMT -->\n");
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
          out.write("\n");
          out.write("                                    <div class=\"col-md-6\">\n");
          out.write("                                        <div class=\"card\">\n");
          out.write("                                            <div class=\"card-body\">\n");
          out.write("                                                <div class=\"d-flex flex-column flex-sm-row\">\n");
          out.write("                                                    <a href=\"instructor-course-edit.html\"\n");
          out.write("                                                       class=\"avatar avatar-lg avatar-4by3 mb-3 w-xs-plus-down-100 mr-sm-3\">\n");
          out.write("                                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.imgAvt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\"\n");
          out.write("                                                             class=\"avatar-img rounded\">\n");
          out.write("                                                    </a>\n");
          out.write("                                                             <a href=\"../conversation?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.mentorID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                 <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"24px\" viewBox=\"0 0 24 24\" width=\"24px\" fill=\"#000000\"><path d=\"M0 0h24v24H0V0z\" fill=\"none\"/><path d=\"M15 4v7H5.17L4 12.17V4h11m1-2H3c-.55 0-1 .45-1 1v14l4-4h10c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm5 4h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7c0-.55-.45-1-1-1z\"/></svg>\n");
          out.write("                                                             </a>\n");
          out.write("                                                    <div class=\"flex\" style=\"min-width: 200px;\">\n");
          out.write("                                                        <!-- <h5 class=\"card-title text-base m-0\"><a href=\"instructor-course-edit.html\"><strong>Learn Vue.js</strong></a></h5> -->\n");
          out.write("                                                        <h4 class=\"card-title mb-1\"><a href=\"instructor-course-edit.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                            </a>\n");
          out.write("                                                        </h4>\n");
          out.write("                                                        <p class=\"text-black-70\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                        </p>\n");
          out.write("                                                        <div class=\"d-flex align-items-end\">\n");
          out.write("                                                            <div class=\"d-flex flex flex-column mr-3\">\n");
          out.write("                                                                <div class=\"d-flex align-items-center py-1 border-bottom\">\n");
          out.write("                                                                    ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                </div>\n");
          out.write("                                                                <div class=\"d-flex align-items-center py-1\">\n");
          out.write("                                                                    <small class=\"text-muted mr-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.yearExperiment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" years experience</small>\n");
          out.write("                                                                    <br/>\n");
          out.write("                                                                    <small class=\"text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtor.education}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("                                                                </div>\n");
          out.write("                                                            </div>\n");
          out.write("                                                            <div class=\"text-center\">\n");
          out.write("                                                                <a href=\"instructor-course-edit.html\"\n");
          out.write("                                                                   class=\"btn btn-sm btn-white\">Edit</a>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"card__options dropdown right-0 pr-2\">\n");
          out.write("                                                <a href=\"#\" class=\"dropdown-toggle text-muted\" data-caret=\"false\"\n");
          out.write("                                                   data-toggle=\"dropdown\">\n");
          out.write("                                                    <i class=\"material-icons\">more_vert</i>\n");
          out.write("                                                </a>\n");
          out.write("                                                <div class=\"dropdown-menu dropdown-menu-right\">\n");
          out.write("                                                    <a class=\"dropdown-item\" href=\"instructor-course-edit.html\">Edit course</a>\n");
          out.write("                                                    <a class=\"dropdown-item\" href=\"#\">Course Insights</a>\n");
          out.write("                                                    <div class=\"dropdown-divider\"></div>\n");
          out.write("                                                    <a class=\"dropdown-item text-danger\" href=\"#\">Delete course</a>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
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
        out.write("\n");
        out.write("                                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"24px\" viewBox=\"0 0 24 24\" width=\"24px\" fill=\"#0000FF\"><path d=\"M0 0h24v24H0V0z\" fill=\"none\"/><path d=\"M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z\"/></svg>\n");
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
          out.write("\n");
          out.write("                                                                        <small class=\"text-black-70 mr-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sList.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
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
