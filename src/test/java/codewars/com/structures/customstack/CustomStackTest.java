package codewars.com.structures.customstack;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class.
 */
public class CustomStackTest {

    private CustomStack customStack;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        customStack = new CustomStack<String>();
    }

    /**
     * testAdd.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testAdd() {
        customStack
                .push("a")
                .push("b")
                .push("c");
        assertEquals("c", customStack.pop());
        assertEquals("b", customStack.pop());
        assertEquals("a", customStack.pop());
    }
}
