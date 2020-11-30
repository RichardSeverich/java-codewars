package codewars.com.micky.solid.liskovsubstitution.good;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 */
public class DuckTest {

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Duck duck = new Duck();
        Assert.assertEquals("si vuela", duck.getFly());
        Assert.assertEquals("si nada", duck.getSwing());
        Assert.assertEquals("si hace cuack", duck.getCuack());
    }
}
