package codewars.com.kataNextSmallerNumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallerNumberTest {

    private SmallerNumber smallerNumber;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        smallerNumber = new SmallerNumber();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final int[] actualResult = smallerNumber
                .getIndexChange(new String[]{"1", "0", "0", "5", "1", "7", "0", "6", "1", "1"});
        final int[] expectedResult = new int[]{7, 8};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 1.
     */
    @Test
    public void test10() {
        final int[] actualResult = smallerNumber
                .getIndexChange(new String[]{"1", "0", "0", "5", "1", "7", "0", "6", "1", "1"});
        final int[] expectedResult = new int[]{7, 8};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"2", "1"});
        final int[] expectedResult = new int[]{0, 1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"2", "0", "7", "1"});
        final int[] expectedResult = new int[]{2, 3};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"1", "7"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 5.
     */
    @Test
    public void tes5() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"1"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        final long actualResult = smallerNumber.getNextSmaller(1005170611);
        final long expectedResult = 1005170161;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        final long actualResult = smallerNumber.getNextSmaller(35);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        final long actualResult = smallerNumber.getNextSmaller(2071);
        final long expectedResult = 2017;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 9.
     */
    @Test
    public void test9() {
        final long actualResult = smallerNumber.getNextSmaller(21);
        final long expectedResult = 12;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 11.
     */
    @Test
    public void test11() {
        final long actualResult = smallerNumber.getNextSmaller(907);
        final long expectedResult = 790;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
