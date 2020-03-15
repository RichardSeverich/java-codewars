package codewars.com.structures.customarraylist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test.
 */
public class MyArrayListTest {

    private MyArrayList myArrayList;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        myArrayList = new MyArrayList();
    }

    /**
     * testAdd.
     */
    @Test
    public void testAdd() {
        final int five = 5;
        final int nine = 9;
        final int oneHundred = 100;
        myArrayList
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

        assertEquals("a", myArrayList.get(0));
        assertEquals("f", myArrayList.get(five));
        assertEquals("j", myArrayList.get(nine));
    }

    /**
     * testDelete.
     */
    @Test
    public void testDelete() {
        final int three = 3;
        final int eight = 8;
        final int seven = 7;
        final int nine = 9;
        myArrayList
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
        myArrayList
                .delete(0)
                .delete(three)
                .delete(seven);
        assertEquals("b", myArrayList.get(0));
        assertEquals("f", myArrayList.get(three));
    }

    /**
     * testDeleteAfterAdd.
     */
    @Test
    public void testDeleteAfterAdd() {
        final int eight = 8;
        final int nine = 9;
        myArrayList
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
        myArrayList.delete(nine);
        myArrayList
                .delete(0)
                .add("a")
                .add("j");
        assertEquals("b", myArrayList.get(0));
        assertEquals("a", myArrayList.get(eight));
        assertEquals("j", myArrayList.get(nine));
    }

    /**
     * testGetNonExistentPosition.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNonExistentPosition() {
        final int three = 3;
        myArrayList
                .add("a")
                .add("b")
                .add("c");
        myArrayList.get(three);
    }

    /**
     * testDeleteNonExistentPosition.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteNonExistentPosition() {
        final int three = 3;
        myArrayList
                .add("a")
                .add("b")
                .add("c");
        myArrayList.delete(three);
    }
}
