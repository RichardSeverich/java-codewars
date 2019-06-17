package codewars.com.kataSetAlarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class SetAlarmTest {

    private Alarm alarm;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        alarm = new Alarm();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertTrue(alarm.setAlarm(true, false));
        Assert.assertFalse(alarm.setAlarm(false, false));
        Assert.assertTrue(alarm.setAlarm(true, false));
        Assert.assertFalse(alarm.setAlarm(false, true));
    }

}
