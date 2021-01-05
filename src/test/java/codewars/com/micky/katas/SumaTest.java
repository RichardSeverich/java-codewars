package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
* Test.
*/
public class SumaTest {

    /**
    * Test.
    */
    @Test
    public void testSum() {
        byte a = 1;
        byte b = 2;
        assertEquals(3, Suma.sum(a, b));
    }
}
