package codewars.com.micky.patronesdiseno.creacionales.builder;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class PizzaTest {
    private Pizza pizza;

    /**
     * Before.
     */
    @Before
    public void instance() {
        pizza = new Pizza();
    }

    /**
     * test.
     */
    @Test
    public void test() {
        pizza.setMasa("crujiente")
            .setQueso("mozzarella")
            .setSalsa("tomate");
        assertEquals("masa crujiente salsa tomate queso mozzarella", pizza.getDatos());
    }
}
