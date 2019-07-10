package codewars.com.exampleSolidSingleResponsibility.bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class CircleTest {

    private Circle circle;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        circle = new Circle();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals(1.0, circle
                .getArea("Square", 1, 2, 0), 0);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals(1.0, circle
                .getArea("Rectangle", 1, 2, 1), 2);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertEquals(3.141592653589793, circle
                .getArea("Circle", 1, 2, 1), 2);
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        Assert.assertEquals(1.0, circle
                .getArea("Triangle", 1, 2, 1), 2);
    }

}
