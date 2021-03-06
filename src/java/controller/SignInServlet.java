/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.Base64;
import dal.MenteeDAO;
import dal.MentorDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserCommon;
public class SignInServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SigninServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SigninServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("SignIn.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String m = request.getParameter("email");
        String p = request.getParameter("password");
        p = Base64.getEncoder().encodeToString(p.getBytes());
        UserDAO db = new UserDAO();
        UserCommon u = db.getAccount(m, p);  
        if (u == null) {          
            request.setAttribute("mess", "Email or password is not correct");
            request.getRequestDispatcher("SignIn.jsp").forward(request, response);
        } else {
             if (u.getRole() == 1) {
                MentorDAO md = new MentorDAO();
                session.setAttribute("email", m);
                session.setAttribute("mentor", md.getMentorByEmail(u.getEmail()));
                session.setAttribute("user", md.getMentorByEmail(u.getEmail()));
//                request.getRequestDispatcher("user/mentor/mentor-dashboard.jsp").forward(request, response);
                response.sendRedirect("mentor/home");
            } else {
                MenteeDAO mtd = new MenteeDAO();
                session.setAttribute("email", m);
                session.setAttribute("user", mtd.getMenteeByEmail(u.getEmail()));
                session.setAttribute("mentee", mtd.getMenteeByEmail(u.getEmail()));
//                request.getRequestDispatcher("user/mentee/mentee-dashboard.jsp").forward(request, response);
                response.sendRedirect("mentee/home");
            }
            session.setAttribute("userCommon", u);

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
