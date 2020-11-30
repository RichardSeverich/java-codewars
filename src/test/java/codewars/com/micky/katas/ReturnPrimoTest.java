package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ReturnPrimoTest{
  

  @Test
  public void basicTests() {
    assertTrue(ReturnPrimo.getPrimo(7));
    /*assertFalse(ReturnPrimo.getPrimo(88));
    assertTrue(ReturnPrimo.getPrimo(71));
    assertFalse(ReturnPrimo.getPrimo(0));
    assertFalse(ReturnPrimo.getPrimo(1));*/
    //assertEquals(true, PrimeNumber.prime(-71));
    //assertEquals(false, PrimeNumber.prime(-88));
  }

  @Test
    public void recursionTests() {
    assertTrue(ReturnPrimo.getPrimoRecur(2, 2));
    /*assertFalse(ReturnPrimo.getPrimoRecur(88, 2));
    assertTrue(ReturnPrimo.getPrimoRecur(71, 2));
    assertFalse(ReturnPrimo.getPrimoRecur(0, 2));
    assertFalse(ReturnPrimo.getPrimoRecur(1, 2));*/
    //assertEquals(true, PrimeNumber.primeRecursion(-71, 2));
    //assertEquals(false, PrimeNumber.primeRecursion(-88, 2));
  }
}