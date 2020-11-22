package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnParesTest {
    @Test
    public void fixedTests() {
        assertEquals(2, ReturnPares.getPares(new int[] {2, 5, 7, 9, 10}));
        assertEquals(4, ReturnPares.getPares(new int[] {2, 12, 22, 752}));
    }
}
