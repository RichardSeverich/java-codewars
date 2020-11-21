package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnPalabrasTest{

  @Test
  public void fixedTests() {
    assertEquals(5 , ReturnPalabras.getDato("AUjash452356346 asdasd asdasd asdasd asdasdqwqe12"));
    assertEquals(2, ReturnPalabras.getDato("Aacfe78saf455af 123124sasd"));
  }
}
