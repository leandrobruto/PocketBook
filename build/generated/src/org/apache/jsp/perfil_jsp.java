package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"perfil.css\"/>\n");
      out.write("        <title>PocketBook</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">\n");
      out.write("<style>\n");
      out.write(".mySlides {display:none}\n");
      out.write("</style>\n");
      out.write("        <script>\n");
      out.write("            function funcao1()\n");
      out.write("            {\n");
      out.write("                alert(\"Cadastrado com sucesso\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"cabeca\">\n");
      out.write("            <center>\n");
      out.write("                <div class=\"c\"><img src=\"pocketbook-logo.png\"></img></div>\n");
      out.write("            </center>\n");
      out.write("            <div class=\"c\"><p>PocketBook</p></div>\n");
      out.write("            <div class=\"c\"><p>perfil</p></div>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <ul id=\"nav\" >\n");
      out.write("            <li><a href=\"#\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">Sobre Nós</a></li>\n");
      out.write("            <li><a href=\"#\">Portfólio</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">sub - 1</a></li>\n");
      out.write("                    <li><a href=\"#\">sub - 2</a></li>\n");
      out.write("                    <li><a href=\"#\">sub - 3</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\">Serviços</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">sub - 1</a></li>\n");
      out.write("                    <li><a href=\"#\">sub - 2</a></li>\n");
      out.write("                    <li><a href=\"#\">sub - 3</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\">Blog</a></li>\n");
      out.write("            <li><a href=\"#\">Contato</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <div id=\"left\"> \n");
      out.write("            <div style=\"border-bottom: solid #575757\">\n");
      out.write("                <div><h2>Bem vindo!</h2></div>\n");
      out.write("                <!--<div><img src=\"perfil.jpg\" width=\"60%\" height=\"60%\" ></div>-->\n");
      out.write("                <div><h2>");
      out.print( request.getSession().getAttribute("usuario"));
      out.write(" !</h2></div>\n");
      out.write("                <br/>\n");
      out.write("                <div><a href=\"");
      out.print( request.getContextPath());
      out.write("/ControllerServlet?acao=perfil\">Editar Perfil</a></div>\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <div class=\"w3-content\" style=\"max-width:800px\">\n");
      out.write(" <label class=\"mySlides\" src=\"img_fjords.jpg\" style=\"width:100%\">dasddasdasdasdasdasdasdasdasdasd</label>\n");
      out.write("  <label class=\"mySlides\" src=\"img_fjords.jpg\" style=\"width:100%\">dasddasdasdasdasdasdasda</label>\n");
      out.write("  <label class=\"mySlides\" src=\"img_fjords.jpg\" style=\"width:100%\">dasddasdasdasdasdasdasdasdasdasd</label>\n");
      out.write("  <label class=\"mySlides\" src=\"img_fjords.jpg\" style=\"width:100%\">dasddasdasdasdasdasdsd</label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-center\">\n");
      out.write("  <div class=\"w3-section\">\n");
      out.write("    <button class=\"w3-btn\" onclick=\"plusDivs(-1)\">❮ Prev</button>\n");
      out.write("    <button class=\"w3-btn\" onclick=\"plusDivs(1)\">Next ❯</button>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"w3-btn demo\" onclick=\"currentDiv(1)\">1</button> \n");
      out.write("  <button class=\"w3-btn demo\" onclick=\"currentDiv(2)\">2</button> \n");
      out.write("  <button class=\"w3-btn demo\" onclick=\"currentDiv(3)\">3</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("var slideIndex = 1;\n");
      out.write("showDivs(slideIndex);\n");
      out.write("\n");
      out.write("function plusDivs(n) {\n");
      out.write("  showDivs(slideIndex += n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function currentDiv(n) {\n");
      out.write("  showDivs(slideIndex = n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showDivs(n) {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"demo\");\n");
      out.write("  if (n > x.length) {slideIndex = 1}    \n");
      out.write("  if (n < 1) {slideIndex = x.length}\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("     x[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("     dots[i].className = dots[i].className.replace(\" w3-red\", \"\");\n");
      out.write("  }\n");
      out.write("  x[slideIndex-1].style.display = \"block\";  \n");
      out.write("  dots[slideIndex-1].className += \" w3-red\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("                <p>Casdatre seu Estabelecimento:</p>\n");
      out.write("                <div id=\"div1\">\n");
      out.write("                    <div class=\"text\"><h2>Seja nosso parceiro. Cadastre seu estabelecimento!</h2></div><br>\n");
      out.write("                    <form method=\"post\" action=");
      out.print( request.getContextPath());
      out.write("/ControllerServlet?acao=cadastrarEstabelecimento>\n");
      out.write("                <div class=\"button\">\n");
      out.write("                    <button type=\"submit\">Cadastrar</button>\n");
      out.write("\t\t</div>\n");
      out.write("                </form>\n");
      out.write("                <a href=\"cadastrarEstabelecimento.jsp\">Vai</a>\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("                <a href=\"");
      out.print( request.getContextPath());
      out.write("/LogoutServlet\" title=\"Fazer logout\">Sair</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div id=\"right\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"rodape\">\n");
      out.write("\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty resposta}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <script>funcao1();</script>  \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
