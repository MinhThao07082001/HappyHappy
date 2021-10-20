/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.RequestDAO;
import dal.SubjectDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Request;
import model.RequestSlotTime;
import model.Subject;
import model.UserCommon;
import org.json.JSONArray;

/**
 *
 * @author Admin
 */
@WebServlet(name = "EditRequest", urlPatterns = {"/editRequest"})
public class EditRequest extends HttpServlet {

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
            out.println("<title>Servlet EditRequest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditRequest at " + request.getContextPath() + "</h1>");
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
        RequestDAO rd = new RequestDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        Request r = rd.getRequestById(id);
        request.setAttribute("req", r);
        SubjectDAO sd = new SubjectDAO();
        List<String> sNameList = sd.getListSubjectName();
        request.setAttribute("sNameList",sNameList);
        List<Subject> sList = sd.getAll();
        request.setAttribute("sub", sList);
        request.getRequestDispatcher("user/update-request.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        UserDAO ud = new UserDAO();
        UserCommon u = ud.getEmail((String) session.getAttribute("email"));
//        System.out.println("UOA");
//System.out.println(request.getParameter("reqID"));
        try {
            String subject = request.getParameter("subject");
            String level = request.getParameter("level");
            SubjectDAO sd = new SubjectDAO();
            Subject s = sd.getSubject(subject, level);
            int requestID = Integer.parseInt(request.getParameter("reqID"));
            int userID = u.getUserID();
            int subjectID = sd.getSubject(subject, level).getSubjectID();
            int moneyPerSlot = Integer.parseInt(request.getParameter("moneyPerSlot"));
            int timePerSlot = Integer.parseInt(request.getParameter("timePerSlot"));
            String startTime = (request.getParameter("startTime"));
            String endTime = (request.getParameter("endTime"));
            String description = request.getParameter("description");
            int learnType = Integer.parseInt(request.getParameter("learnType"));
            String timeJson = request.getParameter("timeJson");
            System.out.println("        TIME: "+timeJson);
            Request r = new Request(userID, subjectID, moneyPerSlot, timePerSlot, startTime, endTime, description, learnType);
            r.setRequestID(requestID);
            JSONArray j = new JSONArray(timeJson);
            List<RequestSlotTime> rstList = new ArrayList<>();
            RequestDAO rd = new RequestDAO();
            System.out.println(startTime+endTime);
            for(int i=0; i<j.length(); i++){
                RequestSlotTime rst = new RequestSlotTime(requestID, j.getJSONObject(i).getInt("day"), j.getJSONObject(i).getString("from"), j.getJSONObject(i).getString("to"));
                rstList.add(rst);
            };
            rd.updateRequest(r, rstList);
            response.sendRedirect("editRequest?id="+requestID);
        } catch (Exception e) {
            System.out.println(e);
        }
        

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
