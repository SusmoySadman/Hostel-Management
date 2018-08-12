/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.IllegalCharsetNameException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Susmoy
 */
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
       
              try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name = request.getParameter("uname");
          
           String pass = request.getParameter("upass");
           String mob = request.getParameter("umobile");
           String email = request.getParameter("uemail");
           String add = request.getParameter("uadd");
            if(name.equals("")||pass.equals("")){
               
               out.println("Please Enter Username and Password");
           }
            else if((name.length()<5)||((name.length()>15))||((pass.length()<5)||((pass.length()>15)))){
               out.println("Invalid Format for username and password");
           }
            
            else{
                
            
           MyDB db = new MyDB();
           Connection con =db.getCon();
           Statement stmt = con.createStatement();
           
           
        stmt.executeUpdate("insert into register(username,password,mobile,email,address)values('"+name+"','"+pass+"','"+mob+"','"+email+"','"+add+"') ");
           
           out.println("Successfully Register");
            }
          /*  String redirectedPage = "/parentPage";
          response.sendRedirect("registrationsuccess.jsp");*/
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
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
