package codewars.com.micky.patronesdiseno.estructurales.facade;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class VueloTest {
    private FacadeVuelo facadeVuelo;

    /**
     * Before.
     */
    @Before
    public void instance() {
        facadeVuelo = new FacadeVuelo();
    }

    /**
     * test.
     */
    @Test
    public void test() {
        assertEquals("ida 16/01/2020 regreso 20/02/2020 origen cbba destino santa cruz", 
        facadeVuelo.buscar("16/01/2020", "20/02/2020", "cbba", "santa cruz"));
    }

}
