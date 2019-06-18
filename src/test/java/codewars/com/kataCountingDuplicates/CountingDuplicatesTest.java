package codewars.com.kataCountingDuplicates;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class CountingDuplicatesTest {

    private CountingDuplicates countingDuplicates;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        countingDuplicates = new CountingDuplicates();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals(0, countingDuplicates.duplicateCount("abcde"));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals(1, countingDuplicates.duplicateCount("indivisibilit"));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertEquals(1, countingDuplicates.duplicateCount("indIvisIbilIt"));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        Assert.assertEquals(1, countingDuplicates.duplicateCountPro("indIvisIbilIt"));
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        Assert.assertEquals(1, countingDuplicates.duplicateCountGood("indIvisIbilIt"));
    }

}
