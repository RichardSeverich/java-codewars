package codewars.com.micky.algoritmosordenamiento;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test.
 */
public class BurbujaTest {
    
    /**
    * Test.
    */
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[]{1, 2, 10, 30, 55}, Burbuja.setBurbuja(new int[] {10, 30, 55, 2, 1}));
    }
}
