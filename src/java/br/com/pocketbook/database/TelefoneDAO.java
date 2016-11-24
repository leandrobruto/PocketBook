/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author nexti
 */
public class TelefoneDAO {
        private static final Logger LOG = Logger.getLogger(TelefoneDAO.class.getName());

    public void inserir(String telefone, String id) throws SQLException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String inserir = "INSERT INTO Telefone (numero, id_estabelecimento)VALUES(?,?)";
        try {
            System.out.println("telefone");
            st = con.prepareStatement(inserir);
            st.setString(1, telefone);
            st.setString(2, id);
            st.execute();
            System.out.println("Urri");
            LOG.info("Telefone adicionado");
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
    
}
