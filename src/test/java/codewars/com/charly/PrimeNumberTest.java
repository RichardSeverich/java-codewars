package codewars.com.charly;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Class. */
public class PrimeNumberTest {

    /** Test. */
    @Test
    public void basicTests() {
        assertEquals(true, PrimeNumber.prime(7));
        assertEquals(false, PrimeNumber.prime(88));
        assertEquals(true, PrimeNumber.prime(71));
        assertEquals(false, PrimeNumber.prime(0));
        assertEquals(false, PrimeNumber.prime(1));
        assertEquals(true, PrimeNumber.prime(-71));
        assertEquals(false, PrimeNumber.prime(-88));
    }

    /** Test. */
    @Test
    public void recursionTests() {
        assertEquals(true, PrimeNumber.primeRecursion(2, 2));
        assertEquals(false, PrimeNumber.primeRecursion(88, 2));
        assertEquals(true, PrimeNumber.primeRecursion(71, 2));
        assertEquals(false, PrimeNumber.primeRecursion(0, 2));
        assertEquals(false, PrimeNumber.primeRecursion(1, 2));
        assertEquals(true, PrimeNumber.primeRecursion(-71, 2));
        assertEquals(false, PrimeNumber.primeRecursion(-88, 2));
    }
}
