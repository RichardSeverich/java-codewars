package codewars.com.micky.solid.liskovsubstitution.good;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 */
public class RubberDuckTest {

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        RubberDuck rubberDuck = new RubberDuck();
        Assert.assertEquals("si nada", rubberDuck.getSwing());
        Assert.assertEquals("si hace cuack", rubberDuck.getCuack());
    }
}
