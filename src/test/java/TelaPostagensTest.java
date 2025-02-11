import org.example.TelaPostagens;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TelaPostagensTest {
    @Test
    void deveEnviarGetServidor(){
        TelaPostagens tela = new TelaPostagens();
        assertEquals("Chamada GET enviada com sucesso.\nRetorno do servidor:\nChamada: GET /postagens\nRetorno: {postagem1, postagem2}",
                tela.enviarGetServidorPostagem("/postagens"));
    }
    @Test
    void deveEnviarPostServidor(){
        TelaPostagens tela = new TelaPostagens();
        assertEquals("Chamada POST enviada com sucesso.\nRetorno do servidor:\nChamada: POST /postagem\n{\n  titulo=TituloTeste\n  descricao=DescriçãoTeste\n}\nRetorno: Postagem criada",
                tela.enviarPostServidorPostagens("/postagem\n{\n  titulo=TituloTeste\n  descricao=DescriçãoTeste\n}"));
    }
    @Test
    void deveEnviarPathServidor(){
        TelaPostagens tela = new TelaPostagens();
        assertEquals("Chamada PATH enviada com sucesso.\nRetorno do servidor:\nChamada: PATH /postagem/123\n{\n  titulo=NovoTitulo\n  descricao=NovaDescricao\n}\nRetorno: Postagem editada",
                tela.enviarPathServidorPostagens("/postagem/123\n{\n  titulo=NovoTitulo\n  descricao=NovaDescricao\n}"));
    }

}
