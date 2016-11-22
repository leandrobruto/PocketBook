/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.modelo;

import br.com.pocketbook.database.ProdutoDAO;
import java.sql.SQLException;

/**
 *
 * @author nexti
 */
public class Produto {
    private int cod;
    private String nome;
    private float valor;

    public Produto(int cod, String nome, float valor) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void inserir() throws SQLException, ClassNotFoundException{
        new ProdutoDAO().inserir(this);
    }
    
}
