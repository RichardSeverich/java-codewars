package codewars.com.kataNextBiggernumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class BiggerNumNext {

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
     * @param srt srt.
     * @return srt.
     */
    public String sortStringNumbers(String srt) {
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
     * value in index= i should be replace for value in index j
     * <p>
     * value in index= j should be replace for value in index i
     *
     * @param str string.
     * @param i   index.
     * @param j   index.
     * @return string swapped.
     */
    public String swap(String str, int i, int j) {
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
    public int[] getIndexChange(String[] arrayString) {
        int[] arrayIndex = new int[2];
        int indexChange = -1;
        arrayIndex[0] = -1;
        arrayIndex[1] = -1;
        for (int i = arrayString.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int valueOne = Integer.parseInt(arrayString[i]);
                int valueTwo = Integer.parseInt(arrayString[j]);
                if (valueOne > valueTwo) {
                    indexChange = j;
                    arrayIndex[0] = j;
                    arrayIndex[1] = i;
                    break;
                }
            }
            if (indexChange != -1) {
                break;
            }
        }
        return arrayIndex;
    }
}
