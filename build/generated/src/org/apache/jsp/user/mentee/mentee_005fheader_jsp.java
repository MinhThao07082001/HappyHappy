package org.apache.jsp.user.mentee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mentee_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!-- Header Layout -->\n");
      out.write("<div class=\"mdk-header-layout js-mdk-header-layout\">\n");
      out.write("<!-- Header -->\n");
      out.write("<div id=\"header\" data-fixed class=\"mdk-header js-mdk-header mb-0\">\n");
      out.write("   <div class=\"mdk-header__content\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <nav id=\"default-navbar\" class=\"navbar navbar-expand navbar-dark bg-primary m-0\">\n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("            <!-- Toggle sidebar -->\n");
      out.write("            <button class=\"navbar-toggler d-block\" data-toggle=\"sidebar\" type=\"button\">\n");
      out.write("            <span class=\"material-icons\">menu</span>\n");
      out.write("            </button>\n");
      out.write("            <!-- Brand -->\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-dashboard.html\" class=\"navbar-brand\">\n");
      out.write("            <img src=\"assets/images/logo/white.svg\" class=\"mr-2\" alt=\"LearnPlus\" />\n");
      out.write("            <span class=\"d-none d-xs-md-block\">LearnPlus</span>\n");
      out.write("            </a>\n");
      out.write("            <!-- Search -->\n");
      out.write("            <form class=\"search-form d-none d-md-flex\">\n");
      out.write("               <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("               <button class=\"btn\" type=\"button\"><i\n");
      out.write("                  class=\"material-icons font-size-24pt\">search</i></button>\n");
      out.write("            </form>\n");
      out.write("            <!-- // END Search -->\n");
      out.write("            <div class=\"flex\"></div>\n");
      out.write("            <!-- Menu -->\n");
      out.write("            <ul class=\"nav navbar-nav flex-nowrap d-none d-lg-flex\">\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-forum.html\">Forum</a>\n");
      out.write("               </li>\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-help-center.html\">Get Help</a>\n");
      out.write("               </li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Menu -->\n");
      out.write("            <ul class=\"nav navbar-nav flex-nowrap\">\n");
      out.write("               <li class=\"nav-item d-none d-md-flex\">\n");
      out.write("                  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-cart.html\" class=\"nav-link\">\n");
      out.write("                  <i class=\"material-icons\">shopping_cart</i>\n");
      out.write("                  </a>\n");
      out.write("               </li>\n");
      out.write("               <!-- Notifications dropdown -->\n");
      out.write("               <li class=\"nav-item dropdown dropdown-notifications dropdown-menu-sm-full\">\n");
      out.write("                  <button class=\"nav-link btn-flush dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                     data-dropdown-disable-document-scroll data-caret=\"false\">\n");
      out.write("                  <i class=\"material-icons\">notifications</i>\n");
      out.write("                  <span class=\"badge badge-notifications badge-danger\">2</span>\n");
      out.write("                  </button>\n");
      out.write("                  <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                     <div data-perfect-scrollbar class=\"position-relative\">\n");
      out.write("                        <div class=\"dropdown-header\"><strong>Messages</strong></div>\n");
      out.write("                        <div class=\"list-group list-group-flush mb-0\">\n");
      out.write("                           <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-messages.html\"\n");
      out.write("                              class=\"list-group-item list-group-item-action unread\">\n");
      out.write("                           <span class=\"d-flex align-items-center mb-1\">\n");
      out.write("                           <small class=\"text-muted\">5 minutes ago</small>\n");
      out.write("                           <span class=\"ml-auto unread-indicator bg-primary\"></span>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"d-flex\">\n");
      out.write("                           <span class=\"avatar avatar-xs mr-2\">\n");
      out.write("                           <img src=\"assets/images/people/110/woman-5.jpg\" alt=\"people\"\n");
      out.write("                              class=\"avatar-img rounded-circle\">\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"flex d-flex flex-column\">\n");
      out.write("                           <strong>Michelle</strong>\n");
      out.write("                           <span class=\"text-black-70\">Clients loved the new design.</span>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           </a>\n");
      out.write("                           <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-messages.html\"\n");
      out.write("                              class=\"list-group-item list-group-item-action unread\">\n");
      out.write("                           <span class=\"d-flex align-items-center mb-1\">\n");
      out.write("                           <small class=\"text-muted\">5 minutes ago</small>\n");
      out.write("                           <span class=\"ml-auto unread-indicator bg-primary\"></span>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"d-flex\">\n");
      out.write("                           <span class=\"avatar avatar-xs mr-2\">\n");
      out.write("                           <img src=\"assets/images/people/110/woman-5.jpg\" alt=\"people\"\n");
      out.write("                              class=\"avatar-img rounded-circle\">\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"flex d-flex flex-column\">\n");
      out.write("                           <strong>Michelle</strong>\n");
      out.write("                           <span class=\"text-black-70\">🔥 Superb job..</span>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"dropdown-header\"><strong>System notifications</strong></div>\n");
      out.write("                        <div class=\"list-group list-group-flush mb-0\">\n");
      out.write("                           <a href=\"student-messages.html\"\n");
      out.write("                              class=\"list-group-item list-group-item-action border-left-3 border-left-danger\">\n");
      out.write("                           <span class=\"d-flex align-items-center mb-1\">\n");
      out.write("                           <small class=\"text-muted\">3 minutes ago</small>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"d-flex\">\n");
      out.write("                           <span class=\"avatar avatar-xs mr-2\">\n");
      out.write("                           <span class=\"avatar-title rounded-circle bg-light\">\n");
      out.write("                           <i\n");
      out.write("                              class=\"material-icons font-size-16pt text-danger\">account_circle</i>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"flex d-flex flex-column\">\n");
      out.write("                           <span class=\"text-black-70\">Your profile information has not\n");
      out.write("                           been synced correctly.</span>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           </a>\n");
      out.write("                           <a href=\"student-messages.html\"\n");
      out.write("                              class=\"list-group-item list-group-item-action\">\n");
      out.write("                           <span class=\"d-flex align-items-center mb-1\">\n");
      out.write("                           <small class=\"text-muted\">5 hours ago</small>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"d-flex\">\n");
      out.write("                           <span class=\"avatar avatar-xs mr-2\">\n");
      out.write("                           <span class=\"avatar-title rounded-circle bg-light\">\n");
      out.write("                           <i\n");
      out.write("                              class=\"material-icons font-size-16pt text-success\">group_add</i>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"flex d-flex flex-column\">\n");
      out.write("                           <strong>Adrian. D</strong>\n");
      out.write("                           <span class=\"text-black-70\">Wants to join your private\n");
      out.write("                           group.</span>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           </a>\n");
      out.write("                           <a href=\"student-messages.html\"\n");
      out.write("                              class=\"list-group-item list-group-item-action\">\n");
      out.write("                           <span class=\"d-flex align-items-center mb-1\">\n");
      out.write("                           <small class=\"text-muted\">1 day ago</small>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"d-flex\">\n");
      out.write("                           <span class=\"avatar avatar-xs mr-2\">\n");
      out.write("                           <span class=\"avatar-title rounded-circle bg-light\">\n");
      out.write("                           <i\n");
      out.write("                              class=\"material-icons font-size-16pt text-warning\">storage</i>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"flex d-flex flex-column\">\n");
      out.write("                           <span class=\"text-black-70\">Your deploy was successful.</span>\n");
      out.write("                           </span>\n");
      out.write("                           </span>\n");
      out.write("                           </a>\n");
      out.write("                        </div>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </li>\n");
      out.write("               <!-- // END Notifications dropdown -->\n");
      out.write("               <!-- User dropdown -->\n");
      out.write("               <li class=\"nav-item dropdown ml-1 ml-md-3\">\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\"\n");
      out.write("                     data-toggle=\"dropdown\"\n");
      out.write("                     href=\"#\"\n");
      out.write("                     role=\"button\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                     alt=\"Avatar\"\n");
      out.write("                     class=\"rounded-circle\"\n");
      out.write("                     width=\"40\"></a>\n");
      out.write("                  <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                     <a class=\"dropdown-item\"\n");
      out.write("                        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/mentee/editprofile\">\n");
      out.write("                     <i class=\"material-icons\">edit</i> Edit Account\n");
      out.write("                     </a>\n");
      out.write("                     <a class=\"dropdown-item\"\n");
      out.write("                        href=\"student-profile.html\">\n");
      out.write("                     <i class=\"material-icons\">person</i> Public Profile\n");
      out.write("                     </a>\n");
      out.write("                     <a class=\"dropdown-item\"\n");
      out.write("                        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/signout\">\n");
      out.write("                     <i class=\"material-icons\">lock</i> Logout\n");
      out.write("                     </a>\n");
      out.write("                  </div>\n");
      out.write("               </li>\n");
      out.write("               <!-- // END User dropdown -->\n");
      out.write("            </ul>\n");
      out.write("            <!-- // END Menu -->\n");
      out.write("         </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- // END Navbar -->\n");
      out.write("   </div>\n");
      out.write("</div>");
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
