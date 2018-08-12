/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
public class conwithus extends HttpServlet {

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name = request.getParameter("uname");
           String email = request.getParameter("uemail");
           String que = request.getParameter("ufeed");
           MyDB db = new MyDB();
           Connection con =db.getCon();
           Statement stmt = con.createStatement();
           
           
        stmt.executeUpdate("insert into contact(username,email,query)values('"+name+"','"+email+"','"+que+"')");
           
           out.println("Successfully inserted Your Query");
            
          /*  String redirectedPage = "/parentPage";
          response.sendRedirect("registrationsuccess.jsp");*/
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


}
