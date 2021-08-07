package padroescomportamentais.mediator;

public class AdministracaoGeral implements Setor {

    private static AdministracaoGeral instancia = new AdministracaoGeral();

    private AdministracaoGeral() { }

    public static AdministracaoGeral getInstancia() {
        return instancia;
    }

    public String receberPergunta(String pergunta) {
        return "Olá, vamos analisar sua pergunta, em breve iremos responder sua solicitação: " + pergunta;
    }
}
