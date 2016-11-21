package br.com.pocketbook.modelo;

import br.com.pocketbook.database.UserDAO;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fap1
 */
public class User {
    private String ID; //email
    private String id_pessoa;//cpf
    private String tipo = "user";
    private String senha;

    public User(String ID, String id_pessoa) {
        this.ID = ID;
        this.id_pessoa = id_pessoa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(String id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void inserir() throws SQLException, ClassNotFoundException {
        System.out.println("function");
        new UserDAO().inserir(this);
    }
    
    public static boolean login(String senha, String login)throws SQLException, ClassNotFoundException{
        return new UserDAO().getUsuario(login).getSenha().equals(senha);
    }
}
