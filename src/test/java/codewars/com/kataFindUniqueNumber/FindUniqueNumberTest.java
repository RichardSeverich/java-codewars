package codewars.com.kataFindUniqueNumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class FindUniqueNumberTest {

    private FindUniqueNumber findUniqueNumber;
    private static final double[] ARRAY_ONE = new double[]{0, 2, 2, 0, 0, 1};
    private static final double[] ARRAY_TWO = new double[]{0, 1, 1, 1, 1, 1};
    private static final double DELTA = 0.001;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        findUniqueNumber = new FindUniqueNumber();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals(1, findUniqueNumber.findUnique(ARRAY_ONE), DELTA);
        Assert.assertEquals(0, findUniqueNumber.findUnique(ARRAY_TWO), DELTA);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals(1, findUniqueNumber.findUniquePro(ARRAY_ONE), DELTA);
        Assert.assertEquals(0, findUniqueNumber.findUniquePro(ARRAY_TWO), DELTA);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertEquals(1, findUniqueNumber.findUniqueGood(ARRAY_ONE), DELTA);
        Assert.assertEquals(0, findUniqueNumber.findUniqueGood(ARRAY_TWO), DELTA);
    }
}
