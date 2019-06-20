package codewars.com.kataNextBiggernumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
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
        final long actualResult = biggerNumber.nextBiggerNumber(2017);
        final long expectedResult = 2071;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final long actualResult = biggerNumber.nextBiggerNumber(1);
        final long expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final long actualResult = biggerNumber.nextBiggerNumber(144);
        final long expectedResult = 414;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
