package codewars.com.richard.balanced;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class BalancedStringTest {

    private IBalancedStringChecker balancedStringChecker;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        this.balancedStringChecker = new BalancedString();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(this.balancedStringChecker.isBalanced("([{}])"));
        Assert.assertFalse(this.balancedStringChecker.isBalanced("([}]"));
    }
}
