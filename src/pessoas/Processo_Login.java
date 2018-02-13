
package pessoas;

import db.DB_Usuario;
import java.sql.SQLException;
import pessoas.Usuario;


public class Processo_Login extends Usuario{
    
        
    public int logar() throws SQLException{
        DB_Usuario logar  = new DB_Usuario();
        Usuario novoUsuario = new Usuario();
        novoUsuario = logar.consultarUsuario(this.getUsu_usuario(), this.getUsu_senha());
        
        if(novoUsuario.getUsu_usuario()== null && novoUsuario.getUsu_senha()== null){
            return 0;
        }else{
            return 1;
        }
    }
    
}
