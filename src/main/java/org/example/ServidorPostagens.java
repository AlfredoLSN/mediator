package org.example;

public class ServidorPostagens implements Servidor{
    private static ServidorPostagens instancia = new ServidorPostagens();
    private ServidorPostagens(){};
    public static ServidorPostagens getInstancia(){
        return instancia;
    }

    public String receberChamadaGet(String mensagem) {
        return "Chamada: GET " + mensagem +
                "\nRetorno: {postagem1, postagem2}";
    }

    public String receberChamadaPost(String mensagem) {
        return "Chamada: POST " + mensagem +
                "\nRetorno: Postagem criada";
    }

    public String recebrChamadaPATH(String mensagem) {
        return "Chamada: PATH " + mensagem +
                "\nRetorno: Postagem editada";
    }
}
