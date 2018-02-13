/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import db.DB_Membro;
import java.sql.SQLException;

/**
 *
 * @author Kramer
 */
public class Processo_Membros extends Membro{
    
    public void inseirMembro() throws SQLException{
        DB_Membro novoMembro = new DB_Membro();
        novoMembro.insertMembro(this);
    }
    
}
