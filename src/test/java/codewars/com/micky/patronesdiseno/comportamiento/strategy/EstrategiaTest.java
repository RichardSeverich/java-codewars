package codewars.com.micky.patronesdiseno.comportamiento.strategy;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class EstrategiaTest {
    private Contexto contexto;
    private AntivirusSimple antivirusSimple;
    private AntivirusAvanzado antivirusAvanzado;

    /**
     * Before.
     */
    @Before
    public void instance() {
        contexto = new Contexto();
        antivirusSimple = new AntivirusSimple();
        antivirusAvanzado = new AntivirusAvanzado();
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        contexto.setEstrategia(antivirusSimple);
        assertEquals("disco D analizado disco C analizado disco F analizado", contexto.ejecutar());
    }

    /**
     * test.
     */
    @Test
    public void test2() {
        contexto.setEstrategia(antivirusAvanzado);
        assertEquals("disco D analizado carpetas D analizadas disco C analizado carpetas C analizadas disco F analizado carpetas F analizadas hardware analizado carpetas hardware analizadas", contexto.ejecutar());
    }


}
