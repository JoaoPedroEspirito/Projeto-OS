
package br.com.prjos.dal;
import java.sql.*;


public class ModuloConexao {
    
    //método responsável por estabelecer a conexão com o BD
    public static Connection conector(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbprojos?characterEncoding=UTF-8";
        String user = "dba";
        String password = "Jp123456";
        try {
            Class.forName(driver);
            Connection conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            return null;
        }
    }
    
    
}
