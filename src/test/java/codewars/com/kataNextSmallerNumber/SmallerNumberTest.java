package codewars.com.kataNextSmallerNumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
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
    public void test01() {
        final int[] actualResult = smallerNumber
                .getIndexChange(new String[]{"9", "4", "1", "4"});
        final int[] expectedResult = new int[]{1, 2};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test02() {
        final long actualResult = smallerNumber.getNextSmaller(9414);
        final long expectedResult = 9144;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test03() {
        final long actualResult = smallerNumber.getNextSmaller(53134);
        final long expectedResult = 51433;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 4.
     */
    @Test
    public void test04() {
        final int[] actualResult = smallerNumber
                .getIndexChange(new String[]{"5", "3", "1", "3", "4"});
        final int[] expectedResult = new int[]{1, 2};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 5.
     */
    @Test
    public void test05() {
        final long actualResult = smallerNumber.getNextSmaller(513);
        final long expectedResult = 351;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 6.
     */
    @Test
    public void test06() {
        final int[] actualResult = smallerNumber
                .getIndexChange(new String[]{"5", "1", "3"});
        final int[] expectedResult = new int[]{0, 2};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 7.
     */
    @Test
    public void test07() {
        final long actualResult = smallerNumber.getNextSmallerGood(513);
        final long expectedResult = 351;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 8.
     */
    @Test
    public void test08() {
        final int[] actualResult = smallerNumber
                .getIndexChange(new String[]{"1", "0", "0", "5", "1", "7", "0", "6", "1", "1"});
        final int[] expectedResult = new int[]{7, 9};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 9.
     */
    @Test
    public void test09() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"2", "1"});
        final int[] expectedResult = new int[]{0, 1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 10.
     */
    @Test
    public void test10() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"2", "0", "7", "1"});
        final int[] expectedResult = new int[]{2, 3};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 11.
     */
    @Test
    public void test11() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"1", "7"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 12.
     */
    @Test
    public void tes12() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"1"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 13.
     */
    @Test
    public void test13() {
        final long actualResult = smallerNumber.getNextSmaller(1005170611);
        final long expectedResult = 1005170161;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 14.
     */
    @Test
    public void test14() {
        final long actualResult = smallerNumber.getNextSmaller(35);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 15.
     */
    @Test
    public void test15() {
        final long actualResult = smallerNumber.getNextSmaller(2071);
        final long expectedResult = 2017;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 16.
     */
    @Test
    public void test16() {
        final long actualResult = smallerNumber.getNextSmaller(21);
        final long expectedResult = 12;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 17.
     */
    @Test
    public void test17() {
        final long actualResult = smallerNumber.getNextSmaller(907);
        final long expectedResult = 790;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 18.
     */
    @Test
    public void test18() {
        final long actualResult = smallerNumber.getNextSmaller(709);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 19.
     */
    @Test
    public void test19() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"7", "9", "0"});
        final int[] expectedResult = new int[]{1, 2};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 20.
     */
    @Test
    public void test20() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"7", "0", "9"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 21.
     */
    @Test
    public void test21() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"9", "0", "7"});
        final int[] expectedResult = new int[]{0, 2};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 22.
     */
    @Test
    public void test22() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"1", "0", "0"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 23.
     */
    @Test
    public void test23() {
        final int[] actualResult = smallerNumber.getIndexChange(new String[]{"9", "9", "9", "9", "9"});
        final int[] expectedResult = new int[]{-1, -1};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
