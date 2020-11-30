package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class ReturnAllImparesTest {
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[]{5, 7, 9}, ReturnAllImpares.getImpares(new int[] {2, 5, 7, 9, 10}));
        assertArrayEquals(new int[]{1, 3, 5, 155}, ReturnAllImpares.getImpares(new int[] {2, 12, 22, 752, 1, 3, 5, 155}));
    }
}
