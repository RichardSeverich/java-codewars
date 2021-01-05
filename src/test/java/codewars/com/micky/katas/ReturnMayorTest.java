package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class ReturnMayorTest {

    /**
    * Test.
    */
    @Test
    public void fixedTests() {
        assertEquals(20, ReturnMayor.getMayor(new int[] {20, 5, 7, 9, 10}));
        assertEquals(752, ReturnMayor.getMayor(new int[] {300, 12, 22, 752, 1, 3, 5, 155}));
    }
}
