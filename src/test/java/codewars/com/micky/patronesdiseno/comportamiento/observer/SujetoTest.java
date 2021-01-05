package codewars.com.micky.patronesdiseno.comportamiento.observer;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class SujetoTest {
    private Sujeto sujeto;
    private DolarObservador dolar;
    private RealObservador real;
    private SolObservador sol;

    /**
     * Before.
     */
    @Before
    public void instance() {
        sujeto = new Sujeto();
        dolar = new DolarObservador();
        real = new RealObservador();
        sol = new SolObservador();
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        dolar.setDolarObservador(sujeto);
        real.setRealObservador(sujeto);
        sol.setSolObservador(sujeto); 
        sujeto.setMontoCambiar(50);
        assertEquals("Sol: 100", sol.actualizar());
        assertEquals("Real: 150", real.actualizar());
        assertEquals("Dolar: 350", dolar.actualizar());
    }
}
