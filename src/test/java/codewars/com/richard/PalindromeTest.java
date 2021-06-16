package codewars.com.richard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class PalindromeTest {

    private Palindrome palindrome;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(palindrome.isPalindrome("Bob"));
        Assert.assertFalse(palindrome.isPalindrome("Hola"));
    }
}