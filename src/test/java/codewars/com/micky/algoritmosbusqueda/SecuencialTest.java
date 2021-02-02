package codewars.com.micky.algoritmosbusqueda;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class SecuencialTest {

    /**
    * Test.
    */
    @Test
    public void testSecuencial() {
        assertEquals ("el elemento ha sido encontrado en la posicion 0", Secuencial.setSecuencial(new int[]{10, 30, 55, 2, 1}, 10));
        assertEquals ("el elemento no se encuentra en el array", Secuencial.setSecuencial(new int[]{10, 30, 55, 2, 1}, 100));
    }
}
