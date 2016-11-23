package br.com.pocketbook.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
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
        System.out.println("request: " + request + " response: " + response);
        System.out.println("Ação: " + request.getParameter("acao"));
        
        if (request.getSession().getAttribute("usuario") != null) {
            response.sendRedirect("perfil.jsp");
        } else {
            String acaoPost = request.getParameter("acao");
            if (null != acaoPost) {
                switch (acaoPost) {
                    case "cadastroEstabelecimento":
                        System.out.println("Eita nois");
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
        System.out.println("Ação: " + request.getParameter("acao"));
        
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
                            response.sendRedirect("perfilEstabelecimento.jsp");
                            
                        } else {
                            processeErro(request, response);
                        }
                    } else {
                        processeErro(request, response);
                    }
                    break;
                    
                case "cadastraProduto":
                    System.out.println("cod: " + request.getParameter("cod"));
                    int cod = Integer.parseInt(request.getParameter("cod"));
                    System.out.println("nome: " + request.getParameter("nome"));
                    String nome = request.getParameter("nome");
                    System.out.println("valor: " + request.getParameter("valor"));
                    float valor = Float.parseFloat(request.getParameter("valor"));
                    System.out.println("aqui: " + cod +" "+ nome +" "+ valor);
                    System.out.println("data: " +  LocalDate.now());
                    System.out.println("data: " +  Calendar.getInstance().getTime());
                    Timestamp.from(Instant.MIN).getTime();
                    
                    if (cod != 0 && !nome.equals("") && valor != 0) {
                        System.out.println("passou");
                        if (ControllerJava.cadastrarProduto(cod, nome, valor)) {
                            response.sendRedirect("cadatraProduto.jsp");
                        }
                    }
                    break;
                    
                case "gerarNota":
                    System.out.println("hujmmmmmm");
                    String idPessoa = request.getParameter("cpfNota");
                    System.out.println("pessoa: " + idPessoa);
                    int codNota = Integer.parseInt(request.getParameter("codNota"));
                    int quantidade = Integer.parseInt(request.getParameter("quantidade"));
//                    float valor_total = Float.parseFloat(request.getParameter("valorTotal"));
                    
                    if (!idPessoa.equals("") && codNota != 0 && quantidade != 0) {
                        System.out.println("passou");
                        if (ControllerJava.gerarNota(idPessoa, codNota, quantidade)) {
                            response.sendRedirect("perfilEstabelecimento.jsp");
                        }
                    }
                    break;
                    
                case "cadastrarEstabelecimento":
                    response.sendRedirect("cadastroEstabelecimento.jsp");
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
