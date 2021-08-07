package interpreter;

import org.junit.jupiter.api.Test;
import padroescomportamentais.interpreter.Interpreter;
import padroescomportamentais.interpreter.InterpreterAlphaNumerico;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {

    @Test
    void deveFormatarCPF(){
        Interpreter interpreter = new InterpreterAlphaNumerico();
        assertEquals("111.222.333-44", interpreter.interpretar("11122233344"));
    }

    @Test
    void deveFormatarAlphaNumerico(){
        Interpreter interpreter = new InterpreterAlphaNumerico();
        assertEquals("ABC123", interpreter.interpretar("abc123"));
    }

    @Test
    void deveRetornarExcessao(){
        try {
            Interpreter interpreter = new InterpreterAlphaNumerico();
            assertEquals("ABC123", interpreter.interpretar("abc&123"));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código/CPF Inválido", e.getMessage());
        }
    }

}
