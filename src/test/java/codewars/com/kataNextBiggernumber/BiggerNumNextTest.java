package codewars.com.kataNextBiggernumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class BiggerNumNextTest {


    private BiggerNumNext biggerNumNext;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        biggerNumNext = new BiggerNumNext();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        int[] actualResult = biggerNumNext.getIndexChange(new String[]{"2", "1", "8", "7", "6", "5"});
        int[] expectedResult = new int[]{1,5};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        int[] actualResult = biggerNumNext.getIndexChange(new String[]{"1", "2"});
        int[] expectedResult = new int[]{0,1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
