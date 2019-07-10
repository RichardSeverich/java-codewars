package codewars.com.exampleSolidSingleResponsibility.good;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 */
public class CircleTest {

    private Circle circle;

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        circle = new Circle(1);
        Assert.assertEquals(3.141592653589793, circle.getArea(), 1.0);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        circle = new Circle(2);
        Assert.assertEquals(12.566370614359172, circle.getArea(), 1.0);
    }
}
