package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
          
            hitsCount = 1;
         } else {
     
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
      
      out.write("\n");
      out.write("      \n");
      out.write("       \n");
      out.write("        <table border=\"2\" align=\"center\" width=\"980\" height=\"800\">\n");
      out.write("         \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" height=\"80\">\n");
      out.write("            <marquee><font color=\"red\" size=\"30px\">We Want Justice</marquee>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("               <td colspan=\"3\" height=\"300\">\n");
      out.write("                    <image src=\"img/1.jpg\" alt=\"logo\" height=\"300\" width=\"100%\">\n");
      out.write("                    \n");
      out.write("               </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td colspan=\"3\" height=\"50\">\n");
      out.write("                    <table border=\"2\" width=\"100%\" height=\"100%\">\n");
      out.write("                        <tr align=\"center\">\n");
      out.write("                            <td><a href=\"home.jsp\">Home</a></td>\n");
      out.write("                            <td><a href=\"rooms.jsp\">Rooms</a></td>\n");
      out.write("                            <td><a href=\"facilities.jsp\">Facilities</a></td>\n");
      out.write("                            <td><a href=\"registration.jsp\">Registration</a></td>\n");
      out.write("                            <td><a href=\"contact.jsp\">Contact</a></td>\n");
      out.write("                                  <td><a href=\"aboutus.jsp\">About Us</a></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               \n");
      out.write("                <td width=\"300\" align=\"center\">\n");
      out.write("                      <image src=\"img/seasound.jpg\" alt=\"logo\" height=\"600\" width=\"100%\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td  height=\"500\"valign=\"top\"style=\"font-size:20px;font-family:Comic Sans MS;text-align:center\" >\n");
      out.write("                    <h1> Hostel Management System</h1>\n");
      out.write("                    <p style=\"text-align: justify;font-size:20px;font-family: initial;padding-left:20px\">\n");
      out.write("                        \n");
      out.write("                        <b>What is a Hostel?</br></br></b> \n");
      out.write("\n");
      out.write("Hostels are a cheap way to lodge safely with like-minded travelers around the world.Hostels usually feature security, social life, showers, and rooms with multiple bunks. Some hostels are bare bones beds and baths at $5 per night; some are almost luxurious. You can find them in most countries around the world, and they're almost always the cheapest accommodation option available to you as you travel. \n");
      out.write("</br></br>\n");
      out.write("<b>The People Who Stay in Hostels</br></br></b>\n");
      out.write("\n");
      out.write("People young and old, families and solo travelers, opt to stay in hostels, and it's not as rare as you think to check in to a place and discover a 70 year old man who has been traveling the world on his own for a few years. Most of your fellow guests will be international, with far fewer Americans than you might expect -- you'll definitely be in the minority in most hostels around the world! Overall, though, the majority of hostel guests are aged between 18 and 26, and some of the most common nationalities are Australians, Brits, Germans, and Israelis.\n");
      out.write("                    </p>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td colspan=\"3\" height=\"50\" align=\"center\">\n");
      out.write("                    \n");
      out.write("                    &copy; All Rights reserved by <b>Super Eagles</b>\n");
      out.write("                     <p>Date/Time: <span id=\"datetime\"></span></p>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var dt = new Date();\n");
      out.write("document.getElementById(\"datetime\").innerHTML = dt.toLocaleString();\n");
      out.write("</script>\n");
      out.write("                    <p><strong>Total Visitors: </strong> ");
      out.print( hitsCount);
      out.write("</p>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
