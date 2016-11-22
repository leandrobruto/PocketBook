package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfilEstabelecimento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<style>body {background-color: powderblue;}\n");
      out.write("\t\t\th1{color: black;}\n");
      out.write("\t\t\tp{color: black;}\n");
      out.write("\t\t</style>\n");
      out.write("\n");
      out.write("\t\t<center>\n");
      out.write("\t\t\t<img src=\"pocketbook-logo.png\">\n");
      out.write("\t\t</center>\n");
      out.write("\t\t\n");
      out.write("\t</head>\n");
      out.write("\t<title>Pocket Book</title>\n");
      out.write("\t<body>\n");
      out.write("\t\t<form method=\"post\" action=\"");
      out.print( request.getContextPath());
      out.write("/ControllerServlet?acao=login\">\n");
      out.write("\t\t<div>\n");
      out.write("                    <label for=\"email\">E-mail:</label>\n");
      out.write("                    <input name=\"email\" type=\"email\" id=\"email\" align=\"right\"/>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t<p>\n");
      out.write("\t\t</p>\n");
      out.write("\t<div>\n");
      out.write("            <label for=\"senha\">Senha:</label>\n");
      out.write("            <input name=\"senha\" type=\"password\" id=\"senha\" align=\"right\" />\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("                <br/>\n");
      out.write("\t\t<div class=\"button\">\n");
      out.write("                    <button type=\"submit\">Login</button>\n");
      out.write("\t\t</div>\n");
      out.write("            </form>\n");
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
