package codewars.com.micky.estructures.pilas;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PilaTest {
    private Pila<String> pilaList;

    /**
     * Before.
     */
    @Before
    public void instance() {
        pilaList = new Pila<>();
    }

    /**
     * test.
     */
    @Test
    public void testAdd() {
        pilaList.push("hola");
        pilaList.push("loko");
        pilaList.push("bola");
        pilaList.push("loka");
        pilaList.push("foca");
        pilaList.push("foco");
        assertEquals("foco", pilaList.top());
        pilaList.pop();
        assertEquals("foca", pilaList.top());
        pilaList.pop();
        assertEquals("loka", pilaList.top());
        pilaList.pop();
        assertEquals(3, pilaList.tamano());
    }

    /**
     * test2.
     */
    @Test
    public void test2() {
        assertEquals(0, pilaList.tamano());
        pilaList.pop();
        pilaList.push("hola");
        assertEquals("hola", pilaList.top());
        pilaList.pop();
        assertEquals(0, pilaList.tamano());
    }

}
