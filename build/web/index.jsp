<%-- 
    Document   : index
    Created on : Jul 29, 2018, 6:19:59 PM
    Author     : Susmoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
   <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
         
        <table border="2" align="center" width="50%" height="800">
            
            <tr>
                <td height="250">
                      <image src="img/1.jpg" alt="logo" height="250" width="100%">
                </td>
                
                
            </tr>
                <tr>
                    <td align="center" valign="top">
                        
                        </br>
                        </br>
                       
                        <h1>Online Hostel Management System</h1>
                        </br>
                       
                        
                        <h2>Please Login if you want to see details</h2>
                        </br>
                       
                      
                        
                        
                        <form action="login" method="get">
                        <table border="1" align="center">
                            <tr>
                                
                                <td>User Name</td>
                                <td>:</td>
                                <td>
                                    <input type="text" name="user" size="20"required="">
                                </td>
                                
                            </tr>
                            
                                <tr>
                                <td>Password</td>
                                <td>:</td>
                                <td>
                                    <input type="password" name="pass"size="20" required="">
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td align="center">
                                    
                                    <input type="submit" value="Login">
                                </td>
                                
                            </tr>
                            
                            
                        </table>
                        </form>
                        
                        
                        
                    </td>
                </tr>
                
                
             <tr>
                
                <td  height="50" align="center">
                    
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
