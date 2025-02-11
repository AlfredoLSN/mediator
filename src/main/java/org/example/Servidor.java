package org.example;

public interface Servidor {
    String receberChamadaGet(String mensagem);
    String receberChamadaPost(String mensagem);
    String recebrChamadaPATH(String mensagem);
}
