package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnVocalesTest{

  @Test
  public void fixedTests() {
    assertEquals(6 , ReturnVocales.getString("AUjash452356346"));
    assertEquals(11, ReturnVocales.getString("Aacfe78saf455af "));
  }
}
