package codewars.com.micky.katas;

import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;

public class ReturnEcuacionTest{  
  
  @Test
  public final void test_all() {
    Assert.assertEquals(1.0, ReturnEcuacion.getEcuacion(3, -5, 2), 0.0);
  }
}