package codewars.com.kataNextBiggernumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class BiggerNumberTest {


    private BiggerNumber biggerNumber;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        biggerNumber = new BiggerNumber();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final long actualResult = biggerNumber.biggerNumber1(12);
        final long expectedResult = 21;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final long actualResult = biggerNumber.biggerNumber1(2017);
        final long expectedResult = 7210;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final long actualResult = biggerNumber.biggerNumber1(9);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        final long actualResult = biggerNumber.biggerNumber2(12);
        final long expectedResult = 21;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        final long actualResult = biggerNumber.biggerNumber2(2017);
        final long expectedResult = 7210;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        final long actualResult = biggerNumber.biggerNumber2(9);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        final long actualResult = biggerNumber.nextBiggerNumber(2017);
        final long expectedResult = 2071;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        final long actualResult = biggerNumber.nextBiggerNumber(1);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 9.
     */
    @Test
    public void test9() {
        final long actualResult = biggerNumber.nextBiggerNumber(144);
        final long expectedResult = 414;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 10.
     */
    @Test
    public void test10() {
        final long actualResult = biggerNumber.nextBiggerNumber(513);
        final long expectedResult = 531;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 11.
     */
    @Test
    public void test11() {
        final long actualResult = biggerNumber.nextBiggerNumber(515);
        final long expectedResult = 551;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
