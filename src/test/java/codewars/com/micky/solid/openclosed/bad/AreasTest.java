package codewars.com.micky.solid.openclosed.bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import codewars.com.micky.solid.openclosed.good.SetArea;

public class AreasTest{

    private Square areaSquare1;
    private Circle areaCircle1;
    private Areas area;

    /**
     * Before.
     */
    @Before
    public void instance() {
        area = new Areas();
    }





    /**
     * Test 1.
     */
    @Test
    public void test1() {
        areaSquare1 = new Square(5);
        Assert.assertEquals(25, area.getAreaSquare(areaSquare1));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        areaSquare1 = new Square(10);
        Assert.assertEquals(100, area.getAreaSquare(areaSquare1));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        areaCircle1 = new Circle(5);
        Assert.assertEquals(78.54, area.getAreaCircle(areaCircle1));
    }

    /**
     * Test 4.
     */
    /*@Test
    public void test4() {
        Assert.assertEquals(78.54, Areas.getAreaCircle(5));
    }*/
}
