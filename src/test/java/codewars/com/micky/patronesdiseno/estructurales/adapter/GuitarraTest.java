package codewars.com.micky.patronesdiseno.estructurales.adapter;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class GuitarraTest {
   private GuitarraElectrica guitarraElectrica;
   private GuitarraAcustica guitarraAcustica;
   private GuitarraElectroAcustica guitarraElectroAcustica;
   
    /**
     * Before.
     */
    @Before
    public void instance() {
        guitarraElectrica = new GuitarraElectrica();
        guitarraAcustica = new GuitarraAcustica();
        guitarraElectroAcustica = new GuitarraElectroAcustica(guitarraAcustica);
    }

    /**
     * test.
     */
    @Test
    public void test() {
        assertEquals("encendido", guitarraElectrica.encender());
        assertEquals("apagado", guitarraElectrica.apagar());
        assertEquals("tocando", guitarraElectroAcustica.encender());
        assertEquals("silencio", guitarraElectroAcustica.apagar());
    }
}
