package org.example;

public class Api {
    private static Api instancia = new Api();

    private Api(){}

    public static Api getInstancia(){
        return instancia;
    }

    public String receberGetServidorPostagens(String mensagem){
        return "Chamada GET enviada com sucesso.\n"+
                "Retorno do servidor:\n"+
                ServidorPostagens.getInstancia().receberChamadaGet(mensagem);
    }
    public String receberPostServidorPostagens(String mensagem){
        return "Chamada POST enviada com sucesso.\n"+
                "Retorno do servidor:\n"+
                ServidorPostagens.getInstancia().receberChamadaPost(mensagem);
    }

    public String receberPATHServidorPostagens(String mensagem){
        return "Chamada PATH enviada com sucesso.\n"+
                "Retorno do servidor:\n"+
                ServidorPostagens.getInstancia().recebrChamadaPATH(mensagem);
    }
}
