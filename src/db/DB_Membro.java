
package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pessoas.Membro;


public class DB_Membro {
    
    public void insertMembro(Membro membro) throws SQLException{
        String sql = " ";
        
        DB_Conexao conexao = new DB_Conexao();
        conexao.conecta();
        Statement st = conexao.getConexao().createStatement();
        st.execute(sql);
        
    }
 
    public void consultarMembroParteNome(String nome) throws SQLException{
        String sql ="SELECT id_membros, mb_nome FROM db_siadi.sia_membros WHERE mb_nome like '%"+nome+"%';";
        
        DB_Conexao conexao = new DB_Conexao();
        conexao.conecta();
        
        Statement stms = (Statement) conexao.getConexao().createStatement();
        ResultSet resultadoConsultaDB = null;
        resultadoConsultaDB = stms.executeQuery(sql);
        
        
    }
}
