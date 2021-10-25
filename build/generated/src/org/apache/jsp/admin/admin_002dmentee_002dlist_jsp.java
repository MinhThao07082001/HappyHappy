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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>AdminLTE 3 | DataTables</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- DataTables -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/datatables-responsive/css/responsive.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/datatables-buttons/css/buttons.bootstrap4.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/dist/css/adminlte.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\n");
      out.write("                <!-- Left navbar links -->\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                        <a href=\"assets/index3.html\" class=\"nav-link\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!-- Right navbar links -->\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <!-- Navbar Search -->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"navbar-search\" href=\"#\" role=\"button\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"navbar-search-block\">\n");
      out.write("                            <form class=\"form-inline\">\n");
      out.write("                                <div class=\"input-group input-group-sm\">\n");
      out.write("                                    <input class=\"form-control form-control-navbar\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                    <div class=\"input-group-append\">\n");
      out.write("                                        <button class=\"btn btn-navbar\" type=\"submit\">\n");
      out.write("                                            <i class=\"fas fa-search\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button class=\"btn btn-navbar\" type=\"button\" data-widget=\"navbar-search\">\n");
      out.write("                                            <i class=\"fas fa-times\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <!-- Messages Dropdown Menu -->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"far fa-comments\"></i>\n");
      out.write("                            <span class=\"badge badge-danger navbar-badge\">3</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <!-- Message Start -->\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <img src=\"assets/dist/img/user1-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 mr-3 img-circle\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3 class=\"dropdown-item-title\">\n");
      out.write("                                            Brad Diesel\n");
      out.write("                                            <span class=\"float-right text-sm text-danger\"><i class=\"fas fa-star\"></i></span>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <p class=\"text-sm\">Call me whenever you can...</p>\n");
      out.write("                                        <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Message End -->\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <!-- Message Start -->\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <img src=\"assets/dist/img/user8-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 img-circle mr-3\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3 class=\"dropdown-item-title\">\n");
      out.write("                                            John Pierce\n");
      out.write("                                            <span class=\"float-right text-sm text-muted\"><i class=\"fas fa-star\"></i></span>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <p class=\"text-sm\">I got your message bro</p>\n");
      out.write("                                        <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Message End -->\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <!-- Message Start -->\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <img src=\"assets/dist/img/user3-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 img-circle mr-3\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3 class=\"dropdown-item-title\">\n");
      out.write("                                            Nora Silvester\n");
      out.write("                                            <span class=\"float-right text-sm text-warning\"><i class=\"fas fa-star\"></i></span>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <p class=\"text-sm\">The subject goes here</p>\n");
      out.write("                                        <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Message End -->\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item dropdown-footer\">See All Messages</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Notifications Dropdown Menu -->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"far fa-bell\"></i>\n");
      out.write("                            <span class=\"badge badge-warning navbar-badge\">15</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\n");
      out.write("                            <span class=\"dropdown-item dropdown-header\">15 Notifications</span>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <i class=\"fas fa-envelope mr-2\"></i> 4 new messages\n");
      out.write("                                <span class=\"float-right text-muted text-sm\">3 mins</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <i class=\"fas fa-users mr-2\"></i> 8 friend requests\n");
      out.write("                                <span class=\"float-right text-muted text-sm\">12 hours</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <i class=\"fas fa-file mr-2\"></i> 3 new reports\n");
      out.write("                                <span class=\"float-right text-muted text-sm\">2 days</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item dropdown-footer\">See All Notifications</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"fullscreen\" href=\"#\" role=\"button\">\n");
      out.write("                            <i class=\"fas fa-expand-arrows-alt\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"control-sidebar\" data-slide=\"true\" href=\"#\" role=\"button\">\n");
      out.write("                            <i class=\"fas fa-th-large\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
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
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"card-title\">Mentor list</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-header -->\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <table id=\"example2\" class=\"table table-bordered table-hover\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>ID</th>\n");
      out.write("                                                    <th>Name</th>\n");
      out.write("                                                    <th>Email</th>\n");
      out.write("                                                    <th>Status</th>\n");
      out.write("                                                    <th>Date Created</th>\n");
      out.write("                                                    <th>Action</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                            <tfoot>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>ID</th>\n");
      out.write("                                                    <th>Name</th>\n");
      out.write("                                                    <th>Email</th>\n");
      out.write("                                                    <th>Status</th>\n");
      out.write("                                                    <th>Date Created</th>\n");
      out.write("                                                    <th>Action</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tfoot>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-body -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.card -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- /.card -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("                </section>\n");
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
      out.write("        <script src=\"assets/plugins/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <script src=\"assets/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- DataTables  & Plugins -->\n");
      out.write("        <script src=\"assets/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-responsive/js/dataTables.responsive.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-responsive/js/responsive.bootstrap4.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.bootstrap4.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/jszip/jszip.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/pdfmake/pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/pdfmake/vfs_fonts.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.html5.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.print.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/datatables-buttons/js/buttons.colVis.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"assets/dist/js/adminlte.min.js\"></script>\n");
      out.write("        <!-- AdminLTE for demo purposes -->\n");
      out.write("        <script src=\"assets/dist/js/demo.js\"></script>\n");
      out.write("        <!-- Page specific script -->\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#example1\").DataTable({\n");
      out.write("                    \"responsive\": true, \"lengthChange\": false, \"autoWidth\": false,\n");
      out.write("                    \"buttons\": [\"copy\", \"csv\", \"excel\", \"pdf\", \"print\", \"colvis\"]\n");
      out.write("                }).buttons().container().appendTo('#example1_wrapper .col-md-6:eq(0)');\n");
      out.write("                $('#example2').DataTable({\n");
      out.write("                    \"paging\": true,\n");
      out.write("                    \"lengthChange\": false,\n");
      out.write("                    \"searching\": false,\n");
      out.write("                    \"ordering\": true,\n");
      out.write("                    \"info\": true,\n");
      out.write("                    \"autoWidth\": false,\n");
      out.write("                    \"responsive\": true,\n");
      out.write("                });\n");
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
          out.write("\n");
          out.write("                                                    <tr>\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.menteeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                        </td>\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mtee.createTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                        <td><a href=\"#\">Details</a></td>\n");
          out.write("                                                    </tr>\n");
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
