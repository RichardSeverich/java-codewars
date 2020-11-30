package codewars.com.micky.katas;

/**
 * Class.
 */
public class ReturnReverse {

    /**
     * @param letra letra.
     * @return result.
     */
    public static String getString(final String letra) {
        String result = "";
        String[] array = letra.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            /*
             * if (i > 0){ result += array[i] + " "; } else { result += array[i]; }
             */
            result += (i > 0) ? array[i] + " " : array[i];
        }
        return result;
    }
}
