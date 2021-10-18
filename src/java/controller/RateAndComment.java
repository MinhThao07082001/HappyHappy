/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.MenteeDAO;
import dal.MentorDAO;
import dal.RateAndCommentDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Mentee;
import model.Mentor;
import model.Rating;
import model.UserCommon;

/**
 *
 * @author WacMac
 */
public class RateAndComment extends HttpServlet {

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
            out.println("<title>Servlet RateAndComment</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RateAndComment at " + request.getContextPath() + "</h1>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter("id"));
        MentorDAO db = new MentorDAO(); 
        Mentor mt = db.getMentorById(id);
        request.setAttribute("mentor", mt);
        request.getRequestDispatcher("/user/mentee/mentee_comment_rate.jsp").forward(request, response);

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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Mentee m = (Mentee) session.getAttribute("user");
        int RateStar = Integer.parseInt(request.getParameter("star"));     
        String Comment = request.getParameter("comment");
        int menteeid = Integer.parseInt(request.getParameter("mentee"));
        int mentorid = Integer.parseInt(request.getParameter("mtorid"));
        String id = request.getParameter("id");
        RateAndCommentDAO rating = new RateAndCommentDAO();      
        Rating rate = new Rating();       
        rate.setRateAmount(RateStar);
        rate.setRateDescription(Comment);
        rate.setMenteeID(menteeid);
        rate.setMentorID(mentorid);
        rating.RateMentor(rate);
        session.setAttribute("user", m);
        response.sendRedirect("rate?id= "+id);
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
