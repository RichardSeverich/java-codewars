package codewars.com.kataNextBiggernumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 4kyu
 * <p>
 * Bad performance.
 *
 * <p>
 * You have to create a function that takes a positive integer number and returns the next
 * bigger number formed by the same digits:
 * <p>
 * 12 ==> 21
 * 513 ==> 531
 * 2017 ==> 2071
 * If no bigger number can be composed using those digits, return -1:
 * <p>
 * 9 ==> -1
 * 111 ==> -1
 * 531 ==> -1
 */
public class BiggerNumberNext {

    private List<String> listPermutation;
    private String globalString;

    /**
     * Constructor.
     */
    BiggerNumberNext() {
        listPermutation = new ArrayList<>();
    }

    /**
     * @param number number.
     * @return long.
     */
    public long nextBiggerNumber(final long number) {
        listPermutation.clear();
        String str = Long.toString(number);
        int length = str.length();
        this.globalString = str;
        this.permute(0, length - 1);
        List<String> listString;
        listString = this.listPermutation
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        String stringResult = "-1";
        for (String stringElement : listString) {
            long actualNum = Long.parseLong(stringElement);
            int index = listString.indexOf(stringElement);
            if (actualNum == number && index < listString.size() - 1) {
                stringResult = listString.get(index + 1);
            }
        }
        return Long.parseLong(stringResult);
    }

    /**
     * permutation function (Bad performance).
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    /**
     * permutation function (Bad performance).
     *
     * @param l starting index.
     * @param r end index.
     */
    private void permute(final int l, final int r) {
        if (l == r) {
            listPermutation.add(globalString);
        } else {
            for (int i = l; i <= r; i++) {
                globalString = swap(globalString, l, i);
                permute(l + 1, r);
                globalString = swap(globalString, l, i);
            }
        }
    }

    /**
     * Swap Characters at position.
     *
     * @param a string value.
     * @param i position 1.
     * @param j position 2.
     * @return swapped string.
     */
    private String swap(final String a, final int i, final int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
