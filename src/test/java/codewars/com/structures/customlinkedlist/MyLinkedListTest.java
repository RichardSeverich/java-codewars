package codewars.com.structures.customlinkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test.
 */
public class MyLinkedListTest {

    private MyLinkedList myLinkedList;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        myLinkedList = new MyLinkedList();
    }

    /**
     * testAdd.
     */
    @Test
    public void testAdd() {
        myLinkedList
                .add("a")
                .add("b")
                .add("c");
        assertEquals("a", myLinkedList.get(0));
        assertEquals("b", myLinkedList.get(1));
        assertEquals("c", myLinkedList.get(2));
    }

    /**
     * testDelete.
     */
    @Test
    public void testDeleteOne() {
        myLinkedList
                .add("a")
                .add("b")
                .add("c");
        myLinkedList.delete(0);
        assertEquals("b", myLinkedList.get(0));
        assertEquals("c", myLinkedList.get(1));
    }

    /**
     * testDelete.
     */
    @Test
    public void testDeleteTwo() {
        myLinkedList
                .add("a")
                .add("b")
                .add("c");
        myLinkedList.delete(1);
        assertEquals("a", myLinkedList.get(0));
        assertEquals("c", myLinkedList.get(1));
    }

    /**
     * testDelete.
     */
    @Test
    public void testDeleteThree() {
        myLinkedList
                .add("a")
                .add("b")
                .add("c");
        myLinkedList.delete(2);
        assertEquals("a", myLinkedList.get(0));
        assertEquals("b", myLinkedList.get(1));
    }

    /**
     * testGetNonExistentPosition.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNonExistentPosition() {
        final int three = 3;
        myLinkedList
                .add("a")
                .add("b")
                .add("c");
        myLinkedList.get(three);
    }

    /**
     * testDeleteNonExistentPosition.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteNonExistentPosition() {
        final int three = 3;
        myLinkedList
                .add("a")
                .add("b")
                .add("c");
        myLinkedList.delete(three);
    }
}
