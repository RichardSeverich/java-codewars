package codewars.com.richard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class RepeatTest {

    private Repeat repeat;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        repeat = new Repeat();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        String[] input = {"1", "2", "3", "2", "1"};
        String[] expectedResult = {"1", "2"};
        String[] actualResult = repeat.getResult(input);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
