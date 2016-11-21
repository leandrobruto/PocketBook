/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fap1
 */
public class GerenteConexao {
    private Connection connection;

        public GerenteConexao() {
            System.out.println("VOU ABRI CONEXAO");
            getConnection();
            System.out.println("CONEXAO: " + connection);
        }
    
    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                String url = "jdbc:mysql://localhost:3306/PocketBook";
                connection = DriverManager.getConnection(url, "root", "root");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenteConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GerenteConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GerenteConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
