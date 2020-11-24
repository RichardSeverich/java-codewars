package codewars.com.micky.katas;

import java.util.Arrays;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.runners.JUnit4;

public class ReturnArrayMergedTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 7}, ReturnArrayMerged.getArray(new int[] {1, 2, 3}, new int[] {5, 6, 7}));
    }

}
