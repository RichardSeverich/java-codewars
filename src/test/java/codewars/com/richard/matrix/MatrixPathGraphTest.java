package codewars.com.richard.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class MatrixPathGraphTest {

    private MatrixPathGraph matrixPath;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        matrixPath = new MatrixPathGraph();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        int input[][] = { 
            { 0, 3, 0, 1 },
            { 3, 0, 3, 3 },
            { 2, 3, 3, 3 },
            { 0, 3, 3, 3 } };
        boolean actualResult = matrixPath.isPath(input);
        Assert.assertTrue(actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        int input[][] = { 
            { 0, 3, 0, 1 },
            { 0, 0, 3, 3 },
            { 2, 0, 3, 3 },
            { 0, 3, 3, 3 } };
        boolean actualResult = matrixPath.isPath(input);
        Assert.assertFalse(actualResult);
    }
}
