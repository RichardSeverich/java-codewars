package codewars.com.kataCountVowels;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Test.
*/
public class KataCountVowelsTest {


    private KataCountVowels kataCountVowels;

    /**
    * Before.
    */
    @Before
    public void setUp() {
        kataCountVowels = new KataCountVowels();
    }

    /**
    * Test 1.
    */
    @Test
    public void test1() {
        String expectedResult = "consonants=4 vowels=5 a=1 e=1 i=1 o=1 u=1";
        Assert.assertEquals(expectedResult, kataCountVowels.solution("eucalipto"));
    }

    /**
    * Test 2.
    */
    @Test
    public void test2() {
        String expectedResult = "consonants=3 vowels=2 a=7 e=0 i=0 o=0 u=3";
        Assert.assertEquals(expectedResult, kataCountVowels.solution("aaauuuAAAABBBBCCCDDD"));
    }

}
