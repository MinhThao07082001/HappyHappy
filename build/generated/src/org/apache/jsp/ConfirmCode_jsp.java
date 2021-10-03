package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfirmCode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Confirm Email</title>\n");
      out.write("\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\n");
      out.write("        <meta name=\"robots\" content=\"noindex\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Perfect Scrollbar -->\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/vendor/perfect-scrollbar.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Material Design Icons -->\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/css/material-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/css/fontawesome.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Preloader -->\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/vendor/spinkit.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- App CSS -->\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/css/app.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .next {\n");
      out.write("                padding-left: 46%;\n");
      out.write("                padding-right: 46%;\n");
      out.write("                padding-top: 9px;\n");
      out.write("                padding-bottom: 9px;\n");
      out.write("                background-color: #2295F5;\n");
      out.write("                border: #2295F5;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .next:hover {\n");
      out.write("                background-color: #0C83E2;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-group .next {\n");
      out.write("                margin-top: 15px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("            /*        Style Password*/\n");
      out.write("            input {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                margin-top: 6px;\n");
      out.write("                margin-bottom: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the container for inputs */\n");
      out.write("            /* The message box is shown when the user clicks on the password field */\n");
      out.write("            #message {\n");
      out.write("                display:none;\n");
      out.write("                color: #000;\n");
      out.write("                position: relative;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #message h8 {\n");
      out.write("                padding: 10px 35px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add a green text color and a checkmark when the requirements are right */\n");
      out.write("            .valid {\n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .valid:before {\n");
      out.write("                position: relative;\n");
      out.write("                left: -35px;\n");
      out.write("                content: \"✔\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add a red text color and an \"x\" when the requirements are wrong */\n");
      out.write("            .invalid {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .invalid:before {\n");
      out.write("                position: relative;\n");
      out.write("                left: -35px;\n");
      out.write("                content: \"✖\";\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"login\">\n");
      out.write("        <div class=\"d-flex align-items-center\" style=\"min-height: 100vh\">\n");
      out.write("            <div class=\"col-sm-8 col-md-6 col-lg-4 mx-auto\" style=\"min-width: 300px;\">\n");
      out.write("                <div class=\"text-center mt-5 mb-1\">\n");
      out.write("                    <div class=\"avatar avatar-lg\">\n");
      out.write("                        <img src=\"user/assets/images/logo/primary.svg\" class=\"avatar-img rounded-circle\" alt=\"LearnPlus\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex justify-content-center mb-5 navbar-light\">\n");
      out.write("                    <a href=\"student-dashboard.html\" class=\"navbar-brand m-0\">HappyHappy</a>\n");
      out.write("                </div>\n");
      out.write("                ");

                    if (request.getAttribute("error") != null) {
                
      out.write("\n");
      out.write("                <p style=\"color: yellow; background: red;margin: 0;font-size: x-large;\" align=\"center\" >");
      out.print( request.getAttribute("error"));
      out.write("</p>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <div class=\"card navbar-shadow\">\n");
      out.write("                    <div class=\"card-header text-center\">\n");
      out.write("                        <h4 class=\"card-title\">Confirm Code</h4>\n");
      out.write("                        <p class=\"card-subtitle\">Check your email for verification code</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                        <form action=\"confirm\" method=\"post\">\n");
      out.write("                            <!-- page 1 -->\n");
      out.write("                            <div id=\"test1\">\n");
      out.write("                                <div class=\"sign \">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"form-label\" for=\"email\">Verification code: <span style=\"color:red\">*</span></label>\n");
      out.write("                                        <div class=\"input-group input-group-merge\">\n");
      out.write("                                            <input id=\"email\" type=\"email\" name=\"email\"\n");
      out.write("                                                   required=\"\" class=\"form-control form-control-prepended\" placeholder=\"Your verification code\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <div class=\"input-group-text\">\n");
      out.write("                                                    <span class=\"far fa-envelope\"></span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <input class=\"next\" type=\"submit\" value=\"Confirm\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>                  \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- SignUp Password Check-->\n");
      out.write("        <script>\n");
      out.write("            var myInput = document.getElementById(\"password\");\n");
      out.write("            var letter = document.getElementById(\"letter\");\n");
      out.write("            var capital = document.getElementById(\"capital\");\n");
      out.write("            var number = document.getElementById(\"number\");\n");
      out.write("            var length = document.getElementById(\"length\");\n");
      out.write("\n");
      out.write("            // When the user clicks on the password field, show the message box\n");
      out.write("            myInput.onfocus = function () {\n");
      out.write("                document.getElementById(\"message\").style.display = \"block\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // When the user clicks outside of the password field, hide the message box\n");
      out.write("            myInput.onblur = function () {\n");
      out.write("                document.getElementById(\"message\").style.display = \"none\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // When the user starts to type something inside the password field\n");
      out.write("            myInput.onkeyup = function () {\n");
      out.write("                // Validate lowercase letters\n");
      out.write("                var lowerCaseLetters = /[a-z]/g;\n");
      out.write("                if (myInput.value.match(lowerCaseLetters)) {\n");
      out.write("                    letter.classList.remove(\"invalid\");\n");
      out.write("                    letter.classList.add(\"valid\");\n");
      out.write("                } else {\n");
      out.write("                    letter.classList.remove(\"valid\");\n");
      out.write("                    letter.classList.add(\"invalid\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate capital letters\n");
      out.write("                var upperCaseLetters = /[A-Z]/g;\n");
      out.write("                if (myInput.value.match(upperCaseLetters)) {\n");
      out.write("                    capital.classList.remove(\"invalid\");\n");
      out.write("                    capital.classList.add(\"valid\");\n");
      out.write("                } else {\n");
      out.write("                    capital.classList.remove(\"valid\");\n");
      out.write("                    capital.classList.add(\"invalid\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate numbers\n");
      out.write("                var numbers = /[0-9]/g;\n");
      out.write("                if (myInput.value.match(numbers)) {\n");
      out.write("                    number.classList.remove(\"invalid\");\n");
      out.write("                    number.classList.add(\"valid\");\n");
      out.write("                } else {\n");
      out.write("                    number.classList.remove(\"valid\");\n");
      out.write("                    number.classList.add(\"invalid\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Validate length\n");
      out.write("                if (myInput.value.length >= 8) {\n");
      out.write("                    length.classList.remove(\"invalid\");\n");
      out.write("                    length.classList.add(\"valid\");\n");
      out.write("                } else {\n");
      out.write("                    length.classList.remove(\"valid\");\n");
      out.write("                    length.classList.add(\"invalid\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"user/assets/vendor/jquery.min.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"user/assets/vendor/popper.min.js \"></script>\n");
      out.write("        <script src=\"user/assets/vendor/bootstrap.min.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- Perfect Scrollbar -->\n");
      out.write("        <script src=\"user/assets/vendor/perfect-scrollbar.min.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- MDK -->\n");
      out.write("        <script src=\"user/assets/vendor/dom-factory.js \"></script>\n");
      out.write("        <script src=\"user/assets/vendor/material-design-kit.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- App JS -->\n");
      out.write("        <script src=\"user/assets/js/app.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- Highlight.js -->\n");
      out.write("        <script src=\"user/assets/js/hljs.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- App Settings (safe to remove) -->\n");
      out.write("        <script src=\"user/assets/js/app-settings.js \"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"user/js/yourCode.js\"></script>\n");
      out.write("        <script src=\"user/script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->\n");
      out.write("\n");
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
