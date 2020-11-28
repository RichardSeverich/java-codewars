package codewars.com.micky.solid.singleresponsibility.good;

import org.junit.Assert;
import org.junit.Test;

public class SesionTest {
    
    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(Sesion.getResult("micky", "micky"));
        Assert.assertFalse(Sesion.getResult("richard", "micky"));
        Assert.assertFalse(Sesion.getResult("micky", "richard"));
    }
}
