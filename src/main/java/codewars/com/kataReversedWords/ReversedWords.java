package codewars.com.kataReversedWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 8 kyu
 *
 * <p>
 * Complete the solution so that it reverses all of the words within the string passed in.
 * <p>
 * Example:
 * <p>
 * ReverseWords.reverse("The greatest victory is that which requires no battle");
 * should return "battle no requires which that is victory greatest The"
 */
public class ReversedWords {

    /**
     * Constructor.
     */
    ReversedWords() {

    }

    /**
     * @param str str.
     * @return string.
     */
    public String reverse1(String str) {
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString().substring(0, str.length());
    }

    /**
     * @param str str.
     * @return string.
     */
    public String reverse2(String str) {
        List<String> listWords = Arrays.asList(str.split(" "));
        Collections.reverse(listWords);
        return String.join(" ", listWords);
    }
}
