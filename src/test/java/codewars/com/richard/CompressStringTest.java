package codewars.com.richard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class CompressStringTest {

    private CompressString compressString;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        compressString = new CompressString();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals("a3b5c4", compressString.compress("aaabbbbbcccc"));
        Assert.assertEquals("abc", compressString.compress("abc"));
    }
}
