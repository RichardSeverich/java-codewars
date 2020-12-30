package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnArrayMulty {

    /**
    * Constructor.
    */
    private ReturnArrayMulty() {
    }

    /**
     * @param array1 array1.
     * @param array2 array2.
     * @return result.
     */
    public static int[] getMulty(final int[] array1, final int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        return result;
    }
}
