package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_002drequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\"\r\n");
      out.write("      dir=\"ltr\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\r\n");
      out.write("              content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\"\r\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Instructor - Public profile</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\r\n");
      out.write("        <meta name=\"robots\"\r\n");
      out.write("              content=\"noindex\">\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            div th td{\r\n");
      out.write("                display:flex;\r\n");
      out.write("                justify-content:flex-end;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body class=\" layout-fluid\" style=\"background-color: #eaf4fc\">\r\n");
      out.write("\r\n");
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
      out.write("        <div class=\"mdk-header-layout js-mdk-header-layout\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mdk-header-layout__content\">\r\n");
      out.write("\r\n");
      out.write("                <div data-push\r\n");
      out.write("                     data-responsive-width=\"992px\"\r\n");
      out.write("                     class=\"mdk-drawer-layout js-mdk-drawer-layout\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mdk-drawer-layout__content page \">\r\n");
      out.write("                        <div class=\"container-fluid page__container\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/home\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\">Request Mentor</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card-header flex-container \" >\r\n");
      out.write("                                        <div class=\"media align-items-center\">\r\n");
      out.write("                                            <div class=\"media-body\">\r\n");
      out.write("                                                <h4 class=\"card-title \" style=\"font-weight: bold ;text-transform: uppercase\">Request Form</h4>      \r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <p><strong>1.Subject's Information</strong></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <form action=\"createRequest\" method=\"POST\">\r\n");
      out.write("                                                    Subject: <select name=\"subject\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    Level: <select name=\"level\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </select>\r\n");
      out.write("\r\n");
      out.write("                                                    </br>\r\n");
      out.write("                                                    </br>\r\n");
      out.write("                                                    CourseType: \r\n");
      out.write("                                                    <select name=\"learnType\">\r\n");
      out.write("                                                        <option value=\"1\">Offline</option>\r\n");
      out.write("                                                        <option value=\"2\">Online</option>\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                    </br>\r\n");
      out.write("                                    </br>\r\n");
      out.write("                                                    <p><strong>2.Time and Fees</strong></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    Budget per lesson: </br>\r\n");
      out.write("                                                    <input type=\"number\" name=\"moneyPerSlot\" style=\"border-radius:  5px\"> </br></br> \r\n");
      out.write("                                                    Length of each lesson: </br> \r\n");
      out.write("                                    <input type=\"number\" id=\"timePerSlot\" name=\"timePerSlot\" style=\"border-radius:  5px\"></br></br>\r\n");
      out.write("                                                    <div class=\"row\">     \r\n");
      out.write("                                                        <div class=\" col-6\">\r\n");
      out.write("                                                            Start Time: <input  type=\"date\" name=\"startTime\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-6\">\r\n");
      out.write("                                                            End Time: <input  type=\"date\" name=\"endTime\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    </br> \r\n");
      out.write("\r\n");
      out.write("                                                    <table>\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <td></td>\r\n");
      out.write("                                                            <td>Monday</td>\r\n");
      out.write("                                                            <td>Tuesday</td>\r\n");
      out.write("                                                            <td>Wednesday</td>\r\n");
      out.write("                                                            <td>Thursday</td>\r\n");
      out.write("                                                            <td>Friday</td>\r\n");
      out.write("                                                            <td>Saturday</td>\r\n");
      out.write("                                                            <td>Sunday</td>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <td>From</td>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <td>To</td>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </table>\r\n");
      out.write("                                    </br>\r\n");
      out.write("                                    <p><strong> 3.Mentee's expectation from Mentor</strong></p>\r\n");
      out.write("\r\n");
      out.write("                                                    Detail Description: </br>\r\n");
      out.write("                                                    <textarea type=\"text\" name=\"description\" rows=\"4\" cols=\"70\"> </textarea></br>   \r\n");
      out.write("                                                    <input type=\"text\" id=\"timeJson\" name=\"timeJson\" hidden>\r\n");
      out.write("                                    <div class=\"form-group \" style=\"text-align: center;\">\r\n");
      out.write("                                        <button type=\"submit \" style=\"border-radius: 5px; width: 10%;\"\r\n");
      out.write("                                                class=\"btn btn-primary\">\r\n");
      out.write("                                            Submit\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--Nav Tab-->\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <!--End of Nav Tab-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Perfect Scrollbar -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("        <!-- MDK -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/dom-factory.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/material-design-kit.js\"></script>\r\n");
      out.write("        <!-- App JS -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app.js\"></script>\r\n");
      out.write("        <!-- Highlight.js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/hljs.js\"></script>\r\n");
      out.write("        <!-- App Settings (safe to remove) -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/app-settings.js\"></script>\r\n");
      out.write("        <!-- Global Settings -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/settings.js\"></script>\r\n");
      out.write("        <!-- Moment.js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/moment-range.js\"></script>\r\n");
      out.write("        <!-- Chart.js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/vendor/Chart.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/chartjs.js\"></script>\r\n");
      out.write("        <!-- Student Dashboard Page JS -->\r\n");
      out.write("        <!-- <script src=\"assets/js/chartjs-rounded-bar.js\"></script> -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/assets/js/page.student-dashboard.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                var arr = [];\r\n");
      out.write("                for (let i = 2; i <= 8; i++) {\r\n");
      out.write("                    const day = {\r\n");
      out.write("                        day: i,\r\n");
      out.write("                        from: document.getElementsByName(i)[0].value,\r\n");
      out.write("                        to: document.getElementsByName(i)[1].value\r\n");
      out.write("                    };\r\n");
      out.write("                    arr.push(day);\r\n");
      out.write("                }\r\n");
      out.write("                var jsonArr = JSON.stringify(arr);\r\n");
      out.write("                var inputTime = document.getElementById(\"timeJson\");\r\n");
      out.write("                inputTime.value = jsonArr;\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            var elements = document.getElementsByClassName(\"time\");\r\n");
      out.write("            var func = function () {\r\n");
      out.write("                var arr = [];\r\n");
      out.write("                for (let i = 2; i <= 8; i++) {\r\n");
      out.write("                    const day = {\r\n");
      out.write("                        day: i,\r\n");
      out.write("                        from: document.getElementsByName(i)[0].value,\r\n");
      out.write("                        to: document.getElementsByName(i)[1].value\r\n");
      out.write("                    };\r\n");
      out.write("                    arr.push(day);\r\n");
      out.write("                }\r\n");
      out.write("                var jsonArr = JSON.stringify(arr);\r\n");
      out.write("                var inputTime = document.getElementById(\"timeJson\");\r\n");
      out.write("                inputTime.value = jsonArr;\r\n");
      out.write("            }\r\n");
      out.write("            for (var i = 0; i < elements.length; i++) {\r\n");
      out.write("                elements[i].addEventListener('input', func, false);\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            document.querySelectorAll('.time-start').forEach(item => {\r\n");
      out.write("                item.addEventListener('input', event => {\r\n");
      out.write("                    //handle click\r\n");
      out.write("                    var time = document.getElementById(\"timePerSlot\").value.length === 0 ? 0 : document.getElementById(\"timePerSlot\").value;\r\n");
      out.write("                    var toTime = document.getElementsByName(item.name)[1];\r\n");
      out.write("                    const timeArr = item.value.split(\":\");\r\n");
      out.write("                    var min = parseInt(timeArr[0]) * 60 + parseInt(timeArr[1]) + parseInt(time);\r\n");
      out.write("                    if (min > 1440) {\r\n");
      out.write("                        alert(\"Fix time per slot\")\r\n");
      out.write("                    } else {\r\n");
      out.write("                        if (parseInt(min / 60) < 10) {\r\n");
      out.write("                            if(min % 60<10){\r\n");
      out.write("                                toTime.value = '0' + parseInt(min / 60) + \":\" + \"0\" +min % 60;\r\n");
      out.write("                                \r\n");
      out.write("                            }else{\r\n");
      out.write("                                 toTime.value = '0' + parseInt(min / 60) + \":\" + min % 60;\r\n");
      out.write("                            }\r\n");
      out.write("                        } else {\r\n");
      out.write("                                                        if(min % 60<10){\r\n");
      out.write("                                toTime.value =  parseInt(min / 60) + \":\" + \"0\" +min % 60;\r\n");
      out.write("                                \r\n");
      out.write("                            }else{\r\n");
      out.write("                                 toTime.value =  parseInt(min / 60) + \":\" + min % 60;\r\n");
      out.write("                            }\r\n");
      out.write("                        toTime.value = parseInt(min / 60) + \":\" + min % 60;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("//                    console.log(parseInt(timeArr[0])*60 + parseInt(timeArr[1]) + parseInt(time))\r\n");
      out.write("\r\n");
      out.write("//                    alert(\"blah\");\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
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
        out.write("\r\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentor/mentor_header.jsp", out, false);
        out.write("\r\n");
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
        out.write("\r\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee/mentee_header.jsp", out, false);
        out.write("\r\n");
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
          out.write("\r\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                        ");
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
          out.write("\r\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                Grade ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                            </option>\r\n");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setBegin(2);
    _jspx_th_c_forEach_2.setEnd(8);
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <td><input type=\"time\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"time time-start\"></td>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setBegin(2);
    _jspx_th_c_forEach_3.setEnd(8);
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <td><input type=\"time\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"time time-start\"></td>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
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
        out.write("\r\n");
        out.write("                        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentor/mentor_tab.jsp", out, false);
        out.write("\r\n");
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
        out.write("\r\n");
        out.write("                        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mentee/mentee_tab.jsp", out, false);
        out.write("\r\n");
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