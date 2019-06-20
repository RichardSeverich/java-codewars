package codewars.com.kataSumParts;

import codewars.com.kataSumsParts.SumParts;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class SumPartsTest {

    private SumParts sumParts;

    /**
     * Test 1.
     */
    @Before
    public void setUp() {
        sumParts = new SumParts();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final int[] actualResult = sumParts.sumParts1(new int[]{1, 2, 3, 4, 5});
        final int[] expectedResult = {15, 14, 12, 9, 5, 0};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        // Results
        final int[] actualResult = sumParts.sumParts2(new int[]{0, 1, 3, 6, 10});
        final int[] expectedResult = {20, 20, 19, 16, 10, 0};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        // Results
        final int[] actualResult = sumParts.sumParts3(new int[]{0, 1, 3, 6, 10});
        final int[] expectedResult = {20, 20, 19, 16, 10, 0};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test4() {
        // Results
        final int[] actualResult = sumParts.sumParts4(new int[]{0, 1, 3, 6, 10});
        final int[] expectedResult = {20, 20, 19, 16, 10, 0};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
