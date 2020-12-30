package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnArraySuma {

    /**
    * Constructor.
    */
    private ReturnArraySuma() {
    }

    /**
     * @param array1 array1.
     * @param array2 array2.
     * @return resultado.
     */
    public static int[] getSumaArrays(final int[] array1, final int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] + array2[i];
        }
        return resultado;
    }
}
