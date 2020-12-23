package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test.
 */
public class CampingTest {

    /**
     * test.
     */
    @Test
    public void testSomething() {
        assertTrue(Camping.zeroFuel(50, 25, 2));
        assertFalse(Camping.zeroFuel(100, 50, 1));
    }
}
