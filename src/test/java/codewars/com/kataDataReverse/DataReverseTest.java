package codewars.com.kataDataReverse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class DataReverseTest {

    private DataReverse dataReverse;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        dataReverse = new DataReverse();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        int[] data = {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1};
        int[] expectedResult = {0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        Assert.assertArrayEquals(expectedResult, dataReverse.getDataReverse(data));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        int[] data = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] expectedResult =
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expectedResult, dataReverse.getDataReverse(data));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        int[] data = {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1};
        int[] expectedResult = {0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        Assert.assertArrayEquals(expectedResult, dataReverse.dataReverseGood1(data));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        int[] data = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] expectedResult =
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expectedResult, dataReverse.dataReverseGood1(data));
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        int[] data = {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1};
        int[] expectedResult = {0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        Assert.assertArrayEquals(expectedResult, dataReverse.dataReverseGood2(data));
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        int[] data = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] expectedResult =
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expectedResult, dataReverse.dataReverseGood2(data));
    }

}
