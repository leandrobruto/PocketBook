/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import br.com.pocketbook.modelo.Estabelecimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author fap1
 */
public class EstabelecimentoDAO {
    
    private static final Logger LOG = Logger.getLogger(PessoaDAO.class.getName());

    public static boolean inserir(Estabelecimento estabelecimento) throws SQLException, ClassNotFoundException {
        boolean retorno = false;
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String insert = "INSERT INTO PocketBook.Estabelecimento values(?,?,?,?,?)";

        try {
            st = con.prepareStatement(insert);
            st.setString(1, estabelecimento.getId());
            st.setString(2, estabelecimento.getId_usurario());
            st.setInt(3, estabelecimento.getId_endereco());
            st.setString(4, estabelecimento.getNome());
            st.setString(5, estabelecimento.getEmail());

            st.execute();
            LOG.info("Estabelecimento adicionado");
            return true;
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
        return retorno;
    }
    
    public static Estabelecimento getEstabelecimento(String id) throws SQLException, ClassNotFoundException {
        Estabelecimento retorno = null;
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String query = "SELECT ID, id_usuario, id_endereco, Nome, email from Ipub.Estabelecimento where ID=?";

        try {
            st = con.prepareStatement(query);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                String id_usuario = rs.getString("id_usuario");
                int id_endereco = rs.getInt("id_endereco");
                String nome = rs.getString("Nome");
                String email = rs.getString("email");

                retorno = new Estabelecimento(id, id_usuario, id_endereco);
                retorno.setNome(nome);
                retorno.setEmail(email);
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
