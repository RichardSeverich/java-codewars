package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnMenor {

    /**
    * Constructor.
    */
    private ReturnMenor() {
    }

    /**
     * @param array array.
     * @return result.
     */
    public static int getMenor(final int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }
}
