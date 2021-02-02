package codewars.com.micky.algoritmosordenamiento;

/**
 * Class.
 */
public final class Insercion {
    private static int posicion;
    private static int auxiliar;

    /**
     * Constructor.
     */
    private Insercion() {
    }

    /**
     * @param arr arr.
     * @return arr.
     */
    public static int[] setInsercion(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            posicion = i;
            auxiliar = arr[i];
            while ((posicion > 0) && (arr[posicion - 1] > auxiliar)) {
                arr[posicion] = arr[posicion - 1];
                posicion--;
            }
            arr[posicion] = auxiliar;
        }
        return arr;
    }
}
