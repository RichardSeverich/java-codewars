package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ReturnPrimoTest{
  

  @Test
  public void basicTests() {
    assertTrue(ReturnPrimo.getPrimo(7));
  }

  @Test
    public void recursionTests() {
    assertTrue(ReturnPrimo.getPrimoRecur(2, 2));
  }
}