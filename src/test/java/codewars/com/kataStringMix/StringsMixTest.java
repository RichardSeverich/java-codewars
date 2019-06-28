package codewars.com.kataStringMix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class StringsMixTest {

    private StringsMix stringsMix;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        stringsMix = new StringsMix();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final String[][] arrayString = new String[5][2];
        arrayString[0][0] = "a";
        arrayString[0][1] = "5";

        arrayString[1][0] = "b";
        arrayString[1][1] = "2";

        arrayString[2][0] = "x";
        arrayString[2][1] = "1";

        arrayString[3][0] = "y";
        arrayString[3][1] = "3";

        arrayString[4][0] = null;
        arrayString[4][1] = null;


        Assert.assertTrue(stringsMix.isStringExistInArray(arrayString, "a"));
        Assert.assertFalse(stringsMix.isStringExistInArray(arrayString, "A"));
        Assert.assertFalse(stringsMix.isStringExistInArray(arrayString, "X"));
        Assert.assertTrue(stringsMix.isStringExistInArray(arrayString, "x"));
        Assert.assertFalse(stringsMix.isStringExistInArray(new String[1][1], "x"));
        Assert.assertFalse(stringsMix.isStringExistInArray(new String[0][1], "x"));
        Assert.assertFalse(stringsMix.isStringExistInArray(null, "x"));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertTrue(stringsMix.isLowerCase("a"));
        Assert.assertFalse(stringsMix.isLowerCase("A"));
        Assert.assertTrue(stringsMix.isLowerCase("x"));
        Assert.assertFalse(stringsMix.isLowerCase("X"));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final String parameter = "aaabbbbccccc";
        final String[][] expectedResult = new String[12][2];
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "5";
        Assert.assertArrayEquals(expectedResult, stringsMix.getArrayWithRepeated(parameter));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        final String parameter = "aaabbbbcccccAAAABBBCCC";
        final String[][] expectedResult = new String[22][2];
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "5";
        Assert.assertArrayEquals(expectedResult, stringsMix.getArrayWithRepeated(parameter));
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        final String parameter = "aaabbbbcccccAAAABBBCCCzxvnmlkp";
        final String[][] expectedResult = new String[30][2];
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "5";
        Assert.assertArrayEquals(expectedResult, stringsMix.getArrayWithRepeated(parameter));
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        final String parameter = "a";
        final String[][] expectedResult = new String[1][2];
        Assert.assertArrayEquals(expectedResult, stringsMix.getArrayWithRepeated(parameter));
    }
}
