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
    
    public static boolean login(String usuario, String senhaU) {
        boolean retorno = false;
        try {
            retorno = User.login(senhaU, usuario);
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

    static boolean cadastrarEstabelecimento(String logradouro, int numero, String bairro, String cep, String cidade, String uf,
            String cnpj, String nomeEstabelecimento, String emailEstabelecimento, Object usuario) {
        boolean retorno = false;
        String idUsuario = usuario.toString();
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
}
