/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import br.com.pocketbook.modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author nexti
 */
public class ProdutoDAO {
    private static final Logger LOG = Logger.getLogger(ProdutoDAO.class.getName());

    public void inserir(Produto produto) throws SQLException, ClassNotFoundException {
        Connection con = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        String insert = "INSERT INTO PocketBook.Produto (cod, valor_unitario, nome)values(?,?,?)";
        System.out.println("produtoDAO");
    try {
            st = con.prepareStatement(insert);
            st.setInt(1, produto.getCod());
            st.setFloat(2, produto.getValor());
            st.setString(3, produto.getNome());
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
