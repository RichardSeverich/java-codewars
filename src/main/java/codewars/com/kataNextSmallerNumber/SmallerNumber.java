package codewars.com.kataNextSmallerNumber;

import codewars.com.kataNextBiggernumber.BiggerNumNext;


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

        int indexMax = arrayIndexChange[1];
        //int indexMin = arrayIndexChange[0];
        if (arrayIndexChange[0] > arrayIndexChange[1]) {
            indexMax = arrayIndexChange[0];
            //indexMin = arrayIndexChange[1];
        }
        // get header and tail
        String headerString = stringNumberSwapped.substring(0, indexMax+1);
        String tailString = stringNumberSwapped.substring(indexMax);
        tailString = tailString.substring(1);

        // build result
        StringBuilder result = new StringBuilder();
        result.append(headerString);
        if (tailString.length() == 0) {
            return Long.parseLong(result.toString());
        }
        tailString = biggerNumber.sortStringNumbers(tailString);
        result.append(tailString);
        return Long.parseLong(result.toString());
    }

    public int[] getIndexChange(final String[] arrayString) {
        int[] arrayIndex = new int[2];
        int indexChange = -1;
        arrayIndex[0] = -1;
        arrayIndex[1] = -1;
        for (int i = arrayString.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                boolean flagDiff = j == i;
                int valueOne = Integer.parseInt(arrayString[i]);
                int valueTwo = Integer.parseInt(arrayString[j]);
                if (valueOne < valueTwo && indexChange == -1 && !flagDiff) {
                    indexChange = 1;
                    arrayIndex[0] = j;
                    arrayIndex[1] = i;
                    break;
                }
                int sumIndexesOne = i + j;
                int sumIndexesTwo = arrayIndex[0] + arrayIndex[1];
                boolean flag = sumIndexesOne > sumIndexesTwo;
                if (valueOne <= valueTwo && flag && !flagDiff) {
                    arrayIndex[0] = j;
                    arrayIndex[1] = i;
                    break;
                }
            }
        }
        return arrayIndex;
    }
}
