
package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pessoas.Membro;


public class DB_Membro {
    
    public void insertMembro(Membro membro) throws SQLException{
        String sql = "INSERT INTO `db_siadi`.`sia_membros` (`mb_nome`, `mb_cpf`, `mb_dtNascimento`, `mb_sexo`, `mb_pai`, `mb_mae`, `mb_nacionalidade`, `mb_naturalidade`, `mb_rgNumero`, `mb_rgOrgao`, `mb_rgData`, `mb_email`, `mb_status`) "
                + "VALUES ('"+membro.getMb_nome()+"', '"+membro.getMb_cpf()+"', '"+membro.getMb_dtNascimento()+"', '"+membro.getMb_sexo()+"', '"+membro.getMb_pai()+"', '"+membro.getMb_nome()+"', '"+membro.getMb_nacionalidade()+"', '"+membro.getMb_naturalidade()+"', '"+membro.getMb_rgNumero()+"', '"+membro.getMb_rgOrgao()+"', '"+membro.getMb_rgData()+"', '"+membro.getMb_email()+"', '1');";
        
        DB_Conexao conexao = new DB_Conexao();
        conexao.conecta();
        Statement st = conexao.getConexao().createStatement();
//        st.execute(sql);
        conexao.desconecta();
        System.out.println("incluido");
        
    }
    
    public void updateMembro() throws SQLException{
        String sql = "";
                
        DB_Conexao conexao = new DB_Conexao();
        conexao.conecta();
        Statement st = conexao.getConexao().createStatement();
        //st.execute(sql);
        conexao.desconecta();
        System.out.println("Atualizado");
        
    }
 
    public ArrayList<Membro> consultarMembroParteNome(String nome) throws SQLException{
        String sql ="SELECT id_membros, mb_nome FROM db_siadi.sia_membros WHERE mb_nome like '"+nome+"%'";
        
        DB_Conexao conexao = new DB_Conexao();
        conexao.conecta();
        
        Statement stms = (Statement) conexao.getConexao().createStatement();
        ResultSet resultadoConsultaDB = stms.executeQuery(sql);
        ArrayList <Membro> consulta = new ArrayList();
        Membro listarMembro = new Membro();
            
        while(resultadoConsultaDB.next()){
           listarMembro.setId_membro(resultadoConsultaDB.getString("id_membros"));
           listarMembro.setMb_nome(resultadoConsultaDB.getString("mb_nome"));
           
           consulta.add(listarMembro);
            
        }
        conexao.desconecta();
        return consulta;
        
    }
}
