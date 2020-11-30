package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnSumaArrayTest {
    @Test
    public void test1() {
        assertEquals(6, ReturnSumaArray.getSumaArray(new int[] {1, 2, 3}));
    }
}