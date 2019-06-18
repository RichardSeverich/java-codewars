package codewars.com.kataNextBiggernumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        long actualResult = biggerNumber.biggerNumber1(12);
        long expectedResult = 21;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        long actualResult = biggerNumber.biggerNumber1(2017);
        long expectedResult = 7210;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        long actualResult = biggerNumber.biggerNumber1(9);
        long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        long actualResult = biggerNumber.biggerNumber2(12);
        long expectedResult = 21;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        long actualResult = biggerNumber.biggerNumber2(2017);
        long expectedResult = 7210;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        long actualResult = biggerNumber.biggerNumber2(9);
        long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        long actualResult = biggerNumber.nextBiggerNumber(2017);
        long expectedResult = 2071;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        long actualResult = biggerNumber.nextBiggerNumber(1);
        long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 9.
     */
    @Test
    public void test9() {
        long actualResult = biggerNumber.nextBiggerNumber(144);
        long expectedResult = 414;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 10.
     */
    @Test
    public void test10() {
        long actualResult = biggerNumber.nextBiggerNumber(513);
        long expectedResult = 531;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 11.
     */
    @Test
    public void test11() {
        long actualResult = biggerNumber.nextBiggerNumber(515);
        long expectedResult = 551;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
