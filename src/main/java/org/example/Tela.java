package org.example;

public class Tela {
    public String enviarGetServidorPostagem(String mensagem){
        return Api.getInstancia().receberGetServidorPostagens(mensagem);
    }
    public String enviarPostServidorPostagens(String mensagem){
        return Api.getInstancia().receberPostServidorPostagens(mensagem);
    }
    public String enviarPathServidorPostagens(String mensagem){
        return Api.getInstancia().receberPATHServidorPostagens(mensagem);
    }
}
