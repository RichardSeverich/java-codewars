package codewars.com.exampleSolidSingleResponsibility.good;

import org.junit.Assert;
import org.junit.Test;

/** Class. */
public class SquareTest {

    private Square square;

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        square = new Square(1);
        Assert.assertEquals(1, square.getArea(), 1.0);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        square = new Square(2);
        Assert.assertEquals(4, square.getArea(), 1.0);
    }
}
