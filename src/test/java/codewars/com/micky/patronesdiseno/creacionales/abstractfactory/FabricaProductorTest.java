package codewars.com.micky.patronesdiseno.creacionales.abstractfactory;

import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.IFigura;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.IColor;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class FabricaProductorTest {
    private FabricaAbstracta fabricaFigura; 
    private IFigura figura;
    private FabricaAbstracta fabricaColor; 
    private IColor color;

    /**
     * Before.
     */
    @Before
    public void instance() {
        fabricaFigura = FabricaProductor.getFabrica("figura");
        figura = fabricaFigura.crearFigura("rectangulo");
        fabricaColor = FabricaProductor.getFabrica("color");
        color = fabricaColor.crearColor("rojo");
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        assertEquals("Figura Rectangular", figura.descripcion());
    }

    /**
     * test.
     */
    @Test
    public void test2() {
        assertEquals("color rojo", color.descripcion());
    }
}
