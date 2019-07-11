package codewars.com.exampleSolidLiskovSubstitution.good;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 */
public class RectangleTest {

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final IRectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(2, rectangle.getArea());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final IRectangle square = new Square(1);
        Assert.assertEquals(1, square.getArea());
    }
}
