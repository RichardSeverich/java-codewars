package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImparTest {
    @Test
    public void fixedTests() {
        assertEquals(7, Impar.oddCount(15));
        assertEquals(7511, Impar.oddCount(15023));
    }
}
