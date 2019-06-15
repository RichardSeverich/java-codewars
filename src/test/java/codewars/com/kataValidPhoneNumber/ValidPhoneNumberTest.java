package codewars.com.kataValidPhoneNumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class ValidPhoneNumberTest {

    private ValidPhoneNumber validPhoneNumber;

    /**
     * Test 1.
     */
    @Before
    public void setUp() {
        validPhoneNumber = new ValidPhoneNumber();
    }

    /**
     * Test 2.
     */
    @Test
    public void test1() {
        Assert.assertTrue(validPhoneNumber.validPhoneNumber("(123) 456-7890"));
    }

    /**
     *
     */
    @Test
    public void test2() {
        Assert.assertFalse(validPhoneNumber.validPhoneNumber("(1111)555 2345"));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertFalse(validPhoneNumber.validPhoneNumber("(098) 123 4567"));
    }
}
