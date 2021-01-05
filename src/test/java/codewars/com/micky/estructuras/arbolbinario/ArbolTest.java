package codewars.com.micky.estructuras.arbolbinario;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class ArbolTest {
    private Arbol<String> arbolBinario;

    /**
     * Before.
     */
    @Before
    public void instance() {
        arbolBinario = new Arbol<>();
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        arbolBinario.agregar(5, "manzana");
        arbolBinario.agregar(7, "platano");
        arbolBinario.agregar(3, "pera");
        arbolBinario.agregar(5, "uva");
        arbolBinario.agregar(1, "piña");
        arbolBinario.agregar(6, "cereza");
        assertEquals(Arrays.asList(1, 3, 5, 5, 6, 7), arbolBinario.enOrden(arbolBinario.raiz));
    }

    /**
     * test.
     */
    @Test
    public void test2() {
        arbolBinario.agregar(5, "manzana");
        arbolBinario.agregar(7, "platano");
        arbolBinario.agregar(3, "pera");
        arbolBinario.agregar(5, "uva");
        arbolBinario.agregar(1, "piña");
        arbolBinario.agregar(6, "cereza");
        assertEquals(Arrays.asList(5, 3, 1, 7, 5, 6), arbolBinario.preOrden(arbolBinario.raiz));
    }

    /**
     * test.
     */
    @Test
    public void test3() {
        arbolBinario.agregar(5, "manzana");
        arbolBinario.agregar(7, "platano");
        arbolBinario.agregar(3, "pera");
        arbolBinario.agregar(5, "uva");
        arbolBinario.agregar(1, "piña");
        arbolBinario.agregar(6, "cereza");
        assertEquals(null , arbolBinario.dameNodo(8));
        Nodo<String> nodo = arbolBinario.dameNodo(3);
        assertEquals("pera" , nodo.valor);
        assertEquals(3 , nodo.numeroNodo);
    }

    /**
     * test.
     */
    @Test
    public void test4() {
        arbolBinario.agregar(5, "manzana");
        arbolBinario.agregar(7, "platano");
        arbolBinario.agregar(3, "pera");
        arbolBinario.agregar(5, "uva");
        arbolBinario.agregar(1, "piña");
        arbolBinario.agregar(6, "cereza");
        assertEquals(false , arbolBinario.eliminar(8));
        arbolBinario.eliminar(1);
        arbolBinario.eliminar(7);
        arbolBinario.eliminar(6);
        assertEquals(Arrays.asList(5, 3, 5), arbolBinario.preOrden(arbolBinario.raiz));
        assertEquals(Arrays.asList(3, 5, 5), arbolBinario.enOrden(arbolBinario.raiz));
        arbolBinario.agregar(89, "sandia");
        arbolBinario.agregar(54, "durazno");
        arbolBinario.agregar(12, "palta");
        arbolBinario.agregar(2, "maracuya");
        arbolBinario.agregar(1, "higo");
        arbolBinario.agregar(4, "pacay");
        assertEquals(Arrays.asList(5, 3, 2, 1, 4, 5, 89, 54, 12), arbolBinario.preOrden(arbolBinario.raiz));
    }
}
