package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class ReverseWordsTest {

    /**
    * Test.
    */
    @Test
    public void testSomething() {
         assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
         assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
         assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
    }
}