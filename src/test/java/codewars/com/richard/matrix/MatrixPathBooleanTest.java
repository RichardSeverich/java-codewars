package codewars.com.richard.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class MatrixPathBooleanTest {

    private MatrixPathBoolean matrixPath;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        matrixPath = new MatrixPathBoolean();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        boolean input[][] = {
            { true, false, false},
            { true, true, false},
            { false, true, true}
        };
        final int fromRow =  0;
        final int fromColumn = 0;
        final int toRow = 2;
        final int toColumn = 2;
        boolean actualResult = matrixPath.isPath(
            fromRow, fromColumn, toRow, toColumn, input);
        Assert.assertTrue(actualResult);
    }

     /**
     * Test 2.
     */
    @Test
    public void test2() {
        boolean input[][] = {
            { false, true, false, true },
            { true, false, true, true },
            { true, true, true, true },
            { false, true, true, true } };
        final int fromRow =  0;
        final int fromColumn = 3;
        final int toRow = 2;
        final int toColumn = 0;
        boolean actualResult = matrixPath.isPath(
            fromRow, fromColumn, toRow, toColumn, input);
        Assert.assertTrue(actualResult);
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        boolean input[][] = { 
            { false, true, false, true },
            { false, false, true, true },
            { true, false, true, true },
            { false, true, true, true } };
        final int fromRow =  0;
        final int fromColumn = 3;
        final int toRow = 2;
        final int toColumn = 0;
        boolean actualResult = matrixPath.isPath(
            fromRow, fromColumn, toRow, toColumn, input);
        Assert.assertFalse(actualResult);
    }
}
