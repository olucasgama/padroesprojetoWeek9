package mediator;

import org.junit.jupiter.api.Test;
import padroescomportamentais.mediator.Usuario;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void perguntarSobreProduto() {
        Usuario usuario = new Usuario();

        assertEquals("Agradecemos sua pergunta sobre o produto.\nNossos administradores já responderam: \n" +
                "Olá, vamos analisar sua pergunta, em breve iremos responder sua solicitação: Este produto tem garantia?",
                usuario.fazerPerguntaProduto("Este produto tem garantia?"));
    }

    @Test
    void perguntarSobreEmpresa() {
        Usuario usuario = new Usuario();

        assertEquals("Agradecemos sua pergunta sobre nossa empresa.\nNossos administradores já responderam: \n" +
                        "Olá, vamos analisar sua pergunta, em breve iremos responder sua solicitação: Vocês tem loja física?",
                usuario.fazerPerguntaEmpresa("Vocês tem loja física?"));
    }

}
