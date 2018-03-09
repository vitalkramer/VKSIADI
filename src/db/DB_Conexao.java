
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB_Conexao {
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String db;
    private static String usuario;
    private static String senha;
    private static String servidor;
    private Connection conexao;
    

    public static String getDb() {
        return db;
    }
    
    public static void setDb(String db){
        DB_Conexao.db = db;
    }

    public static String getUsuarior() {
        return usuario;
    }
    
    public static void setUsuarior(String usuario){
        DB_Conexao.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }
    
    public static void setSenha(String senha){
        DB_Conexao.senha = senha;
    }

    public static String getServidor() {
        return servidor;
    }
    
    public static void setServidor(String servidor){
        DB_Conexao.servidor = "jdbc:mysql://"+servidor+":3306/"+db;
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
    
    
    public void conecta(){
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(servidor, usuario, senha);
            //JOptionPane.showMessageDialog(null, "DB_Conexao de Dados Conectado!");
        }
        catch(ClassNotFoundException Driver)        {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            System.exit(0);
        }catch(SQLException Fonte){
            System.out.println(this.servidor);
            JOptionPane.showMessageDialog(null, "Erro na conexão\n com a fonte de dados: \n" + Fonte);
            System.exit(0);
        }
    }
    
    public void desconecta() throws SQLException{
        this.conexao.close();
    }
      
}
