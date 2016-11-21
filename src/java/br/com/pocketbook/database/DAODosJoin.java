/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pocketbook.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fap1
 */
public class DAODosJoin {
    public static String getNomePessoa(String idUsuario) throws SQLException{
        String retorno = null;
        Connection conexao = new GerenteConexao().getConnection();
        PreparedStatement st = null;
        System.out.println("ID_Usuario: " + idUsuario);
        String query = "select pe.nome from Pessoa pe join Usuario us on us.id_pessoa=pe.idPessoa where us.idUser=?";
        try{
            st= conexao.prepareStatement(query);
            st.setString(1, idUsuario);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                retorno = rs.getString("pe.nome");
            }
        }catch(SQLException sql){
            throw sql;
        }finally{
            if(conexao != null){
            conexao.close();
            }
            if( st != null){
                st.close();
            }
        }
        System.out.println("RETORNO: " + retorno);
        return retorno;
    }
}
