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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>AdminLTE 3 | General Form Elements</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../dist/css/adminlte.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("\n");
      out.write("            <!-- /.navbar -->\n");
      out.write("\n");
      out.write("            <!-- Main Sidebar Container -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin-header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h1>Mentee list</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\">Mentee list</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <form class=\"form-horizontal\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"form-group row\">\n");
      out.write("                    <label for=\"inputEmail3\" class=\"col-sm-2 col-form-label\">Email</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                      <input type=\"email\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group row\">\n");
      out.write("                    <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">Password</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group row\">\n");
      out.write("                    <div class=\"offset-sm-2 col-sm-10\">\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                        <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck2\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"exampleCheck2\">Remember me</label>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.card-body -->\n");
      out.write("                <div class=\"card-footer\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-info\">Sign in</button>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-default float-right\">Cancel</button>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.card-footer -->\n");
      out.write("              </form>\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin-footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Control Sidebar -->\n");
      out.write("            <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("                <!-- Control sidebar content goes here -->\n");
      out.write("            </aside>\n");
      out.write("            <!-- /.control-sidebar -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"../../plugins/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <script src=\"../../plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- bs-custom-file-input -->\n");
      out.write("        <script src=\"../../plugins/bs-custom-file-input/bs-custom-file-input.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"../../dist/js/adminlte.min.js\"></script>\n");
      out.write("        <!-- AdminLTE for demo purposes -->\n");
      out.write("        <script src=\"../../dist/js/demo.js\"></script>\n");
      out.write("        <!-- Page specific script -->\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                bsCustomFileInput.init();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
