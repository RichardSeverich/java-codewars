package codewars.com.micky.solid.liskov.bad;

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
        Duck rubberDuck = new RubberDuck();
        Assert.assertEquals("", rubberDuck.getFly());
        Assert.assertEquals("si nada", rubberDuck.getSwing());
        Assert.assertEquals("si hace cuack", rubberDuck.getCuack());
    }
}
