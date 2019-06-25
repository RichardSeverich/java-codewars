package codewars.com.kataNextSmallerNumber;

import codewars.com.kataNextBiggernumber.BiggerNumNext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 4kyu
 * <p>
 * Write a function that takes a positive integer and returns the next smaller positive
 * integer containing the same digits.
 * <p>
 * For example:
 * <p>
 * nextSmaller(21) == 12
 * nextSmaller(531) == 513
 * nextSmaller(2071) == 2017
 * Return -1 (for Haskell: return Nothing), when there is no smaller number that contains the
 * same digits. Also return -1 when the next smaller number with the same digits would require
 * the leading digit to be zero.
 * <p>
 * nextSmaller(9) == -1
 * nextSmaller(111) == -1
 * nextSmaller(135) == -1
 * nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
 * some tests will include very large numbers.
 * test data only employs positive integers.
 */
public class SmallerNumber {

    /**
     * Constructor.
     */
    SmallerNumber() {
    }

    /**
     * @param number number.
     * @return number.
     */
    public long getNextSmaller(final long number) {
        BiggerNumNext biggerNumber = new BiggerNumNext();
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
        String stringNumberSwapped = biggerNumber.swap(stringNumber, arrayIndexChange[0], arrayIndexChange[1]);
        // find index Max
        int indexMin = arrayIndexChange[0];
        if (arrayIndexChange[0] > arrayIndexChange[1]) {
            indexMin = arrayIndexChange[1];
        }
        // get header and tail
        String headerString = stringNumberSwapped.substring(0, indexMin + 1);
        String tailString = stringNumberSwapped.substring(indexMin);
        tailString = tailString.substring(1);
        // build result
        StringBuilder result = new StringBuilder();
        result.append(headerString);
        if (tailString.length() == 0) {
            return Long.parseLong(result.toString());
        }
        tailString = this.sortReverseStringNumber(tailString);
        result.append(tailString);
        return Long.parseLong(result.toString());
    }

    /**
     * @param arrayString arrayString.
     * @return array.
     */
    public int[] getIndexChange(final String[] arrayString) {
        int[] arrayIndex = new int[2];
        int indexChange = -1;
        arrayIndex[0] = -1;
        arrayIndex[1] = -1;
        for (int i = arrayString.length - 1; i >= 0; i--) {
            int iValue = Integer.parseInt(arrayString[i]);
            for (int j = i; j >= 0; j--) {
                boolean flagDiff = j == i;
                int jValue = Integer.parseInt(arrayString[j]);
                boolean flagEqualValues = iValue == jValue;
                if (!flagDiff && !flagEqualValues) {
                    boolean flagZeroCondition = j == 0 && arrayString[i].equals("0");
                    if (iValue < jValue && indexChange == -1 && !flagZeroCondition) {
                        indexChange = 1;
                        arrayIndex[0] = j;
                        arrayIndex[1] = i;
                        break;
                    }
                    if (iValue <= jValue && indexChange == 1 && !flagZeroCondition) {
                        int iValueBefore = Integer.parseInt(arrayString[arrayIndex[1]]);
                        int jValueBefore = Integer.parseInt(arrayString[arrayIndex[0]]);
                        boolean iFlagValue = iValueBefore > iValue;
                        boolean jFlagValue = jValueBefore > jValue;
                        boolean flagIndex = arrayIndex[0] <= j;
                        if (iFlagValue && jFlagValue && flagIndex) {
                            arrayIndex[0] = j;
                            arrayIndex[1] = i;
                            break;
                        }
                    }
                }
            }
        }
        return arrayIndex;
    }

    /**
     * de menor a mayor.
     *
     * @param srt srt.
     * @return srt.
     */
    public String sortReverseStringNumber(final String srt) {
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
        return sb.reverse().toString();
    }

    /**
     * @param n number.
     * @return nextSmaller.
     */
    public long getNextSmallerGood(long n) {
        char[] carr = String.valueOf(n).toCharArray();
        int len = carr.length, i;
        for (i = len - 1; i > 0; i--) {
            if (carr[i] < carr[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        } else {
            int x = carr[i - 1], min = i;
            for (int j = i + 1; j < len; j++) {
                if (carr[j] < x && carr[j] > carr[min]) {
                    min = j;
                }
            }
            char temp = carr[i - 1];
            carr[i - 1] = carr[min];
            carr[min] = temp;
            String[] sArr = String.valueOf(carr).split("");
            java.util.Arrays.sort(sArr, i, len, java.util.Collections.reverseOrder());
            long r = Long.parseLong(String.join("", sArr));
            return String.valueOf(r).length() == len ? r : -1;
        }
    }
}
