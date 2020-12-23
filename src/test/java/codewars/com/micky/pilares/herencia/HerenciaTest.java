package codewars.com.micky.pilares.herencia;

import org.junit.Assert;
import org.junit.Test;

/**
* Test.
*/
public class HerenciaTest {
    
    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Person persona1 = new Employed("julio", 640154, "dev", 2, 3500);
        Assert.assertTrue(persona1 instanceof Employed);
    }
}
