package codewars.com.micky.patronesdiseno.estructurales.decorator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class EnemigoTest {
    Enemigo enemigo;
    ICrearEnemigo enemigoTortuga;
    ICrearEnemigo agregarArmadura;

    /**
     * Before.
     */
    @Before
    public void instance() {
        enemigo = new Enemigo();
        enemigoTortuga = new EnemigoTortuga();
        agregarArmadura = new ArmaduraEnemigo(enemigoTortuga);
    }

    /**
     * test.
     */
    @Test
    public void test() {
        enemigo.setTipo("tortuga");
        assertEquals("tortuga", enemigo.getTipo());
        assertEquals("se creo un enemigo de tipo tortuga se agrego armadura", agregarArmadura.crearEnemigo(enemigo));
    }
}
