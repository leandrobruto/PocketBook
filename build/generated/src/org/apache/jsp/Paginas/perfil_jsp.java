package org.apache.jsp.Paginas;

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
      out.write("    <head>      \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"perfilcss.css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <title>PocketBook</title>\n");
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
      out.write("            <div class=\"c\"><img src=\"\"></img></div>\n");
      out.write("            <div class=\"c\"><p>PocketBook</p></div>\n");
      out.write("            <div class=\"c\"><p>perfil</p></div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"left\"> \n");
      out.write("            <div style=\"border-bottom: solid #575757\">\n");
      out.write("                <div><h2>Bem vindo!</h2></div>\n");
      out.write("                <div><img src=\"perfil.jpg\" width=\"60%\" height=\"60%\" ></div>\n");
      out.write("                <div><h2>");
      out.print( request.getSession().getAttribute("usuario"));
      out.write(" !</h2></div>\n");
      out.write("                <div><a href=\"");
      out.print( request.getContextPath());
      out.write("/ControlerServlet?acao=perfil\">Editar Perfil</a></div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <p>Casdatre seu Estabelecimento:</p>\n");
      out.write("                <form method=\"post\" action=\"");
      out.print( request.getContextPath());
      out.write("/ControlerServlet?acao=cadastrarE\">\n");
      out.write("                    <input id=\"nEstabelecimento\" type=\"text\" name=\"nomeEstabelecimento\" placeholder=\"Empresa\">\n");
      out.write("                    <input id=\"cnpj\" type=\"tex\" name=\"cnpj\" placeholder=\"CNPJ\">\n");
      out.write("                    <input id=\"emailE\" type=\"tex\" name=\"emailE\" placeholder=\"Email estabelecimento\">\n");
      out.write("                    <input id=\"cEmailE\" type=\"tex\" name=\"cEmailE\" placeholder=\"Confirme Email\">\n");
      out.write("                    <button type=\"submit\" value=\"login\"> Cadastrar</button> \n");
      out.write("                </form>\n");
      out.write("                <a href=\"");
      out.print( request.getContextPath());
      out.write("/LogoutServlet\" title=\"Fazer logout\">Sair</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"center\">\n");
      out.write("            <div><img src=\"b.png\" width=\"98%\" height=\"90%\" ></div><br>\n");
      out.write("            <div><img src=\"r.png\" width=\"98%\" height=\"90%\" ></div>\n");
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
