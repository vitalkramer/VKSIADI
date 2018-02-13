/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pessoas.Usuario;
import vksiadi.Literate;

/**
 *
 * @author vk
 */
public class DB_Usuario {

      
    public void inserirUsuario() {

    }

    public Usuario consultarUsuario(String usuario, String senha) throws SQLException {
        Usuario novoUsuario = new Usuario();
        
        DB_Conexao conexao = new DB_Conexao();
        ResultSet resultadoConsultaDB = null;

        String sql = "SELECT usu_usuario, usu_senha, usu_status, sia_membros_id_membros, id_membros, mb_nome FROM db_siadi.sia_usuario, db_siadi.sia_membros WHERE usu_usuario = '" + usuario + "' AND usu_senha = '" + senha + "' and usu_status = '1' and id_membros=sia_membros_id_membros;";
        conexao.conecta();
        Statement stms = (Statement) conexao.getConexao().createStatement();
        resultadoConsultaDB = stms.executeQuery(sql);

        while (resultadoConsultaDB.next()) {
            novoUsuario.setUsu_usuario(resultadoConsultaDB.getString("usu_usuario"));
            novoUsuario.setUsu_senha(resultadoConsultaDB.getString("usu_senha"));
            novoUsuario.setUsu_status(resultadoConsultaDB.getString("usu_status"));
            novoUsuario.setSia_membros_id_membro(resultadoConsultaDB.getString("sia_membros_id_membros"));
            Literate.setID_MEMBRO(resultadoConsultaDB.getString("sia_membros_id_membros"));            
            Literate.setMB_NOME(resultadoConsultaDB.getString("mb_nome"));
        }
        conexao.encerrarConexao();
        return novoUsuario;
                
    }

    public void consultarUsuario() {
        
    }

}
