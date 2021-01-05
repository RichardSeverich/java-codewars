package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test.
 */
public class ReturnArrayMultyTest {

    /**
    * Test.
    */
    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 12, 21}, ReturnArrayMulty.getMulty(new int[] {1, 2, 3}, new int[] {5, 6, 7}));
    }
}