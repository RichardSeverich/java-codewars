package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnMenorTest {
    @Test
    public void fixedTests() {
        assertEquals(2, ReturnMenor.getMenor(new int[] {2, 5, 7, 9, 10}));
        assertEquals(1, ReturnMenor.getMenor(new int[] {2, 12, 22, 752, 1, 3, 5, 155}));
    }
}
