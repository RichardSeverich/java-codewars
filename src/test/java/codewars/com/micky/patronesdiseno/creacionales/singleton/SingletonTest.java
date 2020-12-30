package codewars.com.micky.patronesdiseno.creacionales.singleton;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Test.
 */
public class SingletonTest {

    /**
     * test.
     */
    @Test
    public void test1() {
        Singleton singleton1 = Singleton.getInstance();
        assertTrue(singleton1 instanceof Singleton);
        Singleton singleton2 = Singleton.getInstance();
        assertFalse(singleton2 instanceof Singleton);
    }
}
