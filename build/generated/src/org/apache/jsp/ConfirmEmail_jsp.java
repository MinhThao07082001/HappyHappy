package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfirmEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Confirm Email</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\r\n");
      out.write("        <meta name=\"robots\" content=\"noindex\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Perfect Scrollbar -->\r\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/vendor/perfect-scrollbar.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Material Design Icons -->\r\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/css/material-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome Icons -->\r\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/css/fontawesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/vendor/spinkit.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- App CSS -->\r\n");
      out.write("        <link type=\"text/css\" href=\"user/assets/css/app.css\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .next {\r\n");
      out.write("                padding-left: 46%;\r\n");
      out.write("                padding-right: 46%;\r\n");
      out.write("                padding-top: 9px;\r\n");
      out.write("                padding-bottom: 9px;\r\n");
      out.write("                background-color: #2295F5;\r\n");
      out.write("                border: #2295F5;\r\n");
      out.write("                color: #FFFFFF;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .next:hover {\r\n");
      out.write("                background-color: #0C83E2;\r\n");
      out.write("                color: #FFFFFF;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-group .next {\r\n");
      out.write("                margin-top: 15px;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("            }\r\n");
      out.write("            /*        Style Password*/\r\n");
      out.write("            input {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 12px;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                margin-top: 6px;\r\n");
      out.write("                margin-bottom: 16px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Style the container for inputs */\r\n");
      out.write("            /* The message box is shown when the user clicks on the password field */\r\n");
      out.write("            #message {\r\n");
      out.write("                display:none;\r\n");
      out.write("                color: #000;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #message h8 {\r\n");
      out.write("                padding: 10px 35px;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Add a green text color and a checkmark when the requirements are right */\r\n");
      out.write("            .valid {\r\n");
      out.write("                color: green;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .valid:before {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                left: -35px;\r\n");
      out.write("                content: \"✔\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Add a red text color and an \"x\" when the requirements are wrong */\r\n");
      out.write("            .invalid {\r\n");
      out.write("                color: red;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .invalid:before {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                left: -35px;\r\n");
      out.write("                content: \"✖\";\r\n");
      out.write("          \r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"login\">\r\n");
      out.write("        <div class=\"d-flex align-items-center\" style=\"min-height: 100vh\">\r\n");
      out.write("            <div class=\"col-sm-8 col-md-6 col-lg-4 mx-auto\" style=\"min-width: 300px;\">\r\n");
      out.write("                <div class=\"text-center mt-5 mb-1\">\r\n");
      out.write("                    <div class=\"avatar avatar-lg\">\r\n");
      out.write("                        <img src=\"user/assets/images/logo/primary.svg\" class=\"avatar-img rounded-circle\" alt=\"LearnPlus\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-center mb-5 navbar-light\">\r\n");
      out.write("                    <a href=\"student-dashboard.html\" class=\"navbar-brand m-0\">HappyHappy</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    if (request.getAttribute("mess") != null) {
                
      out.write("\r\n");
      out.write("                <p style=\"color: yellow; background: red;margin: 0;font-size: x-large;\" align=\"center\" >");
      out.print( request.getAttribute("mess"));
      out.write("</p>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("                <div class=\"card navbar-shadow\">\r\n");
      out.write("                    <div class=\"card-header text-center\">\r\n");
      out.write("                        <h4 class=\"card-title\">Confirm Email</h4>\r\n");
      out.write("                        <p class=\"card-subtitle\">Check your email for verification code</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <form action=\"confirm\" method=\"post\">\r\n");
      out.write("                            <!-- page 1 -->\r\n");
      out.write("                            <div id=\"test1\">\r\n");
      out.write("                                <div class=\"sign \">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"form-label\" for=\"email\">Your Email: <span style=\"color:red\">*</span></label>\r\n");
      out.write("                                        <div class=\"input-group input-group-merge\">\r\n");
      out.write("                                            <input id=\"email\" type=\"email\" name=\"email\"\r\n");
      out.write("                                                   required=\"\" class=\"form-control form-control-prepended\" placeholder=\"Enter Your Email\">\r\n");
      out.write("                                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                                <div class=\"input-group-text\">\r\n");
      out.write("                                                    <span class=\"far fa-envelope\"></span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <input class=\"next\" type=\"submit\" value=\"Confirm\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>                  \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- SignUp Password Check-->\r\n");
      out.write("        <script>\r\n");
      out.write("            var myInput = document.getElementById(\"password\");\r\n");
      out.write("            var letter = document.getElementById(\"letter\");\r\n");
      out.write("            var capital = document.getElementById(\"capital\");\r\n");
      out.write("            var number = document.getElementById(\"number\");\r\n");
      out.write("            var length = document.getElementById(\"length\");\r\n");
      out.write("\r\n");
      out.write("            // When the user clicks on the password field, show the message box\r\n");
      out.write("            myInput.onfocus = function () {\r\n");
      out.write("                document.getElementById(\"message\").style.display = \"block\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // When the user clicks outside of the password field, hide the message box\r\n");
      out.write("            myInput.onblur = function () {\r\n");
      out.write("                document.getElementById(\"message\").style.display = \"none\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // When the user starts to type something inside the password field\r\n");
      out.write("            myInput.onkeyup = function () {\r\n");
      out.write("                // Validate lowercase letters\r\n");
      out.write("                var lowerCaseLetters = /[a-z]/g;\r\n");
      out.write("                if (myInput.value.match(lowerCaseLetters)) {\r\n");
      out.write("                    letter.classList.remove(\"invalid\");\r\n");
      out.write("                    letter.classList.add(\"valid\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    letter.classList.remove(\"valid\");\r\n");
      out.write("                    letter.classList.add(\"invalid\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Validate capital letters\r\n");
      out.write("                var upperCaseLetters = /[A-Z]/g;\r\n");
      out.write("                if (myInput.value.match(upperCaseLetters)) {\r\n");
      out.write("                    capital.classList.remove(\"invalid\");\r\n");
      out.write("                    capital.classList.add(\"valid\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    capital.classList.remove(\"valid\");\r\n");
      out.write("                    capital.classList.add(\"invalid\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Validate numbers\r\n");
      out.write("                var numbers = /[0-9]/g;\r\n");
      out.write("                if (myInput.value.match(numbers)) {\r\n");
      out.write("                    number.classList.remove(\"invalid\");\r\n");
      out.write("                    number.classList.add(\"valid\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    number.classList.remove(\"valid\");\r\n");
      out.write("                    number.classList.add(\"invalid\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Validate length\r\n");
      out.write("                if (myInput.value.length >= 8) {\r\n");
      out.write("                    length.classList.remove(\"invalid\");\r\n");
      out.write("                    length.classList.add(\"valid\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    length.classList.remove(\"valid\");\r\n");
      out.write("                    length.classList.add(\"invalid\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"user/assets/vendor/jquery.min.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"user/assets/vendor/popper.min.js \"></script>\r\n");
      out.write("        <script src=\"user/assets/vendor/bootstrap.min.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Perfect Scrollbar -->\r\n");
      out.write("        <script src=\"user/assets/vendor/perfect-scrollbar.min.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- MDK -->\r\n");
      out.write("        <script src=\"user/assets/vendor/dom-factory.js \"></script>\r\n");
      out.write("        <script src=\"user/assets/vendor/material-design-kit.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- App JS -->\r\n");
      out.write("        <script src=\"user/assets/js/app.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Highlight.js -->\r\n");
      out.write("        <script src=\"user/assets/js/hljs.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- App Settings (safe to remove) -->\r\n");
      out.write("        <script src=\"user/assets/js/app-settings.js \"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"user/js/yourCode.js\"></script>\r\n");
      out.write("        <script src=\"user/script.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->\r\n");
      out.write("\r\n");
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
