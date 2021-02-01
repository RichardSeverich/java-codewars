package codewars.com.micky.algoritmosordenamiento;

/**
 * Class.
 */
public final class Seleccion {

    /**
     * Constructor.
     */
    private Seleccion() {
    }

    /**
     * @param arr arr.
     * @return arr.
     */
    public static int[] setSeleccion(final int[] arr) {
        int auxiliar;
        int minimo;
        for (int i = 0; i < arr.length; i++) {
            minimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimo]) {
                    minimo = j;
                }
            }
            auxiliar = arr[i];
            arr[i] = arr[minimo];
            arr[minimo] = auxiliar;
        }
        return arr;
    }
}
