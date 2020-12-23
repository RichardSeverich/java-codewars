package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Test.
 */
public class CodeWarsKataTest {

    /**
     * test.
     */
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, CodeWarsKata.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}