package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnMayor {

    /**
    * Constructor.
    */
    private ReturnMayor() {
    }

    /**
     * @param array array.
     * @return result.
     */
    public static int getMayor(final int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }
}
