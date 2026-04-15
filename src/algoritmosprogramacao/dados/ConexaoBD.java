package algoritmosprogramacao.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    // Usando o Supabase / PostgreSQL
    private static String URL = "jdbc:postgresql://pg-3242096a-aula-prog.l.aivencloud.com:20640/defaultdb?sslmode=require";
    private static String USERNAME = "avnadmin";
    private static String PASSWORD = "123456"; 
    private static String DRIVER = "org.postgresql.Driver";
    /*
    Se for utilizar o MySQL, descomente o código abaixo e comente o código acima
    private static String URL = "jdbc:mysql://localhost:3306/flowbank";
    private static String USERNAME = "aluno";
    private static String PASSWORD = "123456";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    */
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,
                    "Erro ao conectar no banco!");
            throw new RuntimeException(e);
        }
        catch(ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao importar driver!");
            throw new RuntimeException(ex);
        }
    }
    
    public static Connection getConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,
                    "Erro ao conectar no banco!");
            throw new RuntimeException(e);
        }
        catch(ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao importar driver!");
            throw new RuntimeException(ex);
        }
    }
    
    public static void fecharConexao(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}
