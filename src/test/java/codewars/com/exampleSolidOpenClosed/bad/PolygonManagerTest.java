package codewars.com.exampleSolidOpenClosed.bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class PolygonManagerTest {

    private Square square;
    private Circle circle;
    private PolygonManager polygonManager;


    /**
     * Before.
     */
    @Before
    public void setUp() {
        polygonManager = new PolygonManager();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        this.square = new Square(1);
        Assert.assertEquals(1, polygonManager.getArea(this.square));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        this.square = new Square(2);
        final int expectedResult = 4;
        Assert.assertEquals(expectedResult, polygonManager.getArea(this.square));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        this.circle = new Circle(1);
        final int expectedResult = 3;
        Assert.assertEquals(expectedResult, polygonManager.getArea(this.circle));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        this.circle = new Circle(2);
        final int expectedResult = 12;
        Assert.assertEquals(expectedResult, polygonManager.getArea(this.circle));
    }
}
