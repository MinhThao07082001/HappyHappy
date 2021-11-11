package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dmentee_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>AdminLTE 3 | DataTables</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("        <!-- DataTables -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/datatables-responsive/css/responsive.bootstrap4.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/datatables-buttons/css/buttons.bootstrap4.min.css\">\r\n");
      out.write("        <!-- Theme style -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/dist/css/adminlte.min.css\">\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <!-- Navbar -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Main Sidebar Container -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin-header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Content Header (Page header) -->\r\n");
      out.write("                <section class=\"content-header\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row mb-2\">\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <h1>Mentee list</h1>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/home\">Home</a></li>\r\n");
      out.write("                                    <li class=\"breadcrumb-item active\">Mentee list</li>\r\n");
      out.write("                                </ol>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- /.container-fluid -->\r\n");
      out.write("                </section>\r\n");
      out.write("\r\n");
      out.write("                <!-- Main content -->\r\n");
      out.write("                <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\">\r\n");
      out.write("                                        <h3 class=\"card-title h3\" >Mentee list</h3>\r\n");
      out.write("                                        <form class=\"form-inline\" action=\"mentee\" method=\"GET\"> \r\n");
      out.write("                                            <div class=\"input-group input-group-sm\" style=\"padding-left: 20px\">\r\n");
      out.write("\r\n");
      out.write("                                                <input  class=\"form-control form-control-navbar\" name=\"searchString\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"input-group-append\">\r\n");
      out.write("                                                    <button class=\"btn btn-navbar\" type=\"submit\">\r\n");
      out.write("                                                        <i class=\"fas fa-search\"></i>\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- /.card-header -->\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <table id=\"example2\" class=\"table table-bordered table-hover\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>ID</th>\r\n");
      out.write("                                                    <th>Name</th>\r\n");
      out.write("                                                    <th>Email</th>\r\n");
      out.write("                                                    <th>Date Created</th>\r\n");
      out.write("                                                    <th>Action</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <tfoot>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>ID</th>\r\n");
      out.write("                                                    <th>Name</th>\r\n");
      out.write("                                                    <th>Email</th>\r\n");
      out.write("                                                    <th>Date Created</th>\r\n");
      out.write("                                                    <th>Action</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tfoot>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- /.card-body -->\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.col -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.row -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.container-fluid -->\r\n");
      out.write("                </section>\r\n");
      out.write("                <!-- /.content -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.content-wrapper -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin-footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Control Sidebar -->\r\n");
      out.write("            <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("                <!-- Control sidebar content goes here -->\r\n");
      out.write("            </aside>\r\n");
      out.write("            <!-- /.control-sidebar -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"assets/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap 4 -->\r\n");
      out.write("        <script src=\"assets/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- DataTables  & Plugins -->\r\n");
      out.write("        <script src=\"assets/plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-responsive/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-responsive/js/responsive.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/jszip/jszip.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/pdfmake/pdfmake.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/pdfmake/vfs_fonts.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.html5.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.print.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.colVis.min.js\"></script>\r\n");
      out.write("        <!-- AdminLTE App -->\r\n");
      out.write("        <script src=\"assets/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("        <!-- AdminLTE for demo purposes -->\r\n");
      out.write("        <script src=\"assets/dist/js/demo.js\"></script>\r\n");
      out.write("        <!-- Page specific script -->\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $(\"#example1\").DataTable({\r\n");
      out.write("                    \"responsive\": true, \"lengthChange\": false, \"autoWidth\": false,\r\n");
      out.write("                    \"buttons\": [\"copy\", \"csv\", \"excel\", \"pdf\", \"print\", \"colvis\"]\r\n");
      out.write("                }).buttons().container().appendTo('#example1_wrapper .col-md-6:eq(0)');\r\n");
      out.write("                $('#example2').DataTable({\r\n");
      out.write("                    \"paging\": true,\r\n");
      out.write("                    \"lengthChange\": false,\r\n");
      out.write("                    \"searching\": false,\r\n");
      out.write("                    \"ordering\": true,\r\n");
      out.write("                    \"info\": true,\r\n");
      out.write("                    \"autoWidth\": false,\r\n");
      out.write("                    \"responsive\": true,\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("mtee");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mteeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <tr>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.menteeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.createTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td><a href=\"../admin/mteeDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.menteeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Details</a></td>\r\n");
          out.write("                                                    </tr>\r\n");
          out.write("                                                ");
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
}
