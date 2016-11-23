/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import br.com.pocketbook.modelo.Nota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.logging.Logger;
/**
 *
 * @author nexti
 */
public class NotasDAO {
    private static final Logger LOG = Logger.getLogger(NotasDAO.class.getName());
    
    public void addID(int id) throws SQLException, ClassNotFoundException{
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement pre = null;
        String insrt = "INSERT INTO PocketBook.nota_produto (id_nota)value(?)";
        try {
            pre = con.prepareStatement(insrt);
            pre.setInt(1, id);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            if (pre != null) {
                pre.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public int gerarNota(Nota nota) throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String insert = "INSERT INTO PocketBook.Notas (cod, quantidade, data_compra, id_usuario)values(?,?,?,?)";
        System.out.println("notasDAO");
    try {
            st = con.prepareStatement(insert);
            st.setInt(1, nota.getCod());
            st.setFloat(2, nota.getQuantidade());
            st.setDate(3, Date.valueOf(LocalDate.now()));
            nota.setData(Date.valueOf(LocalDate.now()).toString());
            st.setString(4, nota.getIdPessoa());
            System.out.println("urra: " + nota.getIdPessoa());
            st.execute();
            LOG.info("Produto cadastrado");
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
    
        int retorno = -1;
        PreparedStatement pegaid = null;
        con = new GerenteConexao().getConnection();
        String query = "Select cod from PocketBook.Notas where "
                + "quantidade=? and data_compra=? and id_usuario=?";
    try {
            pegaid = con.prepareStatement(query);
            pegaid.setInt(1, nota.getQuantidade());
            System.out.println("getData: "+ nota.getData());
            pegaid.setString(2, nota.getData());
            pegaid.setString(3, nota.getIdPessoa());
            
            ResultSet result = pegaid.executeQuery();
            
            if(result != null && result.next()){
            retorno = result.getInt("cod");
            }
            
            addID(retorno);
            
            System.out.println("Retorno: " + retorno);
            
            LOG.info("Endereço id = " + retorno);
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
    
    public Nota getNota(int cod) throws SQLException, ClassNotFoundException{
        Nota retorno = null;
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String query = "SELECT idEndereco, logradouro, numero, bairro, cidade, uf, cep FROM PocketBook.Endereco where idEndereco=?";

        try {
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                retorno = new Nota();
                int quantidade = rs.getInt("quantidade");
                float valor_total = rs.getFloat("valor_total");
                String data = rs.getString("data_compra");
                String idPessoa = rs.getString("id_usuario");

                retorno.setQuantidade(quantidade);
                retorno.setValor_total(valor_total);
                retorno.setData(data);
                retorno.setIdPessoa(idPessoa);
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
