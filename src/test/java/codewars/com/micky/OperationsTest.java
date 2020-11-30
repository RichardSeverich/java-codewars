package codewars.com.micky;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class OperationsTest {

    private Operations operations;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        operations = new Operations();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals(5, operations.suma(3, 2));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals(1, operations.resta(3, 2));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertEquals(40, operations.multiplicacion(5, 8));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        Assert.assertEquals(5, operations.division(50, 10));
    }
}
