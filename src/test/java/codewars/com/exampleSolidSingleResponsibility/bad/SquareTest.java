package codewars.com.exampleSolidSingleResponsibility.bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class SquareTest {

    private Square square;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        square = new Square();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals(4.0, square.getAreaSquare(2), 1.0);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals(2.0, square.getAreaRectangle(1, 2), 1.0);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertEquals(12.566370614359172, square.getAreaCircle(2), 1.0);
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        Assert.assertEquals(2, square.getAreaTriangle(2, 1), 1.0);
    }
}
