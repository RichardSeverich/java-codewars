package codewars.com.micky.estructures.list;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class ArrayListTest {

    private ArrayList<String> customArrayList;

    /**
     * Before.
     */
    @Before
    public void instance() {
        customArrayList = new ArrayList<>();
    }

    /**
     * test.
     */
    @Test
    public void testAdd() {
        customArrayList.anadir("hola");
        customArrayList.anadir("loko");
        customArrayList.anadir("bola");
        customArrayList.anadir("loka");
        customArrayList.anadir("foca");
        customArrayList.anadir("foco");
        assertEquals("hola", customArrayList.obtener(0));
        assertEquals("bola", customArrayList.obtener(2));
        assertEquals("foca", customArrayList.obtener(4));
    }

    /**
     * test.
     */
    @Test
    public void testEliminar() {
        customArrayList.anadir("hola");
        customArrayList.anadir("loko");
        customArrayList.anadir("bola");
        customArrayList.anadir("loka");
        customArrayList.anadir("foca");
        customArrayList.anadir("foco");
        customArrayList.eliminar(0);
        customArrayList.eliminar(1);
        customArrayList.eliminar(3);
        assertEquals("loko", customArrayList.obtener(0));
        assertEquals("foca", customArrayList.obtener(2));
    }

    /**
     * test.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testNoExisteEnPosicion() {
        customArrayList.anadir("hola");
        customArrayList.anadir("loko");
        customArrayList.anadir("bola");
        customArrayList.anadir("loka");
        customArrayList.anadir("foca");
        customArrayList.anadir("foco");
        customArrayList.obtener(6);
    }

    /**
     * test.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testEliminarNoExisteEnPosicion() {
        customArrayList.anadir("hola");
        customArrayList.anadir("loko");
        customArrayList.anadir("bola");
        customArrayList.eliminar(3);
    }

    /**
     * test.
     */
    @Test
    public void testEditar() {
        customArrayList.anadir("hola");
        customArrayList.anadir("loko");
        customArrayList.anadir("bola");
        customArrayList.editar(0, "patricio");
        customArrayList.editar(1, "juan");
        assertEquals("patricio", customArrayList.obtener(0));
        assertEquals("juan", customArrayList.obtener(1));
    }
}
