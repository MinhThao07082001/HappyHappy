package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dsignin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Happy Happy Admin</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("        <!-- Theme style -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/dist/css/adminlte.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/images/background.jpg') ;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"login\">\r\n");
      out.write("        <div class=\"d-flex align-items-center\"\r\n");
      out.write("             style=\"min-height: 100vh\">\r\n");
      out.write("            <div class=\"col-sm-8 col-md-6 col-lg-4 mx-auto\"\r\n");
      out.write("                 style=\"min-width: 300px;\">\r\n");
      out.write("                ");
 
                    if(request.getAttribute("mess")!=null){
                
      out.write("\r\n");
      out.write("                <script> alert(\"");
      out.print( request.getAttribute("mess"));
      out.write("\")</script>\r\n");
      out.write("                ");

                  }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"card navbar-shadow form\" style=\"border-radius: 20px;\">\r\n");
      out.write("                    <div class=\"text-center mt-5 mb-1\">\r\n");
      out.write("                        <div class=\"avatar avatar-lg\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/images/logo/logo.svg\" class=\"mr-2pt\" style=\"width: 90px;height: 50px\" alt=\"LearnPlus\" />\r\n");
      out.write("\r\n");
      out.write("                              \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card-header text-center\">\r\n");
      out.write("                       \r\n");
      out.write("                        <p class=\"card-subtitle\" style=\"color: gray\">Access admin account</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"form-horizontal\" action=\"signin\" method=\"post\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label for=\"inputEmail3\" class=\"col-md-6 col-form-label\" style=\"color: grey\">Username</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"Username\" name=\"username\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label for=\"inputPassword3\" class=\"col-md-6 col-form-label\" style=\"color: grey\">Password</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\" name=\"password\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <div class=\"offset-sm-2 col-sm-10\">\r\n");
      out.write("                                                    <div class=\"form-check\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- /.card-body -->\r\n");
      out.write("                                        <div class=\"card-footer\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-info\" style=\"background-color:#94B85E\">Sign in</button>\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-default float-right\" style=\"background-color: #94B85E\">Cancel</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- /.card-footer -->\r\n");
      out.write("                                    </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"user/assets/vendor/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"user/assets/vendor/popper.min.js\"></script> \r\n");
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
      out.write("        <script src=\"assets/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap 4 -->\r\n");
      out.write("        <script src=\"assets/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- bs-custom-file-input -->\r\n");
      out.write("        <script src=\"assets/plugins/bs-custom-file-input/bs-custom-file-input.min.js\"></script>\r\n");
      out.write("        <!-- AdminLTE App -->\r\n");
      out.write("        <script src=\"assets/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("        <!-- AdminLTE for demo purposes -->\r\n");
      out.write("        <script src=\"assets/dist/js/demo.js\"></script>\r\n");
      out.write("        <!-- Page specific script -->\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                bsCustomFileInput.init();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
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
