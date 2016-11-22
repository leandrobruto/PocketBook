package br.com.pocketbook.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fap1
 */
@WebServlet(name = "ControllerServlet", urlPatterns = {"/ControllerServlet"})
public class ControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        if (request.getSession().getAttribute("usuario") != null) {
            response.sendRedirect("perfil.jsp");
        } else {
            String acaoPost = request.getParameter("acao");
            if (null != acaoPost) {
                switch (acaoPost) {
                    case "cadastroEstabelecimento":
                        response.sendRedirect("cadastroEstabelecimento.jsp");
                        break;
                    default:
                        processeErro(request, response);
                        break;
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String acaoPost = request.getParameter("acao");
        
        if (null != acaoPost) {
            switch (acaoPost) {
                case "login":
                    String usuario = request.getParameter("email");
                    String senhaU = request.getParameter("senha");
                    if (ControllerJava.login(usuario, senhaU)) {
                        session.setAttribute("usuario", ControllerJava.getNome(usuario));
                        session.setAttribute("idUsuario", usuario);
                        processRequest(request, response);
                    } else {
                        processeErro(request, response);
                    }
                    break;
                    
                case "cadastro":
                    String name = request.getParameter("name");
                    String sobrenome = request.getParameter("sobrenome");
                    String email = request.getParameter("email");
                    String cpf = request.getParameter("cpf");
                    String telefone = request.getParameter("telefone");
                    String senha = request.getParameter("senha");
                    String confSenha = request.getParameter("confSenha");
                    
                    System.out.println("user: " + name + " email: " + email + " senha: " + senha + " ConfSenha: " + confSenha + "cpf: " + cpf);
                    if (this.confirmaString(senha, confSenha)) {
                        if (ControllerJava.cadastrar(name, sobrenome, email, telefone, senha, cpf)) {
                            response.sendRedirect("index.jsp");
                        } else {
                            processeErro(request, response);
                        }
                    }
                    break;
                    
                case "cadastrarE":
                    System.out.println("cadastro estabelecimento");
                    String nomeEstabelecimento = request.getParameter("nomeEstabelecimento");
                    String emailEstabelecimento = request.getParameter("emailE");
                    String confirmeEmail = request.getParameter("cEmailE");
                    String cnpj = request.getParameter("cnpj");
                    String logradouro = request.getParameter("logradouro");
                    int numero = Integer.parseInt(request.getParameter("numero"));
                    String bairro = request.getParameter("bairro");
                    String cep = request.getParameter("cep");
                    String cidade = request.getParameter("cidade");
                    String uf = request.getParameter("uf");
                    
                    System.out.println("Cadastro");
                    if (this.confirmaString(emailEstabelecimento, confirmeEmail) && !nomeEstabelecimento.equals("") && !cnpj.equals("") && !emailEstabelecimento.equals("")) {
                        if (ControllerJava.cadastrarEstabelecimento(logradouro, numero, bairro, cep, cidade, uf,
                                cnpj, nomeEstabelecimento, emailEstabelecimento, request.getSession().getAttribute("idUsuario"))) {
                            System.out.println("Cadastrou");
                            session.setAttribute("resposta", "sim");
                            response.sendRedirect("perfil.jsp");
                            
                        } else {
                            processeErro(request, response);
                        }
                    } else {
                        processeErro(request, response);
                    }
                    break;
                default:
                    processeErro(request, response);
                    break;
            }
        }
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean confirmaString(String senha, String cSenha) {
            return senha.equals(cSenha);
    }

    protected void processeErro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControlerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Deu Erro</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
