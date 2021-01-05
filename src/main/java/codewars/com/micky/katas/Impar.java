package codewars.com.micky.katas;

/**
 * Class.
 */
public final class Impar {

    /**
    * Constructor.
    */
    private Impar() {
    }

    /**
     * @param n n.
     * @return resultado.
     */
    public static int oddCount(final int n) {
        int contador = 1;
        int resultado = 0;
        while (contador < n) {
            if (contador % 2 != 0) {
                resultado++;
            }
            contador++;
        }
        return resultado;
    }
}
