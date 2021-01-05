package codewars.com.micky.patronesdiseno.estructurales.proxy;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class CuentaTest {
    private Cuenta cuenta;
    private ICuenta cuentaProxy;

    /**
     * Before.
     */
    @Before
    public void instance() {
        cuenta = new Cuenta();
        cuentaProxy = new CuentaProxy();
    }

    /**
     * test.
     */
    @Test
    public void test() {
        cuenta.setCuenta("micky", 1000);
        assertEquals( "cuenta micky saldo 1000.0", cuentaProxy.mostrar(cuenta));
        cuentaProxy.depositarDinero(cuenta, 2000);
        assertEquals( "cuenta micky saldo 3000.0", cuentaProxy.mostrar(cuenta));
        cuentaProxy.retirarDinero(cuenta, 500);
        assertEquals( "cuenta micky saldo 2500.0", cuentaProxy.mostrar(cuenta));
    }
}
