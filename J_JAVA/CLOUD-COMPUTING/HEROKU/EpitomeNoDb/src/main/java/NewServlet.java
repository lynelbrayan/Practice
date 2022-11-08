/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author lynel
 */
@WebServlet(urlPatterns = {"/AgeCalc"})
public class NewServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                        out.println("<!DOCTYPE html>");
                        
                        out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgeCalc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Your Age</h1>");
            
            String s = request.getParameter("dob");
            String n[]=s.split("-");
            
            LocalDate dates=LocalDate.of(Integer.parseInt(n[0]),Integer.parseInt(n[1]), Integer.parseInt(n[2]));
            LocalDate now = LocalDate.now();
            LocalDate current;
            current = LocalDate.of(now.getYear(), now.getMonthValue(),now.getDayOfMonth());
            Period diff = Period.between(dates,current);
            String res = " "+ diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days";
            out.println(res);
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
        processRequest(request, response);
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
