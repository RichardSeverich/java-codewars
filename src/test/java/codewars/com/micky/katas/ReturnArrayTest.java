package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class ReturnArrayTest {

    /**
    * Test.
    */
    @Test
    public void fixedTests() {
      assertEquals(5, ReturnArray.taman(new int[] {2, 5, 7, 9, 10}));
      assertEquals(8, ReturnArray.taman(new int[] {2, 12, 22, 752, 1, 3, 5, 155}));
    }
}
