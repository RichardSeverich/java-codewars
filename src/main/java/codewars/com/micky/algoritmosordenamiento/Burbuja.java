package codewars.com.micky.algoritmosordenamiento;

/**
 * Class.
 */
public final class Burbuja {

    /**
     * Constructor.
     */
    private Burbuja() {
    }

    /**
     * @param arr arr.
     * @return arr.
     */
    public static int[] setBurbuja(final int[] arr) {
        int auxiliar;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    auxiliar = arr[i];
                    arr[i] = arr[j];
                    arr[j] = auxiliar;
                }
            }
        }
        return arr;
    }
}
