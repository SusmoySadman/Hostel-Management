/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Susmoy
 */
public class RoomBook extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          String fullname=request.getParameter("ufull");
          String username=request.getParameter("uname");
          String RoomType=request.getParameter("rm");
          String email=request.getParameter("uemail");
          String institute=request.getParameter("uins");
          try{
              
               MyDB db = new MyDB();
           Connection con =db.getCon();
           
          Statement stmt = con.createStatement();
          stmt.executeUpdate("insert into booking(Fullname,Username,Roomtype,Email,Institute)values('"+fullname+"','"+username+"','"+RoomType+"','"+email+"','"+institute+"') ");
        
          
                out.println("Inserted Successfully");
           
                
            
              
          }catch(Exception e){
              
              out.println("Please connect with Xampp");
          }
         
            
            
            
            /* TODO output your page here. You may use following sample code. */
           
        }
    }

 
   
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   
}
