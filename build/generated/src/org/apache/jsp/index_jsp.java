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
      out.write("        <title>Traductor</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("    <center> <h2>Traductor</h2>\n");
      out.write("        <form action=\"esd\" method=\"post\">\n");
      out.write("            <select name=\"Palabras\">\n");
      out.write("                <option value=\"1\">PALABRAS</option>\n");
      out.write("                <option value=\"2\">Falda</option>\n");
      out.write("                <option value=\"3\">Queso</option>\n");
      out.write("                <option value=\"4\">Gente</option>\n");
      out.write("                <option value=\"5\">Respuesta</option>\n");
      out.write("                <option value=\"6\">Diccionario</option>\n");
      out.write("                <option value=\"7\">Vaso</option>\n");
      out.write("                <option value=\"8\">Baile</option>\n");
      out.write("                <option value=\"9\">Caballo</option>\n");
      out.write("                <option value=\"10\">Raton</option>\n");
      out.write("                <option value=\"11\">Beso</option>\n");
      out.write("            </select>\n");
      out.write("           \n");
      out.write("            <input type=\"submit\" value=\"Traducir\" class=\"btn\"/>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html\n");
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
