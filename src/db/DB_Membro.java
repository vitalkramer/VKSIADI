
package db;


public class DB_Membro {
 
    public void consultarMembroParteNome(String nome){
        String sql ="SELECT id_membros, mb_nome FROM db_siadi.sia_membros WHERE mb_nome like '%"+nome+"%';";
        
    }
}
