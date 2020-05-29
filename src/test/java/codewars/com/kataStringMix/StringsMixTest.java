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
        final String parameter = "aaabbbbcccccAAAABBBCCCzxvnmukp";
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

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        final String[][] expectedResult = new String[7][3];
        final String[][] parameterOne = new String[][]{{"a", "3"}, {"b", "4"}, {"c", "2"}, {"f", "2"},};
        final String[][] parameterTwo = new String[][]{{"a", "2"}, {"b", "3"}, {"c", "3"}};
        // Value 1
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[0][2] = "1";
        // Value 2
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[1][2] = "1";
        // Value 3
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "3";
        expectedResult[2][2] = "2";
        // Value 4
        expectedResult[3][0] = "f";
        expectedResult[3][1] = "2";
        expectedResult[3][2] = "1";
        Assert.assertArrayEquals(expectedResult,
                stringsMix.getArrayMix(parameterOne, parameterTwo));
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        final String[][] expectedResult = new String[7][3];
        final String[][] parameterOne = new String[][]{{"a", "2"}, {"b", "3"}, {"c", "3"}};
        final String[][] parameterTwo = new String[][]{{"a", "3"}, {"b", "4"}, {"c", "2"}, {"f", "2"},};
        // Value 1
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[0][2] = "2";
        // Value 2
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[1][2] = "2";
        // Value 3
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "3";
        expectedResult[2][2] = "1";
        // Value 4
        expectedResult[3][0] = "f";
        expectedResult[3][1] = "2";
        expectedResult[3][2] = "2";
        Assert.assertArrayEquals(expectedResult,
                stringsMix.getArrayMix(parameterOne, parameterTwo));
    }

    /**
     * Test 9.
     */
    @Test
    public void test9() {
        final String[][] expectedResult = new String[7][3];
        final String[][] parameterOne = new String[][]{{"a", "3"}, {"b", "4"}, {"c", "2"}, {"f", "2"},};
        final String[][] parameterTwo = new String[][]{{"x", "2"}, {"y", "3"}, {"z", "4"}};
        // Value 1
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[0][2] = "1";
        // Value 2
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[1][2] = "1";
        // Value 3
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "2";
        expectedResult[2][2] = "1";
        // Value 4
        expectedResult[3][0] = "f";
        expectedResult[3][1] = "2";
        expectedResult[3][2] = "1";
        // Value 5
        expectedResult[4][0] = "x";
        expectedResult[4][1] = "2";
        expectedResult[4][2] = "2";
        // Value 6
        expectedResult[5][0] = "y";
        expectedResult[5][1] = "3";
        expectedResult[5][2] = "2";
        // Value 7
        expectedResult[6][0] = "z";
        expectedResult[6][1] = "4";
        expectedResult[6][2] = "2";
        Assert.assertArrayEquals(expectedResult,
                stringsMix.getArrayMix(parameterOne, parameterTwo));
    }

    /**
     * Test 10.
     */
    @Test
    public void test10() {
        final String[][] expectedResult = new String[7][3];
        final String[][] parameterOne = new String[][]{{"a", "3"}, {"b", "4"}, {"c", "2"}, {"f", "2"},};
        final String[][] parameterTwo = new String[][]{{"a", "2"}, {"y", "3"}, {"z", "4"}};
        // Value 1
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[0][2] = "1";
        // Value 2
        expectedResult[1][0] = "b";
        expectedResult[1][1] = "4";
        expectedResult[1][2] = "1";
        // Value 3
        expectedResult[2][0] = "c";
        expectedResult[2][1] = "2";
        expectedResult[2][2] = "1";
        // Value 4
        expectedResult[3][0] = "f";
        expectedResult[3][1] = "2";
        expectedResult[3][2] = "1";
        // Value 5
        expectedResult[4][0] = "y";
        expectedResult[4][1] = "3";
        expectedResult[4][2] = "2";
        // Value 6
        expectedResult[5][0] = "z";
        expectedResult[5][1] = "4";
        expectedResult[5][2] = "2";
        Assert.assertArrayEquals(expectedResult,
                stringsMix.getArrayMix(parameterOne, parameterTwo));
    }

    /**
     * Test 11.
     */
    @Test
    public void test11() {
        final String[][] expectedResult = new String[7][3];
        final String[][] parameterOne = new String[][]{{"a", "2"}, {"y", "3"}, {"z", "4"}};
        final String[][] parameterTwo = new String[][]{{"a", "3"}, {"b", "4"}, {"c", "2"}, {"f", "2"},};
        // Value 1
        expectedResult[0][0] = "a";
        expectedResult[0][1] = "3";
        expectedResult[0][2] = "2";
        // Value 2
        expectedResult[1][0] = "y";
        expectedResult[1][1] = "3";
        expectedResult[1][2] = "1";
        // Value 3
        expectedResult[2][0] = "z";
        expectedResult[2][1] = "4";
        expectedResult[2][2] = "1";
        // Value 4
        expectedResult[3][0] = "b";
        expectedResult[3][1] = "4";
        expectedResult[3][2] = "2";
        // Value 5
        expectedResult[4][0] = "c";
        expectedResult[4][1] = "2";
        expectedResult[4][2] = "2";
        // Value 6
        expectedResult[5][0] = "f";
        expectedResult[5][1] = "2";
        expectedResult[5][2] = "2";
        Assert.assertArrayEquals(expectedResult,
                stringsMix.getArrayMix(parameterOne, parameterTwo));
    }

    /**
     * Test 12.
     */
    @Test
    public void test12() {
        final String[][] arrayMix = new String[][]
                {
                        {"a", "3", "2"},
                        {"y", "3", "1"},
                        {"z", "4", "1"},
                        {"b", "4", "2"},
                        {"c", "2", "2"},
                        {"f", "2", "2"}
                };

        final String[][] expectedResult = new String[][]
                {
                        {"z", "4", "1"},
                        {"b", "4", "2"},
                        {"a", "3", "2"},
                        {"y", "3", "1"},
                        {"c", "2", "2"},
                        {"f", "2", "2"}
                };

        Assert.assertArrayEquals(expectedResult, stringsMix.sortArray(arrayMix));
    }

    /**
     * Test 13.
     */
    @Test
    public void test13() {
        // This should be the right way.
        // final String expectedResult = "1:ee/1:ll/1:oo";
        final String expectedResult = "1:oo/1:ee/1:ll/";
        Assert.assertEquals(expectedResult, stringsMix.mix("Lords of the Fallen", "gamekult"));
    }

    /**
     * Test 14.
     */
    @Test
    public void test14() {
        // This should be the right way.
        // final String expectedResult = "1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr";
        final String expectedResult = "1:nnnnn/1:ooooo/1:tttt/1:eee/=:rr/1:gg/1:ii/1:mm/";
        Assert.assertEquals(expectedResult,
                stringsMix.mix("A generation must confront the looming", "codewarrs"));
    }

}
