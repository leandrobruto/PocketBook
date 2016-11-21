/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import br.com.pocketbook.modelo.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author fap1
 */
public class EnderecoDAO {
    
    private static final Logger LOG = Logger.getLogger(PessoaDAO.class.getName());

    public int inserir(Endereco endereco) throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String insert = "INSERT INTO PocketBook.Endereco (logradouro,numero,bairro,cidade,uf,cep) "
                + "values(?,?,?,?,?,?)";

        try {
            st = con.prepareStatement(insert);
            st.setString(1, endereco.getLogradouro());
            st.setInt(2, endereco.getNumero());
            st.setString(3, endereco.getBairro());
            st.setString(4, endereco.getCidade());
            st.setString(5, endereco.getUf());
            st.setString(6, endereco.getCep());

            st.execute();
            LOG.info("Endereço inserido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        int retorno = -1;
        PreparedStatement pegaid = null;
        con = new GerenteConexao().getConnection();
        String query = "Select id from ipub.Endereco where "
                + "logradouro=? and numero=? and bairro=? and cidade=? and uf=? and cep=?";
        
        try {
            pegaid = con.prepareStatement(query);
            pegaid.setString(1, endereco.getLogradouro());
            pegaid.setInt(2, endereco.getNumero());
            pegaid.setString(3, endereco.getBairro());
            pegaid.setString(4, endereco.getCidade());
            pegaid.setString(5, endereco.getUf());
            pegaid.setString(6, endereco.getCep());
            
            ResultSet result = pegaid.executeQuery();
            
            retorno = result.getInt("ID");
            LOG.info("Endereço id = "+retorno);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (pegaid != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return retorno;
    }
    
    public Endereco getEndereco(int id) throws SQLException, ClassNotFoundException {
        Endereco retorno = null;
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String query = "SELECT ID, Logradouro, Numero, Bairro, Cidade, UF, CEP FROM Ipub.Endereco where id=?";

        try {
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                retorno = new Endereco();
                String logradouro = rs.getString("Logradouro");
                int numero = rs.getInt("Numero");
                String bairro = rs.getString("Bairro");
                String cidade = rs.getString("Cidade");
                String uf = rs.getString("UF");
                String cep = rs.getString("CEP");

                retorno.setLogradouro(logradouro);
                retorno.setNumero(numero);
                retorno.setBairro(bairro);
                retorno.setCidade(cidade);
                retorno.setUf(uf);
                retorno.setCep(cep);
            }
        } catch (SQLException e) {
            LOG.info(e.getMessage());
        } finally {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                st.close();
            }
        }
        return retorno;
    }
}
