package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            html {\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 15px;\n");
      out.write("                line-height: 1.4;\n");
      out.write("                color: #444;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                font-size: 1em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .wrapper {\n");
      out.write("                margin: 15px auto;\n");
      out.write("                max-width: 1100px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-calendar {\n");
      out.write("                background: #ffffff;\n");
      out.write("                padding: 15px;\n");
      out.write("                max-width: 475px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button-container-calendar button {\n");
      out.write("                cursor: pointer;\n");
      out.write("                display: inline-block;\n");
      out.write("                zoom: 1;\n");
      out.write("                background: #00a2b7;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 1px solid #0aa2b5;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .table-calendar {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .table-calendar td, .table-calendar th {\n");
      out.write("                padding: 5px;\n");
      out.write("                border: 1px solid #e2e2e2;\n");
      out.write("                text-align: center;\n");
      out.write("                vertical-align: top;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .date-picker.selected {\n");
      out.write("                font-weight: bold;\n");
      out.write("                outline: 1px dashed #00BCD4;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .date-picker.selected span {\n");
      out.write("                border-bottom: 2px solid currentColor;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* sunday */\n");
      out.write("            .date-picker:nth-child(1) {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* friday */\n");
      out.write("            .date-picker:nth-child(6) {\n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #monthAndYear {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button-container-calendar {\n");
      out.write("                position: relative;\n");
      out.write("                margin-bottom: 1em;\n");
      out.write("                overflow: hidden;\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #previous {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #next {\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-container-calendar {\n");
      out.write("                margin-top: 1em;\n");
      out.write("                border-top: 1px solid #dadada;\n");
      out.write("                padding: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-container-calendar select {\n");
      out.write("                cursor: pointer;\n");
      out.write("                display: inline-block;\n");
      out.write("                zoom: 1;\n");
      out.write("                background: #ffffff;\n");
      out.write("                color: #585858;\n");
      out.write("                border: 1px solid #bfc5c5;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                padding: 5px 1em;\n");
      out.write("            }\n");
      out.write("            .has-slot{\n");
      out.write("                background-color: bisque;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.subject.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <input type=\"text\" hidden id=\"slots\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.slots}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <input type=\"text\" hidden id=\"dates\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dates}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"container-calendar\">\n");
      out.write("                <h3 id=\"monthAndYear\"></h3>\n");
      out.write("\n");
      out.write("                <div class=\"button-container-calendar\">\n");
      out.write("                    <button id=\"previous\" onclick=\"previous()\">&#8249;</button>\n");
      out.write("                    <button id=\"next\" onclick=\"next()\">&#8250;</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <table class=\"table-calendar\" id=\"calendar\" data-lang=\"en\">\n");
      out.write("                    <thead id=\"thead-month\"></thead>\n");
      out.write("                    <tbody id=\"calendar-body\"></tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div class=\"footer-container-calendar\">\n");
      out.write("                    <label for=\"month\">Jump To: </label>\n");
      out.write("                    <select id=\"month\" onchange=\"jump()\">\n");
      out.write("                        <option value=\"0\">Jan</option>\n");
      out.write("                        <option value=\"1\">Feb</option>\n");
      out.write("                        <option value=\"2\">Mar</option>\n");
      out.write("                        <option value=\"3\">Apr</option>\n");
      out.write("                        <option value=\"4\">May</option>\n");
      out.write("                        <option value=\"5\">Jun</option>\n");
      out.write("                        <option value=\"6\">Jul</option>\n");
      out.write("                        <option value=\"7\">Aug</option>\n");
      out.write("                        <option value=\"8\">Sep</option>\n");
      out.write("                        <option value=\"9\">Oct</option>\n");
      out.write("                        <option value=\"10\">Nov</option>\n");
      out.write("                        <option value=\"11\">Dec</option>\n");
      out.write("                    </select>\n");
      out.write("                    <select id=\"year\" onchange=\"jump()\"></select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        var slots = [];\n");
      out.write("        var dates = [];\n");
      out.write("        slots = document.getElementById(\"slots\").value.split(\";\");\n");
      out.write("        dates = document.getElementById(\"dates\").value.split(\";\");\n");
      out.write("        function findDate(date) {\n");
      out.write("            for (var i = 0; i < dates.length; i++) {\n");
      out.write("                if (date === dates[i]) {\n");
      out.write("                    return i;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            return -1;\n");
      out.write("        }\n");
      out.write("        function generate_year_range(start, end) {\n");
      out.write("            var years = \"\";\n");
      out.write("            for (var year = start; year <= end; year++) {\n");
      out.write("                years += \"<option value='\" + year + \"'>\" + year + \"</option>\";\n");
      out.write("            }\n");
      out.write("            return years;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        today = new Date();\n");
      out.write("        currentMonth = today.getMonth();\n");
      out.write("        currentYear = today.getFullYear();\n");
      out.write("        selectYear = document.getElementById(\"year\");\n");
      out.write("        selectMonth = document.getElementById(\"month\");\n");
      out.write("\n");
      out.write("\n");
      out.write("        createYear = generate_year_range(1970, 2050);\n");
      out.write("        /** or\n");
      out.write("         * createYear = generate_year_range( 1970, currentYear );\n");
      out.write("         */\n");
      out.write("\n");
      out.write("        document.getElementById(\"year\").innerHTML = createYear;\n");
      out.write("\n");
      out.write("        var calendar = document.getElementById(\"calendar\");\n");
      out.write("        var lang = calendar.getAttribute('data-lang');\n");
      out.write("\n");
      out.write("        var months = \"\";\n");
      out.write("        var days = \"\";\n");
      out.write("\n");
      out.write("        var monthDefault = [\"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\", \"August\", \"September\", \"October\", \"November\", \"December\"];\n");
      out.write("\n");
      out.write("        var dayDefault = [\"Sun\", \"Mon\", \"Tue\", \"Wed\", \"Thu\", \"Fri\", \"Sat\"];\n");
      out.write("\n");
      out.write("        if (lang == \"en\") {\n");
      out.write("            months = monthDefault;\n");
      out.write("            days = dayDefault;\n");
      out.write("        } else if (lang == \"id\") {\n");
      out.write("            months = [\"Januari\", \"Februari\", \"Maret\", \"April\", \"Mei\", \"Juni\", \"Juli\", \"Agustus\", \"September\", \"Oktober\", \"November\", \"Desember\"];\n");
      out.write("            days = [\"Ming\", \"Sen\", \"Sel\", \"Rab\", \"Kam\", \"Jum\", \"Sab\"];\n");
      out.write("        } else if (lang == \"fr\") {\n");
      out.write("            months = [\"Janvier\", \"Février\", \"Mars\", \"Avril\", \"Mai\", \"Juin\", \"Juillet\", \"Août\", \"Septembre\", \"Octobre\", \"Novembre\", \"Décembre\"];\n");
      out.write("            days = [\"dimanche\", \"lundi\", \"mardi\", \"mercredi\", \"jeudi\", \"vendredi\", \"samedi\"];\n");
      out.write("        } else {\n");
      out.write("            months = monthDefault;\n");
      out.write("            days = dayDefault;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        var $dataHead = \"<tr>\";\n");
      out.write("        for (dhead in days) {\n");
      out.write("            $dataHead += \"<th data-days='\" + days[dhead] + \"'>\" + days[dhead] + \"</th>\";\n");
      out.write("        }\n");
      out.write("        $dataHead += \"</tr>\";\n");
      out.write("\n");
      out.write("//alert($dataHead);\n");
      out.write("        document.getElementById(\"thead-month\").innerHTML = $dataHead;\n");
      out.write("\n");
      out.write("\n");
      out.write("        monthAndYear = document.getElementById(\"monthAndYear\");\n");
      out.write("        showCalendar(currentMonth, currentYear);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        function next() {\n");
      out.write("            currentYear = (currentMonth === 11) ? currentYear + 1 : currentYear;\n");
      out.write("            currentMonth = (currentMonth + 1) % 12;\n");
      out.write("            showCalendar(currentMonth, currentYear);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function previous() {\n");
      out.write("            currentYear = (currentMonth === 0) ? currentYear - 1 : currentYear;\n");
      out.write("            currentMonth = (currentMonth === 0) ? 11 : currentMonth - 1;\n");
      out.write("            showCalendar(currentMonth, currentYear);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function jump() {\n");
      out.write("            currentYear = parseInt(selectYear.value);\n");
      out.write("            currentMonth = parseInt(selectMonth.value);\n");
      out.write("            showCalendar(currentMonth, currentYear);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function showCalendar(month, year) {\n");
      out.write("\n");
      out.write("            var firstDay = (new Date(year, month)).getDay();\n");
      out.write("\n");
      out.write("            tbl = document.getElementById(\"calendar-body\");\n");
      out.write("\n");
      out.write("\n");
      out.write("            tbl.innerHTML = \"\";\n");
      out.write("\n");
      out.write("\n");
      out.write("            monthAndYear.innerHTML = months[month] + \" \" + year;\n");
      out.write("            selectYear.value = year;\n");
      out.write("            selectMonth.value = month;\n");
      out.write("\n");
      out.write("            // creating all cells\n");
      out.write("            var date = 1;\n");
      out.write("            for (var i = 0; i < 6; i++) {\n");
      out.write("\n");
      out.write("                var row = document.createElement(\"tr\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                for (var j = 0; j < 7; j++) {\n");
      out.write("                    if (i === 0 && j < firstDay) {\n");
      out.write("                        cell = document.createElement(\"td\");\n");
      out.write("                        cellText = document.createTextNode(\"\");\n");
      out.write("                        cell.appendChild(cellText);\n");
      out.write("                        row.appendChild(cell);\n");
      out.write("                    } else if (date > daysInMonth(month, year)) {\n");
      out.write("                        break;\n");
      out.write("                    } else {\n");
      out.write("                        cell = document.createElement(\"td\");\n");
      out.write("                        cell.setAttribute(\"data-date\", date);\n");
      out.write("                        cell.setAttribute(\"data-month\", month + 1);\n");
      out.write("                        cell.setAttribute(\"data-year\", year);\n");
      out.write("                        cell.setAttribute(\"data-month_name\", months[month]);\n");
      out.write("                        cell.className = \"date-picker\";\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("//                        console.log(today.getDate() + \"   \" + year + \"    \" + (today.getMonth() + 1));\n");
      out.write("                        if (date === today.getDate() && year === today.getFullYear() && month === today.getMonth()) {\n");
      out.write("                            cell.className = \"date-picker selected\";\n");
      out.write("                        }\n");
      out.write("                        var dateTime = year + \"-\" + (((month + 1) < 10) ? ('0' + (month + 1)) : (month + 1)) + \"-\" + ((date < 10) ? '0' + date : date)\n");
      out.write("                        var infoSlot;\n");
      out.write("                        var index = findDate(dateTime);\n");
      out.write("                        if (index !== -1) {\n");
      out.write("                            infoSlot = slots[index];\n");
      out.write("                            cell.innerHTML = \"<span>\" + date + \"<br/>\" + infoSlot + \"</span>\";\n");
      out.write("                            cell.className = \"date-picker has-slot\";\n");
      out.write("                        } else {\n");
      out.write("                            cell.innerHTML = \"<span>\" + date + \"</span>\";\n");
      out.write("                        }\n");
      out.write("                        row.appendChild(cell);\n");
      out.write("                        date++;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                tbl.appendChild(row);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function daysInMonth(iMonth, iYear) {\n");
      out.write("            return 32 - new Date(iYear, iMonth, 32).getDate();\n");
      out.write("        }\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("c");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
