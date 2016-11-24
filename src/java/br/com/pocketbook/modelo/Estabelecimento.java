/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.modelo;

import br.com.pocketbook.database.EstabelecimentoDAO;
import br.com.pocketbook.database.TelefoneDAO;
import java.sql.SQLException;

/**
 *
 * @author fap1
 */
public class Estabelecimento {

    private String id; //cnpj
    private String id_usuario; //email do usuario
    private int id_endereco;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public Estabelecimento(String id, String id_usurario, int id_endereco) {
        this.id = id;
        this.id_usuario = id_usurario;
        this.id_endereco = id_endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_usurario() {
        return id_usuario;
    }

    public void setId_usurario(String id_usurario) {
        this.id_usuario = id_usurario;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws SQLException {
        this.telefone = telefone;
        new TelefoneDAO().inserir(this.telefone, this.id);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean inserir() throws SQLException, ClassNotFoundException {
        return EstabelecimentoDAO.inserir(this);
    }
    
    public static boolean login(String senha, String login)throws SQLException, ClassNotFoundException{
        System.out.println("Estabelecimento");
        return new EstabelecimentoDAO().getEstabelecimento(login).getSenha().equals(senha);
    }
}
