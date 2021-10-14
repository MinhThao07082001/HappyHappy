package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\"\r\n");
      out.write("      dir=\"ltr\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:28 GMT -->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\r\n");
      out.write("              content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\"\r\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Sign In</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\r\n");
      out.write("        <meta name=\"robots\"\r\n");
      out.write("              content=\"noindex\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Perfect Scrollbar -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"user/assets/vendor/perfect-scrollbar.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Material Design Icons -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"user/assets/css/material-icons.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome Icons -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"user/assets/css/fontawesome.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"user/assets/vendor/spinkit.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- App CSS -->\r\n");
      out.write("        <link type=\"text/css\"\r\n");
      out.write("              href=\"user/assets/css/app.css\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                background-image: url('user/assets/images/background.jpg') ;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .logo{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 100%\r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"login\">\r\n");
      out.write("        <div class=\"d-flex align-items-center\"\r\n");
      out.write("             style=\"min-height: 100vh\">\r\n");
      out.write("            <div class=\"col-sm-8 col-md-6 col-lg-4 mx-auto\"\r\n");
      out.write("                 style=\"min-width: 300px;\">\r\n");
      out.write("                ");

                    if (request.getAttribute("error") != null) {
                
      out.write("\r\n");
      out.write("                <p style=\"color: yellow; background: red;margin: 0;font-size: x-large;\" align=\"center\" >");
      out.print( request.getAttribute("error"));
      out.write("</p>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"card navbar-shadow form\" style=\"border-radius: 20px;\">\r\n");
      out.write("                    <div class=\"text-center mt-5 mb-1\">\r\n");
      out.write("                        <div class=\"avatar avatar-lg\">\r\n");
      out.write("                            <img class=\"logo\"  src=\"user/assets/images/logo/logo.svg\"\r\n");
      out.write("                                \r\n");
      out.write("                                 alt=\"LearnPlus\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  \r\n");
      out.write("                    <div class=\"card-header text-center\">\r\n");
      out.write("                        <h4 class=\"card-title\">Sign In</h4>\r\n");
      out.write("                        <p class=\"card-subtitle\">Access your account</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                        <form action=\"signin\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"form-label\"\r\n");
      out.write("                                       for=\"email\">Your email address:<span style=\"color:red\">*</span></label>\r\n");
      out.write("                                <div class=\"input-group input-group-merge\">\r\n");
      out.write("                                    <input id=\"email\"\r\n");
      out.write("                                           type=\"email\"\r\n");
      out.write("                                           name=\"email\"\r\n");
      out.write("                                           required=\"\"\r\n");
      out.write("                                           class=\"form-control form-control-prepended\"\r\n");
      out.write("                                           placeholder=\"Your email address\">\r\n");
      out.write("                                    <div class=\"input-group-prepend\">\r\n");
      out.write("                                        <div class=\"input-group-text\">\r\n");
      out.write("                                            <span class=\"far fa-envelope\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"form-label\"\r\n");
      out.write("                                       for=\"password\">Your password:<span style=\"color:red\">*</span></label>\r\n");
      out.write("                                <div class=\"input-group input-group-merge\">\r\n");
      out.write("                                    <input id=\"password\"\r\n");
      out.write("                                           type=\"password\"\r\n");
      out.write("                                           name=\"password\"\r\n");
      out.write("                                           required=\"\"\r\n");
      out.write("                                           class=\"form-control form-control-prepended\"\r\n");
      out.write("                                           placeholder=\"Your password\">\r\n");
      out.write("                                    <div class=\"input-group-prepend\">\r\n");
      out.write("                                        <div class=\"input-group-text\">\r\n");
      out.write("                                            <span class=\"far fa-key\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group \" style=\"text-align: center;\" >\r\n");
      out.write("                                <button type=\"submit \" style=\"border-radius: 10px; background-color: #94B85E; width: 30%; \"\r\n");
      out.write("                                        class=\"btn btn-primary btn-block\">\r\n");
      out.write("                                    Sign In\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <a href=\"confirm\"\r\n");
      out.write("                                   class=\"text-black-70\"\r\n");
      out.write("                                   style=\"text-decoration: underline;\">Forgot Password?</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer text-center text-black-50\">\r\n");
      out.write("                        Not yet an user? <a style=\"color:#94B85E;\" href=\"signup\">Sign Up</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"user/assets/vendor/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"user/assets/vendor/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"user/assets/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Perfect Scrollbar -->\r\n");
      out.write("        <script src=\"user/assets/vendor/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- MDK -->\r\n");
      out.write("        <script src=\"user/assets/vendor/dom-factory.js\"></script>\r\n");
      out.write("        <script src=\"user/assets/vendor/material-design-kit.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- App JS -->\r\n");
      out.write("        <script src=\"user/assets/js/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Highlight.js -->\r\n");
      out.write("        <script src=\"user/assets/js/hljs.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- App Settings (safe to remove) -->\r\n");
      out.write("        <script src=\"user/assets/js/app-settings.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:29 GMT -->\r\n");
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
