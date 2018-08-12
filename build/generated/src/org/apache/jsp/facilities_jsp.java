package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facilities_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Facilities</title>\n");
      out.write("           <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("         <table border=\"2\" align=\"center\" width=\"980\" height=\"800\">\n");
      out.write("         \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" height=\"80\">\n");
      out.write("            <marquee><font color=\"red\" size=\"30px\">We Want Justice</marquee>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <td colspan=\"3\" height=\"300\">\n");
      out.write("                    <image src=\"img/1.jpg\" alt=\"logo\" height=\"300\" width=\"100%\">\n");
      out.write("                    \n");
      out.write("                </td>\n");
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
      out.write("                <td height=\"500\" valign=\"top\" align=\"center\">\n");
      out.write("                    \n");
      out.write("                    <h1><strong>Facilities of Our Hostel</strong></h1></br>\n");
      out.write("                    <table border=\"3\" align=\"center\" width=\"50%\"height=\"200\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">i)   24 Hour Reception</p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">ii)   Always helpful hostel staff with current information</p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">iii)  An Easygoing relaxing and friendly environment</p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">iv)   Free Wifi in lobby,Hotspots are available in apartments </p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">v)    Breakfast is included </p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">vi)   Use of kitchen is included </p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">vii)  Washing machine & dryers are available </p>\n");
      out.write("                    <p class=\"demo\" style=\"text-align:left;padding-left: 20px\">viii) Elevator is fitted in the building</p>\n");
      out.write("                    \n");
      out.write("                            </td>\n");
      out.write("                         \n");
      out.write("                 \n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("            \n");
      out.write("                </td>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td colspan=\"3\" height=\"50\" align=\"center\">\n");
      out.write("                    \n");
      out.write("                    &copy; All Rights reserved by <b>Super Eagles</b>\n");
      out.write("                                        <p>Date/Time: <span id=\"datetime\"></span></p>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var dt = new Date();\n");
      out.write("document.getElementById(\"datetime\").innerHTML = dt.toLocaleString();\n");
      out.write("</script>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>");
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
