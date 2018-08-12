package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
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
      out.write("                            <td><a href=\"aboutus.jsp\">About Us</a></td>\n");
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
      out.write("                    <h1>:::Developed By:::</h1></br>\n");
      out.write("                    <table align=\"center\" width=\"50%\"height=\"200\">\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td>\n");
      out.write("                                  <h2 class=\"myname\"style=\"text-align:center;font-weight: bolder\">Md.Sadman Ahsan (Susmoy)</h2>\n");
      out.write("                                   <p style=\"text-align:left;padding-left: 100px\">Dept. of Computer Science & Engineering</p>\n");
      out.write("                                   <p style=\"text-align:left;padding-left: 80px\">Ahsanullah University of Science & Technology</p>\n");
      out.write("                                 <p style=\"text-align:center\">4th Year 2nd Semester</p>\n");
      out.write("                                 <p style=\"text-align: center\">Email:ahsan.susmoy@gmail.com</p>\n");
      out.write("                                 <p style=\"text-align: center\">Contact:01756938390</p>\n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        \n");
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
      out.write("                      \n");
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
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
