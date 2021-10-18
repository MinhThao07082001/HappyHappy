/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ShareData.FileHandling;
import dal.MenteeDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Mentee;
import model.UserCommon;

/**
 *
 * @author Admin
 */

@MultipartConfig()
@WebServlet(name = "MenteeEditProfile", urlPatterns = {"/user/mentee/editprofile"})
public class MenteeEditProfile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MenteeEditProfile</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MenteeEditProfile at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
        Format f = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = f.format(new Date());
        return strDate;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("now", new SignUpServlet().now());
        request.getRequestDispatcher("/user/mentee/mentee_edit_profile.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        FileHandling fh = new FileHandling();
        Mentee m = (Mentee) session.getAttribute("user");
        MenteeDAO md = new MenteeDAO();
        String[] fileName = request.getPart("imgAvt").toString().split(",")[0].split("=");
        String nameSave = "imgAvt_" + m.getMenteeID();
        String imgAvtPath = fileName.length==1?m.getImg():fh.uploadFile(request, response, "imgAvt", nameSave);
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        String address = request.getParameter("address");
        String description = request.getParameter("description");
        m.setImg(imgAvtPath);
        m.setName(name);
        m.setDob(dob);
        m.setAddress(address);
        m.setDescription(description);
        md.updateMentee(m);
        session.setAttribute("user", m);
        request.getRequestDispatcher("/user/mentee/mentee_edit_profile.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
