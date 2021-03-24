package codewars.com.richard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class StringBalancedTest {

    private StringBalanced stringBalanced;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        stringBalanced = new StringBalanced();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(stringBalanced.isBalanced("{(x,y)}"));
        Assert.assertFalse(stringBalanced.isBalanced("{(x},y)"));
        Assert.assertFalse(stringBalanced.isBalanced("{)(x,y}"));
    }
}
