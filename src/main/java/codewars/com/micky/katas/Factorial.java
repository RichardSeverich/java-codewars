package codewars.com.micky.katas;

/**
 * Class.
 */
public final class Factorial {

    /**
    * Constructor.
    */
    public Factorial() {
    }

    /**
     * @param numero numero.
     * @return resultado.
     */
    public int getFactorial(final int numero) {
        int resultado = 1;
        for (int i = numero; i > 0; i--) {
            if (numero > 0) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }

    /**
     * @param numero numero.
     * @return resultado.
     */
    public int getFacRecursividad(final int numero) {
        int resultado;
        if (numero > 0) {
            resultado = numero * getFacRecursividad(numero - 1);
            return resultado;
        }
        return 1;
    }
}
