package codewars.com.kataNextBiggernumber;

/**
 *
 */
public class BiggerNumNext {

    /**
     * @param number number.
     * @return nextBiggerNumber.
     */
    public long nextBiggerNumber(final long number) {
        String[] arrayString = String.valueOf(number).split("");
        int[] arrayIndexChange = this.getIndexChange(arrayString);
        int indexChangeFirst = arrayIndexChange[0];

        StringBuilder sb = new StringBuilder();
        sb.append(number);
        String stringNumber = sb.toString();
        String headerString = stringNumber.substring(0, indexChangeFirst - 1);
        String mediumString = stringNumber.substring(indexChangeFirst, indexChangeFirst);
        String tailString = stringNumber.substring(indexChangeFirst, stringNumber.length() - 1);

        StringBuilder result = new StringBuilder();
        result.append(headerString);
        result.append(mediumString);
        result.append(tailString);
        return -1;
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
