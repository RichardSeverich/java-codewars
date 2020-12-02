package codewars.com.micky.katas;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private Factorial factor;

    /**
     * Before.
     */
    @Before
    public void instance() {
        factor = new Factorial();
    }

    /**
    * Test.
    */
    @Test
    public void fixedTests() {
        assertEquals(24, factor.getFactorial(4));
        assertEquals(120, factor.getFacRecursividad(5));
    }
}
