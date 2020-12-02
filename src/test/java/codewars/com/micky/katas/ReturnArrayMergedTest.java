package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ReturnArrayMergedTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 7}, ReturnArrayMerged.getArray(new int[] {1, 2, 3}, new int[] {5, 6, 7}));
    }

}
