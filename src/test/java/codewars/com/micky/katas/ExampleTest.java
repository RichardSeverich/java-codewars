package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class ExampleTest{

  /**
  * test.
  */
  @Test
  public void fixedTests() {
    assertEquals(3 , Example.take(list(2)));
    assertEquals(list(2, 2, 2) , Example.take(list(2, 3)));
    assertEquals(list(1) , Example.take(list()));
  }

  /**
  * @param array array.
  * @return int.
  */
  public int list (int... array){
    int sumatoria = 0;
    for (int numeros: array){
      sumatoria += numeros;
    }
    return sumatoria;
  }
}
