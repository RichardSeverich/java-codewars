package codewars.com.kataNextBiggernumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BiggerNumberNextTest {

    private BiggerNumberNext biggerNumber;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        biggerNumber = new BiggerNumberNext();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        long actualResult = biggerNumber.nextBiggerNumber(2017);
        long expectedResult = 2071;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        long actualResult = biggerNumber.nextBiggerNumber(1);
        long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        long actualResult = biggerNumber.nextBiggerNumber(144);
        long expectedResult = 414;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
