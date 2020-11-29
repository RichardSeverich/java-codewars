package codewars.com.micky.solid.isp.bad;

import org.junit.Assert;
import org.junit.Test;

public class ImpresoraTest {
    private Impresora impresora;

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        impresora = new Impresora();
        Assert.assertEquals("se copio", impresora.getCopiar());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        impresora = new Impresora();
        Assert.assertEquals("se engrampo", impresora.getEngranpar());
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        impresora = new Impresora();
        Assert.assertEquals("se envio fax", impresora.getEnviarFax());
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        impresora = new Impresora();
        Assert.assertEquals("se imprimio", impresora.getImprimir());
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        impresora = new Impresora();
        Assert.assertEquals("se imprimio colores", impresora.getImprimirColores());
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        impresora = new Impresora();
        Assert.assertEquals("se imprimio laser", impresora.getImprimirLaser());
    }

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        impresora = new Impresora();
        Assert.assertEquals("se imprimio negro", impresora.getImprimirNegro());
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        impresora = new Impresora();
        Assert.assertEquals("se subio a internet", impresora.getSubirInternet());
    }
}
