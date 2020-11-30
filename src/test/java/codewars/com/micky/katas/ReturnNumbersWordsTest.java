package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnNumbersWordsTest{

  @Test
  public void fixedTests() {
    assertEquals(8 , ReturnNumbersWords.returnNumber("1aaa1 adasdasd123123"));
    assertEquals(14, ReturnNumbersWords.returnNumber("2a2f4sd3s3 123123123"));
  }
}
