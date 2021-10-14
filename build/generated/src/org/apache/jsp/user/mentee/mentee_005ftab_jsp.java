package org.apache.jsp.user.mentee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mentee_005ftab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"mdk-drawer js-mdk-drawer\" id=\"default-drawer\">\r\n");
      out.write("   <div class=\"mdk-drawer__content \">\r\n");
      out.write("      <div class=\"sidebar sidebar-left sidebar-dark bg-dark o-hidden\" data-perfect-scrollbar>\r\n");
      out.write("         <div class=\"sidebar-p-y\">\r\n");
      out.write("            <ul class=\"sidebar-menu sm-active-button-bg\">\r\n");
      out.write("               <li class=\"sidebar-menu-item active\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-dashboard.html\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">account_box</i>\r\n");
      out.write("                  Student\r\n");
      out.write("                  </a>\r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Account menu -->\r\n");
      out.write("            <div class=\"sidebar-heading\">Account</div>\r\n");
      out.write("            <ul class=\"sidebar-menu\">\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button sidebar-js-collapse\"\r\n");
      out.write("                     data-toggle=\"collapse\" href=\"#account_menu\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">person_outline</i>\r\n");
      out.write("                  Account\r\n");
      out.write("                  <span class=\"ml-auto sidebar-menu-toggle-icon\"></span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <ul class=\"sidebar-submenu sm-indent collapse\" id=\"account_menu\">\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\"\r\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/forgetchangepassword\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Forgot Password</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\"\r\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/mentee/editprofile\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Edit Account</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\"\r\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-account-edit-basic.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Basic Information</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\"\r\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-account-edit-profile.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Profile &amp; Privacy</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\"\r\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-account-billing-payment-information.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Payment Information</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-billing.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Payment History</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-invoice.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Student Invoice</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/instructor-invoice.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Instructor Invoice</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\"\r\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/instructor-edit-invoice.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Edit Invoice</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" data-toggle=\"collapse\"\r\n");
      out.write("                     href=\"#messages_menu\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">comment</i>\r\n");
      out.write("                  Messages\r\n");
      out.write("                  <span class=\"ml-auto sidebar-menu-toggle-icon\"></span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <ul class=\"sidebar-submenu sm-indent collapse\" id=\"messages_menu\">\r\n");
      out.write("                     <li class=\"sidebar-menu-item\">\r\n");
      out.write("                        <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-messages.html\">\r\n");
      out.write("                        <span class=\"sidebar-menu-text\">Conversation</span>\r\n");
      out.write("                        <span\r\n");
      out.write("                           class=\"sidebar-menu-badge badge badge-primary badge-notifications ml-auto\">2</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"sidebar-heading\">Student</div>\r\n");
      out.write("            <ul class=\"sidebar-menu sm-active-button-bg\">\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-browse-courses.html\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">search</i>\r\n");
      out.write("                  Search Course\r\n");
      out.write("                  </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-view-course.html\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">import_contacts</i>\r\n");
      out.write("                  View Course\r\n");
      out.write("                  </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-my-courses.html\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">school</i>\r\n");
      out.write("                  My Courses\r\n");
      out.write("                  </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/student-help-center.html\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">live_help</i>\r\n");
      out.write("                  Get Help\r\n");
      out.write("                  </a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"sidebar-menu-item\">\r\n");
      out.write("                  <a class=\"sidebar-menu-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/guest-login.html\">\r\n");
      out.write("                  <i\r\n");
      out.write("                     class=\"sidebar-menu-icon sidebar-menu-icon--left material-icons\">lock_open</i>\r\n");
      out.write("                  Logout\r\n");
      out.write("                  </a>\r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- App Settings FAB -->\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--End Of Navbar-->");
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
