package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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

      out.write("<html lang=\"en\"\n");
      out.write("      dir=\"ltr\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\n");
      out.write("              content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\"\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Instructor - Public profile</title>\n");
      out.write("\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\n");
      out.write("        <meta name=\"robots\"\n");
      out.write("              content=\"noindex\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("        <style>\n");
      out.write("            div th td{\n");
      out.write("                display:flex;\n");
      out.write("                justify-content:flex-end;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\" layout-fluid\" style=\"background-color: #eaf4fc\">\n");
      out.write("\n");
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
      out.write("        <div class=\"mdk-header-layout js-mdk-header-layout\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"mdk-header-layout__content\">\n");
      out.write("                <div data-push\n");
      out.write("                     data-responsive-width=\"992px\"\n");
      out.write("                     class=\"mdk-drawer-layout js-mdk-drawer-layout\">\n");
      out.write("                    <div class=\"mdk-drawer-layout__content page \">\n");
      out.write("                        <div class=\"container-fluid page__container\">\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/home\">Home</a></li>\n");
      out.write("                                <li class=\"breadcrumb-item active\">Request Mentor</li>\n");
      out.write("                            </ol>\n");
      out.write("                            <div class=\"card-header flex-container \" >\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <div class=\"media align-items-center\">\n");
      out.write("                                            <div class=\"media-body\">\n");
      out.write("                                                <h4 class=\"card-title \" style=\"font-weight: bold ;text-transform: uppercase\">Request Form</h4>      \n");
      out.write("                                                <p class=\"card-subtitle\">Your request create</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <form action=\"createRequest\" method=\"POST\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header\">\n");
      out.write("                                            <div class=\"media align-items-center\">\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p><strong>1.Subject's Information</strong></p>\n");
      out.write("                                                    Subject: <select name=\"subject\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                    Level: <select name=\"level\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                    </br>\n");
      out.write("                                                    </br>\n");
      out.write("                                                    CourseType: \n");
      out.write("                                                    <select name=\"learnType\">\n");
      out.write("                                                        <option value=\"1\">Offline</option>\n");
      out.write("                                                        <option value=\"2\">Online</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>          \n");
      out.write("\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header\">\n");
      out.write("                                            <div class=\"media align-items-center\">\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p><strong>2.Time and Fees</strong></p>\n");
      out.write("                                                    Budget per lesson: </br>\n");
      out.write("                                                    <input type=\"number\" name=\"moneyPerSlot\" style=\"border-radius:  5px\"> </br></br> \n");
      out.write("                                                    Length of each lesson: </br> \n");
      out.write("                                                    <input type=\"number\" name=\"timePerSlot\" style=\"border-radius:  5px\"></br></br>\n");
      out.write("                                                    <div class=\"row\">     \n");
      out.write("                                                        <div class=\" col-6\">\n");
      out.write("                                                            Start Time: <input  type=\"date\" name=\"startTime\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-6\">\n");
      out.write("                                                            End Time: <input  type=\"date\" name=\"endTime\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    </br> \n");
      out.write("                                                    <table>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td></td>\n");
      out.write("                                                            <td>Monday</td>\n");
      out.write("                                                            <td>Tuesday</td>\n");
      out.write("                                                            <td>Wednesday</td>\n");
      out.write("                                                            <td>Thursday</td>\n");
      out.write("                                                            <td>Friday</td>\n");
      out.write("                                                            <td>Saturday</td>\n");
      out.write("                                                            <td>Sunday</td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>From</td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"2\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"3\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"4\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"5\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"6\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"7\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"8\" class=\"time\"></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>To</td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"2\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"3\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"4\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"5\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"6\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"7\" class=\"time\"></td>\n");
      out.write("                                                            <td><input type=\"time\" name=\"8\" class=\"time\"></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <div class=\"card-header\">\n");
      out.write("                                            <div class=\"media align-items-center\">\n");
      out.write("                                                <div class=\"media-body\">\n");
      out.write("                                                    <p><strong> 3.Mentee's expectation from Mentor</strong></p>\n");
      out.write("\n");
      out.write("                                                    Detail Description: </br>\n");
      out.write("                                                    <textarea type=\"text\" name=\"description\" rows=\"4\" cols=\"70\"> </textarea></br>   \n");
      out.write("                                                    <input type=\"text\" id=\"timeJson\" name=\"timeJson\" hidden>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group \" style=\"text-align: center;\">\n");
      out.write("                                        <button type=\"submit \" style=\"border-radius: 5px; width: 10%;\"\n");
      out.write("                                                class=\"btn btn-primary\">\n");
      out.write("                                            Submit\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Nav Tab-->\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <!--End of Nav Tab-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/popper.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Perfect Scrollbar -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.min.js\"></script>\n");
      out.write("        <!-- MDK -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/dom-factory.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/material-design-kit.js\"></script>\n");
      out.write("        <!-- App JS -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app.js\"></script>\n");
      out.write("        <!-- Highlight.js -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/hljs.js\"></script>\n");
      out.write("        <!-- App Settings (safe to remove) -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app-settings.js\"></script>\n");
      out.write("        <!-- Global Settings -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/settings.js\"></script>\n");
      out.write("        <!-- Moment.js -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment-range.js\"></script>\n");
      out.write("        <!-- Chart.js -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/Chart.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/chartjs.js\"></script>\n");
      out.write("        <!-- Student Dashboard Page JS -->\n");
      out.write("        <!-- <script src=\"assets/js/chartjs-rounded-bar.js\"></script> -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/page.student-dashboard.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var arr = [];\n");
      out.write("                for (let i = 2; i <= 8; i++) {\n");
      out.write("                    const day = {\n");
      out.write("                        day: i,\n");
      out.write("                        from: document.getElementsByName(i)[0].value,\n");
      out.write("                        to: document.getElementsByName(i)[1].value\n");
      out.write("                    };\n");
      out.write("                    arr.push(day);\n");
      out.write("                }\n");
      out.write("                var jsonArr = JSON.stringify(arr);\n");
      out.write("                var inputTime = document.getElementById(\"timeJson\");\n");
      out.write("                inputTime.value = jsonArr;\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var elements = document.getElementsByClassName(\"time\");\n");
      out.write("            var func = function () {\n");
      out.write("                var arr = [];\n");
      out.write("                for (let i = 2; i <= 8; i++) {\n");
      out.write("                    const day = {\n");
      out.write("                        day: i,\n");
      out.write("                        from: document.getElementsByName(i)[0].value,\n");
      out.write("                        to: document.getElementsByName(i)[1].value\n");
      out.write("                    };\n");
      out.write("                    arr.push(day);\n");
      out.write("                }\n");
      out.write("                var jsonArr = JSON.stringify(arr);\n");
      out.write("                var inputTime = document.getElementById(\"timeJson\");\n");
      out.write("                inputTime.value = jsonArr;\n");
      out.write("            }\n");
      out.write("            for (var i = 0; i < elements.length; i++) {\n");
      out.write("                elements[i].addEventListener('input', func, false);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            document.querySelectorAll('.time-start').forEach(item => {\n");
      out.write("                item.addEventListener('input', event => {\n");
      out.write("                    //handle click\n");
      out.write("                    var time = document.getElementById(\"timePerSlot\").value.length === 0 ? 0 : document.getElementById(\"timePerSlot\").value;\n");
      out.write("                    var toTime = document.getElementsByName(item.name)[1];\n");
      out.write("                    const timeArr = item.value.split(\":\");\n");
      out.write("                    var min = parseInt(timeArr[0]) * 60 + parseInt(timeArr[1]) + parseInt(time);\n");
      out.write("                    if (min > 1440) {\n");
      out.write("                        alert(\"Fix time per slot\")\n");
      out.write("                    } else {\n");
      out.write("                        if (parseInt(min / 60) < 10) {\n");
      out.write("                            if (min % 60 < 10) {\n");
      out.write("                                toTime.value = '0' + parseInt(min / 60) + \":\" + \"0\" + min % 60;\n");
      out.write("\n");
      out.write("                            } else {\n");
      out.write("                                toTime.value = '0' + parseInt(min / 60) + \":\" + min % 60;\n");
      out.write("                            }\n");
      out.write("                        } else {\n");
      out.write("                            if (min % 60 < 10) {\n");
      out.write("                                toTime.value = parseInt(min / 60) + \":\" + \"0\" + min % 60;\n");
      out.write("\n");
      out.write("                            } else {\n");
      out.write("                                toTime.value = parseInt(min / 60) + \":\" + min % 60;\n");
      out.write("                            }\n");
      out.write("                            toTime.value = parseInt(min / 60) + \":\" + min % 60;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("//                    console.log(parseInt(timeArr[0])*60 + parseInt(timeArr[1]) + parseInt(time))\n");
      out.write("\n");
      out.write("//                    alert(\"blah\");\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userCommon.role eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentor/mentor_header.jsp", out, false);
        out.write("\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userCommon.role eq 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee/mentee_header.jsp", out, false);
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sNameList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("sName");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(12);
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                Grade ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                            </option>\n");
          out.write("                                                        ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userCommon.role eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentor/mentor_tab.jsp", out, false);
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userCommon.role eq 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee/mentee_tab.jsp", out, false);
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
