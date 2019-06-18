package codewars.com.kataBuildSquare;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class BuildSquareTest {

    private BuildSquare buildSquare;
    private StringBuilder expectedResult;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        buildSquare = new BuildSquare();
        expectedResult = new StringBuilder();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        expectedResult
                .append("+++")
                .append(System.getProperty("line.separator"))
                .append("+++")
                .append(System.getProperty("line.separator"))
                .append("+++");
        Assert.assertEquals(expectedResult.toString(), buildSquare.generateShape(3));
    }
}
