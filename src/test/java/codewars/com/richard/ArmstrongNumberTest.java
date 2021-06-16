package codewars.com.richard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class ArmstrongNumberTest {

    private ArmstrongNumber armstrongNumber;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        armstrongNumber = new ArmstrongNumber();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(armstrongNumber.isArmstrong(0));
        Assert.assertTrue(armstrongNumber.isArmstrong(1));
        Assert.assertTrue(armstrongNumber.isArmstrong(2));
        Assert.assertTrue(armstrongNumber.isArmstrong(3));
        Assert.assertTrue(armstrongNumber.isArmstrong(4));
        Assert.assertTrue(armstrongNumber.isArmstrong(5));
        Assert.assertTrue(armstrongNumber.isArmstrong(6));
        Assert.assertTrue(armstrongNumber.isArmstrong(7));
        Assert.assertTrue(armstrongNumber.isArmstrong(8));
        Assert.assertTrue(armstrongNumber.isArmstrong(9));
        Assert.assertTrue(armstrongNumber.isArmstrong(153));
        Assert.assertTrue(armstrongNumber.isArmstrong(370));
        Assert.assertTrue(armstrongNumber.isArmstrong(407));
        Assert.assertFalse(armstrongNumber.isArmstrong(11));
        Assert.assertFalse(armstrongNumber.isArmstrong(12));
        Assert.assertFalse(armstrongNumber.isArmstrong(13));
    }
}