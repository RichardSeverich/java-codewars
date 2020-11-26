package codewars.com.charly;

/**
* identificar si el numero es primo.
* en en metodo con recursividad enviar el 2 como divisor para empezar
*/
public final class PrimeNumber {

    /** Constructor. */
    private PrimeNumber() { }

    /**
    * @param num numero.
    * @return boolean.
    */
    public static boolean prime(final int num) {
        int numero = Math.abs(num);
        if (numero == 1) {
            return false;
        }
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    /**
    * @param number numero.
    * @param divisor divisor.
    * @return boolean.
    */
    public static boolean primeRecursion(final int number, final int divisor) {
        int num = Math.abs(number);
        if (num == 0 || num == 1) {
            return false;
        } else if (num / 2 < divisor) {
            return true;
        } else if (num % divisor == 0) {
            return false;
        }
        return primeRecursion(num, divisor + 1);
    }
}
