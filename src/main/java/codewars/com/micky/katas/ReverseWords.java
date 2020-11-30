package codewars.com.micky.katas;

/**
 * Class.
 */
public class ReverseWords {

    /**
     * @param str str.
     * @return result.
     */
    public static String reverseWords(final String str) {
        String result = "";
        String[] array = str.split(" ");
        for (int i = array.length; i > 0; i--) {
            /*
             * if (i == 0){ result += array[i]; } else { result += array[i] + " "; }
             */
            result += (i == 1) ? array[i - 1] : array[i - 1] + " ";
        }
        return result;
    }
}
