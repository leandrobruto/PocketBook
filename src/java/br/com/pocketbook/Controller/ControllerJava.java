/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.Controller;

import br.com.pocketbook.database.DAODosJoin;
import br.com.pocketbook.modelo.Endereco;
import br.com.pocketbook.modelo.Estabelecimento;
import br.com.pocketbook.modelo.Pessoa;
import br.com.pocketbook.modelo.User;
import br.com.pocketbook.modelo.Nota;
import br.com.pocketbook.modelo.Produto;
import java.sql.SQLException;

/**
 *
 * @author fap1
 */
public class ControllerJava {
    private static User usuario;
    private static Pessoa pessoa;
    private static Endereco endereco;
    private static Estabelecimento estabelecimento;

    public static boolean cadastrar(String name, String sobrenome, String email, String telefone, String senha, String cpf) {
        pessoa = new Pessoa(cpf, 1);
        pessoa.setNome(name);
        pessoa.setSobrenome(sobrenome);
        
        usuario = new User(email, cpf);
        usuario.setSenha(senha);
        
        try {
            pessoa.inserir();
            usuario.inserir();
            return true;
        } catch (SQLException sql) {
            System.out.println("Deu SQL");
        } catch (ClassNotFoundException cl) {
            System.out.println("Deu Class");
        }
        return false;
    }
    
    public static boolean loginUsuario(String usuario, String senhaUser) {
        boolean retorno = false;
        try {
            System.out.println("Controller");
            retorno = User.login(senhaUser, usuario);
        } catch (SQLException sql) {
            System.out.println("Deu sql");
            return retorno;
        } catch (ClassNotFoundException cl) {
            System.out.println("Deu Class");
            return retorno;
        } catch (NullPointerException num) {
            System.out.println("deu null");
            return retorno;
        }
        return retorno;
    }
    
    public static boolean loginEmpresa(String usuario, String senhaEmpresa) {
        boolean retorno = false;
        try {
            System.out.println("Empresa");
            retorno = estabelecimento.login(senhaEmpresa, usuario);
        } catch (SQLException sql) {
            System.out.println("Deu sql");
            return retorno;
        } catch (ClassNotFoundException cl) {
            System.out.println("Deu Class");
            return retorno;
        } catch (NullPointerException num) {
            System.out.println("deu null");
            return retorno;
        }
        return retorno;
    }

    public static String getNome(String idUsuario) {
        String retorno = null;
        try {
            retorno = DAODosJoin.getNomePessoa(idUsuario);
        } catch (SQLException sql) {
            System.out.println(sql);
        }
        return retorno;
    }
    
    public static String getEstabelecimento(String email) {
        String retorno = null;
        try {
            retorno = DAODosJoin.getNomeEstabelecimento(email);
        } catch (SQLException sql) {
            System.out.println(sql);
        }
        return retorno;
    }

    static boolean cadastrarEstabelecimento(String logradouro, int numero, String bairro, String cep, String cidade, String uf,
            String cnpj, String nomeEstabelecimento, String emailEstabelecimento, String telefone, String senha, Object usuario) {
        boolean retorno = false;
        String idUsuario = usuario.toString();
        System.out.println("idUser: " + idUsuario);
        endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        endereco.setUf(uf);
        
        try {
            endereco.inserir();
            
            estabelecimento = new Estabelecimento(cnpj, idUsuario, endereco.getIdEndereco());
            estabelecimento.setNome(nomeEstabelecimento);
            estabelecimento.setEmail(emailEstabelecimento);
            estabelecimento.setTelefone(telefone);
            estabelecimento.setSenha(senha);
            System.out.println("senha: " + estabelecimento.getSenha());
            
            estabelecimento.inserir();
            return true;
        } catch (SQLException ex) {
            return retorno;
        } catch (ClassNotFoundException ex) {
            return retorno;
        }
    }
    
    static boolean cadastrarProduto(int cod, String nome, float valor){
        Produto produto = new Produto(cod, nome, valor);
        boolean retorno = false;
        try {
            produto.inserir();
            return retorno;
        } catch (SQLException ex) {
            return retorno;
        } catch (ClassNotFoundException ex) {
            return retorno;
        }
    }
    
    static boolean gerarNota(String idPessoa, int codNota, int quantidade){
        Nota nota = new Nota(idPessoa, codNota, quantidade);
        boolean retorno = false;
        try {
            System.out.println("opaNota");
            nota.gerarNota();
            return retorno;
        } catch (SQLException ex) {
            return retorno;
        } catch (ClassNotFoundException ex) {
            return retorno;
        }
    }
}
