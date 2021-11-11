package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class request_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html lang=\"en\"\r\n");
      out.write("      dir=\"ltr\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/student-dashboard.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:12:12 GMT -->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\r\n");
      out.write("              content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\"\r\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Student - Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\r\n");
      out.write("        <meta name=\"robots\"\r\n");
      out.write("              content=\"noindex\">\r\n");
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-responsive/css/responsive.bootstrap4.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-buttons/css/buttons.bootstrap4.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.11.3/css/jquery.dataTables.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .btn-grad {background-image: linear-gradient(to right, #314755 0%, #26a0da  51%, #314755  100%)}\r\n");
      out.write("            .btn-grad {\r\n");
      out.write("                margin: 10px;\r\n");
      out.write("                padding: 10px 20px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                transition: 0.5s;\r\n");
      out.write("                background-size: 200% auto;\r\n");
      out.write("                color: white;            \r\n");
      out.write("                box-shadow: 0 0 20px #eee;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn-grad:hover {\r\n");
      out.write("                background-position: right center; /* change the direction of the change here */\r\n");
      out.write("                color: #77eed8;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .dropdown {\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            td{\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .justify-content-center{\r\n");
      out.write("                border-bottom: 5px solid #9eabe4;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            /* style nav bar  request */\r\n");
      out.write("\r\n");
      out.write("            /* colors */\r\n");
      out.write("            /* tab setting */\r\n");
      out.write("            /* breakpoints */\r\n");
      out.write("            /* selectors relative to radio inputs */\r\n");
      out.write("            body {\r\n");
      out.write("                background: #efefef;\r\n");
      out.write("                color: #333;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            body h1 {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                color: #428bff;\r\n");
      out.write("                font-weight: 100;\r\n");
      out.write("                padding: 40px 0 20px 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .tabs {\r\n");
      out.write("                left: 50%;\r\n");
      out.write("                transform: translateX(-50%);\r\n");
      out.write("                position: relative;\r\n");
      out.write("                background: white;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("\r\n");
      out.write("                box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                min-width: 240px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .tabs input[name=\"tab-control\"] {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .content section h2, .tabs ul li label {\r\n");
      out.write("                font-family: \"Montserrat\";\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                color: #428bff;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                padding-left: 0;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-direction: row;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                align-items: flex-end;\r\n");
      out.write("                flex-wrap: wrap;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul li {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                flex: 1;\r\n");
      out.write("                width: 25%;\r\n");
      out.write("                padding: 0 10px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul li label {\r\n");
      out.write("                transition: all 0.3s ease-in-out;\r\n");
      out.write("                color: #f01d0d;\r\n");
      out.write("                padding: 1px auto;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                text-overflow: ellipsis;\r\n");
      out.write("                display: block;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                transition: all 0.2s ease-in-out;\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                -webkit-touch-callout: none;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul li label br {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul li label svg {\r\n");
      out.write("                fill: #f01d0d;\r\n");
      out.write("                height: 1.2em;\r\n");
      out.write("                vertical-align: bottom;\r\n");
      out.write("                margin-right: 0.1em;\r\n");
      out.write("                transition: all 0.2s ease-in-out;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul li label:hover, .tabs ul li label:focus, .tabs ul li label:active {\r\n");
      out.write("                outline: 0;\r\n");
      out.write("\r\n");
      out.write("                color: red;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs ul li label:hover svg, .tabs ul li label:focus svg, .tabs ul li label:active svg {\r\n");
      out.write("\r\n");
      out.write("                fill: #4586c2;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .slider {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                width: 25%;\r\n");
      out.write("                transition: all 0.33s cubic-bezier(0.38, 0.8, 0.32, 1.07);\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .slider .indicator {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                width: 50px;\r\n");
      out.write("                max-width: 100%;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("                height: 4px;\r\n");
      out.write("                background: #428bff;\r\n");
      out.write("                border-radius: 1px;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .content {\r\n");
      out.write("                margin-top: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .content section {\r\n");
      out.write("                display: none;\r\n");
      out.write("                animation-name: content;\r\n");
      out.write("                animation-direction: normal;\r\n");
      out.write("                animation-duration: 0.3s;\r\n");
      out.write("                animation-timing-function: ease-in-out;\r\n");
      out.write("                animation-iteration-count: 1;\r\n");
      out.write("                line-height: 1.4;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .content section h2 {\r\n");
      out.write("                color: #428bff;\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .content section h2::after {\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                position: relative;\r\n");
      out.write("                display: block;\r\n");
      out.write("                width: 30px;\r\n");
      out.write("                height: 3px;\r\n");
      out.write("                background: #428bff;\r\n");
      out.write("                margin-top: 5px;\r\n");
      out.write("                left: 1px;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(1):checked ~ ul > li:nth-child(1) > label {\r\n");
      out.write("                cursor: default;\r\n");
      out.write("                color: #428bff;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(1):checked ~ ul > li:nth-child(1) > label svg {\r\n");
      out.write("                fill: #428bff;\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 600px) {\r\n");
      out.write("                .tabs input[name=\"tab-control\"]:nth-of-type(1):checked ~ ul > li:nth-child(1) > label {\r\n");
      out.write("                    background: rgba(0, 0, 0, 0.08);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(1):checked ~ .slider {\r\n");
      out.write("                transform: translateX(55%);\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(1):checked ~ .content > section:nth-child(1) {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(2):checked ~ ul > li:nth-child(2) > label {\r\n");
      out.write("                cursor: default;\r\n");
      out.write("                color: #428bff;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(2):checked ~ ul > li:nth-child(2) > label svg {\r\n");
      out.write("                fill: #428bff;\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 600px) {\r\n");
      out.write("                .tabs input[name=\"tab-control\"]:nth-of-type(2):checked ~ ul > li:nth-child(2) > label {\r\n");
      out.write("                    background: rgba(0, 0, 0, 0.08);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(2):checked ~ .slider {\r\n");
      out.write("                transform: translateX(255%);\r\n");
      out.write("            }\r\n");
      out.write("            .tabs input[name=\"tab-control\"]:nth-of-type(2):checked ~ .content > section:nth-child(2) {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            @keyframes content {\r\n");
      out.write("                from {\r\n");
      out.write("                    opacity: 0;\r\n");
      out.write("                    transform: translateY(5%);\r\n");
      out.write("                }\r\n");
      out.write("                to {\r\n");
      out.write("                    opacity: 1;\r\n");
      out.write("                    transform: translateY(0%);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 1000px) {\r\n");
      out.write("                .tabs ul li label {\r\n");
      out.write("                    white-space: initial;\r\n");
      out.write("                }\r\n");
      out.write("                .tabs ul li label br {\r\n");
      out.write("                    display: initial;\r\n");
      out.write("                }\r\n");
      out.write("                .tabs ul li label svg {\r\n");
      out.write("                    height: 1.5em;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 600px) {\r\n");
      out.write("                .tabs ul li label {\r\n");
      out.write("                    padding: 5px;\r\n");
      out.write("                    border-radius: 5px;\r\n");
      out.write("                }\r\n");
      out.write("                .tabs ul li label span {\r\n");
      out.write("                    display: none;\r\n");
      out.write("                }\r\n");
      out.write("                .tabs .slider {\r\n");
      out.write("                    display: none;\r\n");
      out.write("                }\r\n");
      out.write("                .tabs .content {\r\n");
      out.write("                    margin-top: 20px;\r\n");
      out.write("                }\r\n");
      out.write("                .tabs .content section h2 {\r\n");
      out.write("                    display: block;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            /* style nav bar request*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            tr{\r\n");
      out.write("                border: 1px solid #003300;\r\n");
      out.write("            }\r\n");
      out.write("            th{\r\n");
      out.write("                border: 1px solid #003300;\r\n");
      out.write("            }\r\n");
      out.write("            td{\r\n");
      out.write("                border: 1px solid #003300;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            table {\r\n");
      out.write("                table-layout: fixed;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            table td {\r\n");
      out.write("                text-overflow: ellipsis;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"layout-fluid\" style=\"background-color: #eaf4fc\">\r\n");
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
      out.write("        <!--Header-->\r\n");
      out.write("        <div class=\"mdk-header-layout js-mdk-header-layout\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--End Of Header -->\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <div class=\"mdk-header-layout__content\">\r\n");
      out.write("\r\n");
      out.write("                <div data-push data-responsive-width=\"992px\" class=\"mdk-drawer-layout js-mdk-drawer-layout\">\r\n");
      out.write("                    <!--Page content -->         \r\n");
      out.write("                    <div class=\"mdk-drawer-layout__content page \">\r\n");
      out.write("                        <div class=\"container-fluid page__container\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/mentee/home\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\">Request Mentor</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card-header flex-container \" \r\n");
      out.write("                                 style=\" background: #9eabe4; border-radius: 20px; background-image: linear-gradient(315deg, #9eabe4 0%, #77eed8 74%);\">\r\n");
      out.write("                                <div class=\"media align-items-center\">\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h4 class=\"card-title\">List of Request</h4>                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"media-right mt-2 mt-xs-plus-0\">\r\n");
      out.write("                                        <a class=\"btn-grad\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/createRequest\">Create a request</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"tabs\">\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"radio\" id=\"tab1\" name=\"tab-control\" checked>\r\n");
      out.write("                                    <input type=\"radio\" id=\"tab2\" name=\"tab-control\" >\r\n");
      out.write("\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li ><label for=\"tab1\" role=\"button\">\r\n");
      out.write("                                                <svg viewBox=\"0 0 24 24\"></svg>\r\n");
      out.write("                                                <br>           \r\n");
      out.write("                                                <span>On-going Request</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li >\r\n");
      out.write("                                            <label for=\"tab2\" role=\"button\">\r\n");
      out.write("                                                <svg viewBox=\"0 0 24 24\"></svg>\r\n");
      out.write("                                                <br>\r\n");
      out.write("                                                <span>Closed Request</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </li>    \r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"slider\">\r\n");
      out.write("                                        <div class=\"indicator\">                                           \r\n");
      out.write("                                        </div>                                            \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"content\">                                   \r\n");
      out.write("                                        <section>\r\n");
      out.write("                                            <div class=\"row justify-content-center tab-content round\" style=\"margin: 0 0 0 0\">\r\n");
      out.write("                                                <table class=\" col-lg-12 table-hover\" id=\"example2\">\r\n");
      out.write("                                                    <thead>\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <th>reqTime</th>\r\n");
      out.write("                                                            <th>subjectName</th>\r\n");
      out.write("                                                            <th>startTime</th>\r\n");
      out.write("                                                            <th>endTime</th>\r\n");
      out.write("                                                            <th>description</th>                                                \r\n");
      out.write("                                                            <th>learnType</th>\r\n");
      out.write("                                                            <th>Action</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </table>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </section>  \r\n");
      out.write("                                        <section>\r\n");
      out.write("                                            <div class=\"row d-flex justify-content-center tab-content round \" style=\"margin: 0 0 0 0\">\r\n");
      out.write("                                                <table class=\"col-md-12 table-hover \" id=\"example3\">\r\n");
      out.write("                                                    <thead>\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <!--<th>requestID</th>-->\r\n");
      out.write("                                                            <!--<th>userID</th>-->\r\n");
      out.write("                                                            <th>reqTime</th>\r\n");
      out.write("                                                            <th>subjectName</th>\r\n");
      out.write("                                                            <th>moneyPerSlot</th>\r\n");
      out.write("                                                            <th>timePerSlot</th>\r\n");
      out.write("                                                            <!--<th>startTime</th>-->\r\n");
      out.write("                                                            <!--<th>endTime</th>-->\r\n");
      out.write("                                                            <th>description</th>\r\n");
      out.write("                                                            <!--<th>status</th>-->\r\n");
      out.write("                                                            <th>learnType</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </table>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </section>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- End Page content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--Nav Tab-->\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--End Of Nav Tab-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--     \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>requestID</th>\r\n");
      out.write("                        <th>userID</th>\r\n");
      out.write("                <th>subjectName</th>\r\n");
      out.write("                <th>moneyPerSlot</th>\r\n");
      out.write("                <th>timePerSlot</th>\r\n");
      out.write("                <th>startTime</th>\r\n");
      out.write("                <th>endTime</th>\r\n");
      out.write("                <th>description</th>\r\n");
      out.write("                <th>status</th>\r\n");
      out.write("                <th>learnType</th>\r\n");
      out.write("                <th>reqTime</th>\r\n");
      out.write("                        <th>EDIT</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table>-->\r\n");
      out.write("\r\n");
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
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("        <!-- DataTables  & Plugins -->\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-responsive/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-responsive/js/responsive.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-buttons/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-buttons/js/buttons.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/jszip/jszip.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/pdfmake/pdfmake.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/pdfmake/vfs_fonts.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-buttons/js/buttons.html5.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-buttons/js/buttons.print.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/datatables-buttons/js/buttons.colVis.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/assets/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $('#example2').DataTable({\r\n");
      out.write("                    \"paging\": true,\r\n");
      out.write("                    \"lengthChange\": false,\r\n");
      out.write("                    \"searching\": false,\r\n");
      out.write("                    \"ordering\": true,\r\n");
      out.write("                    \"info\": true,\r\n");
      out.write("                    \"autoWidth\": true,\r\n");
      out.write("                    \"responsive\": true,\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $('#example3').DataTable({\r\n");
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
    _jspx_th_c_forEach_0.setVar("rOList");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rOList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                        <tr>\r\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.reqTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.subject.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.subject.level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.endTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                                                            \r\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.learnType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                            <td><a href=\"editRequest?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.requestID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">EDIT</a></td>\r\n");
          out.write("                                                        </tr>\r\n");
          out.write("                                                    ");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("rAList");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rAList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                        <tr>\r\n");
          out.write("                                                            <!--<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.requestID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>-->\r\n");
          out.write("                                                            <!--<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>-->\r\n");
          out.write("                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.reqTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.subject.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.subject.level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.moneyPerSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th> \r\n");
          out.write("                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.timePerSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                                            <!--<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>-->\r\n");
          out.write("                                                            <!--<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.endTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>-->\r\n");
          out.write("                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("<!--                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>-->\r\n");
          out.write("                                                            <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rAList.learnType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                                        </tr>\r\n");
          out.write("                                                    ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("rOList");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rOList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <tr>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.requestID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.subject.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.subject.level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.moneyPerSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th> \r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.timePerSlot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.endTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.learnType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.reqTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                <th><a href=\"editRequest?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rOList.requestID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">EDIT</a></th>\r\n");
          out.write("            </tr>\r\n");
          out.write("                    ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
