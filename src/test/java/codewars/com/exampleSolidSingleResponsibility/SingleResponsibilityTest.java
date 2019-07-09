package codewars.com.exampleSolidSingleResponsibility;


import codewars.com.exampleSolidSingleResponsibility.bad.Circle;
import codewars.com.exampleSolidSingleResponsibility.bad.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleResponsibilityTest {

    private Circle Circle;
    private Square square;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        Circle = new Circle();
        square = new Square();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals(1.0, Circle
                .getArea("cuadrado", 1, 2, 0), 0);
    }

}
