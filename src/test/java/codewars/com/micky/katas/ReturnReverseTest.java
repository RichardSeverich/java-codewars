package codewars.com.micky.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReturnReverseTest {
    @Test
    public void test() {
         assertEquals("comer gusta me", ReturnReverse.getString("me gusta comer"));
         assertEquals("volar gusta me", ReturnReverse.getString("me gusta volar"));
         assertEquals("genial es mundo el", ReturnReverse.getString("el mundo es genial"));
    }
}