package codewars.com.micky.patronesdiseno.creacionales.prototype;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class CuentaAhorroTest {
    CuentaAhorro cuenta;
    CuentaAhorro cuenta2;

    /**
     * Before.
     */
    @Before
    public void instance() {
        cuenta = new CuentaAhorro();
        cuenta2 = new CuentaAhorro();
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        cuenta.setMonto(1000);
        assertEquals("cuenta de tipo ahorro monto 1000.0", cuenta.getDatos());
    }

    /**
     * test.
     */
    @Test
    public void test2() {
        cuenta.setMonto(1000);
        ICuenta cuentaClonada = cuenta.clonar();
        cuenta2 = (CuentaAhorro)cuentaClonada;
        assertEquals("cuenta de tipo ahorro monto 1000.0", cuenta2.getDatos());
    }
}
