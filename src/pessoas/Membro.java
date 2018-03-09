
package pessoas;

import db.DB_Membro;
import java.sql.SQLException;
import java.util.ArrayList;


public class Membro extends DB_Membro{
    
    private String id_membro;
    private String mb_nome;
    private String mb_cpf;
    private String mb_dtNascimento;
    private int mb_sexo;
    private String mb_pai;
    private String mb_mae;
    private String mb_nacionalidade;
    private String mb_naturalidade;
    private String mb_rgNumero;
    private String mb_rgOrgao;
    private String mb_rgData;
    private String mb_email;
    private String mb_status;
    private String sia_endereço_id_endereco;

    public Membro(){
        
    }
    
    public String getId_membro() {
        return id_membro;
    }

    public void setId_membro(String id_membro) {
        this.id_membro = id_membro;
    }

    public String getMb_nome() {
        return mb_nome;
    }

    public void setMb_nome(String mb_nome) {
        this.mb_nome = mb_nome;
    }

    public String getMb_cpf() {
        return mb_cpf;
    }

    public void setMb_cpf(String mb_cpf) {
        this.mb_cpf = mb_cpf;
    }

    public String getMb_dtNascimento() {
        return mb_dtNascimento;
    }

    public void setMb_dtNascimento(String mb_dtNascimento) {
        this.mb_dtNascimento = mb_dtNascimento;
    }

    public int getMb_sexo() {
        return mb_sexo;
    }

    public void setMb_sexo(int mb_sexo) {
        this.mb_sexo = mb_sexo;
    }

    public String getMb_pai() {
        return mb_pai;
    }

    public void setMb_pai(String mb_pai) {
        this.mb_pai = mb_pai;
    }

    public String getMb_mae() {
        return mb_mae;
    }

    public void setMb_mae(String mb_mae) {
        this.mb_mae = mb_mae;
    }

    public String getMb_nacionalidade() {
        return mb_nacionalidade;
    }

    public void setMb_nacionalidade(String mb_nacionalidade) {
        this.mb_nacionalidade = mb_nacionalidade;
    }

    public String getMb_naturalidade() {
        return mb_naturalidade;
    }

    public void setMb_naturalidade(String mb_naturalidade) {
        this.mb_naturalidade = mb_naturalidade;
    }

    public String getMb_rgNumero() {
        return mb_rgNumero;
    }

    public void setMb_rgNumero(String mb_rgNumero) {
        this.mb_rgNumero = mb_rgNumero;
    }

    public String getMb_rgOrgao() {
        return mb_rgOrgao;
    }

    public void setMb_rgOrgao(String mb_rgOrgao) {
        this.mb_rgOrgao = mb_rgOrgao;
    }

    public String getMb_rgData() {
        return mb_rgData;
    }

    public void setMb_rgData(String mb_rgData) {
        this.mb_rgData = mb_rgData;
    }

    public String getMb_email() {
        return mb_email;
    }

    public void setMb_email(String mb_email) {
        this.mb_email = mb_email;
    }

    public String getMb_status() {
        return mb_status;
    }

    public void setMb_status(String mb_status) {
        this.mb_status = mb_status;
    }

    public String getSia_endereço_id_endereco() {
        return sia_endereço_id_endereco;
    }

    public void setSia_endereço_id_endereco(String sia_endereço_id_endereco) {
        this.sia_endereço_id_endereco = sia_endereço_id_endereco;
    }
    
    public void inserirMembro() throws SQLException{
        insertMembro(this);
    }
    
    public ArrayList<Membro> listarMembros() throws SQLException{
        ArrayList<Membro> listarMembros;
        listarMembros = consultarMembroParteNome(getMb_nome());
            
        return listarMembros;
    }
    public void exibirDados(String id){
        System.out.println("Exibi todos os dados do ID "+id);
    }
}
