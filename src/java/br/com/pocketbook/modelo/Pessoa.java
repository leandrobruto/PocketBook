/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.modelo;

import br.com.pocketbook.database.PessoaDAO;
import java.sql.SQLException;
import java.util.Objects;

/**
 *
 * @author fap1
 */
public class Pessoa {
    private String id; // = CPF
    private int id_endereco;
    private String nome;
    private String sobrenome;

    public Pessoa(String id, int id_endereco) {
        this.id = id;
        this.id_endereco = id_endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void inserir() throws SQLException, ClassNotFoundException{
        new PessoaDAO().inserir(this);
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Pessoa pe = (Pessoa) obj;
        return pe.getId().equals(this.getId());
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
}
