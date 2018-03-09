/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import db.DB_Usuario;
import java.sql.SQLException;

/**
 *
 * @author vk
 */
public class Usuario extends DB_Usuario{
        
    private String usu_usuario;
    private String usu_senha;
    private String usu_status;
    private String sia_membros_id_membro;
    
    public String getUsu_usuario() {
        return usu_usuario;
    }

    public void setUsu_usuario(String usu_usuario) {
        this.usu_usuario = usu_usuario;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    public String getUsu_status() {
        return usu_status;
    }

    public void setUsu_status(String usu_status) {
        this.usu_status = usu_status;
    }

    public String getSia_membros_id_membro() {
        return sia_membros_id_membro;
    }

    public void setSia_membros_id_membro(String sia_membri_id_membro) {
        this.sia_membros_id_membro = sia_membri_id_membro;
    }
    
    public int logar() throws SQLException{
        
        Usuario resultDbUsuario = new Usuario();
        resultDbUsuario = consultarUsuario(this.getUsu_usuario(), this.getUsu_senha());
        
        System.out.println("Usuario: "+getUsu_usuario()+"  Senha: "+getUsu_senha());
        System.out.println("Usuario: "+resultDbUsuario.getUsu_usuario()+"  Senha: "+resultDbUsuario.getUsu_senha());
       
        if(getUsu_usuario().equals(resultDbUsuario.getUsu_usuario()) && getUsu_senha().equals(resultDbUsuario.getUsu_senha())){
            return 1;
        }else{
            return 0;
        }
    }
}
