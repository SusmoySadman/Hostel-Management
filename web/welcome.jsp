<%-- 
    Document   : welcome
    Created on : Jul 18, 2018, 6:30:48 PM
    Author     : Susmoy
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
           <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
      
        
         <table border="2" align="center" width="980" height="800">
         
            <tr>
                <td colspan="3" height="80">
            <marquee><font color="red" size="30px">We Want Justice</marquee>
                </td>
                
            </tr>
            <tr>
                
                
                <td colspan="3" height="300">
                    <image src="img/1.jpg" alt="logo" height="300" width="100%">
                    
                </td>
                
            </tr>
            <tr>
                
                <td colspan="3" height="50">
                    <table border="2" width="100%" height="100%">
                        <tr align="center">
                            <td><a href="home.jsp">Home</a></td>
                            <td><a href="rooms.jsp">Rooms</a></td>
                            <td><a href="facilities.jsp">Facilities</a></td>
                            <td><a href="registration.jsp">Registration</a></td>
                            <td><a href="contact.jsp">Contact</a></td>
                                  <td><a href="aboutus.jsp">About Us</a></td>
                            
                        </tr>
                        
                        
                    </table>
                    
                    
                </td>
                
            </tr>
            <tr>
               
                <td colspan="3" height="500"align="center">
                    <h1>:::Welcome to the User Profile:::</h1></br></br>
                   

                    <%
        
         try{
              String session_id =null;
        HttpSession session1=request.getSession(false);  
        if(session1!=null){  
        session_id=(String)session1.getAttribute("username");  
       
        }
             
             Class.forName("com.mysql.jdbc.Driver");
          Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hm", "root", "");
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery("select * from register where sid='"+session_id+"'");
          rs.next();
          String name = rs.getString("username");
          String email = rs.getString("email");
          String mob = rs.getString("mobile");
          %>
           <h2>Welcome : <%out.print(name);%></h2>
           <h2>Your Mail : <%out.print(email);%></h2>
           <h2>Your Mobile : <%out.print(mob);%></h2>
           <%
         }catch(Exception e){
          out.println(e);
         }
     
          
       
        %>

                </td>
                
            </tr>
            <tr>
                
                <td colspan="3" height="50" align="center">
                    
                    &copy; All Rights reserved by <b>Super Eagles</b>
                    <p>Date/Time: <span id="datetime"></span></p>

<script>
var dt = new Date();
document.getElementById("datetime").innerHTML = dt.toLocaleString();
</script>
                </td>
                
            </tr>
            
        </table>
        
        
      
    </body>
</html>
