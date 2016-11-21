/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.modelo;

/**
 *
 * @author nexti
 */
public class Nota {
    private int numero;
    private int quantidade;
    private float valor_total;
    private String data;

    public Nota(int numero, int quantidade, float valor_total, String data) {
        this.numero = numero;
        this.quantidade = quantidade;
        this.valor_total = valor_total;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    
    
}
