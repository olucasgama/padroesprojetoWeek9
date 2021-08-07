package padroescomportamentais.interpreter;

import java.util.Stack;

public class InterpreterAlphaNumerico implements Interpreter {

  /*  public InterpreterAlphaNumerico(String texto) {

        Stack<Interpreter> pilha = new Stack<Interpreter>();
        Receptor receptor = new Receptor(texto);

        if (texto.matches("[0-9]*")){
            CPF cpf = new CPF();
            cpf.setTexto(texto);
            receptor.setTexto(cpf.interpretar());
        } else if (texto.matches("^[a-zA-Z0-9]*$")) {
            Codigo codigo = new Codigo();
            codigo.setTexto(texto);
            pilha.push(new Receptor(codigo.interpretar()));
        } else {
            throw new IllegalArgumentException("Código/CPF Inválido");
        }
        interpreterInicial = receptor.getTexto();
    }*/

    public String interpretar(String texto) {
        String aux = null;

        if (texto.matches("[0-9]*")){
            CPF cpf = new CPF();
            cpf.setTexto(texto);
            cpf.interpretar();
            aux = cpf.getTexto();
        } else if (texto.matches("^[a-zA-Z0-9]*$")) {
            Codigo codigo = new Codigo();
            codigo.setTexto(texto);
            codigo.interpretar();
            aux = codigo.getTexto();
        } else {
            throw new IllegalArgumentException("Código/CPF Inválido");
        }
        return aux;
    }
}
