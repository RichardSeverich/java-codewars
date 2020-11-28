package codewars.com.micky.solid.openclosed.good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleTest{
    private AreaCircle areaCircle1;
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
        areaCircle1 = new AreaCircle(5);
        Assert.assertEquals(78.54, setArea.getArea(areaCircle1));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        areaCircle1 = new AreaCircle(10);
        Assert.assertEquals(314.16, setArea.getArea(areaCircle1));
    }
}
