package codewars.com.kataReversedWords;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversedWordsTest {

    private ReversedWords reversedWords;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        reversedWords = new ReversedWords();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        String actualResult = reversedWords.reverse1("The greatest victory is that which requires no battle");
        String expectedResult = "battle no requires which that is victory greatest The";
        Assert.assertEquals(expectedResult, actualResult);

    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        String actualResult = reversedWords.reverse2("The greatest victory is that which requires no battle");
        String expectedResult = "battle no requires which that is victory greatest The";
        Assert.assertEquals(expectedResult, actualResult);

    }
}
