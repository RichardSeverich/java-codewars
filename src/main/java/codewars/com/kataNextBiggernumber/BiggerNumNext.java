package codewars.com.kataNextBiggernumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 4kyu
 * <p>
 * Good Performance.
 * <p>
 * You have to create a function that takes a positive integer number and returns the next bigger number
 * formed by the same digits:
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
public class BiggerNumNext {

    /**
     * Constructor.
     */
    public BiggerNumNext() {

    }

    /**
     * @param number number.
     * @return getNextBiggerNumber.
     */
    public long getNextBiggerNumber(final long number) {
        // convert long to string
        String stringNumber = String.valueOf(number);
        // get array.
        String[] arrayString = String.valueOf(number).split("");
        // get index should be swapped.
        int[] arrayIndexChange = this.getIndexChange(arrayString);
        if (arrayIndexChange[0] == -1) {
            return -1;
        }
        // swapped.
        String stringNumberSwapped = this.swap(stringNumber, arrayIndexChange[0], arrayIndexChange[1]);

        // get header and tail
        String headerString = stringNumberSwapped.substring(0, arrayIndexChange[0] + 1);
        String tailString = stringNumberSwapped.substring(arrayIndexChange[0]);
        tailString = tailString.substring(1);

        // build result
        StringBuilder result = new StringBuilder();
        result.append(headerString);
        if (tailString.length() == 0) {
            return Long.parseLong(result.toString());
        }
        tailString = sortStringNumbers(tailString);
        result.append(tailString);
        return Long.parseLong(result.toString());
    }

    /**
     * de menor a mayor.
     *
     * @param srt srt.
     * @return srt.
     */
    public String sortStringNumbers(final String srt) {
        String[] arrayString = srt.split("");
        List<String> listString = new ArrayList<>(Arrays.asList(arrayString));
        listString = listString
                .stream()
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String element : listString) {
            sb.append(element);
        }
        return sb.toString();
    }

    /**
     * value in index= i should be replace for value in index j.
     * <p>
     * value in index= j should be replace for value in index i.
     *
     * @param str string.
     * @param i   index.
     * @param j   index.
     * @return string swapped.
     */
    public String swap(final String str, final int i, final int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    /**
     * for {"2", "1", "8", "7", "6", "5"} -> return {1,5}
     * <p>
     * for {"1", "2"} -> return {0,1}
     * <p>
     * Return the index that should changed.
     *
     * @param arrayString arrayString.
     * @return IndexChange.
     */
    public int[] getIndexChange(final String[] arrayString) {
        int[] arrayIndex = new int[2];
        int indexChange = -1;
        arrayIndex[0] = -1;
        arrayIndex[1] = -1;
        for (int i = arrayString.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int valueOne = Integer.parseInt(arrayString[i]);
                int valueTwo = Integer.parseInt(arrayString[j]);
                if (valueOne > valueTwo && indexChange == -1) {
                    indexChange = 1;
                    arrayIndex[0] = j;
                    arrayIndex[1] = i;
                    break;
                } else if (valueOne > valueTwo && arrayIndex[0] < j && arrayIndex[1] > i) {
                    arrayIndex[0] = j;
                    arrayIndex[1] = i;
                    break;
                }
            }
        }
        return arrayIndex;
    }

    /**
     * @param n number.
     * @return nextBiggerNumber.
     */
    public long getNextBiggerNumberGood(final long n) {
        char[] s = String.valueOf(n).toCharArray();
        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[i] < s[j]) {
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i + 1, s.length);
                    return Long.parseLong(String.valueOf(s));
                }
            }
        }
        return -1;
    }
}
