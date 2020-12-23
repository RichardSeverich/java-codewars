package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
* Test.
*/
public class SquareSumTest {

    /**
    * Test.
    */
    @Test
    public void testBasic() {
        assertEquals(9, SquareSum.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareSum.squareSum(new int[] {1,2}));
        assertEquals(50, SquareSum.squareSum(new int[] {5,-3,4}));
    }
}
