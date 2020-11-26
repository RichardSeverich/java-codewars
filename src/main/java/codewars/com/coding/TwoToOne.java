package codewars.com.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Richard on 8/27/2017.
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted
 * string, the longest possible, containing distinct letters,
 * each taken only once - coming from s1 or s2. #Examples: ```
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
 * a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
 */
public class TwoToOne {

    /**
     * @param s1 this variable contains the first string.
     * @param s2 this variable contains the second string.
     * @return return TwoToOne String.
     */
    public String longest(final String s1, final String s2) {
        String[] myArray = s1.split("");
        SortedSet<String> myTreeSet = new TreeSet<>(Arrays.asList(myArray));
        myArray = s2.split("");
        Collections.addAll(myTreeSet, myArray);
        StringBuilder result = new StringBuilder();
        myTreeSet.forEach(result::append);
        return result.toString();
    }
}
