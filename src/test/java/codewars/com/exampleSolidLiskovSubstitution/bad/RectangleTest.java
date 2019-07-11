package codewars.com.exampleSolidLiskovSubstitution.bad;

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
        final Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(2, rectangle.getArea());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final Rectangle square = new Square(1, 2);
        //issue expectedResult = 1;
        Assert.assertEquals(2, square.getArea());
    }
}
