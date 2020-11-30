package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReturnRepeatTest {
    @Test
    public void testSomething() {
        assertEquals("a", ReturnRepeat.getRepeat(new String[] {"a", "b", "c", "a", "a", "b", "e"}));
    }
}