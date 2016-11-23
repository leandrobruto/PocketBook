/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.modelo;

import br.com.pocketbook.database.NotasDAO;
import java.sql.SQLException;

/**
 *
 * @author nexti
 */
public class Nota {
    private int cod;
    private int quantidade;
    private float valor_total;
    private String idPessoa;
    private String data;

    public Nota(String idPessoa, int cod, int quantidade) {
        this.cod = cod;
        this.quantidade = quantidade;
        this.idPessoa = idPessoa;
    }
    
    public Nota(){
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int numero) {
        this.cod = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    public void gerarNota()throws SQLException, ClassNotFoundException{
        new NotasDAO().gerarNota(this);
    }
    
}
