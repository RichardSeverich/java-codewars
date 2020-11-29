package codewars.com.micky.katas;

/**
 * Class.
 */
public class ReturnImpares {

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
