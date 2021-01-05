package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Test.
 */
public class ReturnPrimoTest{
  
    /**
    * Test.
    */
    @Test
    public void basicTests() {
      assertTrue(ReturnPrimo.getPrimo(7));
    }

    /**
    * Test.
    */
    @Test
    public void recursionTests() {
      assertTrue(ReturnPrimo.getPrimoRecur(2, 2));
    }
}