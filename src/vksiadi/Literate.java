
package vksiadi;


public class Literate {
    
    private static String LOGO;
    private static String ID_USUARIO_LOGADO;
    private static String NOME_USUARIO_LOGADO;
    
    public static String getLOGO() {
        return LOGO;
    }

    public static void setLOGO(String LOGO) {
        Literate.LOGO = LOGO;
    }

    public static String getID_MEMBRO() {
        return ID_USUARIO_LOGADO;
    }

    public static void setID_MEMBRO(String ID_MEMBRO) {
        Literate.ID_USUARIO_LOGADO = ID_MEMBRO;
    }

    public static String getMB_NOME() {
        return NOME_USUARIO_LOGADO;
    }

    public static void setMB_NOME(String MB_NOME) {
        Literate.NOME_USUARIO_LOGADO = MB_NOME;
    }
    
}
