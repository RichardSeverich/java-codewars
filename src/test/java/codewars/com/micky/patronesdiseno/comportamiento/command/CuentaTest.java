package codewars.com.micky.patronesdiseno.comportamiento.command;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class CuentaTest {
    private Cuenta cuenta;
    private Retirar operacionRetirar;
    private Depositar operacionDepositar;
    private Invoker invoker;

    /**
     * Before.
     */
    @Before
    public void instance() {
        cuenta = new Cuenta();
        operacionDepositar = new Depositar();
        operacionRetirar = new Retirar();
        invoker = new Invoker();
    }

    /**
     * test.
     */
    @Test
    public void test1() {
        cuenta.setSaldo(200);
        operacionDepositar.setDeposito(cuenta, 100);
        operacionRetirar.setRetirar(cuenta, 50);
        invoker.recibirOperacion(operacionDepositar);
        invoker.recibirOperacion(operacionRetirar);
        invoker.hacerOperacion();
        assertEquals(250, cuenta.saldo, 0.1);
    }

    /**
     * test.
     */
    @Test
    public void test2() {
        cuenta.setSaldo(300);
        assertEquals(300, cuenta.saldo, 0.1);
        operacionDepositar.setDeposito(cuenta, 900);
        invoker.recibirOperacion(operacionDepositar);
        invoker.hacerOperacion();
        assertEquals(1200, cuenta.saldo, 0.1);
        operacionRetirar.setRetirar(cuenta, 400);
        invoker.recibirOperacion(operacionRetirar);
        invoker.hacerOperacion();
        assertEquals(800, cuenta.saldo, 0.1);
    }
}
