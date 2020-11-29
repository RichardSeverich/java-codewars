package codewars.com.micky.katas;

/**
 * Class.
 */
public class SquareSum {

    /**
     * @param n n.
     * @return resultado.
     */
    public static int squareSum(final int[] n) {
        double resultado = 0;
        double result = 0;
        for (int i = 0; i < n.length; i++) {
            result = Math.pow(n[i], 2);
            resultado += result;
        }
        return (int) resultado;
    }
}
