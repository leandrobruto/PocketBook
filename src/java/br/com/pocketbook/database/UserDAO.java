/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import br.com.pocketbook.modelo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author fap1
 */
public class UserDAO {
    
    private static final Logger LOG = Logger.getLogger(UserDAO.class.getName());
    
    public void inserir(User usuario) throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String insert = "INSERT INTO Usuario values (?,?,?,?)";

        try {
            st = con.prepareStatement(insert);
            st.setString(1, usuario.getID()); //email
            System.out.println("ID: " + usuario.getID());
            st.setString(2, usuario.getId_pessoa()); //cpf
            st.setString(3, usuario.getTipo()); 
            st.setString(4, usuario.getSenha());

            st.execute();
            LOG.info("Usuário adicionado");
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
    }
    
    public User getUsuario(String ID) throws SQLException, ClassNotFoundException {
        User retorno = null;
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String query = "select idUser, id_pessoa, tipo, senha from PocketBook.Usuario where idUser=?";

        try {
            st = con.prepareStatement(query);
            st.setString(1, ID);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String id_pessoa = rs.getString("id_pessoa");
                String tipo = rs.getString("tipo");
                String senha = rs.getString("senha");
                retorno = new User(ID, id_pessoa);
                retorno.setTipo(tipo);
                retorno.setSenha(senha);
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
