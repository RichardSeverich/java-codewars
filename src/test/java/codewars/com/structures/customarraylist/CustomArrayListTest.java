package codewars.com.structures.customarraylist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class CustomArrayListTest {

    private CustomArrayList customArrayList;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        customArrayList = new CustomArrayList<String>();
    }

    /**
     * testAdd.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testAdd() {
        final int five = 5;
        final int nine = 9;
        customArrayList
                .add("a")
                .add("b")
                .add("c")
                .add("d")
                .add("e")
                .add("f")
                .add("g")
                .add("h")
                .add("i")
                .add("j");
        assertEquals("a", customArrayList.get(0));
        assertEquals("f", customArrayList.get(five));
        assertEquals("j", customArrayList.get(nine));
    }

    /**
     * testDelete.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testDelete() {
        final int three = 3;
        final int seven = 7;
        customArrayList
                .add("a")
                .add("b")
                .add("c")
                .add("d")
                .add("e")
                .add("f")
                .add("g")
                .add("h")
                .add("i")
                .add("j");
        customArrayList
                .remove(0)
                .remove(three)
                .remove(seven);
        assertEquals("b", customArrayList.get(0));
        assertEquals("f", customArrayList.get(three));
    }

    /**
     * testDeleteAfterAdd.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testDeleteAfterAdd() {
        final int eight = 8;
        final int nine = 9;
        customArrayList
                .add("a")
                .add("b")
                .add("c")
                .add("d")
                .add("e")
                .add("f")
                .add("g")
                .add("h")
                .add("i")
                .add("j");
        customArrayList.remove(nine);
        customArrayList
                .remove(0)
                .add("a")
                .add("j");
        assertEquals("b", customArrayList.get(0));
        assertEquals("a", customArrayList.get(eight));
        assertEquals("j", customArrayList.get(nine));
    }

    /**
     * testGetNonExistentPosition.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    @SuppressWarnings("unchecked")
    public void testGetNonExistentPosition() {
        final int three = 3;
        customArrayList
                .add("a")
                .add("b")
                .add("c");
        customArrayList.get(three);
    }

    /**
     * testDeleteNonExistentPosition.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    @SuppressWarnings("unchecked")
    public void testDeleteNonExistentPosition() {
        final int three = 3;
        customArrayList
                .add("a")
                .add("b")
                .add("c");
        customArrayList.remove(three);
    }
}
