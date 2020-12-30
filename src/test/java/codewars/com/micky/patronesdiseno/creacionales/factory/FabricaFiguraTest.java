package codewars.com.micky.patronesdiseno.creacionales.factory;

import codewars.com.micky.patronesdiseno.creacionales.factory.productos.IFigura;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class FabricaFiguraTest {
    private FabricaFigura fabricaFigura;
    private IFigura figura;

    /**
     * Before.
     */
    @Before
    public void instance() {
        fabricaFigura = new FabricaFigura();
        figura = fabricaFigura.crearFigura("circulo");
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        assertEquals("Figura Circular", figura.descripcion());
    }
}
