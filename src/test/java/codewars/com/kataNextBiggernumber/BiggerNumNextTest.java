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
        int[] expectedResult = new int[]{1, 5};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        int[] actualResult = biggerNumNext.getIndexChange(new String[]{"1", "2"});
        int[] expectedResult = new int[]{0, 1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        String actualResult = biggerNumNext.swap("123456789", 0, 8);
        String expectedResult = "923456781";
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        String actualResult = biggerNumNext.swap("218765", 1, 5);
        String expectedResult = "258761";
        Assert.assertEquals(expectedResult, actualResult);
    }


    /**
     * Test 5.
     */
    @Test
    public void test5() {
        String actualResult = biggerNumNext.sortStringNumbers("218765");
        String expectedResult = "125678";
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        String actualResult = biggerNumNext.sortStringNumbers("369852147");
        String expectedResult = "123456789";
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        long actualResult = biggerNumNext.getNextBiggerNumber(12);
        long expectedResult = 21;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        long actualResult = biggerNumNext.getNextBiggerNumber(2017);
        long expectedResult = 2071;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 9.
     */
    @Test
    public void test9() {
        long actualResult = biggerNumNext.getNextBiggerNumber(4321);
        long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 10.
     */
    @Test
    public void test10() {
        long actualResult = biggerNumNext.getNextBiggerNumber(534976);
        long expectedResult = 536479;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 11.
     */
    @Test
    public void test11() {
        int[] actualResult = biggerNumNext
                .getIndexChange(new String[]{"1", "0", "0", "5", "1", "7", "0", "1", "6", "1"});
        int[] expectedResult = new int[]{7, 8};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 12.
     */
    @Test
    public void test12() {
        long actualResult = biggerNumNext.getNextBiggerNumber(1005170161);
        long expectedResult = 1005170611;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
