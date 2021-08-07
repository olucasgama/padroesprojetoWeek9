package padroescomportamentais.mediator;

public class AdministracaoProduto implements Setor {

    private static AdministracaoProduto instancia = new AdministracaoProduto();

    private AdministracaoProduto() { }

    public static AdministracaoProduto getInstancia() {
        return instancia;
    }

    public String receberPergunta(String pergunta) {
        return "Olá, vamos analisar sua pergunta, em breve iremos responder sua solicitação: " + pergunta;
    }
}
