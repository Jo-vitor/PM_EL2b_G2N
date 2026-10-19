import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class IngressoTest {
    
    @Test 
    public void testCalcularValorIngressoComDoisAdicionais(){
        Regular ingresso = new Regular("Interestellar", LocalDateTime.now());
        EAdicional a1 = EAdicional.BALDE_ESPECIAL;
        EAdicional a2 = EAdicional.REFRIGERANTE;

        ingresso.incluir(a1);
        ingresso.incluir(a2);

        double valorIngresso = ingresso.valorIngresso();

        assertEquals(58, valorIngresso, 0.01);
    }

}
