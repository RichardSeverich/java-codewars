package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnMayorTest {
    @Test
    public void fixedTests() {
        assertEquals(20, ReturnMayor.getMayor(new int[] {20, 5, 7, 9, 10}));
        assertEquals(300, ReturnMayor.getMayor(new int[] {300, 12, 22, 752, 1, 3, 5, 155}));
    }
}
