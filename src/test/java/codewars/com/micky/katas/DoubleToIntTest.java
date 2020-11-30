package codewars.com.micky.katas;

import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;

public class DoubleToIntTest{  
  
  @Test
  public final void test_all() {
    Assert.assertEquals( "Nope!" , 4, DoubleToInt.doubleInteger(2)); // Test cases here!
  }
}