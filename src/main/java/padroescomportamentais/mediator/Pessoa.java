package padroescomportamentais.mediator;

public class Pessoa {

    public String fazerPerguntaProduto(String pergunta){
        return Forum.getInstancia().receberPerguntaAdministracaoProduto(pergunta);
    }

    public String fazerPerguntaEmpresa(String pergunta){
        return Forum.getInstancia().receberPerguntaAdministracaoGeral(pergunta);
    }
}
