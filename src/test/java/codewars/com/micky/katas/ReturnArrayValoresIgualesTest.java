package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test.
 */
public class ReturnArrayValoresIgualesTest {

    /**
    * Test.
    */
    @Test
    public void test1() {
        assertTrue(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {2, 1, 3}));
        assertFalse(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {5, 6, 7}));
        assertFalse(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {2, 1, 3, 4}));
        assertFalse(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {1, 2, 3, 3}));
    }
}
