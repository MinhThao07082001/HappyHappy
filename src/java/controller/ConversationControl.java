/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ConversationDAO;
import dal.MessageDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Conversation;
import model.Message;
import model.UserCommon;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ChatServlet", urlPatterns = {"/conversation"})
public class ConversationControl extends HttpServlet {

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
            out.println("<title>Servlet ChatServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChatServlet at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        ConversationDAO cd = new ConversationDAO();
        UserDAO ud = new UserDAO();
        MessageDAO md = new MessageDAO();
        String email = (String) session.getAttribute("email");
        UserCommon u = ud.getEmail(email);
        int user1 = u.getUserID();
        int user2 = Integer.parseInt(request.getParameter("id"));
        Conversation conv = cd.getConversationByUserID(user1, user2);
        if(conv == null){
            cd.createConversation(user1, user2);
            conv = cd.getConversationByUserID(user1, user2);
        }
        List<Message> mList = md.getMessageByConservationID(conv.getConversationID());
        System.out.println(user1 + "    " + user2 + "       " +conv.getConversationID());
        request.setAttribute("mList", mList);
        request.setAttribute("from", user1);
        request.setAttribute("to", user2);
        request.setAttribute("conversationID", conv.getConversationID());
        request.getRequestDispatcher("user/chat.jsp").forward(request, response);
         
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
        processRequest(request, response);
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
