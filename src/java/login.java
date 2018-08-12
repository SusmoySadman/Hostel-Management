/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.font.Script;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Susmoy
 */
public class login extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String UserName=request.getParameter("user");
            String Password=request.getParameter("pass");
            try{
                 if(UserName.equals("")||Password.equals("")){
                     out.println("Please Enter Username and Password");
                 }
                 
                 else{
           MyDB db = new MyDB();
           Connection con =db.getCon();
           Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("select sid,username,password,email from register where username = '"+UserName+"' and  password = '"+Password+"'");
           if(rs.next()){
                 String uid = rs.getString("sid");
                 //RequestDispatcher rd=request.getRequestDispatcher("welcome");
                 //rd.forward(request, response);
                 
              
              //response.sendRedirect("welcome.jsp");
               HttpSession session=request.getSession();  
              session.setAttribute("username",uid);
                RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
                 rd.forward(request, response);
           }
           else{
               
               RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
               rd.include(request, response);
               //out.println("user not found");
           }
                      
                 }
                
            }catch(Exception ex){
                
                   out.println("Please connect with Xampp");
            }
           
           
            
          
            
            
        }
    }

 

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   

}
