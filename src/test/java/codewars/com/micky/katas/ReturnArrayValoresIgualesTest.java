package codewars.com.micky.katas;

import java.util.Arrays;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.runners.JUnit4;

public class ReturnArrayValoresIgualesTest {
    @Test
    public void test1() {
        assertTrue(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {2, 1, 3}));
        assertFalse(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {5, 6, 7}));
        assertFalse(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {2, 1, 3, 4}));
        assertFalse(ReturnArrayValoresIguales.getIguales(new int[] {1, 2, 3}, new int[] {1, 2, 3, 3}));
    }
}
