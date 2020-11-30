package codewars.com.micky.pilares.polimorfismo;

import org.junit.Assert;
import org.junit.Test;

public class PolimorfismoTest {
    
    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Person persona1 = new Gerente("micky", 640154, "gerente RRHH", 1, 3500);
        Person persona2 = new Employed("julio", 640154, "dev", 2, 3500);
        Assert.assertTrue(persona1 instanceof Gerente);
        Assert.assertTrue(persona2 instanceof Employed);
    }
}
