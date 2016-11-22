package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroEstabelecimento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>body {background-color: powderblue;}\n");
      out.write("                h1{color: black;}\n");
      out.write("                p{color: black;}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <img src=\"pocketbook-logo.png\">\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<title>Pocket Book</title>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"");
      out.print( request.getContextPath());
      out.write("/ControllerServlet?acao=cadastrarE\">\n");
      out.write("            <input id=\"nEstabelecimento\" type=\"text\" name=\"nomeEstabelecimento\" placeholder=\"Empresa\">\n");
      out.write("            <input id=\"cnpj\" type=\"text\" name=\"cnpj\" placeholder=\"CNPJ\">\n");
      out.write("            <input id=\"emailE\" type=\"text\" name=\"emailE\" placeholder=\"Email estabelecimento\">\n");
      out.write("            <input id=\"cEmailE\" type=\"text\" name=\"cEmailE\" placeholder=\"Confirme Email\">\n");
      out.write("            <h1>Endereço:</h1>\n");
      out.write("            <input id=\"logradouro\" type=\"text\" name=\"logradouro\" placeholder=\"Logradouro\">\n");
      out.write("            <input id=\"numero\" type=\"number\" name=\"numero\" placeholder=\"Numero\">\n");
      out.write("            <input id=\"bairro\" type=\"text\" name=\"bairro\" placeholder=\"Bairro\">\n");
      out.write("            <input id=\"cep\" type=\"number\" name=\"cep\" placeholder=\"Cep\">\n");
      out.write("            <input id=\"cidade\" type=\"text\" name=\"cidade\" placeholder=\"Cidade\">\n");
      out.write("            <input id=\"uf\" type=\"text\" name=\"uf\" placeholder=\"UF\">\n");
      out.write("            <button type=\"submit\" value=\"login\"> Cadastrar</button> \n");
      out.write("        </form>\n");
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
