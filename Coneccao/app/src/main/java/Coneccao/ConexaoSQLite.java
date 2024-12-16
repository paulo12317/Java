/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coneccao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class ConexaoSQLite {
    public Connection conectar(){
        Connection conexao = null;
        String url = "jdbc:sqlite:usuarios.db";
        
        try{
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexao com SQLite estabelecida.");
        
        } catch(SQLException e){
            System.out.println("Erro ao conectar ao banco" + e.getMessage());
        }
        return conexao;
    }
    
    public void desconectar(Connection conexao){
        try{
            if(conexao != null){
                conexao.close();
                System.out.println("Conexao fechada.");
            }
        } catch(SQLException e){
            System.out.println("Erro ao fechar a conex�o."+ e.getMessage());
        }
    }
}
