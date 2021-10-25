/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.mentee;

import dal.MentorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Mentor;

/**
 *
 * @author Admin
 */
@WebServlet(name = "MenteeHome", urlPatterns = {"/mentee/home"})
public class MenteeHome extends HttpServlet {

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
            out.println("<title>Servlet MenteeHome</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MenteeHome at " + request.getContextPath() + "</h1>");
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
        MentorDAO md = new MentorDAO();
        List<Mentor> mList = md.getListMentor();
        //request.setAttribute("mtorList", mList); 
        //Tạo Phân Trang
        
        int size = mList.size();
        int numperPage=4; 
        int numPage=size/numperPage+(size%numperPage==0?0:1);
        String spage=request.getParameter("page");
        int page;
        if(spage==null){
            page=1;
        }else{
                page=Integer.parseInt(spage);
            }
        int start,end;
        start=(page-1)*numperPage;
        end=Math.min(size,page*numperPage);
        
        List<Mentor> arr = md.getMentorByPage(mList, start, end);
        request.setAttribute("num", numPage);
        request.setAttribute("data", arr);
        request.setAttribute("page", page);  
        //Phân trang xong
        request.getRequestDispatcher("/user/mentee/mentee-dashboard.jsp").forward(request, response);
        
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
