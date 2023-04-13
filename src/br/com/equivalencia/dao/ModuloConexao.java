package br.com.equivalencia.dao;
import java.sql.*;

public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;

        String driver = "com.ysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhosht:3308/equivalencia";
        String user = "root";
        String password = "";

        // ESTABELECENDO A CONEXAO COM O BANCO 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}


