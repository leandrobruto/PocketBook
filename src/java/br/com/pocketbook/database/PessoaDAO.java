/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import br.com.pocketbook.modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author fap1
 */
public class PessoaDAO {
    
    private static final Logger LOG = Logger.getLogger(PessoaDAO.class.getName());

    public void inserir(Pessoa pessoa) throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String inserir = "INSERT INTO Pessoa (idPessoa, nome, sobrenome)VALUES(?,?,?)";
        try {
            st = con.prepareStatement(inserir);
            st.setString(1, pessoa.getId()); //cpf
            st.setString(2, pessoa.getNome());
            st.setString(3, pessoa.getSobrenome());
            System.out.println("hum");
            st.execute();
            System.out.println("Urri");
            LOG.info("Registro adicionado");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    public ArrayList<String> listaPessoas() throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        Statement st = null;
        String query = "SELECT ID, id_endereco, Nome, Sobrenome FROM PocketBook.Usario";
        ArrayList<String> retorno = new ArrayList<>();
        try {
            st = con.createStatement();
            LOG.info(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("=====================");
                String cpf = rs.getString("ID");
                int id_endereco = rs.getInt("id_endereco");
                String nome = rs.getString("Nome");
                String sobrenome = rs.getString("sobrenome");
                System.out.println("ID: " + cpf);
                System.out.println("id_endereco: " + id_endereco);
                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
            }
        } catch (SQLException e) {
            LOG.info(e.getMessage());
        } finally {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return retorno;
    }
    
    public Pessoa getPessoa(String ID) throws SQLException, ClassNotFoundException {
        Pessoa retorno = null;
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String query = "SELECT idPessoa, id_endereco, nome, Sobrenome FROM PocketBook.Pessoa WHERE idPessoa=?";
        try {
            st = con.prepareStatement(query);
            st.setString(1, ID);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String cpf = rs.getString("idPessoa");
                int id_endereco = rs.getInt("id_endereco");
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                retorno = new Pessoa(cpf, id_endereco);
                retorno.setNome(nome);
                retorno.setSobrenome(sobrenome);
            }
        } catch (SQLException e) {
            LOG.info(e.getMessage());
        } finally {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return retorno;
    }
}
