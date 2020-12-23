package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class ReturnVocalesTest{

    /**
    * Test.
    */
    @Test
    public void fixedTests() {
      assertEquals(6 , ReturnVocales.getString("AUjash452356346"));
      assertEquals(11, ReturnVocales.getString("Aacfe78saf455af "));
    }
}
