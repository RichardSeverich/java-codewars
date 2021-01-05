package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnSumaArray {

    /**
    * Constructor.
    */
    private ReturnSumaArray() {
    }

    /**
     * @param array1 array1.
     * @return result.
     */
    public static int getSumaArray(final int[] array1) {
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result += array1[i];
        }
        return result;
    }
}
