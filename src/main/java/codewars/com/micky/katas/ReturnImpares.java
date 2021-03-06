package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnImpares {

    /**
    * Constructor.
    */
    private ReturnImpares() {
    }

    /**
     * @param numero numero.
     * @return contador.
     */
    public static int getImpares(final int[] numero) {
        int contador = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }
}
