package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_002drequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"editRequest\" method=\"POST\">\r\n");
      out.write("            ID:<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.requestID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  disabled><br/>\r\n");
      out.write("            <input type=\"text\" name=\"reqID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.requestID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  hidden>\r\n");
      out.write("            Subject: <select name=\"subject\">\r\n");
      out.write("                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.subject.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.subject.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            Level: <select name=\"level\">\r\n");
      out.write("                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.subject.level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Grade ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.subject.level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select\r\n");
      out.write("            Money Per Slot   <input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.moneyPerSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"name=\"moneyPerSlot\"><br/>\r\n");
      out.write("            timePerSlot:   <input type=\"number\" id=\"timePerSlot\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.timePerSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"timePerSlot\"><br/>\r\n");
      out.write("\r\n");
      out.write("            startTime: <input type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.startTime,0, 10)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" name=\"startTime\"><br/>\r\n");
      out.write("            endTime:  <input type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.endTime,0, 10)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" name=\"endTime\"><br/>\r\n");
      out.write("            Note:  <input type=\"text\" name=\"description\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br/>\r\n");
      out.write("            LearnType:\r\n");
      out.write("            <select name=\"learnType\">\r\n");
      out.write("                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.learnType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.learnType eq 1?\"Offline\":\"Online\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                <option value=\"1\">Offline</option>\r\n");
      out.write("                <option value=\"2\">Online</option>\r\n");
      out.write("            </select><br/>\r\n");
      out.write("            <!--<input type=\"text\" name=\"2\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\">-->\r\n");
      out.write("            Create Date: <input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${req.reqTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br/>\r\n");
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    <th>Monday</th>\r\n");
      out.write("                    <th>Tuesday</th>\r\n");
      out.write("                    <th>Wednesday</th>\r\n");
      out.write("                    <th>Thursday</th>\r\n");
      out.write("                    <th>Friday</th>\r\n");
      out.write("                    <th>Saturday</th>\r\n");
      out.write("                    <th>Sunday</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>From</td>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <!--                    <td><input type=\"time\" name=\"2\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>\r\n");
      out.write("                        <td><input type=\"time\" name=\"3\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>\r\n");
      out.write("                        <td><input type=\"time\" name=\"4\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>\r\n");
      out.write("                        <td><input type=\"time\" name=\"5\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>\r\n");
      out.write("                        <td><input type=\"time\" name=\"6\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>\r\n");
      out.write("                        <td><input type=\"time\" name=\"7\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>\r\n");
      out.write("                        <td><input type=\"time\" name=\"8\" class=\"time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[0].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"></td>-->\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>To</td>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <!--                    <td><input type=\"time\" name=\"2\" class=\"time\"></td>\r\n");
      out.write("                                        <td><input type=\"time\" name=\"3\" class=\"time\"></td>\r\n");
      out.write("                                        <td><input type=\"time\" name=\"4\" class=\"time\"></td>\r\n");
      out.write("                                        <td><input type=\"time\" name=\"5\" class=\"time\"></td>\r\n");
      out.write("                                        <td><input type=\"time\" name=\"6\" class=\"time\"></td>\r\n");
      out.write("                                        <td><input type=\"time\" name=\"7\" class=\"time\"></td>\r\n");
      out.write("                                        <td><input type=\"time\" name=\"8\" class=\"time\"></td>-->\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <input type=\"text\" id=\"timeJson\" name=\"timeJson\" hidden>\r\n");
      out.write("            <input type=\"submit\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
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
      out.write("                        to: document.getElementsByName(i)[1].value,\r\n");
      out.write("                    };\r\n");
      out.write("                    arr.push(day);\r\n");
      out.write("                }\r\n");
      out.write("                var jsonArr = JSON.stringify(arr);\r\n");
      out.write("                var inputTime = document.getElementById(\"timeJson\");\r\n");
      out.write("                inputTime.value = jsonArr;\r\n");
      out.write("            }\r\n");
      out.write("//            func;\r\n");
      out.write("            for (var i = 0; i < elements.length; i++) {\r\n");
      out.write("                elements[i].addEventListener('input', func, false);\r\n");
      out.write("            }\r\n");
      out.write("        </script>        \r\n");
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
      out.write("                        toTime.value = parseInt(min / 60) + \":\" + min % 60;\r\n");
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
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                ");
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
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                        Grade ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                    </option>\r\n");
          out.write("                ");
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
          out.write("                        <td><input type=\"time\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"time time-start\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[i-2].slotFrom,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\"></td>\r\n");
          out.write("                        ");
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
          out.write("                        <td><input type=\"time\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"time\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(req.listSlotTime[i-2].slotTo,0, 5)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\"></td>\r\n");
          out.write("                        ");
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
}
