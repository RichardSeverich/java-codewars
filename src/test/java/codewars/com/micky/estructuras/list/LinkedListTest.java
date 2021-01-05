package codewars.com.micky.estructuras.list;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class LinkedListTest {
   
    private LinkedList<String> customLinkedList;

    /**
     * Before.
     */
    @Before
    public void instance() {
        customLinkedList = new LinkedList<>();
    }

    /**
     * test.
     */
    @Test
    public void testAdd() {
        customLinkedList.anadir("hola");
        customLinkedList.anadir("loko");
        customLinkedList.anadir("bola");
        customLinkedList.anadir("loka");
        customLinkedList.anadir("foca");
        customLinkedList.anadir("foco");
        assertEquals("hola", customLinkedList.obtener(0));
        assertEquals("bola", customLinkedList.obtener(2));
        assertEquals("foca", customLinkedList.obtener(4));
    }

    /**
     * test.
     */
    @Test
    public void testAddSingle() {
        customLinkedList.anadir("hola");
        assertEquals("hola", customLinkedList.obtener(0));
    }

    /**
     * test.
     */
    @Test
    public void testEliminar() {
        customLinkedList.anadir("hola");
        customLinkedList.anadir("loko");
        customLinkedList.anadir("bola");
        customLinkedList.anadir("loka");
        customLinkedList.anadir("foca");
        customLinkedList.anadir("foco");
        customLinkedList.eliminar(0);
        customLinkedList.eliminar(1);
        customLinkedList.eliminar(3);
        assertEquals("loko", customLinkedList.obtener(0));
        assertEquals("foca", customLinkedList.obtener(2));
    }

    
    /**
     * test.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testNoExisteEnPosicion() {
        customLinkedList.anadir("hola");
        customLinkedList.anadir("loko");
        customLinkedList.anadir("bola");
        customLinkedList.anadir("loka");
        customLinkedList.anadir("foca");
        customLinkedList.anadir("foco");
        customLinkedList.obtener(6);
    }

    /**
     * test.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testEliminarNoExisteEnPosicion() {
        customLinkedList.anadir("hola");
        customLinkedList.anadir("loko");
        customLinkedList.anadir("bola");
        customLinkedList.eliminar(3);
    }

    /**
     * test.
     */
    @Test
    public void testEditar() {
        customLinkedList.anadir("hola");
        customLinkedList.anadir("loko");
        customLinkedList.anadir("bola");
        customLinkedList.editar(0, "patricio");
        customLinkedList.editar(1, "juan");
        assertEquals("patricio", customLinkedList.obtener(0));
        assertEquals("juan", customLinkedList.obtener(1));
    }
}
