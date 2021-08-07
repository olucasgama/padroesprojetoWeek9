package padroescomportamentais.interpreter;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class CPF {

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void interpretar() {
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.setValueContainsLiteralCharacters(false);
            setTexto(mask.valueToString(texto));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
