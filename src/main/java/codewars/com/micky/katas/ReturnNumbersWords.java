package codewars.com.micky.katas;

/**
 * Class.
 */
public class ReturnNumbersWords {

    /**
     * @param dato dato.
     * @return result.
     */
    public static int returnNumber(final String dato) {
        int result = 0;
        for (int i = 0; i < dato.length(); i++) {
            if (Character.isDigit(dato.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}