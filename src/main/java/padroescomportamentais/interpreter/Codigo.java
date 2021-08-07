package padroescomportamentais.interpreter;

import java.util.Locale;

public class Codigo {

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void interpretar() {
        setTexto(texto.toUpperCase());
    }
}
