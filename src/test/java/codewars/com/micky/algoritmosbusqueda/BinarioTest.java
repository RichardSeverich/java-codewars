package codewars.com.micky.algoritmosbusqueda;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class BinarioTest {

    /**
    * Test.
    */
    @Test
    public void testBinario() {
        assertEquals ("el elemento ha sido encontrado en la posicion 1", Binario.setBinario(new int[]{10, 30, 55, 2, 1}, 30));
        assertEquals ("el elemento ha sido encontrado en la posicion 0", Binario.setBinario(new int[]{10, 30, 55, 2, 1}, 10));
        
    }
}
