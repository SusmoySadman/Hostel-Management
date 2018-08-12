package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Index</title>\n");
      out.write("   <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <table border=\"2\" align=\"center\" width=\"50%\" height=\"800\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td height=\"250\">\n");
      out.write("                      <image src=\"img/1.jpg\" alt=\"logo\" height=\"250\" width=\"100%\">\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" valign=\"top\">\n");
      out.write("                        \n");
      out.write("                        </br>\n");
      out.write("                        </br>\n");
      out.write("                       \n");
      out.write("                        <h1>Online Hostel Management System</h1>\n");
      out.write("                        </br>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        <h2>Please Login if you want to see details</h2>\n");
      out.write("                        </br>\n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <form action=\"login\" method=\"get\">\n");
      out.write("                        <table border=\"1\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                \n");
      out.write("                                <td>User Name</td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"user\" size=\"20\"required=\"\">\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                                <tr>\n");
      out.write("                                <td>Password</td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"password\" name=\"pass\"size=\"20\" required=\"\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td align=\"center\">\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"submit\" value=\"Login\">\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("             <tr>\n");
      out.write("                \n");
      out.write("                <td  height=\"50\" align=\"center\">\n");
      out.write("                    \n");
      out.write("                    &copy; All Rights reserved by <b>Super Eagles</b>                  \n");
      out.write("                    <p>Date/Time: <span id=\"datetime\"></span></p>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var dt = new Date();\n");
      out.write("document.getElementById(\"datetime\").innerHTML = dt.toLocaleString();\n");
      out.write("</script>\n");
      out.write("  \n");
      out.write("                  \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
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
