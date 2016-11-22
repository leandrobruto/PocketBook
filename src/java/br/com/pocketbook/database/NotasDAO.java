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
import java.time.LocalDate;
import java.util.logging.Logger;

/**
 *
 * @author nexti
 */
public class NotasDAO {
    private static final Logger LOG = Logger.getLogger(NotasDAO.class.getName());

    public void inserir(Nota nota) throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String insert = "INSERT INTO PocketBook.Notas (cod, valor_unitario, nome)values(?,?,?)";
        System.out.println("produtoDAO");
    try {
            st = con.prepareStatement(insert);
            st.setInt(1, nota.getNumero());
            st.setFloat(2, nota.getQuantidade());
            st.setFloat(3, nota.getValor_total());
            st.setDate(4, Date.valueOf(LocalDate.MAX));
            System.out.println("data: " + Date.valueOf(LocalDate.MAX));
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
    }
    
}
