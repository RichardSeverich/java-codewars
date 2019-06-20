package codewars.com.kataCountingDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 6 kyu
 * <p>
 * Write a function that will return the count of distinct case-insensitive alphabetic
 * characters and numeric digits that occur more than once in the input string. The input
 * string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * <p>
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {

    /**
     * Constructor.
     */
    CountingDuplicates() {
    }

    /**
     * @param text text
     * @return number of duplicates.
     */
    public int duplicateCount(final String text) {
        String[] array = text.toLowerCase().split("");
        List<String> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    count++;
                }
            }
            if (count > 0 && !list.contains(array[i])) {
                result++;
                list.add(array[i]);
            }
        }
        return result;
    }

    /**
     * @param text text
     * @return number of duplicates.
     */
    public int duplicateCountPro(final String text) {
        return (int) text
                .toLowerCase()
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()))
                .values()
                .stream()
                .filter(e -> e > 1).count();
    }

    /**
     * @param text text
     * @return number of duplicates.
     */
    public int duplicateCountGood(final String text) {
        List<String> list = Arrays.asList(text.toLowerCase().split(""));
        return (int) list.stream().filter(s -> Collections.frequency(list, s) > 1).distinct().count();
    }
}
