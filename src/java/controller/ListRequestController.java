
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CourseDAO;
import dal.RequestDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Request;
import model.RequestSlotTime;
import model.UserCommon;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ListRequestController", urlPatterns = {"/listRequest"})
public class ListRequestController extends HttpServlet {

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
            out.println("<title>Servlet RequestController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RequestController at " + request.getContextPath() + "</h1>");
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
        RequestDAO rd = new RequestDAO();
        String idRequest = request.getParameter("detail");
        if (idRequest != null) {
            Request r = rd.getRequestById(Integer.parseInt(idRequest));
            request.setAttribute("req", r);
            request.getRequestDispatcher("user/request-detail.jsp").forward(request, response);
        } else {
            int role = 2;
//            int role = Integer.parseInt((String) session.getAttribute("role"));
            List<Request> reqList = role == 2 ? rd.getListRequestOfMentee() : rd.getListRequestOfMentor();
            request.setAttribute("reqList", reqList);
            request.getRequestDispatcher("user/list-request.jsp").forward(request, response);
        }

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
        int reqID = Integer.parseInt(request.getParameter("id"));
        HttpSession session = request.getSession();
        UserCommon u = (UserCommon) session.getAttribute("userCommon");
        RequestDAO rd = new RequestDAO();
        CourseDAO cd = new CourseDAO();
        //get req By id
        Request r = rd.getRequestById(reqID);
//        System.out.println("DARK SIZE: "+r.getListSlotTime().size());
//set userID of new req
        r.setUserID(u.getUserID());
        //insert req of people accept req
        List<RequestSlotTime> rstList = r.getListSlotTime();
        r = rd.getRequestById(rd.insertRequest(r));
//        System.out.println(r.getRequestID());
        for (RequestSlotTime reqST : rstList) {
            reqST.setRequestID(r.getRequestID());
        }
        rd.insertRequestSlot(rstList);
        //if mentee acp mentor, req of mentor change status
        if (u.getRole() == 2) {
            //update have people accept req
            rd.updateStatusRequest(reqID, 1);
            rd.updateStatusRequest(r.getRequestID(), 1);
            rd.insertWishRequest(r.getRequestID(), reqID);
            cd.insertCourse(reqID);
        }else{
            rd.insertWishRequest(reqID, r.getRequestID());
        }
        response.sendRedirect("request");

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
