package codewars.com.micky.solid.singleresponsibility.bad;

import org.junit.Assert;
import org.junit.Test;

public class SesionTest {

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(Sesion.getSesion("micky", "micky"));
        Assert.assertFalse(Sesion.getSesion("richard", "micky"));
        Assert.assertFalse(Sesion.getSesion("micky", "richard"));
    }
}
