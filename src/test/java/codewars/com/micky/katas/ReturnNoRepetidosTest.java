package codewars.com.micky.katas;

import java.util.Arrays;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test.
 */
public class ReturnNoRepetidosTest {

    /**
    * Test.
    */
    @Test
    public void test1() {
        assertArrayEquals(new Integer[]{2, 3, 4, 5, 10}, ReturnNoRepetidos.getNoRepetidos(new int[] {2, 2, 3, 4, 5, 5, 5, 10}));
        assertArrayEquals(new Integer[]{2, 12, 1, 3, 5, 155}, ReturnNoRepetidos.getNoRepetidos(new int[] {2, 12, 12, 2, 1, 3, 5, 155}));
    }

    /**
    * Test.
    */
    @Test
    public void test2() {
        assertTrue(ReturnNoRepetidos.existeEnArray(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), 2));
        assertFalse(ReturnNoRepetidos.existeEnArray(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 6)), 5));
    }

    /**
    * Test.
    */
    @Test
    public void testGod() {
        assertArrayEquals(new Integer[]{2, 3, 4, 5, 10}, ReturnNoRepetidos.getNoRepetidosGod(new int[] {2, 2, 3, 4, 5, 5, 5, 10}));
        assertArrayEquals(new Integer[]{2, 12, 1, 3, 5, 155}, ReturnNoRepetidos.getNoRepetidosGod(new int[] {2, 12, 12, 2, 1, 3, 5, 155}));
    }
}
