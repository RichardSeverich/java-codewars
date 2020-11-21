package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnNumbersOfStringTest{

  @Test
  public void fixedTests() {
    assertEquals(8 , ReturnNumbersOfString.getString("1aaa1 adasdasd123123"));
    assertEquals(14, ReturnNumbersOfString.getString("2a2f4sd3s3 123123123"));
  }
}
