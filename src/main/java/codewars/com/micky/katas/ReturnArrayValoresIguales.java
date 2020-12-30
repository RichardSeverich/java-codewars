package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnArrayValoresIguales {

    /**
    * Constructor.
    */
    private ReturnArrayValoresIguales() {
    }

    /**
     * @param array1 array1.
     * @param array2 array2.
     * @return boolean.
     */
    public static boolean getIguales(final int[] array1, final int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!existeEnArray(array2, array1[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array          array.
     * @param buscarElemento buscarElemento.
     * @return boolean.
     */
    public static boolean existeEnArray(final int[] array, final int buscarElemento) {
        for (int valor : array) {
            if (valor == buscarElemento) {
                return true;
            }
        }
        return false;
    }
}
