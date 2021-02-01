package codewars.com.micky.algoritmosordenamiento;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test.
 */
public class SeleccionTest {
    
    /**
    * Test.
    */
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[]{1, 2, 10, 30, 55}, Seleccion.setSeleccion(new int[] {10, 30, 55, 2, 1}));
    }
}
