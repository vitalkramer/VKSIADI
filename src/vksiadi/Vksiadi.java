
package vksiadi;

import db.DB_Conexao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.JOptionPane;


public class Vksiadi {
    
    private static final int DB = 1;
    private static final int USUARIO = 2;
    private static final int SENHA = 3;
    private static final int SERVIDOR = 4;
    private static final int LOGO = 5;

    //caminho absoluto do arquivo.
    private  static final String path = "configuracao.config";
    
    public static void main(String[] args) {
        
        Tela_Carregamento telaProgresso = new Tela_Carregamento();
        telaProgresso.setVisible(true);
             
        String [] dados = null;
        int tipo = 0;
        
        
        
        try{
            //abre o arquivo e deixa pronto para leitura.
            BufferedReader arqLido = new BufferedReader(new FileReader(path));
                       
            String linha = arqLido.readLine();
            
            while (linha != null) {
                
                if(linha.equals("") || linha.equals(" ")){
                    linha = arqLido.readLine(); // lê da segunda até a última linha
                }else{
                    
                    dados = linha.split("=");
                    
                    if(dados[0].equals("DB")){
                        tipo = DB;
                    }
                    if(dados[0].equals("USUARIO")){
                        tipo = USUARIO;
                    }
                    if(dados[0].equals("SENHA")){
                        tipo = SENHA;
                    }
                    if(dados[0].equals("SERVIDOR")){
                        tipo=SERVIDOR;
                    }
                    if(dados[0].equals("LOGO")){
                        tipo = LOGO;
                    }

                    switch(tipo){
                        case DB:
                            DB_Conexao.setDb(dados[1]);
                            telaProgresso.setBarraProgresso(25);
                            break;
                        case USUARIO:
                            DB_Conexao.setUsuarior(dados[1]);
                            telaProgresso.setBarraProgresso(50);
                            break;
                        case SENHA:
                            DB_Conexao.setSenha(dados[1]);
                            telaProgresso.setBarraProgresso(75);
                            break;
                        case SERVIDOR:
                            DB_Conexao.setServidor(dados[1]);
                            telaProgresso.setBarraProgresso(100);
                            break;
                        case LOGO:
                            Literate.setLOGO(dados[1]);
                            break;
                    } 
                }
                linha = arqLido.readLine(); // lê da segunda até a última linha
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
            exit(1);
        }
        telaProgresso.dispose();
        Tela_Login login = new Tela_Login();
        login.setVisible(true);
    }
 
    
}
