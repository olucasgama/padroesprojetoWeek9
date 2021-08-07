package padroescomportamentais.mediator;

public class Forum {

    private static Forum instancia = new Forum();

    private Forum() { }

    public static Forum getInstancia() {
        return instancia;
    }

    public String receberPerguntaAdministracaoProduto(String pergunta) {
        return "Agradecemos sua pergunta sobre o produto.\n" +
                "Nossos administradores já responderam: \n" +
                AdministracaoProduto.getInstancia().receberPergunta(pergunta);
    }

    public String receberPerguntaAdministracaoGeral(String pergunta) {
        return "Agradecemos sua pergunta sobre nossa empresa.\n" +
                "Nossos administradores já responderam: \n" +
                AdministracaoGeral.getInstancia().receberPergunta(pergunta);
    }
}
