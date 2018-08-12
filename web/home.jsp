<%-- 
    Document   : home
    Created on : Jul 17, 2018, 7:22:30 PM
    Author     : Susmoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        
        <%
         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
          
            hitsCount = 1;
         } else {
     
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
      %>
      
       
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
               
                <td width="300" align="center">
                      <image src="img/seasound.jpg" alt="logo" height="600" width="100%">
                    
                    
                </td>
                <td  height="500"valign="top"style="font-size:20px;font-family:Comic Sans MS;text-align:center" >
                    <h1> Hostel Management System</h1>
                    <p style="text-align: justify;font-size:20px;font-family: initial;padding-left:20px">
                        
                        <b>What is a Hostel?</br></br></b> 

Hostels are a cheap way to lodge safely with like-minded travelers around the world.Hostels usually feature security, social life, showers, and rooms with multiple bunks. Some hostels are bare bones beds and baths at $5 per night; some are almost luxurious. You can find them in most countries around the world, and they're almost always the cheapest accommodation option available to you as you travel. 
</br></br>
<b>The People Who Stay in Hostels</br></br></b>

People young and old, families and solo travelers, opt to stay in hostels, and it's not as rare as you think to check in to a place and discover a 70 year old man who has been traveling the world on his own for a few years. Most of your fellow guests will be international, with far fewer Americans than you might expect -- you'll definitely be in the minority in most hostels around the world! Overall, though, the majority of hostel guests are aged between 18 and 26, and some of the most common nationalities are Australians, Brits, Germans, and Israelis.
                    </p>
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
                    <p><strong>Total Visitors: </strong> <%= hitsCount%></p>
                </td>
                
            </tr>
            
        </table>
        
        
        
        
        
    </body>
</html>
