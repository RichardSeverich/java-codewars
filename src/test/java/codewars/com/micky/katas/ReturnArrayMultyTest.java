package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class ReturnArrayMultyTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 12, 21}, ReturnArrayMulty.getMulty(new int[] {1, 2, 3}, new int[] {5, 6, 7}));
    }
}