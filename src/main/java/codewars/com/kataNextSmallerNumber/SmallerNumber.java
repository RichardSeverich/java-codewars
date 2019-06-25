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
        int indexMax = arrayIndexChange[1];
        int indexMin = arrayIndexChange[0];
        if (arrayIndexChange[0] > arrayIndexChange[1]) {
            indexMax = arrayIndexChange[0];
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
            int valueOne = Integer.parseInt(arrayString[i]);
            for (int j = i; j >= 0; j--) {
                boolean flagDiff = j == i;
                int valueTwo = Integer.parseInt(arrayString[j]);
                boolean flagEqualValues = valueOne == valueTwo;
                if (!flagDiff && !flagEqualValues) {
                    boolean flagZeroCondition = j == 0 && arrayString[i].equals("0");
                    if (valueOne < valueTwo && indexChange == -1 && !flagZeroCondition) {
                        indexChange = 1;
                        arrayIndex[0] = j; // Major
                        arrayIndex[1] = i;
                        break;
                    }
                    if (valueOne <= valueTwo && indexChange == 1 && !flagZeroCondition) {
                        int valueTwoBefore = Integer.parseInt(arrayString[arrayIndex[1]]);
                        boolean flagValue = valueTwoBefore > valueOne;
                        boolean flagIndex = arrayIndex[0] <= j;
                        if (flagValue && flagIndex) {
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
}
