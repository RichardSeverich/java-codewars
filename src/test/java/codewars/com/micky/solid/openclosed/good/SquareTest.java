package codewars.com.micky.solid.openclosed.good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest{
    private AreaSquare areaSquare1;
    private SetArea setArea;

    /**
     * Before.
     */
    @Before
    public void instance() {
        setArea = new SetArea();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        areaSquare1 = new AreaSquare(5);
        Assert.assertEquals(25, setArea.getArea(areaSquare1));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        areaSquare1 = new AreaSquare(10);
        Assert.assertEquals(100, setArea.getArea(areaSquare1));
    }
}
